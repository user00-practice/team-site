package com.example.teamsite.service;

import com.example.teamsite.entity.Member;
import com.example.teamsite.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * メンバーサービス
 *
 * 【講師が用意する共通クラス】
 * 参加者はこのクラスを変更しません。
 * 各自の Controller からこの Service を呼び出して使います。
 */
@Service
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    /** 全メンバーを取得します（一覧ページ用）。 */
    public List<Member> findAll() {
        return repository.findAll();
    }

    /**
     * スラグでメンバーを取得します。
     * 見つからない場合は例外をスローします。
     */
    public Member findBySlug(String slug) {
        return repository.findBySlug(slug)
                .orElseThrow(() -> new IllegalArgumentException(
                        "メンバーが見つかりません: " + slug));
    }
}
