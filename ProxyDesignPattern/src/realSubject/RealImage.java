package realSubject;

import subject.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading Image: "+fileName);
    }

    @Override
    public void display() {
        System.out.println("Display Image: "+fileName);
    }
}
