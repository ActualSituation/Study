package lec02;

/**
 * 다섯번째
 * do-while
 */
public class DoWhile05 {

    public static void main(String[] args) {

        /**
         * do-while 문이 있습니다.
         * 어렵게 생각하지 않으셔도 됩니다.
         *
         * 최초 1번은 무조건 로직을 수행하고,
         * 그 뒤로 while문을 수행한다고 생각하시면 됩니다.
         *
         * 최초 1번, 그것을 무조건 수행해야 합니다.
         *
         * 아래 샘플 코드를 짜보겠습니다.
         */
        int whileCnt = 0;
        do {
            System.out.println("do, first.");
            System.out.println("whileCnt ::: " + whileCnt);
            whileCnt++;
        } while(whileCnt < 3);

        /**
         * 위의 로직은 이렇게 진행됩니다.
         * 근데 저것만 봐서는 잘 이해가 되지 않습니다.
         * 처음 무조건 한 번은 실행한다는 것이 어떤 의미인지 와닿지 않으실 겁니다.
         *
         * 다른 예를 코딩해 보겠습니다.
         */

        do {
            System.out.println("Do, fisrt.");
        } while (false);

        /**
         * 위의 예는 while 문에서 false를 넣은 것입니다.
         * while문을 배울 때 false를 넣는다면 while이 동작하지 않는다는 것을 아실 겁니다.
         * while (false)를 통해서 while이 동작하지 않게 막아 놨습니다.
         * do 문에서는 로직이 들어 있습니다.
         * 즉 do 문의 로직은 while 문을 타기 전에 무조건 한 번 돌아갑니다.
         *
         * 다른 방식으로도 설명해 드리겠습니다.
         * 프로그래밍 코드는 한 줄 씩 행을 내려가면서 명령을 수행합니다.
         * 물론 객체지향이란 개념은 절차지향과 다르게 무조건 한 줄씩 내려가면서 수행하는 방식은 아닙니다.
         * 하지만 큰 틀에서 보자면 코드는 한 행씩 내려가면서 코드를 수행합니다.
         *
         * 위의 do-while 문도 그렇습니다.
         * do 다음에 로직이 존재하고 그 아래에 while 문이 존재합니다.
         * do와 while 문 사이에는 로직이 존재하죠.
         * 그 사이의 로직을 무조건 수행하는 것입니다.
         * while문이 참이든 거짓이든 말이죠.
         * 달리 말하면 while문은 true이든 false이든 말입니다.
         *
         * 이런 반복문은 실무에서 저도 별로 써본 적은 없습니다.
         * 거의 없는 것 같네요.
         * 하지만 보통 Java API들, 이런 것들은 대부분 필요한 것들을 만들어 놓은 것들입니다.
         * 프로그래밍을 하다 보면은 이런 여러 가지의 것들을 알아두면
         * 좀 더 다양한 코드를 짤 수 있게 됩니다.
         * 그리고 복잡한 업무 로직도 해결하게 되는 것이죠.
         * 그래서 알아두면 나쁠 것은 없습니다.
         *
         * 기초적인, 기본적인 것들을 파악해 두고,
         * 나중에 그런 업무 로직들을 만날 때마다 응용해 가면서 코드를 작성하시면,
         * 멋진 코드를 만드실 수 있습니다.
         *
         * 그럼 do-while 강의는 여기까지 하고,
         * 그 다음 강의는 각종 변수, 조건문, 반복문들을 활용하여
         * 샘플 코드들을 몇 가지 짜보겠습니다.
         *
         * 감사합니다.
         */

    }

}