package com.ldj.domain;


import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor //모든 필드값을 파라메터로 쓰는 생성자 생성
@NoArgsConstructor //파라메터가 없는 생성자 생성
@Getter //단순 필드값 리턴[수정 불가]
@ToString //ToString 메서드 생성
@Builder //Builder 디자인패턴 생성
public class Board {
    private Integer bno;
    private String title;
    private String content;
    private String writer;

    //일자,시간
    private LocalDateTime regDate;
    private LocalDateTime updateDate;



}
