package handler;

import utility.Priority;
import utility.Request;

public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()== Priority.BASIC){
            System.out.println("Level 1 support handled the request.");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler=nextHandler;
    }
}
