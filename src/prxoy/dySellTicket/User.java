package prxoy.dySellTicket;

/**
 * Created by TigerChain
 * 买票的人
 */
public class User {
    private String uname ; //姓名
    private String address ; // 地址
    private String sex ;     // 性别
    private String idNum ;   // 身份证号
    private String pay ;     // 掏票钱

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }
}
