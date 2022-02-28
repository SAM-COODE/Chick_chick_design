package generate_instance.abstract_factory.list_factory;

import generate_instance.abstract_factory.factory.Item;
import generate_instance.abstract_factory.factory.Page;

/**
 * @ClassName:ListPage
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:48
 * @Description:TODO
 **/
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String getHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.title).append("\n");
        stringBuilder.append(this.author).append("\n");
        for(Item item:this.content){
            stringBuilder.append(item.makeString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
