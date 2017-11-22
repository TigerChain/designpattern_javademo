package observer.callback.customview;

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
                System.out.print("自定义 View 的回调事件");
            }
        });
        // 模拟用户点击这个运作
        button.click();
    }
}
