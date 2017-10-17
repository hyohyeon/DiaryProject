package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.dao.MemberDao;
import com.project.dto.Member;

//Service는 트랜잭션 단위
@Service //@Component
public class MemberService {
	
	@Autowired
	@Qualifier("memberDao")
	private MemberDao memberDao;

	public Member login(String mId, String passwd) {
		Member member = memberDao.login(mId,passwd);
		return member;
	}
	


}
