package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.domain.LottoDTO;
@Component
public interface LottoService {
	public LottoDTO findLottoCount(LottoDTO param);
	public LottoDTO createLotto(); //2,4,13,20,33,41
	public List<LottoDTO> createLottos(LottoDTO param); /*
	*2,4,13,20,33,41
	*2,4,13,20,33,41
	*2,4,13,20,33,41
	*2,4,13,20,33,41
	*2,4,13,20,33,41
	*/

}
