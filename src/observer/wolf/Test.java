package observer.wolf;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        // 使用单例模式
        LangWang langWang = LangWang.getInstance() ;

        BuLieLang buLieLang = new BuLieLang(langWang) ;
        ZhenChaLang zhenChaLang = new ZhenChaLang(langWang) ;


        langWang.xiaDaMingling("1、分工合作，捕猎狼根据侦查狼反馈看机行事 \n" +
                                     "2、侦查狼永远把危险放在第一位，遇到危险第一时间提醒大家撤退");

    }
}
