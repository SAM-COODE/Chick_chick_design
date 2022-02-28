package generate_instance.abstract_factory.list_factory;

import generate_instance.abstract_factory.factory.Item;
import generate_instance.abstract_factory.factory.Tray;

/**
 * @ClassName:ListItem
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:47
 * @Description:TODO
 **/
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Item item:this.tray){
            stringBuilder.append(item.makeString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
