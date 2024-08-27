import caretaker.History;
import originator.Document;

public class Main {
    public static void main(String[] args) {
        Document document=new Document("Initial Content \n");
        History history=new History();

        document.write("Additional Content \n");
        history.addMemento(document.createMemento());

        document.write("More Content \n");
        history.addMemento(document.createMemento());

        document.restoreFromMemento(history.getMemento(0));

        System.out.println(document.getContent());
    }
}