## 객체(Objects)
> 
```js
// 나라는 사람을 프로그래밍 언어로 표현?
// const nyh는 single literal이다
// => 객체 nyh는 더이상 나눌수 없는 값이다.
// 리터럴은 메모리위치안에 저장되는 값이다.
const nyh = {
    // key(property) : value
    name: {
        first: "noh",
        last: 'yeonghun',
    },
    age: 00,
    gender : 'male',
    introduce: function(guest){
        return 'hello' + guset + "my name is nyh"
    },
    hobby: ['youtube', 'football']
}
console.log(nyh['name']['first']);
console.log(nyh.introduce('kim'));
```