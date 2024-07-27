import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components=new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void display() {
        System.out.println("Directory: "+name);
        for(FileSystemComponent comp:components){
            comp.display();
        }
    }
}
