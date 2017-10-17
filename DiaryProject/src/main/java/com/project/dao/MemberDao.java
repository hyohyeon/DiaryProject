package com.project.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.project.dto.Member;
import com.project.mapper.MemberMapper;

@Repository
public class MemberDao {

	@Autowired
	@Qualifier("memberMapper")
	private MemberMapper memberMapper;

	public Member login(String mId, String passwd) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("mId", mId);
		params.put("passwd", passwd);
		Member member = memberMapper.login(params);
		
		return member;
	}

}
