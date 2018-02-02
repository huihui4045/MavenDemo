import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gavin on 2017/9/28.
 */
public class GetBookTarget implements Runnable {

    private AsyncContext asyncContext=null;


    public GetBookTarget(AsyncContext asyncContext) {
        this.asyncContext = asyncContext;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5*1000);

            ServletRequest request = asyncContext.getRequest();

            List<String> books=new ArrayList<>();

            books.add("三国演义");
            books.add("西游记");
            books.add("水浒传");

            request.setAttribute("books",books);

            asyncContext.dispatch("/async/async.jsp");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
