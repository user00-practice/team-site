package com.example.teamsite.entity;

import jakarta.persistence.*;

/**
 * メンバーエンティティ
 *
 * 【講師が用意する共通クラス】参加者は変更しません。
 */
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** PC名（例：PCT01） */
    @Column(name = "pc_name", nullable = false, length = 10)
    private String pcName;

    /** URL スラグ（例：pc01）→ /members/pc01 でアクセス */
    @Column(nullable = false, unique = true, length = 10)
    private String slug;

    /** 一言紹介（一覧ページに表示） */
    @Column(length = 200)
    private String tagline;

    /** 担当ページが完成しているか */
    @Column(nullable = false)
    private boolean pageReady = false;

    public Member() {}

    public Long    getId()                    { return id; }
    public String  getPcName()                { return pcName; }
    public void    setPcName(String pcName)   { this.pcName = pcName; }
    public String  getSlug()                  { return slug; }
    public void    setSlug(String slug)       { this.slug = slug; }
    public String  getTagline()               { return tagline; }
    public void    setTagline(String tagline) { this.tagline = tagline; }
    public boolean isPageReady()              { return pageReady; }
    public void    setPageReady(boolean r)    { this.pageReady = r; }
}
