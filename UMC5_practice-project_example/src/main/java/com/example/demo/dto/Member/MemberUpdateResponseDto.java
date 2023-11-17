package com.example.demo.dto.Member;

import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.SocialType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class MemberUpdateResponseDto {
    private  Long id;

    private String name;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    private String email;

    private Integer point;

    public MemberUpdateResponseDto(Long id, String name, String address, Gender gender, SocialType socialType, String email, Integer point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.socialType = socialType;
        this.email = email;
        this.point = point;
    }
}
