package tranport;


import java.util.ArrayList;

public class visitor {
    private String start;                      //航线的起始点
    private String end;                        //航线的终点
    private String roomtype;                  //舱位类型
    private double price;                     //机票价格
    private int packagenum;                   //行李的数量
    private double[][] weightxyz;             //每一件行李的重量和尺寸（长， 宽， 高）
    private String peopletype;                //乘客类型
    private String isvip;                      //vip类型

    visitor(){}
    /**
     *
     * @param s 航线的起始点
     * @param e 航线的终点
     * @param r 舱位类型
     * @param p 机票价格
     * @param pn 行李的数量
     * @param wxyz 每一件行李的重量和尺寸
     * @param pt 乘客类型
     * @param iv vip类型
     */
    visitor(String s, String e, String r, double p, int pn,double[][] wxyz, String pt, String iv){
        this.setStart(s);
        this.setEnd(e);
        this.setRoomtype(r);
        this.setPrice(p);
        this.setPackagenum(pn);
        this.setWeightxyz(wxyz);
        this.setPeopletype(pt);
        this.setIsvip(iv);
    }

    public void setvisitor(String s, String e, String r, double p, int pn, double[][] wxyz, String pt, String iv){
        this.setStart(s);
        this.setEnd(e);
        this.setRoomtype(r);
        this.setPrice(p);
        this.setPackagenum(pn);
        this.setWeightxyz(wxyz);
        this.setPeopletype(pt);
        this.setIsvip(iv);
    }

    public int getPackagenum() {
        return packagenum;
    }

    public String getEnd() {
        return end;
    }

    public String getIsvip() {
        return isvip;
    }

    public String getPeopletype() {
        return peopletype;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public double getPrice() {
        return price;
    }

    public String getStart() {
        return start;
    }

    public double[][] getWeightxyz() {
        return weightxyz;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setIsvip(String isvip) {
        this.isvip = isvip;
    }

    public void setPackagenum(int packagenum) {
        this.packagenum = packagenum;
    }

    public void setPeopletype(String peopletype) {
        this.peopletype = peopletype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setWeightxyz(double[][] weightxyz) {
        this.weightxyz = weightxyz;
    }
}
