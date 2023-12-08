package com.example.demo.web.controller;

import com.example.demo.apiPlayload.ApiResponse;
import com.example.demo.converter.MemberConverter;
import com.example.demo.domain.Member;
import com.example.demo.service.MemberService.MemberCommandService;
import com.example.demo.web.dto.Member.MemberRequestDTO;
import com.example.demo.web.dto.Member.MemberResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }

}
