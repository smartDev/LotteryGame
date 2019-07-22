package com.lottery.game;

/**
 * Created by Tauheed yar khan.
 */
public class LineResult {

    private LotteryLine lotteryLine;

    private Integer lotteryLineValue;

    public LineResult(LotteryLine line){
        lotteryLine = line;
        lotteryLineValue = lotteryLine.checkLine();
    }

    public LotteryLine getLotteryLine() {
        return lotteryLine;
    }

    public Integer getLotteryLineValue() {
        return lotteryLineValue;
    }

    /**
     * Order Based on Highest Value first
     * @param o1
     * @param o2
     * @return
     */
    public static int compare(LineResult o1, LineResult o2) {
        return o1.lotteryLineValue - o2.getLotteryLineValue();
    }
}
