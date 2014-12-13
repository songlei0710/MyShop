package net.hzjxy.myshop.entity;

import java.util.Date;

/**
 * 网站导航.
 * Created by 磊 on 2014/11/30.
 */
public class SiteNavigation {
    private String snid;
    private String isTargetBlank;
    private String isVisible;
    private String name;
    private String position;
    private Date createtime;

    public String getSnid() {
        return snid;
    }

    public void setSnid(String snid) {
        this.snid = snid;
    }

    public String getIsTargetBlank() {
        return isTargetBlank;
    }

    public void setIsTargetBlank(String isTargetBlank) {
        this.isTargetBlank = isTargetBlank;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    private String creatorid;
    private String htmlPath;
    private int sort;
    private String sign;
}
