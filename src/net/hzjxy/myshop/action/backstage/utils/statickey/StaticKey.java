package net.hzjxy.myshop.action.backstage.utils.statickey;

/**
 * Created by 磊 on 2014/11/30.
 */
public class StaticKey {
    public static final String ZERO="0";

    public static final String ONE="1";

    public static final String TWO="2";

    public static final String THREE="3";

    /**
     * 数据分类等级 一级 二级 三级
     *
     */
    public enum DataGrade{
        FIRST("一级","0"),SECOND("二级","1"),THIRD("三级","2");
        private String name;
        private String state;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        private DataGrade(String name,String state){
            this.name=name;
            this.state=state;
        }
        public static String getName(String tag){
            for(DataGrade d:DataGrade.values()){
                if(d.getState().equals(tag)){
                    return d.getName();
                }
            }
            return "";
        }
    }

}
