package com.company.chapter5;

class Machine{
    public void start(){
        System.out.println("Machine started");
    }
}

class Camera extends Machine{
    public void start(){
        System.out.println("Camera started");
    }
    public void snap(){
        System.out.println("Photo taken.");
    }
}

public class CastingObjects {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        //Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();
    }
}
