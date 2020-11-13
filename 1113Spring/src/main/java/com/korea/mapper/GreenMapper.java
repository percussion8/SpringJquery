package com.korea.mapper;

import java.util.List;
import com.korea.domain.GreenVO;
import com.korea.domain.MergeVO;

public interface GreenMapper {
	public List<GreenVO> getGreen();
	public GreenVO getOne(Long gid);
	public void update(GreenVO vo);

	public void repeat(MergeVO merge);
	public List<MergeVO> getMerges();
}
