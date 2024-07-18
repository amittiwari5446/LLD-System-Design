package builder;

import product.Computer;

public class ProfessionalComputerBuilder implements Builder{
    private Computer computer=new Computer();
    @Override
    public void buildCPU() {
        computer.setCpu("Professional CPU");
    }

    @Override
    public void buildRAM() {
        computer.setRam("8GB DDR4");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500 GB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
