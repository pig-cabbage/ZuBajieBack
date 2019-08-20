package com.zubajie.entity;

public class LendGoodWithSimiliarity {
    private Integer LendGoodId;

    private Float similiarity;

    public  LendGoodWithSimiliarity(Integer LendGoodId,float similiarity){
        this.setLendGoodId(LendGoodId);
        this.setSimiliarity(similiarity);
    }

    public Integer getLendGoodId() {
        return LendGoodId;
    }

    public void setLendGoodId(Integer groupId) {
        this.LendGoodId = groupId;
    }

    public Float getSimiliarity() {
        return similiarity;
    }

    public void setSimiliarity(float similiarity) {
        this.similiarity = similiarity;
    }
}
