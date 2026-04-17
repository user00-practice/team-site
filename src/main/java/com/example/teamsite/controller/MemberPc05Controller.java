package com.example.teamsite.controller;

import com.example.teamsite.entity.Member;
import com.example.teamsite.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberPc05Controller {         // ★ 自分の番号に変える

    private final MemberService memberService;

    public MemberPc05Controller(MemberService memberService) {  // ★ 自分の番号
        this.memberService = memberService;
    }

    @GetMapping("/members/pc05")           // ★ 自分のスラグに変える
    public String show(Model model) {
        Member member = memberService.findBySlug("pc05");  // ★ 自分のスラグ
        model.addAttribute("member", member);
        return "members/pc05";              // ★ 自分のスラグに変える
    }
}
