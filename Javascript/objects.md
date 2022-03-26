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

### 객체 생성
```js
/**
 * 객체 생성
 * 1. 리터럴
 * 
 */

// 싱글 리터럴 객체
const object ={
    property: 'value', // 속성: 값
    method: function(){

    }, // 객체가 속성 값을 함수로 가지면 메소드라고 부른다.
}

// PascalCase(생성자 함수)
function NewObject(name){
    this.name = name;
}

// 객체 다수를 쉽게 만들 수 있다.
const newObject = new NewObject('name') // NewObject { name: 'name'}

const newObject2 = Object.create(
    Object.prototype, {
    name: {
        value: 'name',
        writable: true, // 덮어쓸 수 있는지
        enumerable: true, // 열거할 수 있는지
        configurable: true, // 객체 서술자를 수정할 수 있는지
        }
    }
);

newObject2.name = 'Kim';

for (const key in newObject2){
    console.log(key); // name, undefined
}

console.log(newObject2); // {name : 'Kim'}
```

### 프로퍼티 열거
```js
/**
 * 프로퍼티 열거
 */

const obj = {
    prop1: 'value1',
    prop2: 'value2',
    prop3: 'value3',
    prop4: 'value4'
}

// key 열거
for (const key in obj){
    console.log(key); // prop1, prop2, prop3, prop4
}

// value 열거
for (const key in obj){
    console.log(obj[key]); 
    /*
        value1, value2, value3, value4
    */
}

for (const key in obj){
    // 상속되거나 확장되서 사용한 객체의 속성을 꺼내오지 않기 위해서 사용
    if (obj.hasOwnProperty(key)){
        console.log(obj[key]); 
        /*
            value1, value2, value3, value4
        */
    }
    
}

hasOwnProperty() // 객체의 자신의 prototype이 없다면 `체이닝`현상이 일어난다. => 상위로 올라가면서 찾고자하는 속성을 찾음.
```

### 프로퍼티 조작
```js
/**
 * 프로퍼티 조작
 */

const person = {
    firstName: 'noh',
    location: 'korea',
};

// 추가
person.lastName = 'lastName';
// 수정
person.lastName = 'yeonghun';
// 삭제
delete person.location;
```

### 프로퍼티 접근자
```js
/**
 * 프로퍼티 접근자
 */
const person = {
    firstName: 'noh',
    lastName: 'yeonghun',

    get getFirstName(){
        return this._firstName.toUpperCase();
    },

    set setFirstName(newFirstName){
        if (typeof newFirstName === 'string'){
            this.firstName = newFirstName;
        }else{
            this.firstName = 'undefined name';
        }
    },

    get fullName(){
        return (
            this.firstName + this.lastName + '입니다'
        );
    },

};

console.log(person.getFirstName); // 'NOH'
person.setFirstName('kim');
console.log(person.firstName) // 'kim'
console.log(person.fullName()) // kimyeonghun입니다
```

### 인스턴스
> 고유한 객체.
>
> 객체 내부의 속성을 비교할 때는 값을 비교하지만 객체끼리 비교를 할때는 메모리의 주소를 확인한다.
>
> 고유한 객체가 특정 메모리의 공간을 차지하고 있으면 `인스턴스`이다.
>
> 그래서 만약 두 객체 내부의 속성 값이 모두 같은 `객체`일 지라도 두 `객체`는 서로 다른 특정 메모리 공간의 `주소`를 가지고 있기 때문에 두 `객체`는 다른 `객체`이다.
```js
const me = {
    name: 'nyh',
    age: 10,
    location: 'koera',
};
const me2 = {
    name: 'nyh',
    age: 10,
    location: 'koera',
};
const you = {
    name: 'nyh',
    age: 10,
    location: 'koera',
};
const you2 = {
    name: 'nyh',
    age: 10,
    location: 'koera',
};

console.log(me === me2); // false
console.log(me.name === me2.name) // true
```

### 생성자
> 
```js
/**
 * 생성자
 */

const me = {
    name: 'nyh',
    age: 10,
    location: 'korea',
};

function Person(name, age, location){
    // this는 생성될 인스턴스를 가르킨다.
    this.name = name;
    this.age = age;
    this.location = location;

    this.getName = function (){
        return this.name +'입니다';
    }

}

const me = new Person('nyh', 10, 'korea');
/* 
    Person 
    { name: 'nyh', age: 10, location: 'korea'} 
    this.name = 'nyh'
    this.age = 10,
    this.location = 'korea'
*/
const you = new Person('kim', 20, 'China');
// Person { name: 'kin', age: 20, location: 'China'}

// ES2015 부터 클래스 를 지원한다.
```