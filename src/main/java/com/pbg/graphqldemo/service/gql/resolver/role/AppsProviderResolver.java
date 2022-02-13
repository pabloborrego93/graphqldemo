package com.pbg.graphqldemo.service.gql.resolver.role;

import java.util.Set;

import com.pbg.graphqldemo.dto.ApplicationDto;
import com.pbg.graphqldemo.dto.RoleDto;

public interface AppsProviderResolver {

	Set<ApplicationDto> applications(RoleDto roleDto);
	
}
