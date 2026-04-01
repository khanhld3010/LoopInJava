package printShape;

public class Shape {
    public static void main(String[] args) {
        drawRectangle();
        System.out.println();
        drawRightTriangleBottomLeft();
        System.out.println();
        drawRightTriangleTopLeft();
        System.out.println();
        drawRightTriangleTopRight();
        System.out.println();
        drawRightTriangleBottomRight();
        System.out.println();
        drawRightTriangleIsosceles();
    }

    private static void drawRightTriangleIsosceles() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.printf("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangleBottomRight() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.printf("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangleTopRight() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.printf("  ");
            }
            for (int j = 5; j >= 0 + i; j--) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }


    static void drawRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    static void drawRightTriangleBottomLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangleTopLeft() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }


}
