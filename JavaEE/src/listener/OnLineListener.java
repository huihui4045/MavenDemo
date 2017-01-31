package listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by molu_ on 2017/1/9.
 */
@WebListener()
public class OnLineListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {

        HttpSession session=se.getSession();

        ServletContext application = session.getServletContext();

        String sessionId = session.getId();

        if (session.isNew()){


 
        }
    }


    @Override
    public void sessionDestroyed(HttpSessionEvent se) {


    }
}
