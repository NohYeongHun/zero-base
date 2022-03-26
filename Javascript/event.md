## 이벤트
> 자바 스크립트가 웹에서 하는 일은 `이벤트`이다.
>
> `Event` 인터페이스는 DOM 내에 위치한 이벤트를 나타냅니다.
>
> 이벤트는 Property와 Method로 나뉜다.
```js
const resetButton = document.querySelector('.reset');

/*
    querySelector('.reset') 인 객체를 'click'하면
    alert('안녕하세요') 가 동작한다.
*/
resetButton.addEventListener('click', function() {
    alert('안녕하세요');
});

resetButton.removeEventListener('click', function(event) {
    console.dir(event);
});

const onReset = function (event){
    console.log(event.target);
};

resetButton.addEventListener('click', onReset)
// => click 이벤트 동작시 onReset 함수가 실행된다.
```

## Reference
[MDN-EventType](https://developer.mozilla.org/en-US/docs/Web/API/Event/type)
[MDN-Event](https://developer.mozilla.org/ko/docs/Web/API/Event)