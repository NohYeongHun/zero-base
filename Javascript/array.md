## 배열
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
```