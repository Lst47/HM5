package ru.netology.sqr.HMmaven.services;

public class SQRService {
    public int sqrServiceCalc(int low, int hight) {
        int result = 0;
        int upRange = 99;

        for (int lowRange = 10; lowRange <= upRange; lowRange++) {
            int sqrLowRange = (lowRange * lowRange);
            if (low <= sqrLowRange && sqrLowRange <= hight) {
                result++;
            }
            return result;
        }

        return -1;
    }

}
