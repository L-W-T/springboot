package com.lwt.springboot.autoGenerator.bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 外网用户表
 * </p>
 *
 * @author liangwt
 * @since 2020-05-26
 */
public class OuternetUser implements Serializable {

    private static final long serialVersionUID=1L;

    private String uId;

    /**
     * 1 企业用户,  2 个人用户,  3  机关团体
     */
    private String uType;

    /**
     * 用户真实登录名
     */
    private String uName;

    /**
     * 用户密码
     */
    private String uPwd;

    /**
     * 视用户类型, 为: 企业类型(企业类型:0：默认;1：国有;2：私营;3：集体;4：股份制;5：中外合资（外资）;6：其他;7：事业单位；8：机关单位), 或用户性别,   机构团体不使用此字段
     */
    private String type;

    /**
     * 视用户类型, 为: 企业名称, 或用户姓名, 或单位名称
     */
    private String name;

    /**
     * 企业用户字段,营业执照
     */
    private String license;

    /**
     * 企业用户字段,组织机构代码
     */
    private String orgCode;

    /**
     * 企业用户字段,法定代表人
     */
    private String corporation;

    /**
     * 企业用户字段,法定代表人证件号
     */
    private String corporationId;

    /**
     * 电子邮箱
     */
    private String eMail;

    /**
     * 手机号码
     */
    private String mobilePhone;

    /**
     * 电话号码
     */
    private String telPhone;

    /**
     * 邮政编码
     */
    private String code;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 密码保护问题
     */
    private String pwdQuestion;

    /**
     * 密码保护答案
     */
    private String pwdAnswer;

    /**
     * 个人用户字段,证件类型
     */
    private String paperType;

    /**
     * 个人用户字段,证件号码
     */
    private String paperCode;

    /**
     * 机构团体字段,单位编码
     */
    private String unitCode;

    /**
     * 四类状态：0为验证不通过; 1 为未通过任何验证； 2为通过内网验证，加入组织架构； 3为CA用户；
     */
    private String checkState;

    /**
     * CA证书
     */
    private String caSn;

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 锁定时间
     */
    private LocalDateTime lockdate;

    /**
     * 用户类型2
     */
    private String uType2;

    /**
     * 是否新设立企业
     */
    private String isNewEstablish;

    /**
     * 用户注册时间
     */
    private LocalDateTime userRegTime;

    /**
     * 联系人姓名/经办人姓名
     */
    private String handlerName;

    /**
     * 联系人证件号码/经办人证件号码
     */
    private String handlerId;

    /**
     * 2:外网普通密码;1:内网MD5密码
     */
    private BigDecimal pwdType;

    /**
     * E_UID
     */
    private String eUid;

    /**
     * 交换状态
     */
    private BigDecimal exchangeStatus;

    /**
     * 企业用户字段，注册资金
     */
    private String regCapital;

    /**
     * 货币ID
     */
    private BigDecimal currencyId;

    /**
     * 上次登录时间
     */
    private LocalDateTime loginLastTime;

    /**
     * 当前登录时间
     */
    private LocalDateTime loginCurrTime;

    /**
     * 是否省级单位。1：是；2：否。
     */
    private BigDecimal isProvince;

    /**
     * 外部系统的唯一标识
     */
    private String uCode;

    /**
     * 用户注册来源,0：网厅，1：微信端，2：大厅，3:APP，4：民生APP
     */
    private BigDecimal uSource;

    /**
     * 是否实名认证 1：是 0：否
     */
    private BigDecimal nameCertFlag;

    /**
     * 用户信息版本
     */
    private String version;

    /**
     * 联系人证件类型/经办人证件类型。10：身份证 11：军官 证 12：士兵证 13： 警官证 14：港澳居民 来往内地通行证 15： 台湾居民来往大陆通行 证 16：香港身份证 17：澳门身份证 18： 台湾身份证 20：护照 21:驾照 90：其他
     */
    private String handleIdType;

    /**
     * 法人代表证件类型。企业用户或者单位用户的证件类型：10：身份证 11：军官 证 12：士兵证 13： 警官证 14：港澳居民 来往内地通行证 15： 台湾居民来往大陆通行 证 16：香港身份证 17：澳门身份证 18： 台湾身份证 20：护照 21:驾照 90：其他
     */
    private String corporationIdType;

    /**
     * 是否已补充信息 0-未补充 1-已补充
     */
    private BigDecimal isSupply;

    /**
     * 工商所在地。1-省级；2-市级；3-区级，默认为0。
     */
    private BigDecimal icbcLocation;

    /**
     * 企业用户字段，区县编号。
     */
    private String addrAreaCode;

    /**
     * 身份证帐号
     */
    private String uName2;

    /**
     * 自定义帐号
     */
    private String uName1;

    /**
     * 经办人邮政编码
     */
    private String handlerCode;

    /**
     * 经办人联系地址
     */
    private String handlerAddr;

    /**
     * 企业用户字段，统一社会信用代码
     */
    private String credNum;

    /**
     * 企业用户字段，税务登记编号
     */
    private String taxNum;

    /**
     * 是否实名用户，默认为0。0：未实名，1：已实名
     */
    private BigDecimal isReal;

    /**
     * 企业用户字段，是否重点企业,默认0。0:否 1：是
     */
    private BigDecimal isGChannel;

    /**
     * 是否法律行业，0.否 1.律师 2.公证员 3.人民调解员 4.司法鉴定人 5.通过司法考试尚未执业人员 6.律师实习人员 7.律师机构（含驻粤代表处、联营机构及有公司律师的企业） 8.公证机构 9.人民调解委员会 10.司法鉴定机构 11.岗位公职律师所在单位
     */
    private BigDecimal isLaw;

    /**
     * 人脸识别图像地址
     */
    private String faceImg;

    /**
     * 人脸识别图像上传时间
     */
    private LocalDateTime faceUploadTime;

    /**
     * 用户普通头像地址
     */
    private String userPhoto;

    /**
     * 用户普通头像上传时间
     */
    private LocalDateTime photoUploadTime;

    /**
     * 公职律师承办部门
     */
    private String contractUnit;

    /**
     * 法定代表人手机号码
     */
    private String corporationPhone;

    /**
     * 用户可信任等级
     */
    private String authRank;

    /**
     * 账号状态 1：有效 2：已删除 3：禁用
     */
    private BigDecimal status;

    /**
     * 账号状态 1：有效 2：已删除 3：禁用
     */
    private BigDecimal status1;


    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPwdQuestion() {
        return pwdQuestion;
    }

    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion;
    }

    public String getPwdAnswer() {
        return pwdAnswer;
    }

    public void setPwdAnswer(String pwdAnswer) {
        this.pwdAnswer = pwdAnswer;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getCheckState() {
        return checkState;
    }

    public void setCheckState(String checkState) {
        this.checkState = checkState;
    }

    public String getCaSn() {
        return caSn;
    }

    public void setCaSn(String caSn) {
        this.caSn = caSn;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public LocalDateTime getLockdate() {
        return lockdate;
    }

    public void setLockdate(LocalDateTime lockdate) {
        this.lockdate = lockdate;
    }

    public String getuType2() {
        return uType2;
    }

    public void setuType2(String uType2) {
        this.uType2 = uType2;
    }

    public String getIsNewEstablish() {
        return isNewEstablish;
    }

    public void setIsNewEstablish(String isNewEstablish) {
        this.isNewEstablish = isNewEstablish;
    }

    public LocalDateTime getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(LocalDateTime userRegTime) {
        this.userRegTime = userRegTime;
    }

    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public String getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(String handlerId) {
        this.handlerId = handlerId;
    }

    public BigDecimal getPwdType() {
        return pwdType;
    }

    public void setPwdType(BigDecimal pwdType) {
        this.pwdType = pwdType;
    }

    public String geteUid() {
        return eUid;
    }

    public void seteUid(String eUid) {
        this.eUid = eUid;
    }

    public BigDecimal getExchangeStatus() {
        return exchangeStatus;
    }

    public void setExchangeStatus(BigDecimal exchangeStatus) {
        this.exchangeStatus = exchangeStatus;
    }

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public BigDecimal getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(BigDecimal currencyId) {
        this.currencyId = currencyId;
    }

    public LocalDateTime getLoginLastTime() {
        return loginLastTime;
    }

    public void setLoginLastTime(LocalDateTime loginLastTime) {
        this.loginLastTime = loginLastTime;
    }

    public LocalDateTime getLoginCurrTime() {
        return loginCurrTime;
    }

    public void setLoginCurrTime(LocalDateTime loginCurrTime) {
        this.loginCurrTime = loginCurrTime;
    }

    public BigDecimal getIsProvince() {
        return isProvince;
    }

    public void setIsProvince(BigDecimal isProvince) {
        this.isProvince = isProvince;
    }

    public String getuCode() {
        return uCode;
    }

    public void setuCode(String uCode) {
        this.uCode = uCode;
    }

    public BigDecimal getuSource() {
        return uSource;
    }

    public void setuSource(BigDecimal uSource) {
        this.uSource = uSource;
    }

    public BigDecimal getNameCertFlag() {
        return nameCertFlag;
    }

    public void setNameCertFlag(BigDecimal nameCertFlag) {
        this.nameCertFlag = nameCertFlag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHandleIdType() {
        return handleIdType;
    }

    public void setHandleIdType(String handleIdType) {
        this.handleIdType = handleIdType;
    }

    public String getCorporationIdType() {
        return corporationIdType;
    }

    public void setCorporationIdType(String corporationIdType) {
        this.corporationIdType = corporationIdType;
    }

    public BigDecimal getIsSupply() {
        return isSupply;
    }

    public void setIsSupply(BigDecimal isSupply) {
        this.isSupply = isSupply;
    }

    public BigDecimal getIcbcLocation() {
        return icbcLocation;
    }

    public void setIcbcLocation(BigDecimal icbcLocation) {
        this.icbcLocation = icbcLocation;
    }

    public String getAddrAreaCode() {
        return addrAreaCode;
    }

    public void setAddrAreaCode(String addrAreaCode) {
        this.addrAreaCode = addrAreaCode;
    }

    public String getuName2() {
        return uName2;
    }

    public void setuName2(String uName2) {
        this.uName2 = uName2;
    }

    public String getuName1() {
        return uName1;
    }

    public void setuName1(String uName1) {
        this.uName1 = uName1;
    }

    public String getHandlerCode() {
        return handlerCode;
    }

    public void setHandlerCode(String handlerCode) {
        this.handlerCode = handlerCode;
    }

    public String getHandlerAddr() {
        return handlerAddr;
    }

    public void setHandlerAddr(String handlerAddr) {
        this.handlerAddr = handlerAddr;
    }

    public String getCredNum() {
        return credNum;
    }

    public void setCredNum(String credNum) {
        this.credNum = credNum;
    }

    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    public BigDecimal getIsReal() {
        return isReal;
    }

    public void setIsReal(BigDecimal isReal) {
        this.isReal = isReal;
    }

    public BigDecimal getIsGChannel() {
        return isGChannel;
    }

    public void setIsGChannel(BigDecimal isGChannel) {
        this.isGChannel = isGChannel;
    }

    public BigDecimal getIsLaw() {
        return isLaw;
    }

    public void setIsLaw(BigDecimal isLaw) {
        this.isLaw = isLaw;
    }

    public String getFaceImg() {
        return faceImg;
    }

    public void setFaceImg(String faceImg) {
        this.faceImg = faceImg;
    }

    public LocalDateTime getFaceUploadTime() {
        return faceUploadTime;
    }

    public void setFaceUploadTime(LocalDateTime faceUploadTime) {
        this.faceUploadTime = faceUploadTime;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public LocalDateTime getPhotoUploadTime() {
        return photoUploadTime;
    }

    public void setPhotoUploadTime(LocalDateTime photoUploadTime) {
        this.photoUploadTime = photoUploadTime;
    }

    public String getContractUnit() {
        return contractUnit;
    }

    public void setContractUnit(String contractUnit) {
        this.contractUnit = contractUnit;
    }

    public String getCorporationPhone() {
        return corporationPhone;
    }

    public void setCorporationPhone(String corporationPhone) {
        this.corporationPhone = corporationPhone;
    }

    public String getAuthRank() {
        return authRank;
    }

    public void setAuthRank(String authRank) {
        this.authRank = authRank;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getStatus1() {
        return status1;
    }

    public void setStatus1(BigDecimal status1) {
        this.status1 = status1;
    }

    @Override
    public String toString() {
        return "OuternetUser{" +
        "uId=" + uId +
        ", uType=" + uType +
        ", uName=" + uName +
        ", uPwd=" + uPwd +
        ", type=" + type +
        ", name=" + name +
        ", license=" + license +
        ", orgCode=" + orgCode +
        ", corporation=" + corporation +
        ", corporationId=" + corporationId +
        ", eMail=" + eMail +
        ", mobilePhone=" + mobilePhone +
        ", telPhone=" + telPhone +
        ", code=" + code +
        ", address=" + address +
        ", pwdQuestion=" + pwdQuestion +
        ", pwdAnswer=" + pwdAnswer +
        ", paperType=" + paperType +
        ", paperCode=" + paperCode +
        ", unitCode=" + unitCode +
        ", checkState=" + checkState +
        ", caSn=" + caSn +
        ", barCode=" + barCode +
        ", lockdate=" + lockdate +
        ", uType2=" + uType2 +
        ", isNewEstablish=" + isNewEstablish +
        ", userRegTime=" + userRegTime +
        ", handlerName=" + handlerName +
        ", handlerId=" + handlerId +
        ", pwdType=" + pwdType +
        ", eUid=" + eUid +
        ", exchangeStatus=" + exchangeStatus +
        ", regCapital=" + regCapital +
        ", currencyId=" + currencyId +
        ", loginLastTime=" + loginLastTime +
        ", loginCurrTime=" + loginCurrTime +
        ", isProvince=" + isProvince +
        ", uCode=" + uCode +
        ", uSource=" + uSource +
        ", nameCertFlag=" + nameCertFlag +
        ", version=" + version +
        ", handleIdType=" + handleIdType +
        ", corporationIdType=" + corporationIdType +
        ", isSupply=" + isSupply +
        ", icbcLocation=" + icbcLocation +
        ", addrAreaCode=" + addrAreaCode +
        ", uName2=" + uName2 +
        ", uName1=" + uName1 +
        ", handlerCode=" + handlerCode +
        ", handlerAddr=" + handlerAddr +
        ", credNum=" + credNum +
        ", taxNum=" + taxNum +
        ", isReal=" + isReal +
        ", isGChannel=" + isGChannel +
        ", isLaw=" + isLaw +
        ", faceImg=" + faceImg +
        ", faceUploadTime=" + faceUploadTime +
        ", userPhoto=" + userPhoto +
        ", photoUploadTime=" + photoUploadTime +
        ", contractUnit=" + contractUnit +
        ", corporationPhone=" + corporationPhone +
        ", authRank=" + authRank +
        ", status=" + status +
        ", status1=" + status1 +
        "}";
    }
}
