
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Spin extends Command {
    Subsystem drivetrain;

  public Spin(DriveTrain differential) {
      drivetrain = differential;

    requires(Robot.drivetrain);
    addRequirements(drivetrain);
  }


  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
      drivetrain.tankDrive(0.5, -0.5);
  }

  @Override
  protected boolean isFinished() {
    return true;
  }

  @Override
  protected void end() {
  }


  @Override
  protected void interrupted() {
  }
}
