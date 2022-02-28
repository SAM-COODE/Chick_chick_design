package generate_instance.abstract_factory.list_factory;

import generate_instance.abstract_factory.factory.Factory;
import generate_instance.abstract_factory.factory.Link;
import generate_instance.abstract_factory.factory.Page;
import generate_instance.abstract_factory.factory.Tray;

/**
 * @ClassName:ListFactory
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:47
 * @Description:TODO
 **/
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
