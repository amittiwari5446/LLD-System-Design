public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("document.txt", 1024);
        FileSystemComponent file2 = new File("image.jpeg", 2048);

        Directory directory=new Directory("My Documents");
        directory.addComponent(file1);
        directory.addComponent(file2);

        directory.display();
    }
}