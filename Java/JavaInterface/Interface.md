## 인터페이스
> 다중 상속처럼 사용할 수 있는 기능
> 
> 추상 메소드와 상수만으로 이루어짐
```java
/* 
    접근제어자
    public : 전체 범위에서 사용가능
    private : 선언 클래스 내부만 사용 가능
    protected : 다른 패키지의 일반 클래스만 접근 불가능.
    default : 다른 패키지의 일반 클래스와 자식 클래스는 접근이 불가능.
*/

접근제어자 interface 인터페이스이름{
    public static final 타입 상수이름 = 값;
    public abstract 반환타입 메소드이름(매개변수);
}

class 클래스이름 implements 인터페이스 이름{
    ...
}
```

### 상속과 인터페이스 동시 사용
> 동시 사용으로 다중 상속과 같은 효과
```java
접근제어자 interface 인터페이스 이름{
    ...
}

접근제어자 class 클래스 이름{
    ...
}

class 이름 extends 클래스이름 implements 인터페이스 이름{
    ...
}

```