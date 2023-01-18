package _3DesignPatterns.ch2;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            int ok = 1;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j+1]) {
                    Integer aux = list[j+1];
                    list[j+1] = list[j];
                    list[j] = aux;
                    ok = 0;
                }
            }
            if (ok == 1) {
                break;
            }
        }
    }
}
