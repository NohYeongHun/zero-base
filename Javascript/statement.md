## 목차
1. [조건문](#조건문)
2. [반복문](#반복문)
3. [Switch-Case](#switch-case)

## Statement
> 명령과 흐름을 제어한다.

```
if,
for,
switch ~ case
while
do ~ while
break
continue
```

## 조건문
```js
if (식, 값){
    // True 시 수행할 명령
}else if(식, 값){
    // if가 False이면서 else if가 True시 수행할 명령
}else{
    // 위가 모두 False인 경우 실행할 명령
}
```

## 반복문

### for
```js
const array = [1,2,3,4];
// 초기화; 평가(참 => 실행, 거짓=> 다음으로); 매번 실행되는 평가식;
for (i=0; i < array.length; i++){
    const element = array[i];
}
```
### While

```js
let i = 0;
const MAX = 10;

while (i < MAX ) {
    // 식이 참이라면..

    i ++;

    if (i % 2 === 0){
        continue;
    }
    console.log(i); // 1, 3, 5, 7, 9
}
```


## Switch case

```js
switch (기상상태){
    case 비가온다:
        [break;] // 중지 흐름.
    case 비가 많이 온다:
        [break;]
    case 비가 조금 온다:
        [break;]
    [default:
        [break;]]
}
```