// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   // # of ticks in a revolution
   public static final double TICKS = 2048;

   // Motor ID 
   public static final int MOTOR_ID = 0;

   // PID constants 
   public static final int kP = 0;
   public static final int kI = 0;                          
   public static final int kD = 0;
}
