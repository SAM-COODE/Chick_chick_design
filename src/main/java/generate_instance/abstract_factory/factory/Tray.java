package generate_instance.abstract_factory.factory;

import java.util.ArrayList;

/**
 * @ClassName:Tray
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:12
 * @Description:零件
 **/
public abstract class Tray extends Item{
    protected ArrayList<Item> tray = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
