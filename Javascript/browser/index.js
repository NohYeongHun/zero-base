const h2Element = document.querySelector('h2');

function replaceH2Text(){
    h2Element.innerText = '안녕하세요';
}

h2Element.addEventListener('click', replaceH2Text);