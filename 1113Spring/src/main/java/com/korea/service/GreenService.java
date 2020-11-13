package com.korea.service;

import java.util.List;

import com.korea.domain.GreenVO;
import com.korea.domain.MergeVO;

public interface GreenService {
	public List<GreenVO> getListGreen();
	public GreenVO getOneGreen(Long gid);
	public void modGreed(GreenVO vo);
	
	public void repeatM(String one, String two, int a);
	public List<MergeVO> getMergs();
	

}
