package listener; /**
 * Created by molu_ on 2016/12/29.
 */


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@javax.servlet.annotation.WebListener()
public class WebListener implements ServletContextListener{


    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.printf("Web应用启动======");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.printf("Web应用关闭");
    }
}
