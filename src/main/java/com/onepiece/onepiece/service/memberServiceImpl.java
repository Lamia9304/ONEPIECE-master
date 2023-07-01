package com.onepiece.onepiece.service;

import com.onepiece.onepiece.dto.BoardDTO;
import com.onepiece.onepiece.mapper.memberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




    @Service //서비스임을 선언
    public class memberServiceImpl implements memberService{

        @Autowired //Mapper와 연결
        private memberMapper memberMapper;

        @Override
        public List<BoardDTO> selectBoardList() throws Exception {
            // TODO Auto-generated method stub
            return memberMapper.selectBoardList();
        }

        @Override
        public BoardDTO getBoard(int CHAR_ID) throws Exception {
            return memberMapper.getBoard(CHAR_ID);
        }

        @Override
        public List<BoardDTO> getGRP(String CHAR_GRP) throws Exception {
            return memberMapper.getGRP(CHAR_GRP);
        }

        @Override
        public List<BoardDTO> selectGrpList() throws Exception {
            return memberMapper.selectGrpList();
        }


    }

