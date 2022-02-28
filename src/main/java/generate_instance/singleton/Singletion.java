package generate_instance.singleton;

/**
 * @ClassName:Singletion
 * @Author:wangsw17
 * @Dtae:2022/2/24 17:30
 * @Description:
 **/
public class Singletion {
    public volatile static int num = 0;
    public Singletion(){
        printNum();
        num++;
    }
    public static void  printNum(){
        System.out.println(num);
    }
}
