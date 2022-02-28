package generate_instance.builder;

import generate_instance.builder.test.DickAroundBuilder;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/28 14:18
 * @Description:TODO
 **/
public class Runner {
    public static void main(String[] args) {
        Director director = new Director(new HtmlBuilder());
        director.construct();
        Director director1 = new Director(new TextBuilder());
        director1.construct();
        Director director2 = new Director(new DickAroundBuilder());
        director2.construct();
        System.out.println(director.getResult());
        System.out.println(director1.getResult());
        System.out.println(director2.getResult());
    }
}
