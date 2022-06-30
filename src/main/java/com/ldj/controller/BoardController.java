package com.ldj.controller;

import com.ldj.dto.BoardDTO;
import com.ldj.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/list")
    public void list(){

    }

    @GetMapping("/register")
    public void registerGET(){
    }

    @PostMapping("/register")
    public void registerPOST(BoardDTO boardDTO, Model model){
        boardService.insert(boardDTO);
        model.addAttribute("result", "입력완료");
    }

}
