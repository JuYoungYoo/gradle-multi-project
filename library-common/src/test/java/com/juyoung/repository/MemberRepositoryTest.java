package com.juyoung.repository;

import com.juyoung.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void add() throws Exception {
        memberRepository.save(new Member("chloe","juy5790@outlook.com"));
        Member result = memberRepository.getOne(Long.valueOf(1));
        assertThat(result.getName(), is("chloe"));
    }
}