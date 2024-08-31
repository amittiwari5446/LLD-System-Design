import concreteStates.OutOfStockState;
import concreteStates.PaymentPendingState;
import concreteStates.ProductSelectedState;
import concreteStates.ReadyState;
import context.VendingMachineContext;

public class Main {
    public static void main(String[] args) {
        VendingMachineContext vendingMachine=new VendingMachineContext();

        vendingMachine.setState(new ReadyState());
        vendingMachine.request();

        vendingMachine.setState(new ProductSelectedState());
        vendingMachine.request();

        vendingMachine.setState(new PaymentPendingState());
        vendingMachine.request();

        vendingMachine.setState(new OutOfStockState());
        vendingMachine.request();
    }
}