package thread_learn;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 练习Thread, 实现多线程同步下载图片
public class TestThreadDemo02 extends Thread{
    private String url;
    private String name;

    public TestThreadDemo02(String url, String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
       WebDownloader webDownloader = new WebDownloader();
       webDownloader.downloader(url,name);
       System.out.println("下载了文件名为：" + name);
    }

    public static void main(String[] args) {
        TestThreadDemo02 testThreadDemo02 = new TestThreadDemo02("https://space.bilibili.com/95256449/channel/seriesdetail?sid=393820","shipin1");
        testThreadDemo02.start();
    }
}

class WebDownloader{
    public void downloader(String url, String name)  {
        try{
            FileUtils.copyURLToFile(new URL(url), new File(name));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}