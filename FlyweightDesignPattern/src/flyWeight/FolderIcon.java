package flyWeight;

import image.Image;

public class FolderIcon implements Icon{
    private String color;
    private Image image;

    public FolderIcon(String color, Image image) {
        this.color = color;
        this.image = image;
    }

    @Override
    public void draw(int x, int y) {
        image.load();
        System.out.println("Drawing folder icon with color " + color + " and image " + image.getFileName() + " at position (" + x + ", " + y + ")");
    }
}
