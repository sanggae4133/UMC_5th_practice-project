package com.example.demo.web.dto.Member;

import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.MemberStatus;
import com.example.demo.domain.enums.SocialType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Getter
@Builder
public class ExMemberUpdateResponseDto {

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

    public ExMemberUpdateResponseDto(String name, String address, String specAddress, Gender gender, SocialType socialType, MemberStatus memberStatus, LocalDate inactiveDate, String email, Integer point) {
        this.name = name;
        this.address = address;
        this.specAddress = specAddress;
        this.gender = gender;
        this.socialType = socialType;
        this.memberStatus = memberStatus;
        this.inactiveDate = inactiveDate;
        this.email = email;
        this.point = point;
    }
}

