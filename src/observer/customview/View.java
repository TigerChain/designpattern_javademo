package observer.customview;


import java.util.ArrayList;

/**
 * Created by TigerChain
 * 定义一个被观察者
 */
public class View {
    //被观察者的列表
    private ArrayList<OnClickListener> onClickListeners = new ArrayList<>() ;
    // 触发通知
    protected void click(){
        for(OnClickListener onClickListener:onClickListeners){
            if(onClickListener !=null){
                onClickListener.onClick(View.this);
            }
        }
    }
    // 注册观察者
    public void setOnClickListener(OnClickListener onClickListener){
        onClickListeners.add(onClickListener) ;
    }

    public interface OnClickListener{
        // 定义通知的方法
        void onClick(View v) ;
    }

    public void unRegister(OnClickListener onClickListener){
        if(onClickListeners.contains(onClickListener)){
            onClickListeners.remove(onClickListener) ;
        }
    }
}
