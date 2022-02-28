package generate_instance.prototype;

/**
 * @ClassName:UnderLinePne
 * @Author:wangsw17
 * @Dtae:2022/2/25 17:37
 * @Description:
 **/
public class UnderLinePen implements Product {
    private char underlineChar;

    public UnderLinePen(char underlineChar){
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println(" ");
        for(int i =0;i<length;++i){
            System.out.print(underlineChar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
