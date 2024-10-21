package com.example.lib.controller;

import com.example.lib.model.Member;
import com.example.lib.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/get")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/get{id}")
    public Member getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    @PostMapping("/save")
    public Member saveMember(Member member) {
        return memberService.saveMember(member);
    }
}
