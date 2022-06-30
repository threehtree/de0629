package com.ldj.mapper;

import com.ldj.domain.Board;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")

public class BoardMapperTests {
    @Autowired(required = false)
    private BoardMapper boardMapper;

    @Test
    public void timeTest(){
        log.info("------------------------------");
        log.info(boardMapper.getClass().getName());
        log.info(boardMapper.getTime());
    }
    @Test
    public void insert(){
        Board board = Board.builder()
                .title("타이틀22")
                .content("내용")
                .writer("작성자")
                .build();
        boardMapper.insert(board);
    }
}
