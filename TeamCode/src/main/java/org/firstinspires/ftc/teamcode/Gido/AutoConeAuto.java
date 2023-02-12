/*
This program will automatically pick up cones, score cones, and park during auto.

To Do List:
Add arm
*/

package org.firstinspires.ftc.teamcode.Gido;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
 // Autonomous 

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
 // Motors, distance and color sensors

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AngularVelocity;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles
// Pretty sure this is angle stuff I need for turning

@Autonomous(name="AutoConeAuto", group="Linear Opmode")
public class AutoConeAuto extends LinearOpMode {

    private ElapsedTime     runtime = new ElapsedTime();
    private ColorSensor colorSensor;
    private DistanceSensor distanceSensor;
}
@Override
public void runOpMode() {

    // Wait
    waitForStart();

    Motors motor = new Motors();

    boolean run = true;

    while(run) {

        motor.moveAllWheels(0.5);
        if(pblue > pred && pgreen && pblue) {
            
            motor.moveAllWheels(0.0);
            sleep(100);
            motor.rearLeftWheel(0.3);
            motor.frontLeftWheel(-0.3);
           /* if(du < 100) {
                
                motor.rearLeftWheel(0.0);
                motor.frontLeftWheel(0.0);
                sleep(100);
                motor.timeAllWheels(0.6, 0.35);
                motor.timeAllWheels(-0.6, -0.35);
            } */// Unit of measurement needs to be specified
            for(int i = 1; i <= 5; i++) {

                motor.rearRightWheel(0.5);
                motor.frontRightWheel(0.5);
            }
        }
       double  red = colorSensor.red();
       double green = colorSensor.green();
       double blue = colorSensor.blue();
       double total = red + green + blue; 

       double pred = red / total;
       double pgreen = green / total;
       double pblue = blue / total;
    
        public double getDistance(DistanceUnit du) {

            return distanceSensor.getDistance(du);
        } // Gets the distance 
    }
}