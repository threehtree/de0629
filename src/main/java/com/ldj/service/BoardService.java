package com.ldj.service;

import com.ldj.dto.BoardDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoardService {
    void timecheck();
    void insert(BoardDTO boardDTO);
}
