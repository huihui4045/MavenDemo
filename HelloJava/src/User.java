import java.util.List;

/**
 * Created by gavin on 2016/7/4.
 */
public class User {


    private String age;

    private String sex;


    private String name;

    public User(String age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public User() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
