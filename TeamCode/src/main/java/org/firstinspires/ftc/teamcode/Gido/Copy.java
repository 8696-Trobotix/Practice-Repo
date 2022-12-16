/*
Repurposed class because I spent like an hour on it and I don't want delete it all
This class is now meant for copying stuff now
*/
package org.firstinspires.ftc.teamcode.Gido;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Copy {

    private DigitalChannel touchSensor;
    private DcMotor motor;
    private double ticksPerRotation;
    private Servo servo;
    private ColorSensor colorSensor;
    private DistanceSensor distanceSensor;

    public void init(HardwareMap hwMap) {
        

        // Connects the things
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        motor = hwMap.get(DcMotor.class, "motor");
        double ticksperRotation = motor.getMotorType().getTicksPerRev();
        servo = hwMap.get(Servo.class, "servo");

        touchSensor = hwMap.get(DigitalChannel.class, "sensor_color_distance");
        distanceSensor= hwMap.get(DistanceSensor.class, "sensor_color_distance");
    }
    public boolean isTouchSensor() {

            return !touchSensor.getState();
    }
    public void setMotorSpeed(double speed) {

        motor.setPower(speed);
    }
    public double getMotorRotations() {

            return motor.getCurrentPosition() / ticksPerRotation;
    }
    public void setServoPosition(double position) {

        servo.setPosition(position);
    }
    
    public int getAmountRed() {

        return colorSensor.red();
    }
    public double getDistance(DistanceUnit du) {

            return distanceSensor.getDistance(du);
    }
    
}