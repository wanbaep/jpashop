package jpabook.jpashop.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateItemDto {
    private String name;
    private String price;
    private String stockQuantity;
}
