package com.example.demo.web.dto;

import com.example.demo.domain.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SignupRequestDto {

    private String name;

    private String address;

    private String specAddress;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    public SignupRequestDto(String name, String address, String specAddress, Gender gender, String email) {
        this.name = name;
        this.address = address;
        this.specAddress = specAddress;
        this.gender = gender;
        this.email = email;
    }
}
