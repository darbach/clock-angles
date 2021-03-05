package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockAnglesTest {

  @Test
  void hourHandAngle_angles() {
    double[] minutes = {
        0,
        0,
        15,
        30,
        15,
        30
    };
    int[] hours = {
        0,
        12,
        3,
        3,
        15,
        15
    };
    double[] expected = {
        0,
        0,
        97.5,
        105,
        97.5,
        105
    };
    for (int i = 0; i < minutes.length; i++) {
      assertEquals(expected[i], ClockAngles.hourHandAngle(hours[i], minutes[i]));
    }
  }

  @Test
  void hourHandAngle_exceptions() {
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.hourHandAngle(24, 30));
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.hourHandAngle(-1, 30));
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.hourHandAngle(12, 60));
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.hourHandAngle(12, -1));
  }

  @Test
  void minuteHandAngle_angles() {
    double[] params = {
        0,
        15,
        30,
        40,
        45
    };
    double[] expected = {
        0,
        90,
        180,
        240,
        270
    };
    for (int i = 0; i < params.length; i++) {
      assertEquals(expected[i], ClockAngles.minuteHandAngle(params[i]));
    }
  }

  @Test
  void minuteHandAngle_exceptions() {
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.minuteHandAngle(60));
    assertThrows(IllegalArgumentException.class,
        () -> ClockAngles.minuteHandAngle(-1));
  }
}