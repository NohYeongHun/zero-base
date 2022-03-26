## 배열
> 1. 객체이다.
>
> 2. index : value (딕셔너리)형태를 지님.
```js
const data ='a';
const numb = 0
const boolean = true

const array = [data, numb, boolean, 'name'];
console.log(
    array.length // 4
);
console.log(typeof array) // object;
console.log(array[0]);
array.push('string')
console.log(array);
array.unshift('first');
console.log(array);

// 리터럴 생성
const arr = [1, 2, 3];

// 인스턴스 생성
const arr = new Array(1, 2, 3); 


arr.push(10);
/*
    arr이 Primitive Type이 아니라는 걸 이해 가능하다.
    arr => [1, 2, 3, 10] 
    재 할당 없이 `arr`의 값이 변했다.

    Primitive Type의 경우 
    const num = 10
    console.log(num + 1); // 11
    console.log(num) // 10;
*/
const arr = [1, 2 ,3];
arr[3] = 4; // arr = [1, 2, 3, 4]
arr.push(5);
arr[9] = 10; // arr = [1, 2, 3, 4, <4 empty items>, 10]
arr[8] // undefined
```

### 배열의 길이(length)
```js
/**
 * # 배열의 length
 * 
 * 배열의 가장 높은 인덱스를 추적.
 */

const arr = [1, 2, 3];
arr[9] = undefined;
arr; // [1, 2, 3, <6 empty items>, undefined]
arr.length; // 10
arr.forEach(el => console.log(el)); // undefined

arr.length = 20;
arr.length; // 20
arr // [1, 2, 3, <6 empty items>, undefined, <10 empty items>]

arr.length = 0;
arr; // []
```

### 배열 순회
```js
/**
 * # 배열 순회
 */

const arr = [1, 2, 3];

/* 
    일반적인 for 순회 형태
    i를 var로 선언하면 전역변수가 되어버리므로
    블록 스코프인 let을 사용 해야한다.
*/
for (let i = 0; i < arr.length; i++){
    console.log(arr[i]); // 1, 2, 3
}
/*
    for 문의 순서
    1. let i = 0;
    2. if (i < arr.length;){
        console.log(arr[i]);
        i++;
    }
    3. if 조건이 만족하지 않을 떄까지 반복.
*/
```

### 배열 다루기
```js
const arr = [1,2,3,4,5,6,7,8,9]

// 배열의 끝에 요소 추가
arr.push(10); // arr = [1,2,3,4,5,6,7,8,9,10]

// 배열의 앞에 요소 추가
arr.unshift(0) // arr = [0,1,2,3,4,5,6,7,8,9,10]

// 배열에서 요소의 인덱스 찾기
arr.indexOf(11); // -1 => arr에 11은 존재하지않는다.
arr.indexOf(10); // 10 => arr에 10은 10번 인덱스에 존재한다.

// 배열에서 요소 포함 여부 확인
arr.includes(11); // false
arr.includes(10); // true

// 배열의 요소 지우기
let shift_value = arr.shift() // 배열의 가장 앞의 값을 지우고 그 값을 반환받는다.

// 배열의 끝 요소 지우기
let pop_value = arr.pop() // 배열의 가장 뒷 값을 지우고 그 값을 반환 받는다.

// 특정 인덱스 요소 지우기
const arr = [1, 2, 3, 4]
let splice_value = arr.splice(2, 2) 
/* 
    arr = [1, 2]
    splice_value = [3, 4]
    2번 인덱스부터 2개를 지우고 반환한다.
    Array.splice(start_index, length)
    array의 start_index 부터 length 만큼 인덱스를 지우고 이를 반환한다.
*/

```

### 유사 배열 객체(Array Like Object)
> 배열 같지만 배열이 아닌 객체들
>
> `Array.isArray(Object)`를 이용하여 확인 가능하다.
```js
// arguments
function func(){
    console.log(arguments)
    console.log(Array.isArray(arguments)) // false
    console.log([1,2].__proto__)
}

func(1,2,3,4,5,6)

// NodeList
const nodelist = document.querySelectorAll('li') // NodeList(num) 

console.log(Array.isArray(nodelist)) // false
```


### Reference
- [MDN-Array](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Array)
- [MDN-FOR](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Statements/for)
