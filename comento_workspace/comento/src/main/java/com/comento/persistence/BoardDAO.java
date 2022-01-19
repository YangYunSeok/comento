package com.comento.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.comento.domain.BoardVO;

@Repository
public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	public BoardVO read(Integer bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(Integer bno) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}