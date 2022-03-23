## Sass 란?
> CSS로 해석 및 컴파일 되는 스크립트 언어, 루비로 코딩 되어있다.
> 기존의 CSS에 비해 유지보수가 쉽고 가독성을 높여줌으로서 개발시간을 단축한다.

### CSS
```css
p{
    color: red;
}
p span{
    color: blue;
}

a:hover, a:focus {
    color: blue;
}
```

### Sass
```Sass
p
    color: red
    span
        color:blue
a
    &:hover,
    &:focus
        color:blue
```

### Scss
```scss
p {
    color: red;

    span {
        color: blue;
    }
}

a{
    &:hover,
    &:focus {
        color: blue;
    }
}
```

### CSS 코드가 한 파일로 제작된다면?
> 가독성 저하, 어디서부터 어디까지가 어떤 스타일 담당하는 지 파악 어려움.
>
> 중복 코드 혹은 레거시 코드를 생성하기 쉬움
>
> 단순 수정에도 전체 코드를 일일히 확인해야 함 
>
> 프로젝트가 커질수록 CSS 작업 속도는 느려짐.

### Sass 7-1 패턴 
> base/
>
> components/
>
> layout/
>
> pages/
>
> themes/
>
> abstracts/
>
> vendors/
>

### @import 예시
```scss
// import ordering이 있다.
@import './abstracts/variables.scss'; 
@import './abstracts/mixins.scss';
@import '.base/reset.scss';
```

### vscode sass 컴파일
```
npx sass --watch <컴파일 할 scss경로> <컴파일 될 css 명>
예시 : npx sass --watch html_css/css/ex1.scss html_css/css/ex1.css

html 사용 예시
<link rel="stylesheet" href="css/ex1.css">
```

### 참고 링크
- [Sass](https://sass-lang.com/documentaion)
- [w3-school](https://www.w3schools.com/sass/)
- [blog](https://poiemaweb.com/sass-basics)