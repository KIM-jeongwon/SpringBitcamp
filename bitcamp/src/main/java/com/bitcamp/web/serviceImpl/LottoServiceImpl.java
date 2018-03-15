
package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.controller.HomeController;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;
import com.sun.media.jfxmedia.logging.Logger;
@Service
public class LottoServiceImpl implements LottoService  {
    @Autowired LottoDTO lottoDTO;
  
    @Override
    public LottoDTO findLottoCount(LottoDTO param) {
        
        String count = (Integer.parseInt(param.getMoney())>100000)? "100": 
            (""+(Integer.parseInt(param.getMoney())/1000));
        lottoDTO.setCount(count);
        return lottoDTO;
    }

    @Override
    public LottoDTO createLotto() {
    	  
	int[] lottoNum = new int[6];
    LottoDTO lottos = new LottoDTO();
    for(int i=0; i<6; i++) {
      int num = (int)(Math.random()*44)+1;
      boolean exist = false;
      for(int j=0; j<lottoNum.length; j++) {
        if(num == lottoNum[j]) {
          exist = true;
          break;
        }
	      }
	    if(exist) {
	      i--;
	      continue;
	    }else {
	      lottoNum[i]=num;
	    }
    	}
	    Arrays.sort(lottoNum);
	    lottos.setLottoNumber(Arrays.toString(lottoNum));
	   
	    return lottos;
    	}

    @Override
    public List<LottoDTO> createLottos(LottoDTO param) {
        List<LottoDTO> list = new ArrayList<>();
        
        for (int i = 0; i < Integer.parseInt(findLottoCount(param).getCount()); i++) {
            list.add(createLotto());
        }
        
        return list;
    }

    }