package com.ldj.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data//Getter, Setter 생성
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    //DTO ==> 값을 전달할때 사용하는 규격
    private Integer bno;
    private String title;
    private String content;
    private String writer;

    //일자,시간
    private LocalDateTime regDate;
    private LocalDateTime updateDate;


}
