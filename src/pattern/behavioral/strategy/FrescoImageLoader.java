package pattern.behavioral.strategy;

/**
 * Created by sharp on 2018/9/4.
 */
public class FrescoImageLoader implements ImageLoader{
    @Override
    public void loadImage(String url) {
        System.out.println("use fresco");
    }
}
