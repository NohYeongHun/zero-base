## alias, *(애스터리스크)
- 별명 : 말 그대로 부르기 쉽게 하기 위함(쉽게 사용하기 위함)

```sql
select m.member_type as 회원 구분
, m.user_id as 회원 아이디
, m.password as 비밀번호
, m.name as 회원 이름
from member as m

select member.name
from member
```