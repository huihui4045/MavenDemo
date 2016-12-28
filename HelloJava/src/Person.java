import java.util.List;

/**
 * Created by gavin on 2016/7/4.
 */
public class Person {

    private List<Integer> type;

    private String name;

    private int num;

    private boolean isTrue;

    private String huihui;


    private User user;

    public Person() {
    }

    public Person(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public List<Integer> getType() {
        return type;
    }

    public void setType(List<Integer> type) {
        this.type = type;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }







}
