package com.bugu.dto;

import java.util.Date;

/**
 * 产品基础信息表
 *
 * @author zhangwenhao
 * @date 2023-05-31 10:35
 */
public class UtpProductInfoDTO {
    private String productId;

    private String productNo;

    private String productName;

    private String productShortName;

    private String productTags;

    private String productTypeFirst;

    private String productTypeSecond;

    private String productTypeThird;

    private String productManager;

    private String productManagerNo;

    private String relaseFlag;

    private String productState;

    private String productRemark;

    private String productPri;

    private String productOrgId;

    private String productOrgName;

    private String productTestUrl;

    private String productLogoUrl;

    private String productImageUrl;

    private String firstReleaseTime;

    private String lastVersion;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public UtpProductInfoDTO() {
    }

    public UtpProductInfoDTO(String productId, String productNo, String productName, String productShortName, String productTags, String productTypeFirst, String productTypeSecond, String productTypeThird, String productManager, String productManagerNo, String relaseFlag, String productState, String productRemark, String productPri, String productOrgId, String productOrgName, String productTestUrl, String productLogoUrl, String productImageUrl, String firstReleaseTime, String lastVersion, String createBy, Date createTime, String updateBy, Date updateTime) {
        this.productId = productId;
        this.productNo = productNo;
        this.productName = productName;
        this.productShortName = productShortName;
        this.productTags = productTags;
        this.productTypeFirst = productTypeFirst;
        this.productTypeSecond = productTypeSecond;
        this.productTypeThird = productTypeThird;
        this.productManager = productManager;
        this.productManagerNo = productManagerNo;
        this.relaseFlag = relaseFlag;
        this.productState = productState;
        this.productRemark = productRemark;
        this.productPri = productPri;
        this.productOrgId = productOrgId;
        this.productOrgName = productOrgName;
        this.productTestUrl = productTestUrl;
        this.productLogoUrl = productLogoUrl;
        this.productImageUrl = productImageUrl;
        this.firstReleaseTime = firstReleaseTime;
        this.lastVersion = lastVersion;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductNo() {
        return productNo;
    }

    public final void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductShortName() {
        return productShortName;
    }

    public final void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }

    public String getProductTags() {
        return productTags;
    }

    public final void setProductTags(String productTags) {
        this.productTags = productTags;
    }

    public String getProductTypeFirst() {
        return productTypeFirst;
    }

    public final void setProductTypeFirst(String productTypeFirst) {
        this.productTypeFirst = productTypeFirst;
    }

    public String getProductTypeSecond() {
        return productTypeSecond;
    }

    public final void setProductTypeSecond(String productTypeSecond) {
        this.productTypeSecond = productTypeSecond;
    }

    public String getProductTypeThird() {
        return productTypeThird;
    }

    public final void setProductTypeThird(String productTypeThird) {
        this.productTypeThird = productTypeThird;
    }

    public String getProductManager() {
        return productManager;
    }

    public final void setProductManager(String productManager) {
        this.productManager = productManager;
    }

    public String getProductManagerNo() {
        return productManagerNo;
    }

    public final void setProductManagerNo(String productManagerNo) {
        this.productManagerNo = productManagerNo;
    }

    public String getRelaseFlag() {
        return relaseFlag;
    }

    public final void setRelaseFlag(String relaseFlag) {
        this.relaseFlag = relaseFlag;
    }

    public String getProductState() {
        return productState;
    }

    public final void setProductState(String productState) {
        this.productState = productState;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public final void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

    public String getProductPri() {
        return productPri;
    }

    public final void setProductPri(String productPri) {
        this.productPri = productPri;
    }

    public String getProductOrgId() {
        return productOrgId;
    }

    public final void setProductOrgId(String productOrgId) {
        this.productOrgId = productOrgId;
    }

    public String getProductOrgName() {
        return productOrgName;
    }

    public final void setProductOrgName(String productOrgName) {
        this.productOrgName = productOrgName;
    }

    public String getProductTestUrl() {
        return productTestUrl;
    }

    public final void setProductTestUrl(String productTestUrl) {
        this.productTestUrl = productTestUrl;
    }

    public String getProductLogoUrl() {
        return productLogoUrl;
    }

    public final void setProductLogoUrl(String productLogoUrl) {
        this.productLogoUrl = productLogoUrl;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public final void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getFirstReleaseTime() {
        return firstReleaseTime;
    }

    public final void setFirstReleaseTime(String firstReleaseTime) {
        this.firstReleaseTime = firstReleaseTime;
    }

    public String getLastVersion() {
        return lastVersion;
    }

    public final void setLastVersion(String lastVersion) {
        this.lastVersion = lastVersion;
    }

    public String getCreateBy() {
        return createBy;
    }

    public final void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public final void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public final void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public final void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UtpProductInfoDTO{" +
                "productId='" + productId + '\'' +
                ", productNo='" + productNo + '\'' +
                ", productName='" + productName + '\'' +
                ", productShortName='" + productShortName + '\'' +
                ", productTags='" + productTags + '\'' +
                ", productTypeFirst='" + productTypeFirst + '\'' +
                ", productTypeSecond='" + productTypeSecond + '\'' +
                ", productTypeThird='" + productTypeThird + '\'' +
                ", productManager='" + productManager + '\'' +
                ", productManagerNo='" + productManagerNo + '\'' +
                ", relaseFlag='" + relaseFlag + '\'' +
                ", productState='" + productState + '\'' +
                ", productRemark='" + productRemark + '\'' +
                ", productPri='" + productPri + '\'' +
                ", productOrgId='" + productOrgId + '\'' +
                ", productOrgName='" + productOrgName + '\'' +
                ", productTestUrl='" + productTestUrl + '\'' +
                ", productLogoUrl='" + productLogoUrl + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", firstReleaseTime='" + firstReleaseTime + '\'' +
                ", lastVersion='" + lastVersion + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
