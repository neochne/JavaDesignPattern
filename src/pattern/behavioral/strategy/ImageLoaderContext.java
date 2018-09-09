package pattern.behavioral.strategy;

import java.awt.*;

/**
 * Created by sharp on 2018/9/4.
 */
public class ImageLoaderContext {

    private ImageLoader imageLoader;

    public ImageLoaderContext(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
    }

    public void load(String url){
        imageLoader.loadImage(url);
    }
}
