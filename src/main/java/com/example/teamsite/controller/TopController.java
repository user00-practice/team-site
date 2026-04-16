package com.example.teamsite.controller;

import com.example.teamsite.entity.Member;
import com.example.teamsite.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * トップページコントローラー
 *
 * 【講師が用意する共通クラス】参加者は変更しません。
 */
@Controller
public class TopController {

    private final MemberService memberService;

    public TopController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Member> members = memberService.findAll();

        // 進捗カウントをサーバー側で計算（Thymeleaf の SpEL はラムダ非対応）
        long readyCount = members.stream()
                .filter(Member::isPageReady)
                .count();

        model.addAttribute("members",    members);
        model.addAttribute("readyCount", readyCount);
        model.addAttribute("totalCount", members.size());
        return "index";
    }
}


/**
 * グローバル例外ハンドラー
 *
 * 【講師が用意する共通クラス】参加者は変更しません。
 */
@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleNotFound(IllegalArgumentException ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "error";
    }
}
