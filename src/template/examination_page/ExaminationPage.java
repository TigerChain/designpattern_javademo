package template.examination_page;

/**
 * Created by TigerChain
 * 声明一个抽象的考试卷模版「考试卷对每个考生都是一样的，就是一个模版，至于如何答卷，那是每个人的本事了」
 */
public abstract class ExaminationPage {

    abstract void xuanZeTi() ;// 选择题
    abstract void tianKongTi() ; // 填空题
    abstract void yingYongTi() ; // 应用题

    // 考试卷子是绝密，可不能让别个随便的篡改，所以加个 final
    public final void zuoTi(){
        this.xuanZeTi();
        this.tianKongTi();
        this.yingYongTi();
        this.getresult() ;
    }
    // 得分
    public abstract String getresult() ;
}
