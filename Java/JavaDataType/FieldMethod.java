public class FieldMethod {
    
    /**
     * int -> 키워드
     * age -> 식별자(변수)
     * 10 => 리터럴
     */
    int age = 10;

    /**
     * 두개의 숫자값을 입력받아서 높은 값을 구하는 메서드
     * 매개변수 (필수는 아니다.)
     * 리턴타입 (필수는 아니다.)
     * f(x) = x + 1;
     */
    int maxNumber(int x, int y){
        
        return x > y ? x : y;
    }

    void maxNumber(){
        int result = maxNumber(10, 20);
        System.out.println(result);
    }

}
