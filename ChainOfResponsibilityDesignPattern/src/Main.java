import handler.Level1SupportHandler;
import handler.Level2SupportHandler;
import handler.Level3SupportHandler;
import handler.SupportHandler;
import utility.Priority;
import utility.Request;

public class Main {
    public static void main(String[] args) {
        SupportHandler leve1SupportHandler=new Level1SupportHandler();
        SupportHandler leve2SupportHandler=new Level2SupportHandler();
        SupportHandler leve3SupportHandler=new Level3SupportHandler();

        leve1SupportHandler.setNextHandler(leve2SupportHandler);
        leve2SupportHandler.setNextHandler(leve3SupportHandler);

        Request request1=new Request(Priority.BASIC);
        Request request2=new Request(Priority.INTERMEDIATE);
        Request request3=new Request(Priority.CRITICAL);

        leve1SupportHandler.handleRequest(request1);
        leve1SupportHandler.handleRequest(request2);
        leve1SupportHandler.handleRequest(request3);
    }
}