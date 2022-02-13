package com.pbg.graphqldemo.service.gql.resolver.role;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pbg.graphqldemo.dto.ApplicationDto;
import com.pbg.graphqldemo.dto.RoleDto;

import graphql.com.google.common.collect.Lists;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class AppsProviderResolverImpl implements AppsProviderResolver, GraphQLResolver<RoleDto> {
	
	@Qualifier("appsProviderClient") 
	private final RestTemplate appsProviderClient;
	
	@Override
	public Set<ApplicationDto> applications(RoleDto roleDto) {
		log.info("Retrieving applications of role with name {}", roleDto.getName());
		StringBuilder uri = new StringBuilder()
			.append("/roles")
			.append("?name=")
			.append(roleDto.getName());
		List<RoleDto> result = Lists.newArrayList(appsProviderClient.getForObject(uri.toString(), RoleDto[].class));
		return (result.isEmpty()) ? null : result.get(0).getApplications();
	}
	
}
