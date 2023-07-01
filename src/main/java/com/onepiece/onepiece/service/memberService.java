package com.onepiece.onepiece.service;
import com.onepiece.onepiece.dto.BoardDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface memberService {

    List<BoardDTO> selectBoardList() throws Exception;

        BoardDTO getBoard(int CHAR_ID) throws Exception;

    List<BoardDTO> getGRP(String CHAR_GRP) throws Exception;

    List<BoardDTO> selectGrpList() throws Exception;

//    List<BoardDTO> selectBoardList(String grp) throws Exception;


}