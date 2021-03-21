package reflect.demo;
//不知道第三个题目第一个小问是不是这个意思，第二个不太会做
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflect {
    public static void main(String[] args) {
        Class<?> c1 = null;//申明class对象
        try {
            c1 = Class.forName("reflect.demo.dog");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object obj=null;//声明一个对象
        try {
             obj = c1.newInstance();//实列化对象
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException E){
            E.printStackTrace();
        }
        Field f[]=c1.getDeclaredFields();//利用反射 取得本类属性
        System.out.println("{");
        for (int i = 0;i<f.length; i++) {
            System.out.print(f[i].getName()+":");//输出属性名称
            getter(obj,f[i].getName());//输出属性内容
        }
        System.out.println("}");
    }
    public static void getter(Object obj,String s){// 利用发射调用getter方法
        try {
            Method met =obj.getClass().getMethod("get"+intiStr(s));
            System.out.println(met.invoke(obj));
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
    public static String intiStr(String s){//单词首字母大写
        String str=s.substring(0,1).toUpperCase()+s.substring(1);
        return str;
    }
}
