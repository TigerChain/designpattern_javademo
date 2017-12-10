package template.examination_page;

/**
 * Created by TigerChain
 */
public class Test {
    public static void main(String args[]){
        ExaminationPage xiaoMing = new XiaoMing() ;
        xiaoMing.zuoTi();

        System.out.println("==========华丽的分隔线==========") ;

        ExaminationPage xiaoZhang = new XiaoZhang() ;
        xiaoZhang.zuoTi();
    }
}
