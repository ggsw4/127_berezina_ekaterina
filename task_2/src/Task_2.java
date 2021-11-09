public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
       int i = 0;
       while ( i*i <= num) {
           i++;
       }
       i--;
       return i*i;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int i = 1;
        int k = 1;
        while (num>0) {
            k = 2*i+6;
            i=k;
            num --;
        }
        return k;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
       if (num==1 && base==1){
           return true;
       }
       while (num%base==0) {
           num = num/base;
       }
       if (num==1){
           return true;
       }
       else {
           return false;
       }
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int i = 0;
        while (start!=end) {
            if (start%2==0 && start/2 > end) {
                start=start/2;
            }
            else {
                start --;
            }
            i++;
        }
        return i;
    }
}
