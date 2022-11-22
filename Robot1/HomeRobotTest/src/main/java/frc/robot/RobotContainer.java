package frc.robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Spin;
import frc.robot.subsystems.DriveTrain;

public class RobotContainer {
    Subsystem drivetrain = new DriveTrain();
    Command m_autoCommand = new Spin(drivetrain);
    
    private void configureButtonBindings() {

    }

    public Command getAutonomousCommand() {
        return m_autoCommand;
      }


    }
