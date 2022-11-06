package baseball.view;

public class OutputView {
    public static final String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";

    public static void inputNumberMessage() {
        System.out.print(INPUT_NUMBER_MESSAGE);
    }

    public static void gameStartMessage() {
        System.out.println(GAME_START_MESSAGE);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
