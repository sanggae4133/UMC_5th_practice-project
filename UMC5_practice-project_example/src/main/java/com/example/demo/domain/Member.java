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
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@DynamicUpdate
@DynamicInsert
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 20)
	private String name;

	@Column(nullable = false, length = 40)
	private String address;

	@Column(nullable = false, length = 40)
	private String specAddress;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "VARCHAR(10)")
	private Gender gender;

	@Enumerated(EnumType.STRING)
	private SocialType socialType;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
	private MemberStatus status;

	private LocalDate inactiveDate;

	//    @Column(nullable = false, length = 50)
	private String email;

	@ColumnDefault("0")
	private Integer point;

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberAgree> memberAgreeList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberPrefer> memberPreferList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<Review> reviewList = new ArrayList<>();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<MemberMission> memberMissionList = new ArrayList<>();
}