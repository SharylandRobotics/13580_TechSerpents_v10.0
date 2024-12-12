package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.RobotHardware;



@Autonomous(name="Robot red: Auto Drive By Encoder", group="Robot")

public class RedAlianceShortAutoByEncoder extends LinearOpMode {
    RobotHardware robot= new RobotHardware(this);
    private ElapsedTime runtime= new ElapsedTime();

    @Override
    public void runOpMode(){
        robot.init();
        waitForStart();

        //Closes the claw to secure the specimen
        robot.setHandPositions(-0.8);
        while(opModeIsActive()&& (runtime.seconds()<0.5)){
            telemetry.addData("Path", "Leg1: %41f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);
        //Don't touch this it already works

        robot.encoderArm(73, 10);


        //go straight for 2 squares
        robot.encoderDrive(0.7,24.0,24.0,24.0,24.0, 15);
        /*
        robot.setDrivePower(0.5,0.5,0.5,0.5);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<0.0068)){
            telemetry.addData("Path", "Leg3: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        */


        //strafe to the left a little bit
        robot.encoderDrive(0.6,-10.0,10.0,10.0,-10.0, 15);
        /*
        robot.setDrivePower(-0.5,0.5,0.5,-0.5);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<0.000002)){
            telemetry.addData("Path", "Leg2: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        */



        //go straight for 2 squares
        robot.encoderDrive(5.0,8,8,8,8,15);
        /*
        robot.setDrivePower(0.2,0.2,0.2,0.2);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<0.00000000001)){
            telemetry.addData("Path", "Leg3: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);
*/
        //makes the elbow go down
        robot.encoderArm(-35,10);


        //Open claw
        robot.setHandPositions(0.5);
        while(opModeIsActive()&& (runtime.seconds()<0.5)){
            telemetry.addData("Path", "Leg6: %41f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        robot.encoderDrive(0.8,-4.0,-4.0,-4.0,-4.0,15);
        //robot.encoderArm(0,15);
        robot.encoderDrive(0.8,33.0,-33.0,-33.0,33.0, 15);
        robot.encoderDrive(0.8,24.0,24.0,24.0,24.0,15);
        sleep(200);
        robot.encoderDrive(0.8,10,-10,-10,10, 15);
        robot.encoderDrive(1,-44.0,-44.0,-44.0,-44.0, 15);
        sleep(400);
        robot.encoderDrive(0.8, 47.0, 47.0, 47.0, 47.0, 15);
        sleep(200);
        robot.encoderDrive(0.8, 16.5, -16.5, -16.5, 16.5, 15);
        sleep(300);
        robot.encoderDrive(0.8,-45.0,-45.0,-45.0,-45.0, 15);
        sleep(400);
        //robot.encoderDrive(0.8, 47.0, 47.0, 47.0, 47.0, 15);
        //sleep(200);
        //robot.encoderDrive(0.8, 11, -11, -11, 11, 15);
        //sleep(400);
        //robot.encoderDrive(0.8, -45.0, -45.0, -45.0, -45.0, 15);
        sleep(200);
        robot.encoderDrive(0.8, 17,17,17,17,12);
        sleep(200);
        robot.encoderDrive(0.8, -19,19,19,-19,15);
        sleep(200);
        robot.encoderDrive(0.8,-45.5,-45.5,45.5,45.5,15);
        sleep(200);
        //this is the value that makes the robot approach the wall to pick specimen
        robot.encoderDrive(0.8,21.615,21.615,21.615,21.615,15);
        sleep(200);

        robot.encoderArm(22,10);
        robot.setHandPositions(-0.8);
        while(opModeIsActive()&& (runtime.seconds()<0.5)){
            telemetry.addData("Path", "Leg1: %41f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1100);
        robot.encoderArm(40,20);
        robot.encoderDrive(1, -15.265,-15.265,-15.265,-15.265,15);
        robot.encoderDrive(0.8,-47,-47,47,47,15);
        sleep(200);
        //Strafes to the left to place sample
        robot.encoderDrive(1, -50,50,50,-50,15);
        //makes the arm go up
        robot.encoderArm(13,10);
        robot.encoderDrive(0.8,10.3,10.3,10.3,10.3,15);

        sleep(150);
        //makes arm go down
        robot.encoderArm(-35,10);


        //Open claw
        robot.setHandPositions(0.5);
        while(opModeIsActive()&& (runtime.seconds()<0.5)){
            telemetry.addData("Path", "Leg6: %41f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);
        robot.encoderDrive(0.8, 12, -12,-12,12,15);
        robot.encoderDrive(0.8, -25,-25,-25,-25,15);
        robot.encoderDrive(0.8, 35,-35,-35,35,15);

        //The don't touch has ended, you can now modify the code
        /* Hello, let me show you the basics
        <-the 86 is referred to as line 86 of code so each line has a number
        the code bellow works like this:
        robot.setDrivePower(power of left front wheel, power of left back wheel, power of right front wheel, power of right back wheel);
        comas and semicolons are important do not skip them, you can get an error in your code
        then the while loop has a number in this part runtime.seconds()<0.35<- this number and the ones I explained on top
        are the only thing you can change so if it is something else please ask me first because you can cause an error
         */
        /*
        //strafe to the right a little bit
        robot.setDrivePower(0.5,-0.5,-0.5,0.5);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<0.7)){
            telemetry.addData("Path", "Leg2: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);

        //go straight to get into position
        robot.setDrivePower(0.5,0.5,0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<0.3)){
            telemetry.addData("Path","Leg5: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);

        // Strafe to the left
        robot.setDrivePower(0.5,-0.5,-0.5,0.5);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<0.0000000001)){
            telemetry.addData("Path", "Leg2: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        sleep(1000);

        //go back to push
        robot.setDrivePower(-0.5,-0.5,-0.5,-0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<2.1)){
            telemetry.addData("Path","Leg5: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        //go front
        robot.setDrivePower(0.5,0.5,0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<2.1)) {
            telemetry.addData("Path", "Leg7: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        //strafe to the left
        robot.setDrivePower(0.5,-0.5,-0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<0.000001)){
            telemetry.addData("Path","Leg8: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        //go back to push
        robot.setDrivePower(-0.5,-0.5,-0.5,-0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<2.1)){
            telemetry.addData("Path","Leg5: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        //go front
        robot.setDrivePower(0.5,0.5,0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<2.1)) {
            telemetry.addData("Path", "Leg7: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        //strafe to the left
        robot.setDrivePower(0.5,-0.5,-0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<0.15)){
            telemetry.addData("Path","Leg8: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        //go back to push
        robot.setDrivePower(-0.5,-0.5,-0.5,-0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<2.1)){
            telemetry.addData("Path","Leg5: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        //go front
        robot.setDrivePower(0.5,0.5,0.5,0.5);
        runtime.reset();
        while(opModeIsActive()&&(runtime.seconds()<1.3)) {
            telemetry.addData("Path", "Leg7: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }


        */













    }



    //What are you doing here, please do not touch any code .

    public void setArmPosition(){
        robot.upDown.setTargetPosition((int) (robot.armPosition));

        ((DcMotorEx)robot.upDown).setVelocity(1500);
        robot.upDown.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }




}
