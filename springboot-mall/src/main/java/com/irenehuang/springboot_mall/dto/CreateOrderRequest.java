package com.irenehuang.springboot_mall.dto;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;

public class CreateOrderRequest {

    @NotEmpty // 驗證集合不為空
    private List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setBuyItemList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }

}
