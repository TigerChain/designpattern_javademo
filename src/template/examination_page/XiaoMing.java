package template.examination_page;

/**
 * Created by 0.0 on 2017/12/1.
 */
public class XiaoMing extends ExaminationPage {
    @Override
    void xuanZeTi() {
        System.out.println("小明选择题全部选 B 采用一般选 B 法");
    }

    @Override
    void tianKongTi() {
        System.out.println("小明的填空题一个都没有做");
    }

    @Override
    void yingYongTi() {
        System.out.println("小明的应用题直接来了一个字答？");
    }

    @Override
    public String getresult() {
        String result = "小明数学卷子得了 20 分" ;
        System.out.println(result) ;
        return result ;
    }
}
