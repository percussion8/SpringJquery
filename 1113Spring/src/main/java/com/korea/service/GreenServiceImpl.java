package com.korea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.domain.GreenVO;
import com.korea.domain.MergeVO;
import com.korea.mapper.GreenMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GreenServiceImpl implements GreenService{
	private GreenMapper mapper;
	
	@Override
	public List<GreenVO> getListGreen() {
		System.out.println("서비스에서 getgreen");
		return mapper.getGreen();
	}

	@Override
	public GreenVO getOneGreen(Long gid) {
		System.out.println("서비스에서 getOnegreen");
		return mapper.getOne(gid);
	}

	@Override
	public void modGreed(GreenVO vo) {
		System.out.println("서비스에서 modGreen");
		mapper.update(vo);
		
	}

	@Override
	public void repeatM(String one, String two, int a) {
		String result = "";
		for (int i = 0; i < a; i++) {
			result += one + two;
		}
		MergeVO merge = new MergeVO();
		merge.setMerged(result);
		mapper.repeat(merge);
	}

	@Override
	public List<MergeVO> getMergs() {
		return mapper.getMerges();
		
	}
	
	

}
