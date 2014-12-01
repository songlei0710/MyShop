package net.hzjxy.myshop.action.backstage.base;

import com.opensymphony.xwork2.ActionSupport;
import net.hzjxy.myshop.service.impl.Serial;
import org.apache.struts2.json.annotations.JSON;

/**
 * Created by 磊 on 2014/11/30.
 */
public class BaseTAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private Serial serial;
    private String query;//text
    private String qType;//select
    private String sortName;//排序字段
    private String sortOrder;//排序方式
    /**
     * action 返回类型
     */
    public final static String JSON="json";

    @JSON(serialize = false)
    public Serial getSerial() {
        return serial;
    }

    public void setSerial(Serial serial) {
        this.serial = serial;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
