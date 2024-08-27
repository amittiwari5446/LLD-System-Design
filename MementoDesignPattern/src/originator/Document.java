package originator;

import memento.DocumentMemento;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void write(String text){
        this.content+=text;
    }

    public String getContent() {
        return content;
    }
    public DocumentMemento createMemento(){
        return new DocumentMemento(this.content);
    }
    public void restoreFromMemento(DocumentMemento memento){
        this.content=memento.getSavedContent();
    }
}
