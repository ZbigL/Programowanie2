package pl.sdaacademy.intermediate.basic.basic10tests;

/**
 * @author Zbigniew Lemiesz
 */
public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException("width i heigth must be bigger than zero");
        }
    }

    public int getWidth() {
        return width;
    }

    public void updateWidth(int width) {
        if (width > 0) this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }


}

