import java.util.Random;

public class BubbleSortDemo {
    public static void main(String[] args) {

        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                board[i][j] = '_';
            }
        }

        board[0][0] = 'x';
        board[1][1] = 'o';

        board[0][2] = 'x';
        board[0][1] = 'o';

        board[2][1] = 'x';
        board[1][2] = 'o';

        board[1][0] = 'x';
        board[2][2] = 'o';

        board[0][1] = 'x';

        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[row].length; ++col) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }

//
//
//
//
//        int[] numbers = buildNumbers();
//        bubbleSort_brute_force(numbers);
//
//        numbers = buildNumbers();
//        bubbleSort_improved(numbers);
//
//        numbers = buildNumbers();
//        insertionSort(numbers);
    }

    private static int[] buildNumbers() {
        Random random = new Random(1);
        int[] result = new int[10];

        for (int i = 0; i < result.length; ++i) {
            result[i] = random.nextInt(10) + 1;
        }
        return result;
    }

    private static void bubbleSort_brute_force(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = 0; j < numbers.length - 1; ++j) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    private static void bubbleSort_improved(int[] numbers) {
        int remaining = numbers.length - 1;
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = 0; j < remaining; ++j) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
            --remaining;
        }
    }

    private static void swap(int[] numbers, int first, int second) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
    }

    private static void insertionSort(int[] numbers) {
        int i = 1;
        while (i < numbers.length) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                --j;
            }
            numbers[j + 1] = temp;
            ++i;
        }
    }
}
