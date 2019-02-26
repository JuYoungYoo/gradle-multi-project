package com.juyoung.service;

import com.juyoung.domain.Member;
import org.springframework.stereotype.Service;
import com.juyoung.repository.*;

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    // @Autowired X : SpringMVC에 종속적이게 되어, 생성자 주입방식으로 변환
    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup(Member member){
        return memberRepository.save(member).getId();
    }
}
