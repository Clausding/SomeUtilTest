package apache.httpclient;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

@Slf4j
public class Httpclient {
    public static void main(String[] args) {
        doGet();
    }

    public void doPost() {
        try {



        } catch (Exception e) {
            log.error("发送请求失败", e);
        }
    }

    public static void doGet() {
        try {
            //创建client实例
            HttpClient client= HttpClients.createDefault();
            //创建httpget实例
            HttpGet httpGet=new HttpGet("http://www.baidu.com");
            //执行 get请求
            HttpResponse response=client.execute(httpGet);
            //返回获取实体
            HttpEntity entity=response.getEntity();
            //获取网页内容，指定编码
            String web= EntityUtils.toString(entity,"UTF-8");
            //输出网页
            System.out.println(web);

        } catch (IOException e) {
            log.error("发送请求失败", e);
        }
    }

}
