var myList = [ , 'home', , 'school'];
console.log(myList[0]);
console.log(myList[1]);

var str ='word'; // 변경되어지지 않음.
str.toUpperCase();

console.log(str);
console.log(myList[3]);


/* 
    Primitive Type
*/
const un = undefined;
const nu = null;
const bool = false;
const num = '0';
const string ='test';

console.log(typeof un); // undefined
console.log(typeof nu); // object
console.log(typeof bool); // boolean
console.log(typeof num); // number
console.log(typeof string); // string


/*
    Objects Type
*/
const obj ={
    name: 'jang',
}

const arr = ['jang'];

function func(){
    return 'jang';
}

console.log(typeof obj); // object
console.log(typeof arr); // object
console.log(typeof func); // function


const number = '0';
/**
 * 동등 연산자를 사용할 때 
 * 엄격한 비교 => === 
    * 데이터 타입도 비교한다.
 * 느슨한 비교 => ==
    * 데이터 타입을 비교하지 않는다. '0'(문자열) == 0(숫자)
 */

if (number == 0){
    console.log('number는 0입니다'); // True
}else{
    console.log('number는 0이 아닙니다.'); // False
}

const word = '문자';
const word2 = "문자";
const word3 = `문자`;
const words = word + ' ' + word2

console.log(word == word3);
console.log(words);
console.log(words.length);

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