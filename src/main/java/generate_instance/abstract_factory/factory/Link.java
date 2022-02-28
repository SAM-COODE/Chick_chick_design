package generate_instance.abstract_factory.factory;

/**
 * @ClassName:Link
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:11
 * @Description:零件
 **/
public abstract class Link extends Item{
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
