package generate_instance.builder.test;

import generate_instance.builder.Builder;

/**
 * @ClassName:DickAroundBuilder
 * @Author:wangsw17
 * @Dtae:2022/2/28 14:06
 * @Description:TODO
 **/
public class DickAroundBuilder extends Builder {
    @Override
    public void makeTitle(String text) {
        stringBuffer.append("摆烂\n");
    }

    @Override
    public void makeString(String text) {
        stringBuffer.append("摆烂\n");
    }

    @Override
    public void makeItems(String[] items) {
        stringBuffer.append("摆烂\n");
    }

    @Override
    public void close() {
        stringBuffer.append("摆烂\n");
    }
}
