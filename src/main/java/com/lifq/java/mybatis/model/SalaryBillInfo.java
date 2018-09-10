package com.lifq.java.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 工资单表 SalaryBillInfo
 * 
 * @date 2017/05/18 16:21:37
 * @auth liuj
 */

//@Alias("author")
public class SalaryBillInfo implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 月份
     */
    private String month;

    /**
     * 发送方式：1-邮箱，2-手机
     */
    private Integer type;

    /**
     * 用户id
     */
    private Integer ownerId;

    /**
     * 附件id
     */
    private Integer fileId;

    /** 
     *
     */
    private String fileName;
    /**
    * exce文件密码
    */
    private String filePassword;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModify;

    /**
     * 0未保存1未发送2已发送3已撤销
     */
    private Integer status;

    /**
     * 0未删除1已删除
     */
    private Integer dr;

    /**
     *
     */
    private BigDecimal totalAmount;

    /**
     * 总人数
     */
    private Integer totalPerson;

    /**
     * 发送通知描述
     */
    private String sendDesc;

    /**
     *
     */
    private String matchingRule;

    /**
     *
     */
    private String excelHeader;

    /**
     * 工资单撤回总数
     */
    private Integer revokeCount;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 具体年
     */
    private Integer year;

    /**
     * 具体月份
     */
    private Integer moon;

    /**
     * 工资单发送失败总数
     */
    private Integer errorCount;

    /**
     * 是否回执:0-未回执；1-已回执。默认为0
     */
    private Integer isReceipt;

    /**
     * 回执时间
     */
    private Date sendDate;

    /**
     * 发工资错误条数
     */
    private Integer payErrorCount;

    /**
     * 更新数量
     */
    private Integer wxUpdate;

    /**
     * 工资表sheet页下标
     */
    private Integer sheetIndex;

    /**
     * 发送数量
     */
    private Integer sendNum;

    /**
     * 未发送数量
     */
    private Integer nosendNum;

    /**
     * 已撤回数量
     */
    private Integer revokeNum;

    /**
     * 反馈总数
     */
    private Integer feedbackCount;

    /**
     * 确认总数
     */
    private Integer lookCount;
    
    /**
     * 创建人
     */
    private Integer createUser;
    
    /**
     * 修改人
     */
    private Integer modifyUser;

    /**
     * 发送方式，多方式用，分隔
     */
    private String sendType;
    
    private String catetory;//标题类别
    
    private String notice;//通知内容
    
    private String msgDesc;//企业微信中消息描述
    
    private String createUserName;
    

    public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public Integer getId() {

        return this.id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getTitle() {

        return this.title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getMonth() {

        return this.month;
    }

    public void setMonth(String month) {

        this.month = month;
    }

    public Integer getType() {

        return this.type;
    }

    public void setType(Integer type) {

        this.type = type;
    }

    public Integer getOwnerId() {

        return this.ownerId;
    }

    public void setOwnerId(Integer ownerId) {

        this.ownerId = ownerId;
    }

    public Integer getFileId() {

        return this.fileId;
    }

    public void setFileId(Integer fileId) {

        this.fileId = fileId;
    }

    public String getFileName() {

        return this.fileName;
    }

    public void setFileName(String fileName) {

        this.fileName = fileName;
    }

    public Date getGmtCreate() {

        return this.gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {

        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {

        return this.gmtModify;
    }

    public void setGmtModify(Date gmtModify) {

        this.gmtModify = gmtModify;
    }

    public Integer getStatus() {

        return this.status;
    }

    public void setStatus(Integer status) {

        this.status = status;
    }

    public Integer getDr() {

        return this.dr;
    }

    public void setDr(Integer dr) {

        this.dr = dr;
    }

    public BigDecimal getTotalAmount() {

        return this.totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {

        this.totalAmount = totalAmount;
    }

    public Integer getTotalPerson() {

        return this.totalPerson;
    }

    public void setTotalPerson(Integer totalPerson) {

        this.totalPerson = totalPerson;
    }

    public String getSendDesc() {

        return this.sendDesc;
    }

    public void setSendDesc(String sendDesc) {

        this.sendDesc = sendDesc;
    }

    public String getMatchingRule() {

        return this.matchingRule;
    }

    public void setMatchingRule(String matchingRule) {

        this.matchingRule = matchingRule;
    }

    public String getExcelHeader() {

        return this.excelHeader;
    }

    public void setExcelHeader(String excelHeader) {

        this.excelHeader = excelHeader;
    }

    public Integer getRevokeCount() {

        return revokeCount;
    }

    public void setRevokeCount(Integer revokeCount) {

        this.revokeCount = revokeCount;
    }

    public Date getSendTime() {

        return sendTime;
    }

    public void setSendTime(Date sendTime) {

        this.sendTime = sendTime;
    }

    public Integer getYear() {

        return year;
    }

    public void setYear(Integer year) {

        this.year = year;
    }

    public Integer getMoon() {

        return moon;
    }

    public void setMoon(Integer moon) {

        this.moon = moon;
    }

    public Integer getErrorCount() {

        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {

        this.errorCount = errorCount;
    }

    public Integer getIsReceipt() {

        return isReceipt;
    }

    public void setIsReceipt(Integer isReceipt) {

        this.isReceipt = isReceipt;
    }

    public Date getSendDate() {

        return sendDate;
    }

    public void setSendDate(Date sendDate) {

        this.sendDate = sendDate;
    }

    public Integer getPayErrorCount() {

        return payErrorCount;
    }

    public void setPayErrorCount(Integer payErrorCount) {

        this.payErrorCount = payErrorCount;
    }

    public Integer getWxUpdate() {

        return wxUpdate;
    }

    public void setWxUpdate(Integer wxUpdate) {

        this.wxUpdate = wxUpdate;
    }

    public Integer getSheetIndex() {

        return sheetIndex;
    }

    public void setSheetIndex(Integer sheetIndex) {

        this.sheetIndex = sheetIndex;
    }

    public Integer getSendNum() {

        return sendNum;
    }

    public void setSendNum(Integer sendNum) {

        this.sendNum = sendNum;
    }

    public Integer getNosendNum() {

        return nosendNum;
    }

    public void setNosendNum(Integer nosendNum) {

        this.nosendNum = nosendNum;
    }

    public Integer getRevokeNum() {

        return revokeNum;
    }

    public void setRevokeNum(Integer revokeNum) {

        this.revokeNum = revokeNum;
    }

    public Integer getFeedbackCount() {

        return feedbackCount;
    }

    public void setFeedbackCount(Integer feedbackCount) {

        this.feedbackCount = feedbackCount;
    }

    public Integer getLookCount() {

        return lookCount;
    }

    public void setLookCount(Integer lookCount) {

        this.lookCount = lookCount;
    }

    public String getSendType() {

        return sendType;
    }

    public void setSendType(String sendType) {

        this.sendType = sendType;
    }

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Integer getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(Integer modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getFilePassword() {
		return filePassword;
	}

	public void setFilePassword(String filePassword) {
		this.filePassword = filePassword;
	}

	public String getCatetory() {
		return catetory;
	}

	public void setCatetory(String catetory) {
		this.catetory = catetory;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	
	
    
}
