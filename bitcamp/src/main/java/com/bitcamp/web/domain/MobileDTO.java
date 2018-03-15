package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MobileDTO {
 private String mobSeq,model,thumbnail;
}
