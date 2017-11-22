package observer.callback.customview;

/**
 * Created by TigerChain
 * 自定义 View
 */
public class View {

    private OnClickListener onClickListener ;
    // 触发点击事件
    protected void click(){
        if(onClickListener !=null){
            onClickListener.onClick(this);
        }
    }
    // 设置回调
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener ;
    }

    public interface OnClickListener{
        // 定义回调方法
        void onClick(View v) ;
    }
}
