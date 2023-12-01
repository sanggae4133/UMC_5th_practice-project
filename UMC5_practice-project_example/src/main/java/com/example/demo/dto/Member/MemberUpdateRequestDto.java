package com.example.demo.dto.Member;

import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.MemberStatus;
import com.example.demo.domain.enums.SocialType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Getter
public class MemberUpdateRequestDto {
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
}

