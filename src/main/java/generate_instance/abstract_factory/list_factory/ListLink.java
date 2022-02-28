package generate_instance.abstract_factory.list_factory;

import generate_instance.abstract_factory.factory.Link;

/**
 * @ClassName:ListLink
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:47
 * @Description:TODO
 **/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeString() {
        return url;
    }
}
