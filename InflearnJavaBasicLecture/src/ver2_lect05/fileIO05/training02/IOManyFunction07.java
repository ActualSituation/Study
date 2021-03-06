package ver2_lect05.fileIO05.training02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOManyFunction07 {

    /**
     * 이번엔 파일 복사를 실습해 보겠습니다.
     * 잘 따라와 주세요.
     */

    public static void main(String[] args) {

        String target = String.valueOf("C:\\dev\\FileIOTextFile.txt");
        String destination = String.valueOf("C:\\dev\\FileIOTextFileDuplicated.txt");

        try {

            File destinationFile = new File(destination);

            /**
             * 이미 파일이 존재하는지 여부를 확인합니다.
             * 복사하려는 곳에 파일이 존재하면 파일 복사를 실행하지 않습니다.
             * 그러면서 예외를 발생시켜서 강제로 로직을 끊는 거죠.
             * catch 로직 구분으로 보내는 것입니다.
             */

            if (destinationFile.exists()) {
                String message = String.valueOf("이미 파일이 존재하여 복사가 불가합니다.");
                throw new Exception(message);
            }


            FileInputStream fis = new FileInputStream(target);
            /**
             * 파일을 읽어오고
             */
            FileOutputStream fos = new FileOutputStream(destination);
            /**
             * 복사하려는 위치로 파일을 씁니다.
             * Stream은 통로를 여는 것이라고 말해 드렸죠?
             */

            byte[] byteBowl = new byte[1024];
            /**
             * 1024 byte는 mega byte입니다. 흔히들 아는 mb죠.
             * 1024 mega byte는 giga byte입니다.
             * 흔히들 아는 gb이고, ssd 용량에서 익숙한 개념이죠.
             * 512gb, 256gb 등 말이죠.
             * 여기에 1024를 곱하면 mb, 1024를 곱하면 byte가 되는 겁니다.
             * 컴퓨터 공학이나 컴퓨터 과학을 배우시면 기초 이론으로 배우시게 되는 개념이예요.
             * 크기를 재는 개념은 마치 cm나 m나 mm 등 다양한 것처럼
             * byte만 존재하는 건 아닙니다.
             * 하지만 너무 복잡하니 우리가 지금 배우는 자바에서는 byte와 mega byte, giga byte 정도만 알아두죠.
             *
             * 여담을 또 하자면 tera byte라는 개념이 있죠.
             * 테라 바이트의 단위가 등장하면서 불붙게 된 개념 중 하나는 바로 빅 데이터입니다.
             * 빅 데이터가 불 붙으면서 같이 불 붙은 개념은
             * 바로 인공지능이구요.
             * 빅 데이터의 유의미한 분석의 바탕에는 매우 방대한 자료가 필요합니다.
             * 또한 자료도 무작위, 아무 분야의 자료만 필요한 게 아니예요.
             * 해당 분야의 특정 초점을 맞춘 데이터가 방대하게 필요하죠.
             * 인공지능에서 쓰는 데이터도 그렇구요.
             * 이런 데이터를 정제하는 능력도 필요하고
             * 그런 능력을 배우는 분들이 빅데이터 분야에 종사하시는 분들입니다.
             * 저희는 개발자에 관심이 있으신 분들이 많으니
             * 빅데이터 개발자로 가시는 분들이 많으시겠죠.
             * 빅데이터 쪽으로는 파이썬과 R이 유명합니다.
             * 하지만 자바도 지원되는 걸로 알아요.
             *
             * 각종 새로 나온 도구들이 언어들을 지원하는 배경에는
             * 해당 언어를 사용하는 개발자 생태계가 얼마나 넓냐도 고려 대상입니다.
             * 그래서 대부분의 새로 나온 도구들이 지원하는 언어에는
             * java, python, javascript가 있어요.
             * 특히 우리 나라에서는 java와 javascript, 둘 중 하나를 할 줄 알면
             * 개발자로 살아가기 좋습니다.
             * python은 상대적으로 생태계가 넓지 않은 편이기도 해요.
             * 그리고 전세계적으로 봐도 java와 javascript, python 중 하나를 공부해도
             * 먹고 살 수 있습니다.
             *
             * 또한 매번 말씀 드리지만,
             * 당장 월급 받고 일하는데 필요한 지식의 양이 있고,
             * 고소득을 올리는데 필요한 지식의 양과 지혜의 깊이가 있어요.
             * 그리고 고소득에 가까워질 수록 올라가는 학습 곡선은 점점 더뎌진답니다.
             * 하지만 그 더뎌지는 학습곡선만큼 깊은 지식과 지혜를 가진 개발자도 적어지는 편이예요.
             * 저는 어느 위치에 있는지는 잘 모르겠어요.
             * 저도 자바 입문 강의를 만들지만, 꾸준히 다른 분의 강의나 책을 보면서
             * 공부하기도 하거든요.
             *
             * 사실 대부분의 분야가 그렇지만 IT 중 SW 개발은 계속해서 신기술들이 쏟아져 나와요.
             * 그리고 그런 신기술들이 쏟아져 나와서 활약을 하다가
             * 이제 전통적인 산업군에도 쓰이면서 자리잡아 가는 기술들도 있고,
             * 처음에 화려하게 등장한 것과 다르게 어느 사이에 조용히 사라지며 시장에서
             * 퇴장하는 기술들이 있어요.
             * 그래서 개발자들은 기술 트렌드에도 민감해야 하는 편이죠.
             * 또한 시장에 이미 광범위하게 구축된 시스템들은 그 퇴장하는 속도가 느린 편이랍니다.
             * 과거에 C가 그러했고 지금은 Java가 그러하죠.
             * 아직 Java의 차세대로 불리는 언어는 없는 편입니다.
             *
             * python의 django, javascript의 node.js 등 다양하게 언급이 됐지만,
             * 아직 java의 spring framework를 넘어서진 못하고 있어요.
             * 거기에는 그만큼 java 진영의 개발자들이 노력하는 것도 있기도 해요.
             * 기술의 깊이를 더욱 깊게 파고, 활용되는 범위를 넓히구요.
             *
             * 여담을 좀 더 하자면, 그런 오픈소스들과 java의 오픈소스,
             * openjdk에 기여를 하게 되는 개발자가 되시면
             * 정말 좋은 대우를 받으실 수 있습니다.
             *
             * 제가 예전 강의에서 말씀드린 것 같은데 SW개발 분야에서 오픈소스가 가지는 영향은 엄청나요.
             * 그런 오픈소스에 기여를 했다는 것이 왜 좋은 대우를 받는 길이냐면은,
             * 그 오픈소스에 이미 기여를 하는 개발자분들은 시장의 인정을 받은 오픈소스를 모여서 만드는
             * 개발자들에게 인정을 받은 분들이예요.
             * 그 분들이 새로 추가되는 코드를 확인하고 이 코드 정말 좋다, 라고 판단해서
             * 자신들의 오픈소스에 반영해 주는 것이니까요.
             * 이 말은 곧 회사 인사 담당자나 기술쪽 팀장 분들에게는
             * 이 사람에 대한 기술 테스트는 필요없다, 라는 알림을 주는 것과 같아요.
             * 그렇기 때문에 오픈소스에 기여하는 것은 자신의 가치를 높이는 매우 좋은 길이 됩니다.
             *
             * 기여를 하지 못하더라도, 시장에 인정을 받은 어떤 오픈소스에 대해 높은 이해도를 가지는 것만 해도
             * 매우 높은 가치를 지닌 개발자가 되는 길입니다.
             *
             * 그리고 제가 생각하기에,
             * 이 강의를 결제하고 들으시는 분들은 아직 거기까지 가려면 머나먼 길이 남았어요.
             * 하지만 꾸준히 노력하시면,
             * 어느 것이든 시장에 인정을 받은 오픈소스의 기여자가 되실 확률이 높습니다.
             *
             * 여담이 길었네요.
             * 그럼 강의를 진행하겠습니다.
             */
            while (true) {
                int read = fis.read(byteBowl);
                if (read == -1) {
                    break;
                }
                fos.write(byteBowl, 0, read);
            }

            /**
             * 위의 과정은 해당 길이만큼 끊어서 파일을 쓰는 것입니다.
             */

            System.out.println("파일 복사에 성공했습니다.");

            fis.close();
            fos.close();

        } catch (Exception e) {

            System.out.println("파일 복사 중 예외가 발생하였습니다.");

            e.printStackTrace();
        }

    }

}
