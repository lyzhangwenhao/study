package com.bugu.dto;

/**
 * 首页案例介绍配置DTO
 *
 * @author zhangwenhao
 * @date 2023-05-31 15:11
 */
public class UtpIndexCaseDTO {
    /**
     * case_id
     * index_nav_code
     * case_title
     * case_desc
     * case_logo_url
     * case_image_url
     * related_product
     */
    private String caseId;
    private String indexNavCode;
    private String caseTitle;
    private String caseDesc;
    private String caseLogoUrl;
    private String caseImageUrl;
    private String relatedProduct;

    public UtpIndexCaseDTO() {
    }

    public UtpIndexCaseDTO(String caseId, String indexNavCode, String caseTitle, String caseDesc, String caseLogoUrl, String caseImageUrl, String relatedProduct) {
        this.caseId = caseId;
        this.indexNavCode = indexNavCode;
        this.caseTitle = caseTitle;
        this.caseDesc = caseDesc;
        this.caseLogoUrl = caseLogoUrl;
        this.caseImageUrl = caseImageUrl;
        this.relatedProduct = relatedProduct;
    }

    public String getCaseId() {
        return caseId;
    }

    public final void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getIndexNavCode() {
        return indexNavCode;
    }

    public final void setIndexNavCode(String indexNavCode) {
        this.indexNavCode = indexNavCode;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public final void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getCaseDesc() {
        return caseDesc;
    }

    public final void setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
    }

    public String getCaseLogoUrl() {
        return caseLogoUrl;
    }

    public final void setCaseLogoUrl(String caseLogoUrl) {
        this.caseLogoUrl = caseLogoUrl;
    }

    public String getCaseImageUrl() {
        return caseImageUrl;
    }

    public final void setCaseImageUrl(String caseImageUrl) {
        this.caseImageUrl = caseImageUrl;
    }

    public String getRelatedProduct() {
        return relatedProduct;
    }

    public final void setRelatedProduct(String relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

    @Override
    public String toString() {
        return "UtpIndexCaseDTO{" +
                "caseId='" + caseId + '\'' +
                ", indexNavCode='" + indexNavCode + '\'' +
                ", caseTitle='" + caseTitle + '\'' +
                ", caseDesc='" + caseDesc + '\'' +
                ", caseLogoUrl='" + caseLogoUrl + '\'' +
                ", caseImageUrl='" + caseImageUrl + '\'' +
                ", relatedProduct='" + relatedProduct + '\'' +
                '}';
    }
}
