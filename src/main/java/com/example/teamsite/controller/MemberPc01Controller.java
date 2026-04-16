package com.example.teamsite.controller;

import com.example.teamsite.entity.Member;
import com.example.teamsite.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * =====================================================
 * 【参加者が作るファイルのサンプル】PCT01 担当
 * =====================================================
 *
 * ■ 各参加者の作業
 *   このファイルをコピーして自分の PC 番号に書き換えます。
 *
 *   PCT02 の場合：
 *     ファイル名  → MemberPc02Controller.java
 *     クラス名   → MemberPc02Controller
 *     @GetMapping → "/members/pc02"
 *     findBySlug  → "pc02"
 *     return      → "members/pc02"
 *
 * ■ 担当ページの URL
 *   http://localhost:8080/members/pc01
 *
 * ■ 対応する HTML テンプレート
 *   src/main/resources/templates/members/pc01.html
 */
@Controller
public class MemberPc01Controller {

    private final MemberService memberService;

    public MemberPc01Controller(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/pc01")              // ← 自分の番号に変える
    public String show(Model model) {
        Member member = memberService.findBySlug("pc01");  // ← 自分の番号に変える
        model.addAttribute("member", member);
        return "members/pc01";                // ← 自分の番号に変える
    }
}
