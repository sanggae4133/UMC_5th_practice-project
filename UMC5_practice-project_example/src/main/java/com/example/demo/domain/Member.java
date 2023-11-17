package com.example.demo.domain;


// Member의 구성요소 - id, 이름, 닉네임, 나이, 성별
// 각 필드의 타입은 본인이 원하는대로 하면됩니다.
// 여기에 뭐가 들어갈까요?

import com.example.demo.domain.common.BaseEntity;
import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.MemberStatus;
import com.example.demo.domain.enums.SocialType;
import com.example.demo.domain.mapping.MemberAgree;
import com.example.demo.domain.mapping.MemberMission;
import com.example.demo.domain.mapping.MemberPrefer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
@Setter
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// 여기에 뭐가 들어갈까요?
	private Long id;

	// 나머지 필드를 선언해주세요

	private String name;

	private String address;

	private String specAddress;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "VARCHAR(10)")
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private SocialType socialType;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
	private MemberStatus memberStatus;

	private LocalDate inactiveDate;

	private String email;

	private Integer point;

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberAgree> memberAgreeList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberPrefer> memberPreferList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Review> reviewList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberMission> memberMissionList = new ArrayList<>();

	// 생성자와 Getter, Setter 도 필요합니다
	// Setter 는 안쓰는것이 좋지만 예제의 복잡도를 줄이기 위해 그냥 과제에서는 쓰는것으로 합니다

	//**
	// * 이건 지우지말고 냅두세요
	// */

	/*
	protected Member() {
	}

	*/

}
