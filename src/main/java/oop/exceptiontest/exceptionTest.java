package oop.exceptiontest;

public class exceptionTest {
    public static void method1(int i, int j) throws Exception{
        if (j == 0){
            throw new Exception("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        System.out.println(k);
    }
    public static void main(String[] args){

        // 예외처리 방법
        // 1. 내가 try catch 한다.
        // 2. throw한다. 넘긴다.
        try{
            method1(1, 0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
