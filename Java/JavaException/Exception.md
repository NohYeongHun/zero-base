## 예외 (Exception)
> 정상적이지 않은 Case
>
> 0으로 나누기
>
> 배열의 인덱스 초과
>
> 없는 파일 열기
>
> ....
```java
int a = 1 / 0;
// divide zero exception
```

## 예외 처리 (Exception Handling)
> 정상적이지 않은 Case에 대한 적절한 처리 방법
```java
try{
    ...
}catch (예외 case1){
    ...
}catch (예외 case2){
    ...
}

int a = 0;

try {
    a = 5 / 0;
}catch (ArithmeticException e){
    System.out.println(e);
}
```

## finally
> 예외 발생 여부와 관계없이 항상 실행되는 부분
```java
try{
    예외가 발생할 수도 있는 부분;
}catch (예외 case1){
    예외 case1이 발생해야 실행되는 부분;
}finally{
    항상 실행되는 부분;
}
```

## throw, throws
> throw: 예외를 발생시킴
>
> throws: 예외를 전가시킴
```java
... 함수이름(){
    throw new Exception();
}

...함수이름() throws Exception{
    ...
}
```

### 예외처리 예시
```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 사용자 지정 Exception
class NotTenException extends RuntimeException{

}

public class Main {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }

        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try{
            if (ten!= 10){
                throw new NotTenException();
            }
        }catch (NotTenException e){
            System.out.println("e = " + e);
            return false;
        }

        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException{
        if (ten != 10){
            throw new NotTenException();
        }

        return true;
    }

    public static void main(String[] args) throws IOException {

//      1. 예외
//      1-1. 0으로 나누기
        System.out.println("== 0으로 나누기 ==");
//      int a = 5 / 0;

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e){
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = "+ e);
        }finally{
            System.out.println("1-1. 연습 종료");
        }

//      1-2. 배열 인덱스 초과
        System.out.println("== 배열 인덱스 초과 ==");
        int[] b = new int[4];
        try{
            b[4] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 초과 예외 발생");
            System.out.println("e = " + e);
        }

//      1-3. 없는 파일 열기
        System.out.println("== 없는 파일 열기 ==");
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        }catch(FileNotFoundException e){
            System.out.println("e = " + e);
        }


//      2. throw, throws
        System.out.println("== checkTen ==");
        boolean checkResult = Main.checkTen(10);
        System.out.println("checkResult = " + checkResult);


        System.out.println("== checkTenWithException ==");
        checkResult = Main.checkTenWithException(9);
        System.out.println("checkResult = " + checkResult);

        System.out.println("== checkTenWithThrows ==");

        try {
            checkResult = checkTenWithThrows(5);
        }catch (NotTenException e){
            System.out.println("e = " + e);
        }
        System.out.println("checkResult = " + checkResult);

    }

}
```