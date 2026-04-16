package com.example.teamsite.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * カスタムエラーコントローラー
 *
 * 【講師が用意する共通クラス】参加者は変更しません。
 *
 * Spring Boot デフォルトの「Whitelabel Error Page」の代わりに
 * error.html を表示します。
 *
 * 404 の主な発生ケース：
 *   - 参加者がまだ Controller を作っていないページへのアクセス
 *     例：PCT02 担当者が MemberPc02Controller.java を作る前に
 *         /members/pc02 へアクセスした場合
 * → 「このページはまだ作成されていません」と表示されます。
 */
@Controller
@RequestMapping("/error")
public class CustomErrorController implements ErrorController {

    @RequestMapping
    public String handleError(HttpServletRequest request, Model model) {
        Integer statusCode = (Integer) request.getAttribute(
                "jakarta.servlet.error.status_code");

        if (statusCode != null && statusCode == HttpStatus.NOT_FOUND.value()) {
            // リクエストされた URL を取得
            String requestUri = (String) request.getAttribute(
                    "jakarta.servlet.error.request_uri");
            model.addAttribute("message",
                    "URL: " + (requestUri != null ? requestUri : "不明"));
        } else {
            model.addAttribute("message", "予期しないエラーが発生しました。");
        }
        return "error";
    }
}
