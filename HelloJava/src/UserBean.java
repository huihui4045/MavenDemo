import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gavin on 2016/10/27.
 */
public class UserBean {


    @JSONField(name = "protertyName")
    private String protertyName;
    private Map<String, String> PropertyValue;
    public String getProtertyName() {
        return protertyName;
    }
    public void setProtertyName(String protertyName) {
        this.protertyName = protertyName;
    }
    @JSONField(name = "protertyValue")
    public void setPropertyValue(JSONArray jsonArray) {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < jsonArray.size(); i++) {

            JSONObject o = (JSONObject) jsonArray.get(i);
            Set<String> strings = o.keySet();
            //遍历这个key  或者value
            {
                map.put("", "");
            }


        }


        PropertyValue = map;

    }
}
