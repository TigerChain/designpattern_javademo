package builder.computer_diy;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
  public static void main(String args[]){

      Builder builder = new AssemblerBuilder() ;
      Direcror direcror = new Direcror(builder) ;
      Computer computer = direcror.createComputer("Intel 酷睿i9 7900X","三星M9T 2TB （HN-M201RAD）","技嘉AORUS Z270X-Gaming 7","科赋Cras II 红灯 16GB DDR4 3000") ;
      System.out.println("小明这台电脑使用的是：\n"+computer.getMainBoard()+" 主板\n"+computer.getCpu()+" CPU\n"+computer.getHardDisk()+"硬盘\n"+computer.getMainBoard()+" 内存\n");

  }
}
