package image;

public class Image {
    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }
    public void load(){
        System.out.println("Loading File: "+fileName);
    }

    public String getFileName(){
        return fileName;
    }
}
