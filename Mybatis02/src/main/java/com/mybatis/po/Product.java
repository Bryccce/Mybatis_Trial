package com.mybatis.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {
    private int pid;
    private String pname;
    private double price;
    private String category;
}
