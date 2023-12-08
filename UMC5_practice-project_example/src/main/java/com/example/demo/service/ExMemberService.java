package com.example.demo.service;


import com.example.demo.domain.Member;
import com.example.demo.web.dto.Member.MemberDto;
import com.example.demo.web.dto.Member.ExMemberUpdateRequestDto;
import com.example.demo.web.dto.Member.ExMemberUpdateResponseDto;
import com.example.demo.web.dto.SignupRequestDto;
import com.example.demo.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static com.example.demo.domain.enums.MemberStatus.ACTIVE;
import static com.example.demo.domain.enums.SocialType.KAKAO;

@Service
@RequiredArgsConstructor
public class ExMemberService {

	private final MemberRepository memberRepository;

	// 	1. 엔티티 저장하는 방법 -> repository.save() 호출
	@Transactional
	public Long join(SignupRequestDto request) {
		Member member = Member.builder()
				.name(request.getName())
				.address(request.getAddress())
				.specAddress(request.getSpecAddress())
				.gender(request.getGender())
				.socialType(KAKAO)
				.status(ACTIVE)
				.inactiveDate(LocalDate.now())
				.email(request.getEmail())
				.point(0)
				.build();
		Member savedMember = memberRepository.save(member);
		return savedMember.getId();
	}


	// 	2. 엔티티를 ID로 조회하는 방법 -> repository.findById() 호출
	public MemberDto findMemberById(Long memberId) {
		Member member = memberRepository.findById(memberId).orElseThrow();

		return MemberDto.builder()
				.id(member.getId())
				.name(member.getName())
				.address(member.getAddress())
				.specAddress(member.getSpecAddress())
				.gender(member.getGender())
				.socialType(member.getSocialType())
				.memberStatus(member.getStatus())
				.inactiveDate(member.getInactiveDate())
				.email(member.getEmail())
				.point(member.getPoint())
				.build();
	}

/*
	// 	3. 엔티티를 업데이트하는 방법 -> repository.findById()를 호출한 뒤 setter로 필드값들을 변경해준다.
	@Transactional
	public ExMemberUpdateResponseDto updateMember(ExMemberUpdateRequestDto request) {
		//Optional<Member> optionalMember = memberRepository.findById(request.getId());
		Member member = memberRepository.findById(request.getId()).orElseThrow();

		member.setName(request.getName());
		member.setAddress(request.getAddress());
		member.setSpecAddress(request.getSpecAddress());
		member.setGender(request.getGender());
		member.setSocialType(request.getSocialType());
		member.setMemberStatus(request.getMemberStatus());
		member.setInactiveDate(request.getInactiveDate());
		member.setEmail(request.getEmail());
		member.setPoint(request.getPoint());

		return ExMemberUpdateResponseDto.builder()
				.name(member.getName())
				.address(member.getAddress())
				.specAddress(member.getSpecAddress())
				.gender(member.getGender())
				.socialType(member.getSocialType())
				.memberStatus(member.getStatus())
				.inactiveDate(member.getInactiveDate())
				.email(member.getEmail())
				.point(member.getPoint())
				.build();
	}

 */
}

