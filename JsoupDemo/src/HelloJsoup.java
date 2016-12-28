import com.alibaba.fastjson.JSON;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by gavin on 2016/10/28.
 */
public class HelloJsoup {


    public static void main(String[] args) throws IOException {


        Document document = Jsoup.connect("http://www.toutiao.com/").get();


        // 使用select方法选择元素，参数是CSS Selector表达式
        Elements links = document.select("a[target]");

        System.out.println("links:"+links.size());

        for (Element link : links) {
            //使用abs:前缀取绝对url地址
          //  print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));

            System.out.println(String.format("%s:%s",link.attr("abs:href"),link.text().trim()));
        }

    }
}
