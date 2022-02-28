package generate_instance.builder;

/**
 * @ClassName:TextBuilder
 * @Author:wangsw17
 * @Dtae:2022/2/28 14:05
 * @Description:TODO
 **/
public class TextBuilder extends Builder{
    @Override
    public void makeTitle(String text) {
        stringBuffer.append("===============================\n");
        stringBuffer.append("[").append(text).append("]\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String text) {
        stringBuffer.append('√').append(text).append("\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            stringBuffer.append("   丶").append(item).append("\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("===============================\n");
    }

}
