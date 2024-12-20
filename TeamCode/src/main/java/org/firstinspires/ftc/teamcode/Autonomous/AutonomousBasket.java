package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.RobotHardware;

@Autonomous(name="Basket", group="Robot")
public class AutonomousBasket extends LinearOpMode {
    RobotHardware robot = new RobotHardware(this);
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        robot.init();
        double heading;
        waitForStart();

        robot.setHandPositions(-0.8);
        while (opModeIsActive() && (runtime.seconds() < 0.5)) {
            telemetry.addData("Path", "Leg1: %41f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);

        robot.encoderDrive(0.7, -39, 39, 39, -39, 15);
        robot.encoderDrive(0.8, -30, -30, 30, 30, 15);
        robot.encoderArm(107, 12);
        robot.encoderSpoolie(2000, 40, 15);
    }


}