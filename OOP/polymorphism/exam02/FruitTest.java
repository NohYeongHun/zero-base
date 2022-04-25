package polymorphism.exam02;

public class FruitTest {

    public static void fruitCheck(Fruit fruit){

        if(fruit instanceof Banana){
            System.out.println("바나나 입니다.");
        } else if(fruit instanceof PearFruit){
            System.out.println("배 입니다.");
        } else if(fruit instanceof Apple){
            System.out.println("사과 입니다.");
        } else {
            System.out.println("바나나, 배, 사과가 아닙니다.");
        } 
    }

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit(); 
        Fruit fruit2 = new Banana();
        Fruit fruit3 = new PearFruit();
        Fruit fruit4 = new Apple();
        
        Fruit[] fruitList = { fruit1, fruit2, fruit3, fruit4 };

        

        for (int i = 0; i < fruitList.length; i++) {
            fruitCheck(fruitList[i]);
        }

        Fish fish1 = new Fish();
        // 상속관계가 있을 경우에만 instanceof를 사용 가능
        // if (fish1 instanceof Fruit){
        //     System.out.println("과일 입니다.");
        // } else{
        // System.out.println("과일 아닙니다")
        //}
    }
}
