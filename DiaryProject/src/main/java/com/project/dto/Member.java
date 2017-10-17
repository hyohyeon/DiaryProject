package com.project.dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Member {

	@NotEmpty(message="아이디를 입력해주세요.")
	@Length(min=3, max=20, message="아이디는 3자 이상 20자 미만입니다.")
	private String mId;
	@NotEmpty(message="비밀번호를 입력해주세요.")
	@Length(min=5, max=16, message="비밀번호는 5자이상 16자 미만입니다.")
	private String passwd;
	@NotEmpty(message="이름은 입력해주세요.")
	@Length(min=3, max=10, message="이름은 3자 이상 10자 미만입니다.")
	private String nickname;
	@NotEmpty(message="이메일 주소를 입력해주세요")
	@Email(message="이메일 형식에 맞게 작성해주세요.")
	private String email;
	
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
