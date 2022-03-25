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

### if, else, else if
```js
if (식, 값){
    // True 시 수행할 명령
}else if(식, 값){
    // if가 False이면서 else if가 True시 수행할 명령
}else{
    // 위가 모두 False인 경우 실행할 명령
}
```

### for
```js
const array = [1,2,3,4];
// 초기화; 평가(참 => 실행, 거짓=> 다음으로); 매번 실행되는 평가식;
for (i=0; i < array.length; i++){
    const element = array[i];
}
```