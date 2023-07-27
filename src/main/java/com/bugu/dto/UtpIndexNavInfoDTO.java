package com.bugu.dto;

/**
 * 首页导航DTO
 *
 * @author zhangwenhao
 * @date 2023-05-31 15:07
 */
public class UtpIndexNavInfoDTO {
    /**
     * index_nav_id
     * index_nav_name
     * index_nav_code
     * index_nav_pri
     * use_flag
     * index_nav_title
     * index_nav_sub_title
     * create_by
     * create_time
     * update_by
     * update_time
     */
    private String indexNavId;
    private String indexNavName;
    private String indexNavCode;
    private String indexNavPri;
    private String useFlag;
    private String indexNavTitle;
    private String indexNavSubTitle;
    private String createBy;
    private String createTime;
    private String updateBy;
    private String updateTime;

    public UtpIndexNavInfoDTO() {
    }

    public UtpIndexNavInfoDTO(String indexNavId, String indexNavName, String indexNavCode, String indexNavPri, String useFlag, String indexNavTitle, String indexNavSubTitle, String createBy, String createTime, String updateBy, String updateTime) {
        this.indexNavId = indexNavId;
        this.indexNavName = indexNavName;
        this.indexNavCode = indexNavCode;
        this.indexNavPri = indexNavPri;
        this.useFlag = useFlag;
        this.indexNavTitle = indexNavTitle;
        this.indexNavSubTitle = indexNavSubTitle;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    public String getIndexNavId() {
        return indexNavId;
    }

    public final void setIndexNavId(String indexNavId) {
        this.indexNavId = indexNavId;
    }

    public String getIndexNavName() {
        return indexNavName;
    }

    public final void setIndexNavName(String indexNavName) {
        this.indexNavName = indexNavName;
    }

    public String getIndexNavCode() {
        return indexNavCode;
    }

    public final void setIndexNavCode(String indexNavCode) {
        this.indexNavCode = indexNavCode;
    }

    public String getIndexNavPri() {
        return indexNavPri;
    }

    public final void setIndexNavPri(String indexNavPri) {
        this.indexNavPri = indexNavPri;
    }

    public String getUseFlag() {
        return useFlag;
    }

    public final void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    public String getIndexNavTitle() {
        return indexNavTitle;
    }

    public final void setIndexNavTitle(String indexNavTitle) {
        this.indexNavTitle = indexNavTitle;
    }

    public String getIndexNavSubTitle() {
        return indexNavSubTitle;
    }

    public final void setIndexNavSubTitle(String indexNavSubTitle) {
        this.indexNavSubTitle = indexNavSubTitle;
    }

    public String getCreateBy() {
        return createBy;
    }

    public final void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public final void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public final void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public final void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "UtpIndexNavInfoDTO{" +
                "indexNavId='" + indexNavId + '\'' +
                ", indexNavName='" + indexNavName + '\'' +
                ", indexNavCode='" + indexNavCode + '\'' +
                ", indexNavPri='" + indexNavPri + '\'' +
                ", useFlag='" + useFlag + '\'' +
                ", indexNavTitle='" + indexNavTitle + '\'' +
                ", indexNavSubTitle='" + indexNavSubTitle + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
