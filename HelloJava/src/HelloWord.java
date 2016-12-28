
import java.lang.reflect.Field;
import java.time.temporal.TemporalQuery;
import java.util.*;

/**
 * Created by gavin on 2016/6/13.
 */
public class HelloWord {


    public static void show(String s) {

        System.out.println(s);
    }

    public static void main(String[] arg) {


        TemporalQuery<Object> query = String::valueOf;



        JavaVMStackSOF stackSOF = new JavaVMStackSOF();



        double calculate = stackSOF.calculate(100);

        System.out.printf("calculate:" + calculate);


        System.out.printf("calculate2:" + stackSOF.sqrt(25));


        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.add("A4");
        list.add("A5");

        list.forEach(e -> show(e));






        /*User user = new User("22", "女", "裴银辉");
        *//*Person person = new Person("吕鹏", user);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        person.setType(list);*//*

        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(User.class, "sex");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Map<String,Object> map=new HashMap<>();
        map.put("key1",1);
        map.put("key2","ssssss");
        map.put("key3",list);

        map.remove("key1");


       // String s = JSON.toJSONString(user,filter);

        String s=JSON.toJSONString(map);*/



      /* int m= Integer.parseInt("08");

        System.out.println(m+"");*/



       /* String array="[{\"1001\":\"lvpeng\",\"10011\":\"lvpeng11\"},{\"1002\":\"lvpeng2\"},{\"1003\":\"lvpeng3\"},{\"1004\":\"lvpeng4\"}]";


        Map<String,String> map=JSON.parseObject(array,new TypeReference<Map<String,String>>(){});


        Set<String> keySet = map.keySet();

        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()){

            String key = iterator.next();


            System.out.print("key:"+key);
        }*/


    }


    /**
     * 将对象转化为key=value&ley1=value1形式
     *
     * @param t
     * @param <T>
     * @return
     */

    public static <T> String getKeyValueString(T t) {

        StringBuffer sb = new StringBuffer();
        ////获得对象所有属性
        Field[] declaredFields = t.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            try {
                String key = field.getName();

                Object o = field.get(t);

                System.out.println("o:" + o);

                String value = field.get(t) + "";


                sb.append(String.format("%s=%s&", key, value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


        String s = sb.toString();
        return s.substring(0, s.length() - 1);
    }
}
