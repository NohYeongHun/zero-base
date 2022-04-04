package JavaObject;

/**
 * Mutable Object(가변 객체)
 */
class MutableObject {
    public int age;
    public String name;

    public MutableObject(int _age, String _name){
        this.age = _age;
        this.name = _name;
    };

    public String introduce(){
        return String.format("My age %d , My name is %s", age, name);
    }
}

/**
 * Immutable Object(불변 객체)
 */
class ImmutableObject{
   private final int immutableAge = 24;
   private final String immutableName = "nyh";

// final 선언시 setter가 불가능. 
//    public ImmutableObject(int _age, int _name){
//        this.age = age;
//        this.name = name;
//    }
    public String introduce(){
        return String.format("My age %d , My name is %s", immutableAge, immutableName);
    }

}

public class Object{
    public static void main(String[] args) {
        ImmutableObject immutable = new ImmutableObject();
        System.out.println(immutable.introduce());
        

        MutableObject mutable = new MutableObject(20, "test");
        System.out.println(mutable.introduce());
        
    }
}

