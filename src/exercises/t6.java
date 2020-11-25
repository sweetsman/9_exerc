package exercises;
import java.util.Date;
import java.util.Random;
public class t6 {
    public static void main(String[] args) {

        final int NUM = 100000;

        int[] number = new int[NUM];
        Random random = new Random();

        for (int i = 0; i < NUM; i++)
            number[i] = random.nextInt(100000);

        StopWatch stopWatch = new StopWatch();
        sort(number, 0, NUM - 1);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime() + "ms");

    }

    //将数组第一个数作为中间数，放到数组中正确的位置，并返回其位置
    public static int mid(int[] a,int low,int high) {
        int middle = a[low];

        while (low < high) {
            for (; low < high; high--) {
                if (middle > a[high]) {
                    a[low] = a[high];
                    low++;
                    break;
                }
            }

            for (; low < high; low++) {
                if (a[low] > middle) {
                    a[high] = a[low];
                    high--;
                    break;
                }
            }
        }

        a[low] = middle;

        return low;
    }

    //将数组分成两份。递归。
    public static void sort(int[] a, int low, int high) {

        if (low >= high)
            return;

        int middle;

        middle = mid(a, low, high);

        sort(a, low, middle - 1);
        sort(a, middle + 1, high);

    }

}

class StopWatch {

    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
