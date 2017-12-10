package builder.computerbuilder;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){

        // 不使用建造者模式
        Computer computer = new Computer("华硕主板","i9 cpu","三星 ssd","长城电源","显卡"
        ,"鼠标","机箱","鼠标垫") ;
        System.out.println("使用普通的构造方法组装电脑：\n"+computer.toString());

        // 使用建造者模式
        ComputerB computerB = new ComputerB.ComputerBuilder("技嘉主板","i9 cpu","三星 ssd","长城电源","显卡")
                .setMouse("鼠标").setMousePad("垫子").build() ;
        System.out.println("使用建造者模式组装电脑：\n"+computerB.toString());
    }
}
