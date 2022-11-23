/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;;
/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private PWMSparkMax motorLeft = new PWMSparkMax(0);
  private PWMSparkMax motorRight = new PWMSparkMax(1);
  motorRight.setInverted(true);
  public DifferentialDrive drive = new DifferentialDrive(leftMotor,rightMotor);


}
