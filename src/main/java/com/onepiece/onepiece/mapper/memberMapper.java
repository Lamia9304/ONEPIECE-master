package com.onepiece.onepiece.mapper;

import com.onepiece.onepiece.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper        // Mapper라고 선언함
public interface memberMapper {
    // 여기서 지정한 메서드의 이름은 쿼리의 이름과 동일해야 함 (selectBoardList)
    List<BoardDTO> selectBoardList() throws Exception;
    public BoardDTO getBoard(int CHAR_ID) throws Exception;

    List<BoardDTO> getGRP(String CHAR_GRP) throws Exception;

    List<BoardDTO> selectGrpList() throws Exception;
}