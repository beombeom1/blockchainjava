package Die;

public class FairDie extends Die {

    // 주사위 던지기 통계정보를 위한 배열 크기
    static final int MAX_ARR = 7;

    // 배열 freq의 첫번째는 배열원소의 최대값과 최소값의 차이를 유지
    static int[] freq = new int[MAX_ARR];

    // 최소 빈도 번호 min_num, 최대 빈도 번호 max_num
    static int min_num, max_num;

    FairDie() {
        /*
        for (int i = 1; i <= SIDES; i++)
            freq[i] = 0;
        */
    }

    void roll() {
        super.roll();
        int number = getNumber();

        // int init = freq[1];
        int diff = 0;
        int min = freq[1], max = freq[1];

        freq[number] = freq[number] + 1;
        for (int i = 1; i <= SIDES; i++) {
            if (min > freq[i]) {
                min = freq[i];
                min_num = i;
            }
            if (max < freq[i]) {
                max = freq[i];
                max_num = i;
            }
        }
        diff = max - min;
        freq[0] = diff;
        System.out.println("Diff : " + diff
                + ", max num : " + max_num
                + ", min num : " + min_num);
        if (diff >= 2 && max_num == number) {
            System.out.println("*number* : " + number);
            freq[number] = freq[number] - 1;
            roll();
        } else {
            setNumber(number);
        }
    }
}
