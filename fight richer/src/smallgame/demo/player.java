package smallgame.demo;

import java.util.ArrayList;

class player extends person{
    public  player(String name){
        super(name);//调用父类构造
    }
    private ArrayList<String> shoupai=new ArrayList<>();
    @Override//方法的覆写
    public void mopai(String p) {//玩家  摸牌
        this.getShoupai().add(p);//将p加入手牌
    }
    public ArrayList<String> getShoupai() {//getter方法
        return shoupai;
    }
    public void print(){//输出方法
        System.out.println(this.getName()+this.getShoupai());
    }
}
