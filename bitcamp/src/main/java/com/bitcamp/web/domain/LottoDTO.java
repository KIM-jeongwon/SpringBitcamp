package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class LottoDTO {
	private String randomNum,
	lottoNumber,
	money,
	count;//횟

	@Override
	public String toString() {
		return "\n[" + lottoNumber + "]";
	}
	
}
