package com.wedding.items.pojo;

import java.util.Date;

public class Items {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_name
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String itemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_active_title
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String itemActiveTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_market_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer itemMarketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_fact_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer itemFactPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_final_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer itemFinalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_type
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer itemType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.main_pic
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String mainPic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.seller_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.shop_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.create_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.create_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.last_update_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.last_update_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private String lastUpdatePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.stat
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer stat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wd_items.item_status
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    private Integer itemStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.id
     *
     * @return the value of wd_items.id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.id
     *
     * @param id the value for wd_items.id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_name
     *
     * @return the value of wd_items.item_name
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_name
     *
     * @param itemName the value for wd_items.item_name
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_active_title
     *
     * @return the value of wd_items.item_active_title
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getItemActiveTitle() {
        return itemActiveTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_active_title
     *
     * @param itemActiveTitle the value for wd_items.item_active_title
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemActiveTitle(String itemActiveTitle) {
        this.itemActiveTitle = itemActiveTitle == null ? null : itemActiveTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_market_price
     *
     * @return the value of wd_items.item_market_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getItemMarketPrice() {
        return itemMarketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_market_price
     *
     * @param itemMarketPrice the value for wd_items.item_market_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemMarketPrice(Integer itemMarketPrice) {
        this.itemMarketPrice = itemMarketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_fact_price
     *
     * @return the value of wd_items.item_fact_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getItemFactPrice() {
        return itemFactPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_fact_price
     *
     * @param itemFactPrice the value for wd_items.item_fact_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemFactPrice(Integer itemFactPrice) {
        this.itemFactPrice = itemFactPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_final_price
     *
     * @return the value of wd_items.item_final_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getItemFinalPrice() {
        return itemFinalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_final_price
     *
     * @param itemFinalPrice the value for wd_items.item_final_price
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemFinalPrice(Integer itemFinalPrice) {
        this.itemFinalPrice = itemFinalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_type
     *
     * @return the value of wd_items.item_type
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getItemType() {
        return itemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_type
     *
     * @param itemType the value for wd_items.item_type
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.main_pic
     *
     * @return the value of wd_items.main_pic
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getMainPic() {
        return mainPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.main_pic
     *
     * @param mainPic the value for wd_items.main_pic
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setMainPic(String mainPic) {
        this.mainPic = mainPic == null ? null : mainPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.seller_id
     *
     * @return the value of wd_items.seller_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.seller_id
     *
     * @param sellerId the value for wd_items.seller_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.shop_id
     *
     * @return the value of wd_items.shop_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.shop_id
     *
     * @param shopId the value for wd_items.shop_id
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.create_time
     *
     * @return the value of wd_items.create_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.create_time
     *
     * @param createTime the value for wd_items.create_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.create_person
     *
     * @return the value of wd_items.create_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.create_person
     *
     * @param createPerson the value for wd_items.create_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.last_update_time
     *
     * @return the value of wd_items.last_update_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.last_update_time
     *
     * @param lastUpdateTime the value for wd_items.last_update_time
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.last_update_person
     *
     * @return the value of wd_items.last_update_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public String getLastUpdatePerson() {
        return lastUpdatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.last_update_person
     *
     * @param lastUpdatePerson the value for wd_items.last_update_person
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setLastUpdatePerson(String lastUpdatePerson) {
        this.lastUpdatePerson = lastUpdatePerson == null ? null : lastUpdatePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.stat
     *
     * @return the value of wd_items.stat
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.stat
     *
     * @param stat the value for wd_items.stat
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wd_items.item_status
     *
     * @return the value of wd_items.item_status
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public Integer getItemStatus() {
        return itemStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wd_items.item_status
     *
     * @param itemStatus the value for wd_items.item_status
     *
     * @mbggenerated Mon Jan 12 17:16:13 CST 2015
     */
    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }
}