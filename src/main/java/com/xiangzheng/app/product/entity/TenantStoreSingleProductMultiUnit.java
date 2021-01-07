package com.xiangzheng.app.product.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 门店单品多单位信息表
 * </p>
 *
 * @author gaohaoyou
 * @since 2021-01-06
 */
@TableName("tenant_store_single_product_multi_unit")
public class TenantStoreSingleProductMultiUnit extends Model<TenantStoreSingleProductMultiUnit> {

    private static final long serialVersionUID = 1L;

    /**
     * 门店单品多单位ID
     */
    @TableId(value = "store_single_product_multi_unit_id", type = IdType.AUTO)
    private Long storeSingleProductMultiUnitId;
    /**
     * 价格片区ID
     */
    @TableField("areagroup_price_id")
    private Integer areagroupPriceId;
    /**
     * 商品库单品多单位ID
     */
    @TableField("single_product_multi_unit_id")
    private Long singleProductMultiUnitId;
    /**
     * 计量单位内部ID
     */
    @TableField("unit_inner_id")
    private Integer unitInnerId;
    /**
     * 商品库商品多单位ID
     */
    @TableField("product_multi_unit_id")
    private Long productMultiUnitId;
    /**
     * 单品内部ID
     */
    @TableField("single_product_inner_id")
    private Long singleProductInnerId;
    /**
     * 单品第三方编号
     */
    @TableField("store_single_product_third_code")
    private String storeSingleProductThirdCode;
    /**
     * 价格片区浮率
     */
    @TableField("areagroup_price_rate")
    private BigDecimal areagroupPriceRate;
    /**
     * 价格片区实际价格
     */
    @TableField("areagroup_price")
    private BigDecimal areagroupPrice;
    /**
     * 创建日期
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 更新日期
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 操作的员工账号ID 没有操作人或者是系统自动任务则是-1
     */
    @TableField("oper_user")
    private Integer operUser;
    /**
     * 软删除 0未删除 1已删除
     */
    @TableField("is_del")
    private Integer isDel;
    /**
     * 零售价
     */
    @TableField("retail_price")
    private BigDecimal retailPrice;


    public Long getStoreSingleProductMultiUnitId() {
        return storeSingleProductMultiUnitId;
    }

    public void setStoreSingleProductMultiUnitId(Long storeSingleProductMultiUnitId) {
        this.storeSingleProductMultiUnitId = storeSingleProductMultiUnitId;
    }

    public Integer getAreagroupPriceId() {
        return areagroupPriceId;
    }

    public void setAreagroupPriceId(Integer areagroupPriceId) {
        this.areagroupPriceId = areagroupPriceId;
    }

    public Long getSingleProductMultiUnitId() {
        return singleProductMultiUnitId;
    }

    public void setSingleProductMultiUnitId(Long singleProductMultiUnitId) {
        this.singleProductMultiUnitId = singleProductMultiUnitId;
    }

    public Integer getUnitInnerId() {
        return unitInnerId;
    }

    public void setUnitInnerId(Integer unitInnerId) {
        this.unitInnerId = unitInnerId;
    }

    public Long getProductMultiUnitId() {
        return productMultiUnitId;
    }

    public void setProductMultiUnitId(Long productMultiUnitId) {
        this.productMultiUnitId = productMultiUnitId;
    }

    public Long getSingleProductInnerId() {
        return singleProductInnerId;
    }

    public void setSingleProductInnerId(Long singleProductInnerId) {
        this.singleProductInnerId = singleProductInnerId;
    }

    public String getStoreSingleProductThirdCode() {
        return storeSingleProductThirdCode;
    }

    public void setStoreSingleProductThirdCode(String storeSingleProductThirdCode) {
        this.storeSingleProductThirdCode = storeSingleProductThirdCode;
    }

    public BigDecimal getAreagroupPriceRate() {
        return areagroupPriceRate;
    }

    public void setAreagroupPriceRate(BigDecimal areagroupPriceRate) {
        this.areagroupPriceRate = areagroupPriceRate;
    }

    public BigDecimal getAreagroupPrice() {
        return areagroupPrice;
    }

    public void setAreagroupPrice(BigDecimal areagroupPrice) {
        this.areagroupPrice = areagroupPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getOperUser() {
        return operUser;
    }

    public void setOperUser(Integer operUser) {
        this.operUser = operUser;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public BigDecimal getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(BigDecimal retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    protected Serializable pkVal() {
        return this.storeSingleProductMultiUnitId;
    }

    @Override
    public String toString() {
        return "TenantStoreSingleProductMultiUnit{" +
        ", storeSingleProductMultiUnitId=" + storeSingleProductMultiUnitId +
        ", areagroupPriceId=" + areagroupPriceId +
        ", singleProductMultiUnitId=" + singleProductMultiUnitId +
        ", unitInnerId=" + unitInnerId +
        ", productMultiUnitId=" + productMultiUnitId +
        ", singleProductInnerId=" + singleProductInnerId +
        ", storeSingleProductThirdCode=" + storeSingleProductThirdCode +
        ", areagroupPriceRate=" + areagroupPriceRate +
        ", areagroupPrice=" + areagroupPrice +
        ", createDate=" + createDate +
        ", updateDate=" + updateDate +
        ", operUser=" + operUser +
        ", isDel=" + isDel +
        ", retailPrice=" + retailPrice +
        "}";
    }
}
