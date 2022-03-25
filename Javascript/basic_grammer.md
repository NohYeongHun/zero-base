## Javascript 기본 문법

### 주석

1. `//` 주석
```js
function comment() {
  // 자바스크립트의 각주 한 줄입니다.
  console.log("Hello world!");
}
comment();
```

2. `/* */` 주석
```js
function comment() {
  /* 자바스크립트 각주 한 줄입니다. */
  console.log("Hello world!");
}
comment();

function comment() {
  /* This comment spans multiple lines. Notice
     that we don't need to end the comment until we're done. */
  console.log("Hello world!");
}
comment();
```

3. `JS DOC`
> 협업시 사용하면 좋은 주석 방법.
>
> 자세한 설명이 있는 대신 작성 시 소요시간이 길다.
```js
/**
 * @constructor
 * 
 * @param {string} title - The titile of the book.
 * @param {string} author - The author ot the book.
 */
function Book(title, author){
  // logic..
}
 
```

## 리터럴
> 스크립트에 부여한 고정값, 변수가 아님.

### Null 리터럴
```js
null
```

### 불리언 리터럴
```js
true
false
```

### 숫자 리터럴
```js
// 10진법
1234567890
42

// Caution when using with a leading zero:
0888 // 888 parsed as decimal
0777 // parsed as octal, 511 in decimal

0e-5   // => 0
0e+5   // => 0
5e1    // => 50
175e-2 // => 1.75
1e3    // => 1000
1e-3   // => 0.001
```

### 객체 리터럴
```js
var o = { a: 'foo', b: 'bar', c: 42 };

// shorthand notation. New in ES2015
var a = 'foo', b = 'bar', c = 42;
var o = {a, b, c};

// instead of
var o = { a: a, b: b, c: c };
```

### 배열 리터럴
> 0개 이상의 식 목록.
> 각 식은 배열 요소를 나타내고 대괄호 `[]`로 묶입니다.
```js
var coffees = ["French Roast", "Colombian", "Kona"];

/* 
    myList[0] == undefined
    myList[1] == 'home'
*/
var myList = [ , 'home', , 'school'];
```

### 정규 표현식 리터럴
```js
/ab+c/g

// An "empty" regular expression literal
// The empty non-capturing group is necessary
// to avoid ambiguity with single-line comments.
/(?:)/
```

### 템플릿 리터럴
```js
var o = { a: 'foo', b: 'bar', c: 42 };

// shorthand notation. New in ES2015
var a = 'foo', b = 'bar', c = 42;
var o = {a, b, c};

// instead of
var o = { a: a, b: b, c: c };
```

## 값&식&문

### 값
> 하나의 값

### 식 or 표현식
> 값을 생성
>
> 값으로 귀결

### 문(Statement)
> 행동을한다
>
> 흐름을 제어한다.

```js
123 // 값
1 + 1 // 식

{

} // 문
```

## Reference
[MDN-어휘문법]https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Lexical_grammar
[Javascript-입문]https://developer.mozilla.org/ko/docs/Web/JavaScript/A_re-introduction_to_JavaScript