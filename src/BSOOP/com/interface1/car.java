package BSOOP.com.interface1;

public class car implements Engine,brake{


    @Override
    public void start1() {
        System.out.println("i break like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("stop");
    }

    @Override
    public void break1() {
        System.out.println("break1");

    }
}
