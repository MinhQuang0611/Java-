public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getChuVi() {
        return 2 * (width + height);
    }

    public int getDienTich() {
        return width * height;
    }

    public boolean kiemTra() {
        return width > 0 && height > 0;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("You are so stupid :)");
            return;
        }
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            Rectangle rectangle = new Rectangle(width, height);

            if (rectangle.kiemTra()) {
                System.out.println("Chu vi: " + rectangle.getChuVi());
                System.out.println("Diện tích: " + rectangle.getDienTich());
            } else {
                System.out.println("Stupid");
            }
        } catch (NumberFormatException e) {
            System.out.println("Stupid");
        }
    }
}
