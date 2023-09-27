package com.example.springjang.controller;

import com.example.springjang.dto.MemberForm;
import com.example.springjang.entity.Member;
import com.example.springjang.reprository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.internal.log.SubSystemLogging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/members/sign")
    public String newMemberform() {
        return "members/new";
    }

    @PostMapping("/members/create")
    public String createMemeber(MemberForm mform) {
        log.info(mform.toString());

        Member member = mform.toEntity();
        log.info(member.toString());

        Member saved = memberRepository.save(member);
        log.info(saved.toString());
        return "";
    }
}
