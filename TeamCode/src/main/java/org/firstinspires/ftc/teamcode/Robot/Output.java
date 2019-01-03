package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.*;

public class Output {
    public DcMotor liftMotor;
    public Servo bucketServo;
    public Servo marker;

    public Output(HardwareMap hwMap, Mode mode){
        liftMotor = hwMap.dcMotor.get("liftMotor");
        bucketServo = hwMap.servo.get("bucketServo");
        marker = hwMap.servo.get("marker");

        liftMotor.setDirection(DcMotor.Direction.FORWARD);
        liftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        setMotorRunMode(mode);


    }

    public void setMotorRunMode(Mode mode){
        if(mode == Mode.Auto){
            liftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            liftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        }
        else{
            liftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            liftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        }
    }
}
