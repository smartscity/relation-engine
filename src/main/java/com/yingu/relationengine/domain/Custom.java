package com.yingu.relationengine.domain;

import java.io.Serializable;
import java.util.Date;

public class Custom implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.global_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String globalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.name
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.id_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String idCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.bank_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String bankCard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.mobile
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.status
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.device_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.callback
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String callback;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.retry_num
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Integer retryNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.loan_apps
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Integer loanApps;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.ip
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.qq
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.wechat
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String wechat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.head_portrait
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String headPortrait;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.latitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.longitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.analysis_type
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Boolean analysisType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.conclusion
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String conclusion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.bad_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Integer badPoints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.good_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Integer goodPoints;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.source
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.app_key
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String appKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.create_time
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.imei
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String imei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.idfa
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String idfa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column custom.reason
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table custom
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.id
     *
     * @return the value of custom.id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.id
     *
     * @param id the value for custom.id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.global_id
     *
     * @return the value of custom.global_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.global_id
     *
     * @param globalId the value for custom.global_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setGlobalId(String globalId) {
        this.globalId = globalId == null ? null : globalId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.name
     *
     * @return the value of custom.name
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.name
     *
     * @param name the value for custom.name
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.id_card
     *
     * @return the value of custom.id_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.id_card
     *
     * @param idCard the value for custom.id_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.bank_card
     *
     * @return the value of custom.bank_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.bank_card
     *
     * @param bankCard the value for custom.bank_card
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.mobile
     *
     * @return the value of custom.mobile
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.mobile
     *
     * @param mobile the value for custom.mobile
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.status
     *
     * @return the value of custom.status
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.status
     *
     * @param status the value for custom.status
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.device_id
     *
     * @return the value of custom.device_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.device_id
     *
     * @param deviceId the value for custom.device_id
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.callback
     *
     * @return the value of custom.callback
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getCallback() {
        return callback;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.callback
     *
     * @param callback the value for custom.callback
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setCallback(String callback) {
        this.callback = callback == null ? null : callback.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.retry_num
     *
     * @return the value of custom.retry_num
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Integer getRetryNum() {
        return retryNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.retry_num
     *
     * @param retryNum the value for custom.retry_num
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setRetryNum(Integer retryNum) {
        this.retryNum = retryNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.loan_apps
     *
     * @return the value of custom.loan_apps
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Integer getLoanApps() {
        return loanApps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.loan_apps
     *
     * @param loanApps the value for custom.loan_apps
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setLoanApps(Integer loanApps) {
        this.loanApps = loanApps;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.ip
     *
     * @return the value of custom.ip
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.ip
     *
     * @param ip the value for custom.ip
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.qq
     *
     * @return the value of custom.qq
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.qq
     *
     * @param qq the value for custom.qq
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.wechat
     *
     * @return the value of custom.wechat
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.wechat
     *
     * @param wechat the value for custom.wechat
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.head_portrait
     *
     * @return the value of custom.head_portrait
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.head_portrait
     *
     * @param headPortrait the value for custom.head_portrait
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.latitude
     *
     * @return the value of custom.latitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.latitude
     *
     * @param latitude the value for custom.latitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.longitude
     *
     * @return the value of custom.longitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.longitude
     *
     * @param longitude the value for custom.longitude
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.analysis_type
     *
     * @return the value of custom.analysis_type
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Boolean getAnalysisType() {
        return analysisType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.analysis_type
     *
     * @param analysisType the value for custom.analysis_type
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setAnalysisType(Boolean analysisType) {
        this.analysisType = analysisType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.conclusion
     *
     * @return the value of custom.conclusion
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.conclusion
     *
     * @param conclusion the value for custom.conclusion
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.bad_points
     *
     * @return the value of custom.bad_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Integer getBadPoints() {
        return badPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.bad_points
     *
     * @param badPoints the value for custom.bad_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setBadPoints(Integer badPoints) {
        this.badPoints = badPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.good_points
     *
     * @return the value of custom.good_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Integer getGoodPoints() {
        return goodPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.good_points
     *
     * @param goodPoints the value for custom.good_points
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setGoodPoints(Integer goodPoints) {
        this.goodPoints = goodPoints;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.source
     *
     * @return the value of custom.source
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.source
     *
     * @param source the value for custom.source
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.app_key
     *
     * @return the value of custom.app_key
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.app_key
     *
     * @param appKey the value for custom.app_key
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.create_time
     *
     * @return the value of custom.create_time
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.create_time
     *
     * @param createTime the value for custom.create_time
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.imei
     *
     * @return the value of custom.imei
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.imei
     *
     * @param imei the value for custom.imei
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.idfa
     *
     * @return the value of custom.idfa
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.idfa
     *
     * @param idfa the value for custom.idfa
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa == null ? null : idfa.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column custom.reason
     *
     * @return the value of custom.reason
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column custom.reason
     *
     * @param reason the value for custom.reason
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Custom other = (Custom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGlobalId() == null ? other.getGlobalId() == null : this.getGlobalId().equals(other.getGlobalId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getBankCard() == null ? other.getBankCard() == null : this.getBankCard().equals(other.getBankCard()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getCallback() == null ? other.getCallback() == null : this.getCallback().equals(other.getCallback()))
            && (this.getRetryNum() == null ? other.getRetryNum() == null : this.getRetryNum().equals(other.getRetryNum()))
            && (this.getLoanApps() == null ? other.getLoanApps() == null : this.getLoanApps().equals(other.getLoanApps()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getHeadPortrait() == null ? other.getHeadPortrait() == null : this.getHeadPortrait().equals(other.getHeadPortrait()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getAnalysisType() == null ? other.getAnalysisType() == null : this.getAnalysisType().equals(other.getAnalysisType()))
            && (this.getConclusion() == null ? other.getConclusion() == null : this.getConclusion().equals(other.getConclusion()))
            && (this.getBadPoints() == null ? other.getBadPoints() == null : this.getBadPoints().equals(other.getBadPoints()))
            && (this.getGoodPoints() == null ? other.getGoodPoints() == null : this.getGoodPoints().equals(other.getGoodPoints()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getAppKey() == null ? other.getAppKey() == null : this.getAppKey().equals(other.getAppKey()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getImei() == null ? other.getImei() == null : this.getImei().equals(other.getImei()))
            && (this.getIdfa() == null ? other.getIdfa() == null : this.getIdfa().equals(other.getIdfa()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table custom
     *
     * @mbggenerated Sat Oct 14 14:12:39 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGlobalId() == null) ? 0 : getGlobalId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getBankCard() == null) ? 0 : getBankCard().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getCallback() == null) ? 0 : getCallback().hashCode());
        result = prime * result + ((getRetryNum() == null) ? 0 : getRetryNum().hashCode());
        result = prime * result + ((getLoanApps() == null) ? 0 : getLoanApps().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getHeadPortrait() == null) ? 0 : getHeadPortrait().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getAnalysisType() == null) ? 0 : getAnalysisType().hashCode());
        result = prime * result + ((getConclusion() == null) ? 0 : getConclusion().hashCode());
        result = prime * result + ((getBadPoints() == null) ? 0 : getBadPoints().hashCode());
        result = prime * result + ((getGoodPoints() == null) ? 0 : getGoodPoints().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getAppKey() == null) ? 0 : getAppKey().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getImei() == null) ? 0 : getImei().hashCode());
        result = prime * result + ((getIdfa() == null) ? 0 : getIdfa().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        return result;
    }
}