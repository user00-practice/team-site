package com.example.teamsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * チームメンバー紹介サイト エントリーポイント
 *
 * 起動後 → http://localhost:8080 でトップページが開きます。
 *
 * [IntelliJでの実行]
 * このファイルの左余白 ▶ →「TeamSiteApplication の実行」
 */
@SpringBootApplication
public class TeamSiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeamSiteApplication.class, args);
    }
}
