package ver2_lect05.thread04;

public class Thread01 {

    /**
     * 쓰레드에 대해 설명 드리겠습니다.
     *
     * 우선 쓰레드라는 것은 하나의 프로세스에서 여러 개의 작업을
     * 동시에 처리하기 위해서 사용하는 것이라고 보시면 됩니다.
     *
     * 그러면 프로세스란 무엇인가? 의문을 가지실 수 있습니다.
     *
     * 프로세스는 보통 현재 실행 중인 하나의 프로그램을 이야기합니다.
     * 현재 켜져 있는 IDE도 하나의 프로그램이죠.
     * 보통 한 CPU에서 하나 이상의 프로세스를 실행시킬 수 있습니다.
     * CPU는 듀얼 코어, 쿼드 코어 등을 이야기하죠.
     * 여기서 하나 이상의 프로세스를 실행시킬 수 있다는 의미입니다.
     * 듀얼 코어라 하면 두 개의 프로세스를 실행시킬 경우 두 개의 코어에서
     * 동시에 프로그램 처리가 가능하다는 뜻입니다.
     *
     * 여기서 곁가지 이야기를 하자면, 컴퓨터를 사용하면 여러 개의 작업이
     * 동시에 실행됩니다.
     * 그러면 의문이 드실 겁니다. 동시에 작업을 컴퓨터가 처리하느냐? 하는 의문 말입니다.
     * 컴퓨터는 이럴 때, 여러 개의 코어를 가지고 있으면 동시 작업에 유리한 경향을
     * 가집니다.
     * 여러 개의 코어에서 프로세스를 분담하여 처리하기 때문이죠.
     * 그래서 코어가 2개, 4개, 8개, 16개 등으로 늘어나며
     * 작업 처리량이 늘어나는 것입니다.
     *
     * 하나의 프로세스에서는 여러 개의 쓰레드를 작동시킬 수가 있습니다.
     * 그러면 여러 개의 프로세스를 작동시키고, 거기서 각각의 프로세스마다
     * 여러 개의 쓰레드를 작동시킨다면 엄청나게 많은 작업을 동시에 처리할 수 있게 되는 것입니다.
     * 결국 쓰레드의 사용 이유는 동시 작업을 위해서 입니다.
     * 하지만 쓰레드라는 것이 동시에 여러 개의 작업이 쭉 이어지면서 처리되는 것은 아닙니다.
     * 컴퓨터의 자원을 쓸 수 있는 시간은 있고, 동시에 처리할 수 있는 한계량이 있습니다.
     * 그것을 넘어설 때는 사람은 느끼지 못하는 사이마다
     * 컴퓨터는 작업을 바꿔가면서 진행을 하는 것이고
     * 사람이 보기에는 작업을 동시에 처리하는 것처럼 보이는 것입니다.
     * 거기에는 컴퓨터의 처리 능력이 매우 빠르기 때문에 가능하다는 것이 조건으로 달려 있습니다.
     *
     * 여러 개의 쓰레드를 사용하는 프로그램 중 대표적인 것은 채팅 프로그램이 있습니다.
     * 여러 명의 사용자가 서로 채팅을 하면서
     * 파일을 다운로드하고 업로드하고 기프티콘을 주고받고 채팅을 하고 하는 작업을
     * 동시에 진행시킬 수 있는 바탕에는 여러 개의 쓰레드로 기능을 구현한 것이 밑바탕이 됩니다.
     *
     * 하지만 쓰레드에는 장점만 있는 것은 아닙니다.
     * 같은 프로세스 내에서 자원을 공유하면서 작업을 처리하기 때문에
     * 동기화, 교착상태 등의 문제들이 발생할 수 있습니다.
     * 이런 것들에 대한 신중한 고려를 하면서 프로그래밍을 해야 합니다.
     *
     * 그럼 이론 설명은 이 정도로 하고 실습을 해보겠습니다.
     */

}
