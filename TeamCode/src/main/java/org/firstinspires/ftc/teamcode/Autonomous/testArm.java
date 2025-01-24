package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.RobotHardware;

@Autonomous(name="testArm", group="Robot")
public class testArm extends LinearOpMode {
    RobotHardware robot= new RobotHardware(this);
    private ElapsedTime runtime= new ElapsedTime();

    @Override
    public void runOpMode(){
        robot.init();
        waitForStart();
        robot.encoderDrive(0.7,26.0,26.0,26.0,26.0, 15);
        robot.encoderArm(57, 10);
        sleep(50);
        robot.encoderDrive(0.5,4,4,4,4,20);
        sleep(100);
        robot.encoderSpoolie(0.2,10,20);
        //robot.encoderArm(17,10);
        //robot.encoderDrive(0.2,40,40,40,40,17);
    }
}

