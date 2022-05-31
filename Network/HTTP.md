## 목차
- [목표](#본-챕터-목표)
- [HTTP](#http)

## 본 챕터 목표

1. HTTP와 HTTPS의 차이점에 대해 간략히 설명
2. 쿠키와 세션의 차이점에 대해 간략히 설명
3. HTTP GET, POST 방식에 대해 간략히 설명
4. 웹 브라우저를 실행시켜서 주소창에 특정 URL 값을 입력시킨 후, 엔터를 눌렀을 때, 페이지가 렌더링되는 과정을 웹통신 흐름에 중점을 두어 가능한 구체적으로 설명.

### 다양한 응용 계층 프로토콜
- HTTP/HTTPS (HyperText Transfer Protocol): 웹사이트 접속
- FTP (File Transfer Protocol): 파일 송수신
- SMTP/POP3 (Simple Mail Transfer Protocol): 메일 송신/수신
- DNS(Domain Name System): 이름 해석

## HTTP (HyperText Transfer Protocol)
- 인터넷(WWW)상에서 정보를 주고받는 프로토콜
- HTTP method: GET, POST, PUT, DELETE
- Server/Client 모델로 Request/Response 사용
    - Client에서 요청(Request)를 보내면, Server에서 응답(Response)을 준다.
    - HTTP는 Connectionless 한 프로토콜임 - 1회성 Request 및 Response!
    - TCP/IP socket을 이용해서 연결됨
![](img/2022-05-31-11-40-24.png)

### WWW이란?
- WWW 이란?
    - W3 또는 웹(Web)
    - 주요 요소 : HTML, URL, HTTP
- HTML : markup 언어, hypertext 와 hyperlink(또는 링크)로 구성

### HTTP 1.1
- HTTP는 Connectionless 방식
- HTTP 1.1은 keepalive 기능을 통해, 서버에서 설정된 keepalive timeout 까지는 연결과정 없이 데이터 송수신 가능 
    - 내부적으로 결국 매번 TCP 3-way handshake 과정을 거칠 필요가 없어짐
![](img/2022-05-31-11-42-01.png)

### 일반적인 HTTP(HyperText Transfer Protocol) 송수신
![](img/2022-05-31-11-42-20.png)