package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

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
        }



    }
}
