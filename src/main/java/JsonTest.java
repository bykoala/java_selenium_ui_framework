import java.util.List;

import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

public class JsonTest {

	public static void main(String[] args) {
		test1();
	}
    public static void test1() {
        // 对象嵌套数组嵌套对象
        String json1 = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':101,'name':'刘铭','age':16}]}";
        // 数组
        String json2 = "['北京','天津','杭州']";
        //1、
        //静态方法
  

        //2、
        List<String> list=JSON.parseArray(json2, String.class);
        System.out.println(list);
    }

}
