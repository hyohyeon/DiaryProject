package com.project.mapper;

import java.util.HashMap;

import com.project.dto.Member;

public interface MemberMapper {

	Member login(HashMap<String, Object> params);
	
}
