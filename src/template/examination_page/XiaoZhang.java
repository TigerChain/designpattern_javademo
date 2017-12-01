package template.examination_page;

/**
 * Created by TigerChain
 */
public class XiaoZhang extends ExaminationPage {
    @Override
    void xuanZeTi() {
        System.out.println("小张选择题前三个选 A ,中间四个选 B ，后面三个选 C");
    }

    @Override
    void tianKongTi() {
        System.out.println("小张的填空题全部做对");
    }

    @Override
    void yingYongTi() {
        System.out.println("小张的应用题部共扣了 5 分");
    }

    @Override
    public String getresult() {
        String result = "小张的数学卷子得了 80 分" ;
        System.out.println(result) ;
        return result ;
    }
}
