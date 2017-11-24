package observer.customview;

/**
 * Created by TigerChain
 * 测试类
 */
public class Test {
    public static void main(String args[]){
        Button button = new Button() ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("TigerChain");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("never give up");
            }
        });

        button.click();
    }
}
