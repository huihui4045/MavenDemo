package listener; /**
 * Created by molu_ on 2017/1/9.
 */

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class MyServletContextAttributeListener implements ServletContextAttributeListener{


    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {

        String name = scae.getName();

        Object value = scae.getValue();

        System.out.println("attributeAdded  key:"+name+"  value:"+value);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {

        String name = scae.getName();

        Object value = scae.getValue();

        System.out.println("attributeRemoved   key:"+name+"  value:"+value);
    }


    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {

    }
}
