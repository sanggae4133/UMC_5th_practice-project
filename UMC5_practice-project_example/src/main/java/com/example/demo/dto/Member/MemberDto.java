package com.example.demo.dto.Member;
import com.example.demo.domain.enums.Gender;
import com.example.demo.domain.enums.SocialType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Getter
public class MemberDto {

    private Long id;

    private String name;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    private String email;

    private Integer point;

    public MemberDto(Long id, String name, String address, Gender gender, SocialType socialType, String email, Integer point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.socialType = socialType;
        this.email = email;
        this.point = point;
    }
}
