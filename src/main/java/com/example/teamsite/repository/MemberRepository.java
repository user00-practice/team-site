package com.example.teamsite.repository;

import com.example.teamsite.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * メンバーリポジトリ
 *
 * 【講師が用意する共通クラス】
 * 参加者はこのクラスを変更しません。
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    /** スラグ（URL の末尾）でメンバーを検索します。 */
    Optional<Member> findBySlug(String slug);
}
