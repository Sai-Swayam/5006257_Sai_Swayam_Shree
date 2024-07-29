import java.util.LinkedList;

interface Image {
    public void display(String img);
}

class RealImage implements Image {
    @Override
    public void display(String img) {
        //load image from the remote server
        System.out.println("Fetching image from server, hold on!\nImage : " + img);
    }
}

class ProxyImage implements Image {
    private Image image = new RealImage();
    private LinkedList<String> imgCache = new LinkedList<>();

    @Override
    public void display(String img) {
        if (imgCache.contains(img))
            System.out.println("Image already in cache.\nImage : " + img);
        else {
            imgCache.add(img);
            image.display(img);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage();
        img.display("car");
        img.display("bike");
        img.display("plane");
        img.display("car");
    }
}