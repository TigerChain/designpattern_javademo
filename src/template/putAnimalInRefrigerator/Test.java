package template.putAnimalInRefrigerator;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        // 要有冰箱
        IRefrige panasonnicRefrige = new PanasonnicRefrige() ;
        panasonnicRefrige.setModel("松下冰箱");

        // 要有动物，这里是装大象
        Animail elephant = new Elephant() ;

        // 执行步骤
//        AbstractMothodWork  work = new ConcreateMethodWork() ;
//        work.handle(panasonnicRefrige,elephant);



        ConCreateTemplate conCreateTemplate = new ConCreateTemplate() ;
        conCreateTemplate.handle(panasonnicRefrige, elephant, new ITemplate() {
            @Override
            public void open(IRefrige iRefrige) {
                System.out.println("第 1 步把 "+iRefrige.getRefrigeModel()+" 门打开");
            }

            @Override
            public void putin(Animail animail) {
                System.out.println("第 2 步把 "+animail.getAnimailName()+" 装进去");
            }

            @Override
            public void close() {
                System.out.println("第 3 步把冰箱门盖上");
            }
        });
    }
}
