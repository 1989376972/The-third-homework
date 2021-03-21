package smallgame.demo;

abstract class person {//定义一个抽象类
    private String name;
    public person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void mopai(String p);//抽象方法
}
