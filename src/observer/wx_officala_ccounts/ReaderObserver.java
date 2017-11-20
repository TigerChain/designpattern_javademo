package observer.wx_officala_ccounts;

/**
 * Created by TigerChain
 * 微信用户
 */
public class ReaderObserver implements IObserver {

    // 微信用户的姓名
    private String uname ;

    public ReaderObserver(String uname){
        this.uname = uname ;
    }

    @Override
    public void reciveContent(String info) {
        System.out.println(uname+"注意，TigerChain 发送了文章---"+info);
    }

    public String getUname(){
        return this.uname ;
    }
}
