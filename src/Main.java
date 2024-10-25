import java.util.ArrayList;

class Test{
    int _x;
    public Test(){
        _x = 0;
    }
    public Test(int x){
        _x = x;
    }
    public int getX(){
        return _x;
    }
    public void setX(int x){
        _x = x;
    }
}

class Test2{
    int _y;
    public Test2(){
        _y = 0;
    }
    public Test2(int y){
        _y = y;
    }
    public int getY(){
        return _y;
    }
    public void setY(int y){
        _y = y;
    }
}

class Stuff<T>{
    private T _thing;
    public Stuff(){
        _thing = null;
    }
    public Stuff(T t){
        _thing = t;
    }
    public T getThing(){
        return _thing;
    }
    public void setThing(T t){
        _thing = t;
    }
    public void print(){
        if (_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        }
        else {
            System.out.println("Member Variable is null");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Stuff<Test> s = new Stuff<>();
        Test tx = new Test(5);
        Test2 ty = new Test2(6);
        s.setThing(tx);
        s.print();
        System.out.println(s.getThing().getX());
    }
}