package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * Created by 磊 on 2014/11/30.
 */
public class GoodsComment {
    private String commentId;
    private String goodsId;
    private String goodsName;
    private String replyOrCommentUserName;//商品评论人
    private Date postTime;
    private String commentContent;//评论内容
    private Integer score;//该评论分值
    private String state;
    private String replyOrComment;
    private String replyId;
    private String replyOrCommentUserId;
    private String emailAble;
    private String title;
    private String virtualAdd;
    private String shopId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getReplyOrCommentUserName() {
        return replyOrCommentUserName;
    }

    public void setReplyOrCommentUserName(String replyOrCommentUserName) {
        this.replyOrCommentUserName = replyOrCommentUserName;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReplyOrComment() {
        return replyOrComment;
    }

    public void setReplyOrComment(String replyOrComment) {
        this.replyOrComment = replyOrComment;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyOrCommentUserId() {
        return replyOrCommentUserId;
    }

    public void setReplyOrCommentUserId(String replyOrCommentUserId) {
        this.replyOrCommentUserId = replyOrCommentUserId;
    }

    public String getEmailAble() {
        return emailAble;
    }

    public void setEmailAble(String emailAble) {
        this.emailAble = emailAble;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVirtualAdd() {
        return virtualAdd;
    }

    public void setVirtualAdd(String virtualAdd) {
        this.virtualAdd = virtualAdd;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
