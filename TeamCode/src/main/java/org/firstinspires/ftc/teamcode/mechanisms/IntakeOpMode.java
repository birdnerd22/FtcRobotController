package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IntakeOpMode extends OpMode {

    IntakeSpin intake = new IntakeSpin();

    boolean aPressed = gamepad1.a;
    boolean bPressed = gamepad1.b;

    @Override
    public void init() {
        intake.init(hardwareMap);


    }

    @Override
    public void loop() {
        if(aPressed){
            intake.intake(1.0);
        } else if(bPressed) {
            intake.intake(-1.0);//outtake
        } else {
            intake.intake(0.0);//not moving
        }



    }
}
