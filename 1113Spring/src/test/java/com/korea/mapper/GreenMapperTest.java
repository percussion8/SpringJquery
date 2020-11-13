package com.korea.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.korea.domain.GreenVO;
import com.korea.domain.MergeVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		"file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class GreenMapperTest {
	@Setter(onMethod_=@Autowired)
	private GreenMapper mapper;
	
	//@Test
	public void getList() {
		mapper.getGreen().forEach(i->log.info(i));
	}
	
	//@Test
	public void getOne() {
		log.info(mapper.getOne((long) 3));
	}
	
	//@Test
	public void update() {
		GreenVO vo = new GreenVO();
		vo.setGid(3L);
		vo.setName("박재연");
		vo.setKorea("한글");
		vo.setMath("대수학");
		mapper.update(vo);
		
	}
	
	//@Test
	public void repeat() {
		MergeVO merge = new MergeVO();
		int a = 5;
		String str1 = "King";
		String str2 = "Monica";
		String str3 = "";
		for (int i = 0; i < a; i++) {
			str3 += str1 + str2;
		}
		merge.setMerged(str3);
		mapper.repeat(merge);
	}
	
	//@Test
	public void getmerged() {
		mapper.getMerges().forEach(i->log.info(i));
	}
}
