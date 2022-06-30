package com.ldj.mapper;

import com.ldj.domain.Board;
import org.apache.ibatis.annotations.Select;

public interface BoardMapper {

    String getTime();

    void insert(Board board);
}
