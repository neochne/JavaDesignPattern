package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sharp on 2018/9/8.
 */
public class Button {

    public List<OnClickListener> onClickListeners = new ArrayList<>();
    public void setOnClickListener(OnClickListener onClickListener){
        onClickListeners.add(onClickListener);
    }

    public void click(){

        for (OnClickListener listener:onClickListeners){
            listener.onClick(this);
        }

    }

}
