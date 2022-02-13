package com.pbg.graphqldemo.service.gql.resolver.role;

import com.pbg.graphqldemo.dto.RoleDto;

public interface CNProviderResolver {

	String dn(RoleDto roleDto);
	
}
