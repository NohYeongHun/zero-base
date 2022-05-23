## 2. 리눅스 운영체제에 대한 설명
1. 프로그래밍에 유용하게 사용할 수 있다.
2. UNIX 계열 운영체제
3. 클라우드 컴퓨팅에서 많이 사용

## 3. 리눅스 운영체제
1. Ubuntu
2. Red Hat
3. CentOS 등등..

## 4. 다음 중 리눅스 운영체제의 특징
1. 전역 네임스페이스를 사용.
2. inode 값으로 파일 관리
3. 각 프로세스는 pid값으로 구분

## 5. 다음 중 Shell의 종류로 알맞지 않은 것은?
1. bash
2. ksh
3. zsh

## 6. 다음 중 리눅스 패키지 설치를 위한 명령어로 알맞은 것?
- apt-get

## 7. 다음 중 현재 디렉토리에서 파일 목록을 출력하는 shell 명령어
- ls

## 8. 다음 중 특정 파일이 소유자, 그룹, 기타사용자에게 모든 권한을 부여받은 경우의 출력으로 알맞은 것.
- rwx rwx rwx

## 9. 다음 중 fast.c 파일에 사용자와 그룹에게 읽기, 쓰기 권한을 추가하는 명령어로 알맞은 것
- chmod ug+rw fast.c

## 10. 다음 중 a.txt의 마지막 10라인을 b.txt에 저장하는 shell 명령어로 알맞은 것

- `tail <a.txt> b.txt`

## 11. 다음 중 fastcampus.txt 파일에서 computer 라는 문구가 들어간 문구를 대, 소문자 구분 없이 검색해서 출력하는 shell 명령어로 알맞은 것은?
- `grep -i computer fastcampus.txt`

## 12. 다음 중 foreground 프로세스를 실행 중지하는 명령어로 알맞은 것
- CTRL + Z

## 13. 다음 중 시스템이 사용하고 있는 모든 프로세스의 상태를 확인하는 명령어로 알맞은 것?
- ps -a

## 14. 다음 중 리눅스의 root directory에 포함되어 있는 디렉토리
```
bin   dev  home  lib32  libx32      media  opt   root  sbin  srv  tmp  var
boot  etc  lib   lib64  lost+found  mnt    proc  run   snap  sys  usr
```

## 15. SoftLink에 대한 설명
- soft link의 inode number는 원본 파일의 inode number와 다르다.
- soft link의 내용을 변경하면 원본 파일의 내용은 변경
- 원본 파일이 사라지면, soft link는 해당 파일을 접근하지 못한다.
- 원본 파일이 수정되면, soft link는 해당 파일을 수정된 형태를 볼 수 있다.

## 16. 시스템콜 함수
- read()
- write()
- open()

## 17. 다음 중 소프트웨어 인터럽트 명령에 해당하는 instruction value는?
- 0x80

## 18. 다음 중 시스템 콜의 구현 방법에 대한 설명
- CPU는 사용자 모드를 커널 모드로 바꿔준다.
- IDT에서 0x80에 해당하는 주소를 찾아서 실행한다.
- 해당 시스템 콜 함수를 실행 한 후, 커널 모드에서 사용자 모드로 변경하고 해당 프로세스의 다음 작업을 수행한다.
- 시스템콜 실제 코드
    1. eax 레지스터에 시스템 콜 번호를 넣고,
    2. ebx 레지스터에는 시스템 콜에 해당하는 인자값을 넣고,
    3. 소프트웨어 인터럽트 명령을 호출하면서 0x80값을 넘겨줌

## 19. 다음 중 리눅스 C 컴파일러를 이용하여 test.c 파일을 컴파일 하여 test 라는 실행파일을 만드는 명령어
- gcc -o test test.c

## 20. 클라우드 컴퓨팅 서비스
1. 서버 환경을 미리 구축해 놓고, 바로 사용할 수 있도록 제공한다.
2. 대표적인 서비스로 Amazon Web Service(AWS)가 있다.
3. 네트워크를 통해 데이터를 요청하고 받는 형식으로 진행된다.

## 21. AWS
- EC2를 사용해서 Computing 자원을 사용할 수 있다.
- Elastic IP를 사용하여 적절한 IP주소를 필요할 때 할당받는다.
- EC2를 사용할 Server Region을 직접 설정할 수 있다.

## 22. 다음 중 운영체제를 구성하는 요소
- File Manager
- Shell
- Kernel

## 23. 다음 중 현재 디렉토리에 있는 모든 파일의 목록과 그에 대한 내용을 출력하는 shell 명령어로 알맞은 것은?
- ls -al

## 24. 다음 중 Chromedriver 파일에 소유자 읽기 권한을 제외한 모든 권한을 없애는 shell 명령어로 알맞은 것
- chmod 400

## 25. 다음 중 디렉토리에 있는 모든 파일을 지우는 리눅스 명령어로 알맞은 것
- rm -r

## 26. 다음 중 anaconda 디렉토리 내부에 있는 하위 경로에 존재하는 파일까지 모두 포함하여 python 문구를 포함하고 있는 파일의 목록을 출력하는 명령어
- ls | grep -r python anaconda

## 27. 다음 중 inference.py를 background에서 실행하는 명령어로 알맞은 것은?
- python inference.py &

## 28. background에서 실행중인 inference.py 프로세스를 확인해보니 pid가 100였다. 이 프로세스를 강제 종료하는 명령어로 알맞은 것은?
- kill -9 100

## 29. cp A B 명령어를 수행했을 때, 설명 중 맞는 것
1. A와 B는 동일한 inode값을 가지지 않는다.
2. A를 삭제하면 B에 접근이 가능하다.
3. ls -ali 명령어로 확인했을 때 출력 결과가 동일하지 않다.
4. A와 B는 동일한 파일 크기를 갖는다.

## 30. GNU 프로젝트의 일환으로 개발된 리눅스 운영체제 대부분의 기본으로 설정되어 있는 shell의 이름은?
- BASH

## 31. root directory가 현재 디렉토리 위치일 때, anaconda 폴더 안에 있는 envs 폴더안에 존재하는 모든 파일의 목록을 출력하는 shell 명령어
- ls -al anaconda/envs
- ls anaconda/envs
- ls ./anaconda/envs