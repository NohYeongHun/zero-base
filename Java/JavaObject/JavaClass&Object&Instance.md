## Class, Object, Instance
- [Class](#class)
- [Object](#object)
- [Instance](#instance)
- [추상클래스](#추상-클래스abstract-class)
- [추상메소드](#추상-메소드abstract-method)
- [내부클래스]

## Class
> 객체를 정의하는 설계도

### Class Definition
```java
public class ClassName {
    // 객체 변수
    // 메소드 => 리턴타입 메소드명(파라미터)
    // + 접근제어자
    // + static
}

ClassName obj = new ClassName();
```

### Overloading
> 한 클래스 내에서 같은 이름의 메소드를 여러 개 정의
>
> 오버로딩 조건
>
> - 메소드의 이름이 같아야 함
>
> - 매개변수의 개수 또는 타입이 달라야 함
>
> - 리턴 타입의 차이로는 오버로딩이 되지 않음
```java
public class 클래스명 {
    클래스명() {}
    클래스명(String name, String type){
        구현 내용;
    }
}
```

### 접근제어자
> 클래스의 변수나 메소드의 접근에 제한을 두는 키워드
>
> 접근제어자 종류
```
- private: 해당 클래스에서만 접근 가능
- public: 어디서든 접근 가능
- default: 해당 패키지 내에서만 접근 가능
- protected: 해당 패키지 및 상속받은 클래스에서 접근 가능
```

### Static
> 변수나 메소드의 특성을 바꾸는 키워드
> 
> Static 특징
>
> - 메모리에 한번만 할당
>
> - 즉, Static 변수나 메소드는 공유 특성을 가짐.
>
> Static 클래스 변수
>
> - 해당 클래스 각 객체들이 값을 공유
>
> Static 클래스 메소드
>
> - 객체를 생성하지 않아도 호출 가능.

## Object
> 실체

### Constructor
> 객체가 생성될 때 자동으로 호출됨
> 생성자 규칙
>
> - 클래스명과 이름 맞추기
> - 리턴 타입 없음
```java
public class ClassName{
    ClassName() {}
}
```

### this, this()
> this : 객체 자신을 의미
>
> this() : 생성자


## Instance
> 클래스와 객체의 관계
>
> 클래스로부터 객체를 선언 (인스턴스 화)
>
> 어떤 객체는 어떤 클래스의 인스턴스

## 추상 클래스(Abstract Class)
> 하나 이상의 추상 메소드를 포함하는 클래스
>
> 반드시 구현해야 하는 부분에 대해 명시적으로 표현
>
> 추상 클래스 자체는 객체 생성 불가
```java
// 정의 예시
abstract class 클래스명 {
    ...
    abstract void print();
}
```

## 추상 메소드(Abstract Method)
> 자식 클래스에서 반드시 오버라이딩 해야하는 메소드
>
> 선언만하고 구현 내용 없음

```java
// 정의 예시
abstract void print();
```

## 내부 클래스(Inner Class)
> 클래스 in 클래스 (클래스 안에 선언한 클래스)
```java
class Outer{
    ...
    class Inner{
        ...
    }
}
```

### 내부 클래스 특징
> 내부 클래스에서 외부 클래스 멤버에 접근 가능
> 
> 외부에서는 내부 클래스에 접근 불가

### 내부 클래스 종류
> 인스턴스 클래스 (instance Class)
>
> 정적 클래스 (static class)
>
> 지역 클래스 (local class)
>
> 익명 클래스 (anonymous class)

### 익명 클래스 (Anonymous Class)
> 이름을 가지지 않는 클래스
>
> 선언과 동시에 객체 생성
>
> 일회용 클래스
```java
클래스이름 참조변수이름 = new 클래스 이름(){
    ...
};
```