package _04_class_object.exercise.stop_watch;

import java.util.Arrays;
import java.util.Scanner;

public class RunStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println("thời gian bắt đầu"+stopWatch.getStartTime());
        int []array=new int[100000];
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)Math.floor(Math.random()*100000);
        }

        for (int i = 0; i <array.length ; i++) {
            int max= array[i];
            for (int j = i; j <array.length-i ; j++) {
                if (max < array[j]) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;
                }
            }
        }
        stopWatch.stop();
        System.out.println(Arrays.toString(array));
        System.out.println("thời gian kết thúc"+stopWatch.getEndTime());
        System.out.println("milis " +" " + stopWatch.getElapsedTime());
    }

}

