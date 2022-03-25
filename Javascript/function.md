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
