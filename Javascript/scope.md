## 목차
1. [함수-스코프](#함수-스코프)
2. [블록-스코프](#블럭-스코프)

## Scope
> 변수의 유효 범위

## 함수 스코프
> 함수 스코프
>
> 함수 내부에서 선언한 변수는 함수 밖에서는 접근이 불가능하다.
```js

var globalVal = '전역 변수'; // 전역 변수 Scope

function test(){
    var num = 123; // test 함수 내부에서만 존재하는 변수 `num`

    console.log(innerVal); // is not defined
    function innerFunc(){
        var innerVal = '함수 내부 지역 변수';
        console.log(globalVal); // 전역 변수
    }

    return num; // num 변수 값을 받기위해선?. => return
}

console.log(test()); // 123
```

## 블럭 스코프
> 블럭 내부에서만 접근 가능한 스코프
>
> var => 함수 스코프
>
> let, const => 블록 스코프
>
> var는 어디서나 접근이 가능해지기 때문에 유효범위가 안전한 let이나 const를 사용하는게 좋다.
```js
for (var index = 0; index < 3; index++){
    console.log(index); 
} // 여기서 var index는 전역변수 선언과 다름이없다.

console.log(index); // 3

for (let indec = 0; indec <3; indec++){
    console.log(indec);
}// 여기서 let indec의 유효범위는 블록이므로 블록 스코프를 가진다.

console.log(indec); // is not defined

{
    let alpha = 'alpha';
    var beta = 'beta';
}
console.log(a); // alpha is not defined
console.log(b); // beta 
```