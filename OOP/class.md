## 목차
1. [StringBuffer, StringBuilder](#stringbuffer--stringbuilder)

## StringBuffer / StringBuilder

### StringBuffer 클래스
- StringBuffer의 필요성
- 문자열 처리는 보통 String이 하지만, 불변의 속성을 갖는다.

![](img/2022-05-09-06-45-36.png)

> 문자열 할당 후 추가로 더해지는 연산을 하면 기존 메모리에 추가되는게 아니라, 새로운 메모리에 더해진 문자열의 영역을 잡고 그 곳의 주소를 가리킴. 이전에 저장되어 있던 문자열 부분은 GC가 관리함 
>
> => 문자열의 변경이(추가, 삭제, 수정) 빈번한 경우 메모리에 영향이 클 수 있음.
이를 해결하기 위해서 불변이 아닌 가변의 속성을 가지는 StringBuffer 클래스를 사용
>
> => 따라서, 문자열의 변경이(추가, 삭제, 수정) 빈번하게 발생하는 경우 String 클래스 보다는 StringBuffer 클래스를 사용하여야 함.

- 보통 문자열의 조작에 많이 쓰이나, 요즘 컴파일러는 String 클래스와 크게 차이가 없어 보임.
- String 이나 StringBuffer나 업무에 맞게 편한걸 사용.
![](img/2022-05-09-06-53-27.png)


### StringBuilder와 StringBuffer와의 차이
- StringBuffer는 멀티쓰레드 환경에서 유리.
- StringBuilder는 싱글쓰레드 환경에서 유리함.

> 쓰레드가 서로 공유하고 수정할 수 있는 data가 존재할 때
스레드간 동기화가 되지 않은 상태에서 멀티쓰레드 프로그램을 수행하면 data의 안전성과 신뢰성을 보장할 수 없음.
>
> StringBuffer의 경우 자바의 `syncronized` 기능을 이용하여 thread-safe를 만족 시켜서 여러개의 스레드가 한 개의 자원을 사용하고자 할 때 현재 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지 스레드 들은 데이터에 접근할 수 없도록 막는 개념


### [Buffer, Builder 예제](classkinds/buffers/StringBufferTest.java)