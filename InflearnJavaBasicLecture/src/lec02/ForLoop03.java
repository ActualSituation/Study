package lec02;

import java.util.ArrayList;

/**
 * 세 번째
 * for문
 */
public class ForLoop03 {

    public static void main(String[] args) {
        /**
         * for문 반복문입니다.
         * 반복문에는 크게 두 가지가 있습니다.
         * for문과 while문이 있습니다.
         * 두 가지의 용도에는 다른 쓰임새가 있습니다.
         * 사용하는 것이 미묘하게 다르죠.
         * 자주 쓰이는 반복문은 for문입니다.
         * for문은 조건문이 걸리고 특정 조건 하에서만 실행됩니다.
         * 예시를 보여 드리겠습니다.
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("i는 " + i + "입니다.");
        }

        /**
         * 위의 코드를 따라서 쳐보세요.
         * 0부터 4까지 반복해서 콘솔창에 찍히는 것이 보이실 겁니다.
         *
         * 해당 코드의 내용을 설명해 드리겠습니다.
         *
         * for는 반복문을 의미하는 단어입니다.
         * for라고 치고 난 뒤 안에는 int i = 0; 즉 i라는 정수형 변수는 0부터,
         * i < 5; i는 5보다 작을 때까지, i++, i는 1씩 증가한다는 의미입니다.
         * i++는 생소하시죠?
         * i++는 1씩 증가한다는 증감연산자 중 하나입니다.
         * 증감연산자를 깊게 설명하지 않았는데 코딩을 하면서 하나씩 설명하려 합니다.
         * 이유는 +, -, *, /, %는 대부분 기본적으로 아는 내용입니다.
         * +는 더하기,
         * -는 빼기,
         * *는 곱하기,
         * %는 나눈 뒤 나머지 값을 구하는 것입니다.
         * 사칙연산을 아신다면 대부분 아실 것이고,
         * %만 약간 다릅니다.
         *
         * i++ 와 ++i가 있습니다.
         * 무슨 차이일까요?
         *
         * 먼저 증가하는 것과
         * 로직을 실행하고 난 뒤에 증가하는 것의 차이가 있습니다.
         * 이건 미묘하지만 매우 중요한 차이가 있습니다.
         *
         * 말로 설명드리기 조금 그렇군요.
         *
         * ++i 는 먼저 i를 증가시킨다는 뜻입니다.
         * i++는 i를 실행하고 증가시킨다는 뜻입니다.
         *
         * 여러 실무 코드를 짜다면 ++i를 하게 될 경우,
         * 값이 먼저 증가한다는 것으로 로직을 짜게 되면,
         * 실무의 데이터가 엉켜버리는 경우가 생깁니다.
         *
         * 반복문에서 의도한 바대로 값이 나오지 않는다면,
         * ++i가 아니라 i++의 형태로 짜는 것이 좋습니다.
         *
         * 코드로 구현해 보려니 딱히 좋은 코드가 생각나지 않는군요.
         *
         * 조언을 드리는 것으로 넘어가겠습니다.
         *
         * 이 조언을 드리는 이유는 저자 본인이 실무 경험을 겪으면서 해당 예외를 겪었기 때문입니다.
         * 분명 의도한 값대로 값이 나오지 않고 다른 데이터가 계속해서 출력되고 있었기 때문입니다.
         * 무엇이 문제인지 모르고 한참을 헤매다가 본 것은
         * ++i였던 것으로 기억합니다.
         * 물론 i라는 변수명은 아니었습니다.
         * 다른 업무에 적합한 변수명으로 되어 있었죠.
         * ++i라고 되어 있는 것을 혹시나? 하는 마음에 i++로 바꾸어 보았죠.
         * 그랬더니 현업에서 요구하는 의도하는 데이터가 나오게 되었습니다.
         * 의도하는 데이터라기 보다는 정확하게 계산된 올바른 값이 나오고 있었죠.
         *
         * 이것의 가장 큰 차이는 ++i는 일단 해당 값을 1 증가시킨다는 의미입니다.
         * i++는 해당 로직이 뒤로 흘러간 다음에 i을 증가시킨다는 의미입니다.
         */

        int whileCnt = 0;
        while (whileCnt < 5) {
            System.out.println("반복문++ : " + whileCnt++ + " 입니다.");
        }

        whileCnt = 0;
        while (whileCnt < 5) {
            System.out.println("++반복문 : " + ++whileCnt + " 입니다.");
        }

        /**
         * 차이가 보이시나요?
         * 일단 증가한다는 차이와,
         * 로직을 실행하고 증가한다는 차이가 있습니다.
         * 사실 값의 변화를 보여드리려고 이렇게 짜긴 했습니다.
         * 다만, 실무에서는 좀 더 복잡한 로직을 짜게 되고,
         * 좀 더 많은 데이터를 다루게 됩니다.
         * 그러다 보면 ++i와 i++의 차이를 명확하게 아셔야 합니다.
         * 일단 증가되고 로직이 실행되는 것과, 로직이 실행되고 나서 증가되는 것,
         * ++i와 i++의 차이를 아셔야 합니다.
         *
         * 증감연산자에 대한 설명은 저정도로 하고,
         * for 반복문은 이정도면 아시면 좋습니다.
         *
         * 다른 예로는...
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("1부터... " + i + "입니다.");
        }

        /**
         * 위와 같은 형태도 가능합니다.
         * 특이점은 1부터 시작합니다.
         * 그리고 i는 <= 의 형태로 5와 같거나 작다는 의미가 됩니다.
         * 이건 중요한 부분입니다.
         * <= 와 같은 형태가 되면 맥스값의 기준이 달라집니다.
         * < 5 의 형태가 되면 4까지가 됩니다.
         * <= 의 형태가 되면
         * 5까지가 됩니다.
         * 반복이 1이 더 되느냐, 안 되느냐는 큰 차이가 있습니다.
         * 이 차이점을 알아두시는 것이 좋습니다.
         * 그리고 시작점도 다릅니다.
         * i = 0; 부터는 0부터 시작합니다.
         * i = 1; 부터는 1부터 시작합니다.
         * i = 0; 부터는 0부터 시작하는데 프로그래밍에서 컴퓨터는
         * 대부분의 시작값이 1이 아니라 0부터 시작하게 됩니다.
         * 좀 특이한 컴퓨터 만의 차이점입니다.
         * 1부터 시작이 아니라, 0부터 시작이라는 특징이 있습니다.
         * 이 점을 잘 알아두세요.
         *
         */

        ArrayList<String> strList = new ArrayList<>();
        strList.add("총무부");
        strList.add("회계부");
        strList.add("재무부");
        strList.add("기획부");
        strList.add("인사부");

        for (String dep : strList) {
            System.out.println("부서 : " + dep);
        }

        /**
         * 컬렉션 프레임워크를 배우진 않았지만,
         * 예시를 보여드리기 위해 위와 같은 코드를 짰습니다.
         * 위와 같은 for문은 향상된 for문이라고 합니다.
         * 특이하죠?
         * 저런 for문은 index의 구분이 필요가 없습니다.
         * ArrayList의 값을 순서대로 돌아가면서 값을 하나씩 빼주는 것이죠.
         * 사실 향상된 for문은 잘 쓸 일이 없습니다.
         * 기본적인 for문을 쓰는 경우가 더 많죠.
         * 다른 경우도 볼까요?
         */

        for (int i = 10; i > 0; i--) {
            System.out.println("i는 " + i + " 입니다.");
        }

        /**
         * 반대로 for문이 돌아가죠?
         * 하나씩 작아집니다.
         * 즉 값이 하나씩 줄어드는 for문을 짠 겁니다.
         * 값이 줄어드는 로직은 최초값을 크게 잡고 하나씩 줄여나가면 되는 것입니다.
         */

        for (int i = 10; i > 0; i-=2) {
            System.out.println("i는 -=2 ::: " + i);
        }

        /**
         * 위와 같은 경우도 있습니다.
         * -= 는 생소하시죠?
         * 저것도 증감연산자인데 축약한 증감연산자입니다.
         * i = i - 2; 를 축약한 것이 i-=2가 되는 것입니다.
         * 이런 식으로 성큼성큼 넘어가는 반복문을 만들 수도 있지만,
         * 저런 경우는 거의 없습니다.
         * 그저 i++, i-- 이 정도만 있습니다.
         *
         * for 문은 이 정도로 알아보겠습니다.
         *
         * 감사합니다.
         */

    }

}
