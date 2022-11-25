package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Motor;


public class RunMotorAngle extends CommandBase {
   PIDController pidController;
   private Motor m_motor;
   private double theta;

   public RunMotorAngle(Motor motor, double angle) {
      m_motor = motor;
      pidController = new PIDController(Constants.kP, Constants.kI, Constants.kD);
      theta = angle;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(m_motor);
    }
    // ensures that the motor runs theta degrees more than what it already is
    @Override
    public void initialize() {
      theta += m_motor.getTheta();
      theta %= 360.0;
    }
  
    // Runs the motor according to how the PID tells it to
    @Override
    public void execute() {
      m_motor.run(pidController.calculate(m_motor.getTheta(), theta));
    }
  
    // Stops the motor
    @Override
    public void end(boolean interrupted) {
      m_motor.run(0.0);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
