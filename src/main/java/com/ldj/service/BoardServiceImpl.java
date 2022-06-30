package com.ldj.service;

import com.ldj.domain.Board;
import com.ldj.dto.BoardDTO;
import com.ldj.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private BoardMapper boardMapper;
    private ModelMapper modelMapper;

    @Override
    public void timecheck() {

    }

    @Override
    public void insert(BoardDTO boardDTO) {
        Board board = modelMapper.map(boardDTO,Board.class);
        log.info(board);
        boardMapper.insert(board);
    }

}
