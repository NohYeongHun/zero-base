## 함수(Function)
> 특정 일을 처리하는 코드 묶음

```js
// 함수 선언문
function func(num){
    if (10 > num){
        return 'Hello';
    }
    return 'Test'
}

// 객체의 property가 함수일 때 method로 지칭함
const obj = {
    // 메서드
    prop: function(){

    } 
}

// 생성자 함수
function MyObj(){

}

// 화살표 함수 (ES2015+, ES6)
const arrowFunc = () => {}

// 함수를 호출.
console.log(func(num)); //Hello

// 반환문(return)이 명시되어 있지 않은경우 void function 이다. => undefined를 반환한다.
const array = [1,2,3,4]
function voidfunc(num){
    
    if (10 < num){
        array.push(num);
    }
}

console.log(voidfunc()); // undefined
```

### 함수 표현식
> 만든 함수를 변수에 할당
```js
// 함수 표현식 + 기명 함수 => 기명 함수 표현식
const func = function func(){
    return 'func';
};

// 함수 표현식 + 익명
const func = function() {
    return 'func';
};
```

### 화살표 함수
```js
/*
    기존의 함수와 달리
    1. argument (x)
    2. this => 동작 방식이 다르다.
*/
const arrowFunc = () => {
    return '문자열';
}

const arrowFunc = () => '문자열';
```

### 매개변수와 인자 다루기
```js
function func({p1, p2, p3, p4}){
    console.log(p2, p4); 
}
const result = func({
    p2:'P2',
    p4:'P4',
}) // P2, P4
```

### arguments 객체
> 함수에 전달된 인수에 해당하는 Array 형태의 객체입니다.

```js
const func = function(){
    const convertArr = Array.from(arguments)

    return convertArr.reduce((prev, curr) => prev + curr)
}

console.log(func(1,2,3,4,5,6,7)); // 28
```

### rest parameter
> 나머지 매개변수`...` 구문을 사용하면 함수가 정해지지 않은 수의 매개변수를 받을 수 있음.
```js
const func = (...nums) => {
    return nums.reduce((prev, curr) => prev + curr);
}

console.log(func(1, 2, 3, 4, 5, 6, 7)); // 28
```