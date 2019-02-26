package com.juyoung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juyoung.domain.Member;

public interface MemberRepository extends JpaRepository<Member,Long>{

}