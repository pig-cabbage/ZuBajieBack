package com.zubajie.entity;

import java.io.Serializable;
import java.util.Date;

public class LendGoods implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.lend_id
     *
     * @mbg.generated
     */
    private Integer lendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.price
     *
     * @mbg.generated
     */
    private String price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.photo_number
     *
     * @mbg.generated
     */
    private Integer photoNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.tag
     *
     * @mbg.generated
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.period_of_validity
     *
     * @mbg.generated
     */
    private Integer periodOfValidity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.state
     *
     * @mbg.generated
     */
    private boolean state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lend_goods.view_count
     *
     * @mbg.generated
     */
    private Integer viewCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lend_goods
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.lend_id
     *
     * @return the value of lend_goods.lend_id
     *
     * @mbg.generated
     */
    public Integer getLendId() {
        return lendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.lend_id
     *
     * @param lendId the value for lend_goods.lend_id
     *
     * @mbg.generated
     */
    public void setLendId(Integer lendId) {
        this.lendId = lendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.user_id
     *
     * @return the value of lend_goods.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.user_id
     *
     * @param userId the value for lend_goods.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.create_time
     *
     * @return the value of lend_goods.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.create_time
     *
     * @param createTime the value for lend_goods.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.price
     *
     * @return the value of lend_goods.price
     *
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.price
     *
     * @param price the value for lend_goods.price
     *
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.description
     *
     * @return the value of lend_goods.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.description
     *
     * @param description the value for lend_goods.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.photo_number
     *
     * @return the value of lend_goods.photo_number
     *
     * @mbg.generated
     */
    public Integer getPhotoNumber() {
        return photoNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.photo_number
     *
     * @param photoNumber the value for lend_goods.photo_number
     *
     * @mbg.generated
     */
    public void setPhotoNumber(Integer photoNumber) {
        this.photoNumber = photoNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.tag
     *
     * @return the value of lend_goods.tag
     *
     * @mbg.generated
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.tag
     *
     * @param tag the value for lend_goods.tag
     *
     * @mbg.generated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.title
     *
     * @return the value of lend_goods.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.title
     *
     * @param title the value for lend_goods.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.period_of_validity
     *
     * @return the value of lend_goods.period_of_validity
     *
     * @mbg.generated
     */
    public Integer getPeriodOfValidity() {
        return periodOfValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.period_of_validity
     *
     * @param periodOfValidity the value for lend_goods.period_of_validity
     *
     * @mbg.generated
     */
    public void setPeriodOfValidity(Integer periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.state
     *
     * @return the value of lend_goods.state
     *
     * @mbg.generated
     */
    public boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.state
     *
     * @param state the value for lend_goods.state
     *
     * @mbg.generated
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lend_goods.view_count
     *
     * @return the value of lend_goods.view_count
     *
     * @mbg.generated
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lend_goods.view_count
     *
     * @param viewCount the value for lend_goods.view_count
     *
     * @mbg.generated
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lend_goods
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lendId=").append(lendId);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", price=").append(price);
        sb.append(", description=").append(description);
        sb.append(", photoNumber=").append(photoNumber);
        sb.append(", tag=").append(tag);
        sb.append(", title=").append(title);
        sb.append(", periodOfValidity=").append(periodOfValidity);
        sb.append(", state=").append(state);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}