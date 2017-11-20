package prxoy.dySellTicket;

/**
 * Created 真实的售票员小张
 */
public class XiaoZhangSeller implements ISellTicket {

    private User user ;

    public XiaoZhangSeller(User user){
        this.user = user ;
    }

    @Override
    public void sellTicket() {
        if(null !=user){
            System.out.println("买票者的信息===============");

            System.out.println("买票者姓名："+user.getUname());
            System.out.println("买票性别："+user.getSex());
            System.out.println("买票者身份证号："+user.getIdNum());
            System.out.println("买票者住址："+user.getAddress());

            System.out.println("==============================") ;

            System.out.println("正在验证信息...信息无误,请支付票钱");
            System.out.println("买票者支付:"+user.getPay()+" 元");
            System.out.println("请稍等正在出票.....");
            System.out.println("出票成功:从西安到宝鸡大巴进站去坐");
        }
    }
}
