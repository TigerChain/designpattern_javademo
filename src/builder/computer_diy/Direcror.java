package builder.computer_diy;

/**
 * Created by TigerChain
 * 声明一个导演类「指挥者，这里可以装电脑的老板」，用来指挥组装过程，也就是组装电脑的流程
 */
public class Direcror {
    private Builder builder ;

    public Direcror(Builder builder){
        this.builder = builder ;
    }

    public Computer createComputer(String cpu,String hardDisk,String mainBoard,String memory){
        this.builder.createMainBoard(mainBoard);
        this.builder.createCpu(cpu) ;
        this.builder.createMemory(memory);
        this.builder.createhardDisk(hardDisk);
        return this.builder.createComputer() ;
    }
}
