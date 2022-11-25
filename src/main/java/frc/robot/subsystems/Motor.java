package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

// Subsystem that controls the motor

public class Motor extends SubsystemBase {
   // The motor
   private WPI_TalonFX motor;
   public Motor() {
      motor = new WPI_TalonFX(Constants.MOTOR_ID);
   }
   public void run(double amount) {
      motor.set(amount);
   }
   // returns relative motor angle (in degrees)
   public double getTheta() {
      return 360.0 * Constants.TICKS / ( motor.getSelectedSensorPosition() % Constants.TICKS );
   }
}