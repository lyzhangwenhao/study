package com.bugu.dto;

/**
 * 精选导航配置DTO
 *
 * @author zhangwenhao
 * @date 2023-05-31 15:09
 */
public class UtpIndexHandpickNavDTO {
    /**
     * handpic_nav_id
     * index_nav_code
     * category_name
     * category_id
     * category_pri
     * product_name
     * product_no
     * product_remark
     * nav_pri
     * category_image_path
     * category_iamge_url
     */
    private String handpicNavId;
    private String indexNavCode;
    private String categoryName;
    private String categoryId;
    private String categoryPri;
    private String productName;
    private String productNo;
    private String productRemark;
    private String navPri;
    private String categoryImagePath;
    private String categoryIamgeUrl;

    public UtpIndexHandpickNavDTO() {
    }

    public UtpIndexHandpickNavDTO(String handpicNavId, String indexNavCode, String categoryName, String categoryId, String categoryPri, String productName, String productNo, String productRemark, String navPri, String categoryImagePath, String categoryIamgeUrl) {
        this.handpicNavId = handpicNavId;
        this.indexNavCode = indexNavCode;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.categoryPri = categoryPri;
        this.productName = productName;
        this.productNo = productNo;
        this.productRemark = productRemark;
        this.navPri = navPri;
        this.categoryImagePath = categoryImagePath;
        this.categoryIamgeUrl = categoryIamgeUrl;
    }

    public String getHandpicNavId() {
        return handpicNavId;
    }

    public final void setHandpicNavId(String handpicNavId) {
        this.handpicNavId = handpicNavId;
    }

    public String getIndexNavCode() {
        return indexNavCode;
    }

    public final void setIndexNavCode(String indexNavCode) {
        this.indexNavCode = indexNavCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public final void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public final void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryPri() {
        return categoryPri;
    }

    public final void setCategoryPri(String categoryPri) {
        this.categoryPri = categoryPri;
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNo() {
        return productNo;
    }

    public final void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductRemark() {
        return productRemark;
    }

    public final void setProductRemark(String productRemark) {
        this.productRemark = productRemark;
    }

    public String getNavPri() {
        return navPri;
    }

    public final void setNavPri(String navPri) {
        this.navPri = navPri;
    }

    public String getCategoryImagePath() {
        return categoryImagePath;
    }

    public final void setCategoryImagePath(String categoryImagePath) {
        this.categoryImagePath = categoryImagePath;
    }

    public String getCategoryIamgeUrl() {
        return categoryIamgeUrl;
    }

    public final void setCategoryIamgeUrl(String categoryIamgeUrl) {
        this.categoryIamgeUrl = categoryIamgeUrl;
    }

    @Override
    public String toString() {
        return "UtpIndexHandpickNav{" +
                "handpicNavId='" + handpicNavId + '\'' +
                ", indexNavCode='" + indexNavCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", categoryPri='" + categoryPri + '\'' +
                ", productName='" + productName + '\'' +
                ", productNo='" + productNo + '\'' +
                ", productRemark='" + productRemark + '\'' +
                ", navPri='" + navPri + '\'' +
                ", categoryImagePath='" + categoryImagePath + '\'' +
                ", categoryIamgeUrl='" + categoryIamgeUrl + '\'' +
                '}';
    }
}
