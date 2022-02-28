package adapter.proxy;

import adapter.Banner;

/**
 * @ClassName:BannerPrint
 * @Author:wangsw17
 * @Dtae:2022/2/24 11:18
 * @Description:
 **/
public class BannerPrint extends Print {
    private Banner banner;

    public BannerPrint(String slogan){
        this.banner = new Banner(slogan);
    }
    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
