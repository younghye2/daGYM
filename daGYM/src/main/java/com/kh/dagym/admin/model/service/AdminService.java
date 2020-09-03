package com.kh.dagym.admin.model.service;

import java.util.List;

import com.kh.dagym.admin.model.vo.Board;
import com.kh.dagym.admin.model.vo.Member;
import com.kh.dagym.admin.model.vo.Page;
import com.kh.dagym.admin.model.vo.Reply;
import com.kh.dagym.admin.model.vo.Trainer;

public interface AdminService {

	/** 회원 전체 조회 Service
	 * @return mList
	 */
	public abstract List<Member> selectMList();

	/** 트레이너 전체 조회 Service
	 * @return tList
	 */
	public abstract List<Trainer> selectTList();

	/** 1:1 문의 조회 Service
	 * @return iList
	 */
	public abstract List<Board> selectIList(Page pInfo);

	/** 1:1 문의 답변 Service
	 * @param reply
	 * @return result
	 */
	public abstract int insertAnswer(Reply reply);

	/** 페이징처리 Service
	 * @param cp
	 * @return pInfo
	 */
	public abstract Page pagination(int type, int cp);

}