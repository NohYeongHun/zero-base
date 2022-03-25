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

## 원시 값(Primitive Value)
> 객체를 제외한 모든 타입은 불변 값(변경할 수 없는 값)을 정의합니다. 
>
> 예를 들어 (C 언어와는 달리) 문자열은 불변합니다.
>
> 이런 일련의 타입을 "원시 값"이라고 합니다.

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

```js
// 객체 타입
const obj ={
    name: 'jang',
}

// 객체 타입
const arr = ['jang'];

// 객체 타입
function func(){
    return 'jang';
}

console.log(typeof obj); // object
console.log(typeof arr); // object
console.log(typeof func); // function
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
