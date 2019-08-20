package com.zubajie.entity;

public class BorrowGoodWithSimiliarity {
    private Integer BorrowGoodId;

    private Float similiarity;

    public  BorrowGoodWithSimiliarity(Integer BorrowGoodId,float similiarity){
        this.setBorrowGoodId(BorrowGoodId);
        this.setSimiliarity(similiarity);
    }

    public Integer getBorrowGoodId() {
        return BorrowGoodId;
    }

    public void setBorrowGoodId(Integer groupId) {
        this.BorrowGoodId = groupId;
    }

    public Float getSimiliarity() {
        return similiarity;
    }

    public void setSimiliarity(float similiarity) {
        this.similiarity = similiarity;
    }
}
