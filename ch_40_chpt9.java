package com.Wing;

class MyEmoployee{
   private int id;
    private String name;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}

public class ch_40_chpt9 {
    public static void main(String[] args) {
    MyEmoployee me=new MyEmoployee();
    me.setId(15);
    me.setName("Naveed");
        System.out.println(me.getId());
        System.out.println(me.getName());
    }
}
