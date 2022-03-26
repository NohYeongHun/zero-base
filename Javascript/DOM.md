## DOM
> 문서 객체 모델
>
> `Javascript`로 `HTML`을 모델링해서 표현하는 방법

### 문서 구조
> HTML(Mark Up) => 브라우저에서 읽을 수 있는 문서
>
> HTML의 문서 구조를 이해하고 지키려고 노력 해야한다.

### Node, Tree
> `Node`는 여러 가지 DOM 타입들이 상속하는 인터페이스.
>
> HTML => 문서
>
> 문서를 조작하는 언어 => JavaScript
>
> Document Object Model을 이용하여 `JavaScript`가 HTML을 조작 할 수 있다.
>
> HTML을 `JavaScript`로 모델링 한것이 Document Object Model이고 인터페이스 구조 단위가 `Node` 단위이며 이는 트리 자료구조로 이루어져 있다.

### DOM 속성
```js
const li = document.querySelector('li') // HTML의 li 태그 정보를 가져온다.

console.dir(li);
/*
    li의 DOM 속성 정보
    accessKey: ""
    ariaAtomic: null
    ariaAutoComplete: null
    ariaBusy: null
... 수없이 많다..
*/
```

### DOM 선택

### Document.getElementById()
> 주어진 문자열과 일치하는 `id`속성을 가진 요소를 차고 이를 나타내는 `Element`객체를 반환합니다.
```js
// 구문
document.getElementById(id)
/*
    매개변수 : id
    반환 값 : 주어진 id와 일치하는 DOM 요소를 나타내는 Element 객체
*/
```

### Element.getElementsByClassName()
> 주어진 클래스를 가진 모든 자식 엘리먼트의 실시간 `HTMLCollection` 을 반환
>
> 여기서 `HTMLCollection`은 유사 배열이다.
```js
var elements = element.getElementsByClassName(name);
```

### Element.getElementsByTagName()
> 엘리먼트의 `HTMLCollection`과 주어진 태그명을 반환. 루트 노드를 포함해 전체 다큐먼트를 대상으로 검색함.

```js
var elements = document.getElementsByTagName()
```

### Document.querySelector()
> 제공한 선택자 또는 선택자 뭉치와 일치하는 문서 내 첫 번째 `Elements`를 반환합니다. 일치하는 요소가 없으면 `null`을 반환합니다.
```js
document.querySelector(selectors);
```

### Document.querySelectorAll()
> 메소드 `querySelectorAll()` 는 지정된 셀렉터 그룹에 일치하는 다큐먼트의 엘리먼트 리스트를 나타내는 정적 `NodeList`를 반환합니다.

```js
elementList = parentNode.querySelectorAll(selectors);

const nav = document.querySelector('#nav-access');

nav.querySelecotrAll('li'); // 중첩이 가능하다.
```

### DOM 조작

```js
const test = document.querySelector(selector); // 클래스인 경우

test.classList.add('zero-base'); // test content의 classList에 `zero-base`를 추가. 


```

### Refrence
[MDN](https://developer.mozilla.org/ko/docs/Web/API/Document_Object_Model/Introduction)
[MDN-Semantics](https://developer.mozilla.org/ko/docs/Glossary/Semantics)
[MDN-Node](https://developer.mozilla.org/ko/docs/Web/API/Node)