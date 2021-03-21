package smallgame.demo;
//一个简单的斗地主
import java.util.ArrayList;
import java.util.Collections;

public class game {
    public static void main(String[] args) {
        ArrayList<String> poker=new ArrayList<>();//定义arraylist集合 储存总牌数，泛型使用string
        String[] colors= {"♡","♠", "♢", "♣",};//花色集合
        String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K"};//牌面集合
        poker.add("大王");//大王小王单独添加
        poker.add("小王");
        for (String number:numbers){
            for (String color:colors){
                poker.add(color+number);
            }
        }//扑克牌生成
        Collections.shuffle(poker);//将牌打乱
        player player01=new player("哲哥1号");//实列化player对象，三名玩家
        player player02=new player("哲哥2号");
        player player03=new player("哲哥3号");
        ArrayList<String> dipai=new ArrayList<>();//底牌
        for (int i=0;i<poker.size();i++){
            String p=poker.get(i);//获得一张牌
            if (i>=51){
                 dipai.add(p);//最后3张留作底牌
            }else if(i%3==0){
                player01.mopai(p);//玩家摸牌
            }else if(i%3==1){
                player02.mopai(p);
            }else if(i%3==2){
                player03.mopai(p);
            }
        }
        player01.print();//将牌输出
        player02.print();
        player03.print();
    }
}
