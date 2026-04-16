package com.example.teamsite.controller;

import com.example.teamsite.entity.Member;
import com.example.teamsite.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * =====================================================
 * 【参加者が作るファイルのサンプル】
 * =====================================================
 *
 * このファイルは「山田」さん担当の見本です。
 * 各自は自分の名前に置き換えてコピーして作成します。
 *
 * ファイル名の例：
 *   MemberSuzukiController.java  → 鈴木さん担当
 *   MemberSatoController.java    → 佐藤さん担当
 *
 * 担当ページの URL：
 *   http://localhost:8080/members/yamada
 *
 * 対応するHTMLテンプレート：
 *   src/main/resources/templates/members/yamada.html
 */
@Controller
public class MemberYamadaController {

    private final MemberService memberService;

    // ① MemberService をコンストラクタインジェクションで受け取ります
    public MemberYamadaController(MemberService memberService) {
        this.memberService = memberService;
    }

    /**
     * 山田さんの紹介ページ
     * GET /members/yamada
     *
     * ② スラグ（"yamada"）でメンバー情報をDBから取得してテンプレートに渡します。
     *    スラグは data.sql の slug カラムと一致させてください。
     */
    @GetMapping("/members/yamada")
    public String show(Model model) {
        Member member = memberService.findBySlug("yamada");
        model.addAttribute("member", member);
        return "members/yamada";   // ③ templates/members/yamada.html を表示
    }
}
