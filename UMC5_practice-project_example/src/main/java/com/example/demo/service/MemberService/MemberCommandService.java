package com.example.demo.service.MemberService;

import com.example.demo.domain.Member;
import com.example.demo.web.dto.Member.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
