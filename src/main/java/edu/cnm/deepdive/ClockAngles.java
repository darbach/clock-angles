package edu.cnm.deepdive;

public class ClockAngles {

  public static double hourHandAngle(int hours, double minutes) throws IllegalArgumentException {
    if ((hours > 23 || hours < 0) || (minutes >= 60 || minutes < 0)) {
      throw new IllegalArgumentException();
    }
    // hours + fractions of an hour * 360 degrees / 12 hours
    return ((hours % 12) + (minutes / 60)) * 360 / 12 ;
  }

  public static double minuteHandAngle(double minutes) throws IllegalArgumentException {
    if (minutes >= 60 || minutes < 0) {
      throw new IllegalArgumentException();
    }
    return minutes * 360 / 60;
  }
}
