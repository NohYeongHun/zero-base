## 목차

1. [선언과 할당](#변수의-선언과-할당)
2. [값](#값value)
3. [자료형](#자료형-data-type)
4. [원시값](#원시-값primitive-value)
5. [객체](#객체objects)
6. [비교](#느슨한비교-엄격한-비교)
7. [타입변환](#타입-변환)
8. [Truethy&Falsy](#truethy--falsy)
9. [참조](#reference)

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

### null
> 변수에 `빈 값`을 임의로 지정

```js
const initValue = null; // null을 지정

console.log(!null); // true
console.log(!!null); // false
console.log(Number(null)); // 0
```

### undefined
> 변수를 `선언`만 하고 `정의`하지 않은 것.

```js
variable // undefined

console.log(!undefined); // true
console.log(!!undefined); // false
console.log(Number(undefined)); // NaN => Not a Number
console.log(null === undefined); // false
```

### boolean
> 논리적인 흐름을 제어할때 사용하는 데이터 타입
>
> 프로그램 구현시에 상당히 많은 데이터 타입이 발생할 수 있는데 이를 통한 논리적인 코드 흐름을 만들어 내기 위해서는 거의 필수적으로 사용되어지는 데이터 타입이다.
```js
/**
 * - Boolean
 * ON: True
 * OFF: False
 */

console.log(Boolean('STRING')) // true

if (식) {
    // true이면 사용..
}else if(식){
    // if false, true이면 사용
}
```
### number
> 숫자 리터럴
```js
const num = 123 // Literal
new Number(123) // refer Object
```

> 숫자로 명시적 형 변환
```js
Number(undefined) // NaN
Number(null) // 0
Number('') // 0
Number('String') // NaN
Number(true) // 1
Number(false) // 0
Number(3.141592) // 3.141592
```

> `NaN`
>
> Not a Number 검사 시에는 `Number.isNaN `메소드를 이용하자
```js
/**
 * 
 * Not A Number => 숫자가 아니다
 * - NaN
 * - Number.NaN
 * 숫자로 읽어낼 수 없다.
 * 잘못된 계산 결과식
 * 정의할 수 없는 결과식
 * 문자열이 포함된 계산식 (덧셈 제외)
 */

Number(undefined); // NaN
parseInt('숫자로 변환 불가능한 문자열'); // NaN
Math.log(-1); // NaN
10 + NaN; // NaN
"가나다라" / 10; // NaN

// 느슨한 검사
isNaN(undefined); // true
isNaN({}); // true
isNaN({}); // true

// ES2015+ (엄격한 검사)
Number.isNaN(undefined) // false
Number.isNaN({}) // false
Number.isNaN('문자열') // false
```

> `Infinity`
```js
/**
 * 
 * Infinity
 * 너무 크거나 작다
 * 지수 1023까지만 허용
 */
const result = isFinite(Math.pow(2,1024)); // Infinity
7 / 0 ; // Infinity

console.log(isFinite(result)) // false;
console.log(isFinite(NaN)) // false;
console.log(isFinite(19)) // true;
```

> 정수
```js
/**
 * 정수 (Integer)
 * - 자바 스크립트에는 부동소수점(IEEE-754) 숫자만 존재
 * - 정수를 저장하는 2가지 방법
 * 1. 10진 소수가 없는 작은 숫자는 정수로 오래 유지(예시 : 31비트)
 * 2. 비트 연산자를 이용 32비트 정수로 바꿔 반환
*/

// 안전한 정수의 최댓값
Number.MAX_SAFE_INTEGER
// 안전한 정수의 최소값
Number.MIN_SAFE_INTEGER

// 소수점을 다루는 방법.
Math.floor(4) //4 : 가장 가까운 정수로 내림
Math.ceil(4.2) // 5 : 가장 가까운 정수로 올림
Math.round(4.2) // 4 : 가장 가까운 정수로 반올림

parseInt('10', 10); // '10'을 정수로 변환
Number('10'); // '10'을 숫자로 변환

/* 
    parseInt의 대략적인 구조
    value = 정수로 변환할 'string' 값
    radix = 2 ~ 36 사이의 진수 값 
*/
function parseInt(value, radix){
    if (radix === undefined){
        return Number(value)
    }
    else{
        ...//radix에 따른 진수 변환
    }
}
```

### string
> 예제
```js
const singleQuote = '';
const singleQuote = "";
const multiLine ='1\
2\
5\
3';

// ES2015+
const singleQuote = ``;
const backQuoteMultiLine = `1
2
3
4
5
`;

const str = 'ABC'; // 배열처럼 접근 가능.
str.charAt(2); // 'C'

const multiString = `dog barked dog`
const searchTerm = 'dog';
multiString.includes(searchTerm); // 포함여부
multiString.indexOf(saerchTerm); // 인덱스 확인

['HE','LLOW','ORLD'].join(''); // HELLOWORLD
const helloWorld = 'HELLO WORLD';
[...helloWorld]; // ['H','E','L','L','O',' ','W','O','R','L','D']
```

> 템플릿 리터럴
```js
/**
 * Template Literals
 * 1. 멀티라인 (개행)이 자유로움
 * 2. Basic String Formatting => 보간법을 활용 => 표현식을 문자열 포함
 * 3. HTML Escaping : 안전하게 사용하도록 도움 (XSS, SQL Injection)
 * 
 */

function genHello(name){
    return `안녕하세요
    ${name}님
    반갑습니다.
    `
}

function genDivision(innerText){
    return `<div>${innerText}</div>`
}

const divTag = genDivision('Jang');
body.innerHTML = divTag;
```

### symbol
### bigint
> 원시 값이 안정적으로 나타낼 수 있는 최대치인 $2^{53}-1 보다 큰 정수를 표현할 수 있는 내장 객체$
```js
console.log(Number.MAX_VALUE); // Javascript가 표현할 수 있는 제일 큰 양의 숫자 값.
Number.MAX_SAFE_INTEGER

const big_num = 123123123123123213213213213123123123123
console.log(123123123123123n) // BigInt 타입
console.log(Bigint(big_num)); // 자바스크립트에서 사용 시 굉장히 큰 숫자들도 축약 없이 보여준다.

console.log(0n === 0) 
/* 
    false
    strict한 검사에서는 false가 나온다.
*/
console.log(0n == 0)
/*
    true
    unstrict한 검사에서는 true가 나온다.
*/
```

### 원시값의 래퍼 객체

```js
const bool = false;
const num = 123;
const str = 'string';

const bool2 = new Boolean(false)
const num2 = new Number(123)
const str2 = new String('string')

console.log('string' instanceof String) // false 

console.log(str.toUpperCase()) 
/* 
    => STRING
    str은 Primitive Type인데 어떻게 toUpperCase가 동작되어 질까?
    str이 선언하고 정의되어 졌을때 내부적으로 동작은 다음과 같다.
    1. const str = new String('string');
    2. `new String('string')` 해당 임시객체가 삭제된다.
    3. const str = `string`; 으로
*/
```

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

const test = {
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

## 타입 변환
> 타입 변환은 암시적 & 명시적 변환이 있다.
>
> 형 변환은 명시적으로 하는 것이 예측 가능한 코드를 생성 가능하다.

### 암시적 형변환
> 연산이 어떻게 진행될지 정확하게 예측하기 힘들다.
```js
const result = 1 + '입니다' // 1입니다.

console.log(typeof result1) 
// string

const result2 = '11' + 11 // 1111

console.log(typeof result2)
// string

const result3 = '2' * '2' // 4

console.log(typeof result3)
// number
```

### 명시적 형변환
> 연산이 어떻게 진행될지 정확하게 예측 할 수있다.
>
> 예측 가능한 코드를 만들기 위해서 형 변환을 명시적으로 수행해야한다.
```js
const result1 = String(1) + '입니다'

const result2 = Number('11') + 11

const result3 = Number('5') * 3

const result4 = Number(String(['111'])) + 111
```

## Truethy & Falsy
> 참 같은 & 거짓 같은.
>
> 참 같은 값`(Truthy)`인 값이란 불리언을 기대하는 문맥에서 `true`로 평가되는 값
>
> 거짓 같은 값`(Falsy)`인 값이란 불리언을 기대하는 문맥에서 `false`로 평가되는 값
```js
/* 
    Truethy
*/
if (true)
if ({})
if ([])
if (42)
if ("0")
if ("false")
if (new Date())
if (-42)
if (12n)
if (3.14)
if (-3.14)
if (Infinity)
if (-Infinity)

/*
    Falsy
*/
if (false)
if (null)
if (undefined)
if (0)
if (-0)
if (0n)
if (NaN)
if ("")

false && "dog"
// ↪ false

0 && "dog"
// ↪ 0

```

## Reference
- [MDN](https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/Grammar_and_types)
- [MDN-Truethy](https://developer.mozilla.org/ko/docs/Glossary/Truthy)
