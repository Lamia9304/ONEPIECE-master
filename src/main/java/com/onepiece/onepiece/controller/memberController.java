package com.onepiece.onepiece.controller;

import com.onepiece.onepiece.dto.BoardDTO;
import com.onepiece.onepiece.service.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class memberController {


    @Autowired
    private memberService memberService; //서비스와 연결



//    @RequestMapping("/board") //노테이션의 값으로 주소 지정
//    public ModelAndView openBoardList() throws Exception{
//        //templates 폴더 아래있는 /boardList.html을 의미함. Thymeleaf와 같은 템플릿엔진을 사용할 경우 스프링 부트의 자동 설정 기능으로 '.html'과 같은 접미사 생략 가능
//        ModelAndView mv = new ModelAndView("/boardList");
//        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
//        List<BoardDTO> list = memberService.selectBoardList();
//        mv.addObject("list", list);
//        return mv;
//    }

    @RequestMapping("/board")
    public ModelAndView openBoardList() throws Exception{
        //templates 폴더 아래있는 /boardList.html을 의미함. Thymeleaf와 같은 템플릿엔진을 사용할 경우 스프링 부트의 자동 설정 기능으로 '.html'과 같은 접미사 생략 가능
        ModelAndView mv = new ModelAndView("/boardList");
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
        List<BoardDTO> list = memberService.selectGrpList();
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping(value="/board/view",method = RequestMethod.GET)
   public String getBoard(Model model, @RequestParam(value="id",required = false) Integer CHAR_ID) throws Exception {
        BoardDTO dto=memberService.getBoard((CHAR_ID));
        model.addAttribute("dto",dto);
        System.out.println(dto.getCodeDTO().getCOMM_NM());

        return "boardView";
    }
    @RequestMapping("/board/sr") //노테이션의 값으로 주소 지정
    public String getGRP(Model model,@RequestParam(value="grp",required = false) String CHAR_GRP) throws Exception{
        List<BoardDTO> list = memberService.getGRP(CHAR_GRP);
        model.addAttribute("list",list);
        return "boardList3";
    }



}