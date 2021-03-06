package lec06;

/**
 * 패키지에 대해 설명
 */
public class Package {

    /**
     * 저의 강좌는 자바 입문, 초급 과정이라 할 수 있습니다.
     * 그 중에서도 입문에 가깝습니다.
     *
     * 강의를 들으시는 분들께서 자바에 좀 더 친숙해지실 수 있도록 하는 것이 목표입니다.
     * 그를 통해 자바라는 언어가 어떻게 구성되어 있고,
     * 그 언어로 무엇을 하실 수 있을지, 큰 그림을 그려나가실 수 있도록 해드리는 것이
     * 저의 목표입니다.
     * 저의 강좌를 들으시고 나서, 이후부터는 좀 더 난이도 높은 강좌를 통해
     * 자바에 대해 깊이 있게 알아가시길 추천합니다.
     *
     * 예전에 어떤 옛날 이야기에 이런 이야기가 나옵니다.
     *
     * 중병이 걸린 환자에게는 죽과 약한 약을 쓰며 병을 다스린 뒤
     * 든든한 음식을 먹여 기운을 돋우고 강한 약을 써서 병을 치유한다고.
     * 의사분들이 보신다면 안 맞는 말이라고 할 수도 있습니다.
     * 비유로써 그리 말하는 것입니다.
     * 처음 입문부터 너무 어려운, 너무 세세한 내용을 다루지 않으려 했습니다.
     * 쉬운 내용들을, 그러면서도 핵심적인 것들을 잡아가면서
     * 미래에는 자바에 대해 이해하실 수 있는 큰 그림을 그려나가실 수 있도록
     * 해드리는 것이 저의 강좌의 목표입니다.
     */

    /**
     * 다들 윈도우 운영체제를 많이 사용해 보셨을 거라고 생각합니다.
     * 윈도우를 쓰다보면 폴더를 만들고 파일을 생성하지요?
     * 그런 작업들과 비슷한 개념이 패키지 개념입니다.
     * 각각의 폴더별로 동일한 파일이 존재할 수 있습니다.
     * 하지만 윈도우 운영체제는 다른 폴더의 같은 이름의 파일은 같은 파일이라곳
     * 생각하지 않죠.
     * 예를 들어
     * '구매'폴더와 '인사'폴더에 들어있는 '주간업무보고'라는 파일은 다를 것입니다.
     * 같은 '주간업무보고'라는 파일이지만 '구매'폴더와 '인사'폴더에 들어있는 것은
     * 각각 구매의 주간업무보고와 인사의 주간업무보고인 것이죠.
     * 
     * 다른 예를 들어
     * '1반' 이순신과 '2반' 이순신은 각각 다릅니다.
     * 1반의 이순신과 2반의 이순신이 동일인일 수는 없죠.
     * 이런 것과 같은 원리입니다.
     * '구매'폴더와 '인사'폴더는 일종의 패키지입니다.
     * 각각의 것들이 패키지와 같은 것이죠.
     * 저것들로 각각의 구분자가 되어 주는 것입니다.
     * 그리고 그 안에 든 '주간업무보고'라는 것이 자바 파일이 되는 것입니다.
     *
     * 이제 이해가 되시나요?
     * 그리고 폴더를 계층구조로 표현할 수 있듯이
     * 패키지도 계층구조로 표현할 수 있습니다.
     * 이를 통해서 계층구조로 표현된 패키지에 각각의 자바 파일을 관리할 수 있는 것이죠.
     *
     * 패키지의 네이밍에도 일종의 규칙이 있습니다.
     * 그 규칙은 회사마다 정하는 규칙이 다릅니다.
     * 각 회사에서 정하는 룰에 따르셔야 합니다.
     *
     * 예를 들자면
     *
     * com.jth.world.resort.procure
     * com.jth.world.resort.hr
     * com.jth.world.construct.account
     * com.jth.world.construct.sales
     *
     * 이런 식으로 패키지 구조를 짤 수 있습니다.
     * 각각의 앞의 com.jth.world라는 것은 동일하게 들어갈 수 있습니다.
     * 하지만 그 뒤부터는 별도로 짜여질 수 있습니다
     * 각각의 하나의 지주회사에 리조트 회사와 건설 회사가 있다고 합시다.
     * 거기서 리조트의 구매와 인사, 건설의 회계와 영업을 저런 식으로 나눌 수 있습니다.
     *
     * 아니면
     *
     * com.jth.world.resort.procure
     * com.jth.world.resort.hr
     * com.jth.world.construct.procure
     * com.jth.world.construct.hr
     *
     * 이런 식으로 동일한 구매와 인사가 각각 다른 리조트와 건설에 들어있다는 것을
     * 알릴 수 있는 방법도 존재합니다.
     *
     * 패키지는 이렇게 파일들의 효율적인 관리를 도와줍니다.
     *
     * 이건 여러분이 윈도우에서 파일을 관리할 때
     * 폴더별로 구분해서 관리하시는 분들은,
     * 폴더별로 파일을 관리하는 것이,
     * 자바에서는 패키지 별로 자바 파일을 관리하는 것과 같다고 보시면 됩니다.
     *
     * 패키지의 설명은 여기까지 하겠습니다.
     *
     *
     * import라는 개념이 있습니다.
     *
     * import는 다른 곳에 위치한 자바 파일을 땡겨다가 쓰는 것입니다.
     * 구매에 있는 주간업무보고를 인사에서 끌어다가 쓰고 싶다면
     * import 구문을 통해서 땡겨다가 쓰는 것입니다.
     * import 구분은 패키지의 경로와 자바 파일 명이 필요합니다.
     * 이것을 통해 어떤 파일을 끌어다 쓰는지 명시해 주는 것입니다.
     * import 구문은 자바의 객체지향 개념에서 자주 사용되는 것입니다.
     * 왜냐면 객체지향은 여러 클래스와 메소드로 나누는 것이기 때문에,
     * 그렇게 나누어진 클래스를 필요한 클래스 파일에서 당겨다가 쓸 때는
     * import를 써야 하기 때문입니다.
     *
     * import와 패키지의 설명은 여기까지 하겠습니다.
     *
     * 감사합니다.
     *
     * 이론 설명 강의는 여기까지 하겠습니다.
     * 지금까지 배운 개념을 활용하여 종합적인 프로그램을 짜보도록 하겠습니다.
     * 저의 강의 계획 중 입문 개념 중 첫 번째 파트는 여기까지입니다.
     * 그리고 지금까지 배운 개념들을 활용해서 하나의 프로그램을 짜보려고 합니다.
     *
     * 이후에 좀 더 다양한 입문용 개념들을 담은 또 다른 강의 하나를 제작하려 합니다.
     * 그 후 해당 개념들을 종합적으로 활용하여 눈으로 보이는 어떤 특정 프로그램을
     * 짜려고 계획 중에 있습니다.
     *
     * 이것들을 구현하기 전까지, 첫 번째 단계의 강의를 여기까지 잘 따라와 주셔서 감사합니다.
     *
     * 그러면 위의 개념들을 종합적으로 활용하는 코드를 짜보겠습니다.
     */

}
