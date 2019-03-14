package com.juyoung.book.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 기본 생성자로 생성하는 것을 막고, JPA에서 ENtity 클래스 생성하는 것은 허용하기 위해 추가
public class Books {

//    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성규칙, default : auto_increment
//    GenerateValue Type : AUTO, IDENTITY(auto_increment), SEQUENCE, TABLE
//    @Column(name = "id", updatable = false)
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 500 , nullable = false)
    private String title;
    private String author;
    @Column(name = "summary", columnDefinition = "TEXT")
    private String summary;
    @Column(name = "level")
    private int level;
    @Column(name = "isopen")
    private boolean isopen;
    private int hit;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Builder
    public Books(String title, String author, String summary, int level, boolean isopen, int hit) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.level = level;
        this.isopen = isopen;
        this.hit = hit;
    }
}
