package com.ldj.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data//Getter, Setter 생성
public class BoardDTO {
    //DTO ==> 값을 전달할때 사용하는 규격
    private int bno;
    private String title;
    private String content;
    private String writer;

    //일자,시간
    private LocalDateTime regDate;
    private LocalDateTime upDate;


}
