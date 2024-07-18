package builder;

import product.Computer;

public class GamingComputerBuilder implements Builder{
    private Computer computer=new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("16GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1 TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
