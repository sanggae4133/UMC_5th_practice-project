package com.example.demo.service;


import com.example.demo.domain.Member;
import com.example.demo.dto.Member.MemberDto;
import com.example.demo.dto.Member.MemberRequestDto;
import com.example.demo.dto.Member.MemberUpdateRequestDto;
import com.example.demo.dto.Member.MemberUpdateResponseDto;
import com.example.demo.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;


	// 	1. 엔티티 저장하는 방법 -> repository.save() 호출
	@Transactional
	public Long save(MemberRequestDto request) {
		Member member = new Member(request.getName(), request.getAddress());
		Member savedMember = memberRepository.save(member);
		return savedMember.getId();
	}


	// 	2. 엔티티를 ID로 조회하는 방법 -> repository.findById() 호출
	public MemberDto getMember(Long memberId) {
		Optional<Member> optionalMember = memberRepository.findById(memberId);
		Member member = optionalMember.get();

		MemberDto memberDto = new MemberDto(member.getId(), member.getName(), member.getAddress());

		return memberDto;
	}


	// 	3. 엔티티를 업데이트하는 방법 -> repository.findById()를 호출한 뒤 setter로 필드값들을 변경해준다.
	@Transactional
	public MemberUpdateResponseDto setMemberRepository(MemberUpdateRequestDto request) {
		Optional<Member> optionalMember = memberRepository.findById(request.getId());
		Member member = optionalMember.get();

		member.setName(request.getName());
		member.setAddress(request.getAddress());

		return new MemberUpdateResponseDto(
				member.getName(),
				member.getAddress()
		);
	}



}
