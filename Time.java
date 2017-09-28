/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Time {

    private int mHour;
    private int mMinute;
    private int mSecond;
    private long mTime;

    public Time() {
        mTime = System.currentTimeMillis();
    }

    public Time(long time) {
        mTime = time;
    }

    public Time(int hour, int minute, int second) {
        mHour = hour;
        mMinute = minute;
        mSecond = second;
    }

    public void setTime(long elapsedTime) {
        mTime = elapsedTime;
    }

    public int getHour() {
        return (int) (mTime / (1000 * 60 * 60)) % 24;
    }

    public int getMinute() {
        return (int) (mTime / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int) (mTime / 1000) % 60;
    }

}
