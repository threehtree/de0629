package com.ldj.controller;


import com.ldj.dto.BoardDTO;
import com.ldj.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")

public class BoardControllerTests {
    @Autowired
    private BoardService boardService;

    @Test
    public void insert(){
        BoardDTO boardDTO = BoardDTO.builder()
                .bno(3)
                .content("코온텐트")
                .title("타아이틀")
                .writer("자악성자")
                .build();
        boardService.insert(boardDTO);
    }
}
