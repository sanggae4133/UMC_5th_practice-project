package com.example.demo.web.dto.Member;
import com.example.demo.domain.Review;
import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.MemberStatus;
import com.example.demo.domain.enums.SocialType;
import com.example.demo.domain.mapping.MemberAgree;
import com.example.demo.domain.mapping.MemberMission;
import com.example.demo.domain.mapping.MemberPrefer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@Builder
public class MemberDto {

    private Long id;

    private String name;

    private String address;

    private String specAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    private LocalDate inactiveDate;

    private String email;

    private Integer point;

    private List<MemberAgree> memberAgreeList = new ArrayList<>();

    private List<MemberPrefer> memberPreferList = new ArrayList<>();

    private List<Review> reviewList = new ArrayList<>();

    private List<MemberMission> memberMissionList = new ArrayList<>();


    public MemberDto(Long id, String name, String address, String specAddress, Gender gender, SocialType socialType, MemberStatus memberStatus, LocalDate inactiveDate, String email, Integer point, List<MemberAgree> memberAgreeList, List<MemberPrefer> memberPreferList, List<Review> reviewList, List<MemberMission> memberMissionList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.specAddress = specAddress;
        this.gender = gender;
        this.socialType = socialType;
        this.memberStatus = memberStatus;
        this.inactiveDate = inactiveDate;
        this.email = email;
        this.point = point;
        this.memberAgreeList = memberAgreeList;
        this.memberPreferList = memberPreferList;
        this.reviewList = reviewList;
        this.memberMissionList = memberMissionList;
    }
}
