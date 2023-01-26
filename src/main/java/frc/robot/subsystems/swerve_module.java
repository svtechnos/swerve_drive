// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class swerve_module extends SubsystemBase {
  private double s_degrees;
  private double s_speed;
  /** Creates a new swerve_module. */
  public swerve_module() {}
  public void sTurn(double s_degrees) {}
  public void sSpeed(double s_speed) {}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
