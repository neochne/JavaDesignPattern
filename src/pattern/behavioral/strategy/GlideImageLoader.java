package pattern.behavioral.strategy;

import java.awt.*;

/**
 * Created by sharp on 2018/9/4.
 */
public class GlideImageLoader implements ImageLoader{
    @Override
    public void loadImage(String url) {
        System.out.println("use glide");
    }
}
