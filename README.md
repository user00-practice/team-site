# チームメンバー紹介サイト

GitHub 共同開発トレーニング用 Spring Boot Webアプリです。

## 起動方法

1. このフォルダを IntelliJ IDEA で開く（`ファイル` → `開く...`）
2. Maven のインポートが完了するまで待つ
3. 右上「TeamSiteApplication」の ▶ をクリック
4. ブラウザで http://localhost:8080 にアクセス

## 技術スタック

| 項目 | 内容 |
|------|------|
| Java | SE17 以降 |
| Spring Boot | 3.2.5 |
| テンプレート | Thymeleaf |
| DB | H2（インメモリ） |
| ビルド | Maven |

## ファイル構成

```
src/main/java/com/example/teamsite/
├── TeamSiteApplication.java          ★ 起動クラス（講師用・変更不要）
├── entity/Member.java                ★ エンティティ（講師用・変更不要）
├── repository/MemberRepository.java  ★ DBアクセス（講師用・変更不要）
├── service/MemberService.java        ★ サービス（講師用・変更不要）
└── controller/
    ├── TopController.java            ★ トップページ（講師用・変更不要）
    └── MemberPc01Controller.java     ← 参加者が作るファイルのサンプル

src/main/resources/
├── data.sql                          ← 講師が参加人数に合わせて調整
├── templates/members/
│   └── pc01.html                    ← 参加者が作るページのサンプル
```

## 参加者の作業（1人あたり2ファイル）

### Controller（Java）

`MemberPc01Controller.java` をコピーして自分の番号に変更します。

```
PCT01 → MemberPc01Controller.java + templates/members/pc01.html
PCT02 → MemberPc02Controller.java + templates/members/pc02.html
（以降同様）
```

### ブランチ命名規則

```
feature/member-pc01  ← 自分の番号
feature/member-pc02
...
```

## 担当割り当て

| PC名  | スラグ | 担当ブランチ              |
|-------|--------|--------------------------|
| PCT01 | pc01   | feature/member-pc01      |
| PCT02 | pc02   | feature/member-pc02      |
| PCT03 | pc03   | feature/member-pc03      |
| PCT04 | pc04   | feature/member-pc04      |
| PCT05 | pc05   | feature/member-pc05      |
| PCT06 | pc06   | feature/member-pc06      |
| PCT07 | pc07   | feature/member-pc07      |
| PCT08 | pc08   | feature/member-pc08      |
| PCT09 | pc09   | feature/member-pc09      |
| PCT10 | pc10   | feature/member-pc10      |
