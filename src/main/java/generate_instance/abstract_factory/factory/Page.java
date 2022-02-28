package generate_instance.abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @ClassName:Page
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:18
 * @Description:产品
 **/
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();
    public Page(String title,String author){
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        content.add(item);
    }
    public void output(){
        String fileName =title+".html";
        try {
            Writer writer = new FileWriter(fileName);
            writer.write(this.getHtml());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String getHtml();

}
