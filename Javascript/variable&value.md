## 목차

1. [선언과 할당](#변수의-선언과-할당)
2. [값](#값value)
3. [자료형](#자료형-data-type)
4. [원시값](#원시-값primitive-value)
5. [객체](#객체objects)
6. [비교](#느슨한비교-엄격한-비교)
7. [참조](#reference)

## 변수의 선언과 할당

### 선언과 할당 예시.
```js
// 추천
// 선언과 동시에 할당
const lang = 'constJavaScript';

// 선언
let lang;

// 할당
lang = 'JS'

// 재할당
lang = 'JavaScript'

// 선언과 동시에 할당
let lang = 'JavaScript';

// 재할당
lang = 'JS'
```

### 복합 할당 예시
```js
let count = 0;

// 비추천 : 보기 좋을 수 있고 간단하지만 실수 유발.
count += 1;

//추천 : 잘 읽히고 예상하기 쉬움.
count = count + 1;
```
## 값(Value)
> 더 이상 나눌 수 없는 값
>
> 더 이상 평가될 수 없는 하나의 식으로 자료형을 간단히 이루는 값.

## 자료형 (Data Type)
```js
// 문자열 값 (원시 값)
var str = 'string'

// 대문자 변환
str.toUpperCase();
```

### 동적 타이핑
> 자바스크립트는 느슨한 타입언어, 혹은 동적언어이다.
>
> 변수의 타입을 미리 선언할 필요가 없다는 뜻. 타입은 프로그램이 처리되는 과정에서 자동으로 파악된다.
>
> 이 말은 같은 변수에 여러 타입의 값을 넣을 수 있다는 뜻과 동일하다.
```js
var foo = 42; // type of foo => Number
var foo = 'bar'; // type of foo => String
var foo = true; // typeof foo => Boolean
```

## 원시 값(Primitive Value)
> 객체를 제외한 모든 타입은 불변 값(변경할 수 없는 값)을 정의합니다. 
>
> 예를 들어 (C 언어와는 달리) 문자열은 불변합니다.
>
> 이런 일련의 타입을 "원시 값"이라고 합니다.
>
> 원시 값에서 불변의 의미는 원시값을 변조하는 함수를 사용하였을 때 원시 값은 불변하므로 변하지 않는다는 뜻이다.
>
> 해당 원시 값을 변하게 하고 싶으면 `재할당` 해야한다.

```js
/* 불변의 예시 */
const test = 'string'; // string
console.log(test.toUpperCase()); // STRING

console.log(test); // string

/* 값을 변경하고 싶다면? */
let test = 'string'; // string
test = test.toUpperCase(); // 재할당 STRING

console.log(test); // STRING
```

1. null
2. undefined
3. boolean
4. number
5. string
6. symbol
7. bigint

```js
const un = undefined;
const nu = null;
const bool = false;
const num = 0;
const str ='문자열';

console.log(typeof un); // undefined
console.log(typeof nu); // object??
console.log(typeof bool); // boolean
console.log(typeof num); // number
console.log(typeof string); // string
```

## 객체(Objects)
> 원시 값이 아닌 데이터 값
>
> 객체 타입은 메모리 주소의 집합이다.
>
> 객체 타입에서 내부 변수의 이름은 메모리 주소의 별칭이다.

```js
// 객체 타입
const obj = {
    name: 'jang', // 메모리 주소의 별칭 name
    age: 00, // 메모리 주소의 별칭 age
    arr: [], // 메모리 주소의 별칭 arr
    func1: function() {}, // 메모리 주소의 별칭 func1
    child: {} // 메모리 주소의 별칭 child
};

// 객체 타입
const arr = ['jang'];

// 객체 타입
function func(){
    return 'jang';
}

console.log(typeof obj); // object
console.log(typeof arr); // object
console.log(typeof func); // function

console.log(obj instanceof Object); // True
console.log(func instanceof Function); // True
console.log(arr instanceof Array); // True

const test ={
    str: 'string'
}

test.str.toUpperCase();
/* 
    {str: 'string'}
    => 왜그럴까? test는 객체 타입이지만 내부의 str은 Primitive Type이므로 변경되지 않는다.
*/
console.log(test); 


test.num = 123
test.bool = true

/* 
    {str:'string', num:123, bool: true}
    왜그럴 까?
    test는 Objects 타입이므로 불변하지 않는다.
    그래서 새로운 값을 넣는 것이 용인된다.
*/
console.log(test); 

const arr = [1,2,3];
console.log(arr[0]); // 1
console.log(arr[1]); // 2
console.log(arr[2]); // 3

arr[3] = 1000; // arr = [1, 2, 3, 1000]

```
## 느슨한비교, 엄격한 비교 

```js
const number = '0';
/**
 * 동등 연산자를 사용할 때 
 * 엄격한 비교 => ===
 * 느슨한 비교 => ==
 */

if (number == 0){
    console.log('number는 0입니다'); // 
}else{
    console.log('number는 0이 아닙니다.');
}
```


## Reference
[MDN]https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/Grammar_and_types

