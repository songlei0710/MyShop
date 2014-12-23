package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * Created by 磊 on 2014/11/30.ss
 */
public class GroupOrder {
    private String orderId;//订单id
    private String userId;//用户id
    private String userName;//用户名
    private String paymentId;//订单id
    private String paymentName;//订单名称
    private String deliverMode;//
    private String deliveryNumber;
    private String orderState;
    private String logisticsId;
    private double freight;
    private double amount;
    private Double points;
    private Date purchaseTime;
    private Date deliveryTime;
    private String invoice;
    private String shippingAddressId;
    private String customerNotes;
    private String logisticsWebAddress;
    private Date payTime;
    private String orderTag;
    private String toBuyer;
    private double shouldPay;
    private double usePoints;
    private String vouchersId;
    private String goodId;
    private String goodsName;
    private Integer needQuantity;//
    private String payState;//
    private String shippingState;//
    private String deliverAddressId;
    private String shippingUsername;
    private Date createTime;
    private String hasPrInTexPress;//
    private String hasPrintInVoice;//
    private String hasPrintFPinVoice;//
    private String expressNumber;//
    private String tradeNo;//


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getDeliverMode() {
        return deliverMode;
    }

    public void setDeliverMode(String deliverMode) {
        this.deliverMode = deliverMode;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(String shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getLogisticsWebAddress() {
        return logisticsWebAddress;
    }

    public void setLogisticsWebAddress(String logisticsWebAddress) {
        this.logisticsWebAddress = logisticsWebAddress;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public String getToBuyer() {
        return toBuyer;
    }

    public void setToBuyer(String toBuyer) {
        this.toBuyer = toBuyer;
    }

    public double getShouldPay() {
        return shouldPay;
    }

    public void setShouldPay(double shouldPay) {
        this.shouldPay = shouldPay;
    }

    public double getUsePoints() {
        return usePoints;
    }

    public void setUsePoints(double usePoints) {
        this.usePoints = usePoints;
    }

    public String getVouchersId() {
        return vouchersId;
    }

    public void setVouchersId(String vouchersId) {
        this.vouchersId = vouchersId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getNeedQuantity() {
        return needQuantity;
    }

    public void setNeedQuantity(Integer needQuantity) {
        this.needQuantity = needQuantity;
    }

    public String getPayState() {
        return payState;
    }

    public void setPayState(String payState) {
        this.payState = payState;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getDeliverAddressId() {
        return deliverAddressId;
    }

    public void setDeliverAddressId(String deliverAddressId) {
        this.deliverAddressId = deliverAddressId;
    }

    public String getShippingUsername() {
        return shippingUsername;
    }

    public void setShippingUsername(String shippingUsername) {
        this.shippingUsername = shippingUsername;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHasPrInTexPress() {
        return hasPrInTexPress;
    }

    public void setHasPrInTexPress(String hasPrInTexPress) {
        this.hasPrInTexPress = hasPrInTexPress;
    }

    public String getHasPrintInVoice() {
        return hasPrintInVoice;
    }

    public void setHasPrintInVoice(String hasPrintInVoice) {
        this.hasPrintInVoice = hasPrintInVoice;
    }

    public String getHasPrintFPinVoice() {
        return hasPrintFPinVoice;
    }

    public void setHasPrintFPinVoice(String hasPrintFPinVoice) {
        this.hasPrintFPinVoice = hasPrintFPinVoice;
    }

    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
