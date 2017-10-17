package com.project.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.dto.Member;
import com.project.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {
	@Autowired
	@Qualifier("memberService")
	private MemberService memberService;
	
	@RequestMapping(value = "login.action", method = RequestMethod.POST)
	@ResponseBody
	public String login(String mId, String passwd) {
		Member member = memberService.login(mId, passwd);
		System.out.println(member.getNickname());
		System.out.println(member.getEmail());
		return "success";
	}
}
