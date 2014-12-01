package net.hzjxy.myshop.entity;

/**
 * 快递单模板
 * Created by 磊 on 2014/11/30.
 */
public class ExpressTemplate {
    private String expressTemplateId;   //编号
    private String sendName;            //发送者名称
    private String sendCountry;         //发送者国际
    private String sendProvince;        //发送者省份
    private String sendCity;            //发送者城市
    private String sendDistrict;        //发送者区域
    private String sendStreet;          //发送者街道
    private String sendTelNo;           //发送者座机
    private String sendMobile;          //发送者手机
    private String recipientName;       //接收者名称
    private String recipientCountry;    //接收者国家
    private String recipientProvince;   //接收者省份
    private String recipientCity;       //接收者城市
    private String recipientDistrict;   //接收者区域
    private String recipientStreet;     //接收者街道
    private String recipientTelNo;      //接收者座机
    private String recipientMobile;     //接收者手机
    private String recipientPostcode;   //接收者邮政编码
    private String orderId;             //订单编号
    private String notes;               //备注
    private String sendTime;            //发送时间
    private String logisticsId;         //物流编号
    private String state;               //状态

    public String getExpressTemplateId() {
        return expressTemplateId;
    }

    public void setExpressTemplateId(String expressTemplateId) {
        this.expressTemplateId = expressTemplateId;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getSendCountry() {
        return sendCountry;
    }

    public void setSendCountry(String sendCountry) {
        this.sendCountry = sendCountry;
    }

    public String getSendProvince() {
        return sendProvince;
    }

    public void setSendProvince(String sendProvince) {
        this.sendProvince = sendProvince;
    }

    public String getSendCity() {
        return sendCity;
    }

    public void setSendCity(String sendCity) {
        this.sendCity = sendCity;
    }

    public String getSendDistrict() {
        return sendDistrict;
    }

    public void setSendDistrict(String sendDistrict) {
        this.sendDistrict = sendDistrict;
    }

    public String getSendStreet() {
        return sendStreet;
    }

    public void setSendStreet(String sendStreet) {
        this.sendStreet = sendStreet;
    }

    public String getSendTelNo() {
        return sendTelNo;
    }

    public void setSendTelNo(String sendTelNo) {
        this.sendTelNo = sendTelNo;
    }

    public String getSendMobile() {
        return sendMobile;
    }

    public void setSendMobile(String sendMobile) {
        this.sendMobile = sendMobile;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientCountry() {
        return recipientCountry;
    }

    public void setRecipientCountry(String recipientCountry) {
        this.recipientCountry = recipientCountry;
    }

    public String getRecipientProvince() {
        return recipientProvince;
    }

    public void setRecipientProvince(String recipientProvince) {
        this.recipientProvince = recipientProvince;
    }

    public String getRecipientCity() {
        return recipientCity;
    }

    public void setRecipientCity(String recipientCity) {
        this.recipientCity = recipientCity;
    }

    public String getRecipientDistrict() {
        return recipientDistrict;
    }

    public void setRecipientDistrict(String recipientDistrict) {
        this.recipientDistrict = recipientDistrict;
    }

    public String getRecipientStreet() {
        return recipientStreet;
    }

    public void setRecipientStreet(String recipientStreet) {
        this.recipientStreet = recipientStreet;
    }

    public String getRecipientTelNo() {
        return recipientTelNo;
    }

    public void setRecipientTelNo(String recipientTelNo) {
        this.recipientTelNo = recipientTelNo;
    }

    public String getRecipientMobile() {
        return recipientMobile;
    }

    public void setRecipientMobile(String recipientMobile) {
        this.recipientMobile = recipientMobile;
    }

    public String getRecipientPostcode() {
        return recipientPostcode;
    }

    public void setRecipientPostcode(String recipientPostcode) {
        this.recipientPostcode = recipientPostcode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
