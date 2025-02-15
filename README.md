## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

[x] 자동차 이름을 입력을 받아야 함
    [x] 자동차 이름은 5자리를 초과할 수 없음
    [x] 자동차 이름은 쉼표(,)로 구분
[x] 시도 횟수를 입력을 받아야 함
    [x] 시도 횟수 사용자가 정의
[x] 자동차가 매 시도마다 전진 할 수 있음
    [x] 조건: 0~9까지의 random값 중에서 값이 4 이상이면 됨
[x] 매 시도마다 모든 자동차의 이름과 거리를 표기
[x] 자동차 경주 게임을 완료한 후 누가 우승했는지 알려 줌.
    [x] 우승자는 한명 이상일 수 있음
    [x] 가장 멀리 간 자동차가 우승
