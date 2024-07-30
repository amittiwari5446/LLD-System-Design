package flyWeight;

import image.Image;

public class FileIcon implements Icon{
    private String type;
    private Image image;

    public FileIcon(String type, Image image) {
        this.type = type;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        image.load();
        System.out.println("Drawing "+type+" icon with image "+image.getFileName()+" at position ("+x+", "+y+")");
    }
}
