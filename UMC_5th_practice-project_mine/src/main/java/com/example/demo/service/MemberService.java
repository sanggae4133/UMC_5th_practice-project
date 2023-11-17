package com.example.demo.service;

public class MemberService {
	private final MemberService memberService;

	public MemberService(MemberService memberService) {
		this.memberService = memberService;
	}

// 	1. 엔티티 저장하는 방법 -> repository.save() 호출
// 	2. 엔티티를 ID로 조회하는 방법 -> repository.findById() 호출
// 	3. 엔티티를 업데이트하는 방법 -> repository.findById()를 호출한 뒤 setter로 필드값들을 변경해준다.
}
