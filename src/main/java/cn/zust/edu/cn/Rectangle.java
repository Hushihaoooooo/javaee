package cn.zust.edu.cn;
/**
 * @author ShiHaoHu
 * @since 2024/3/7 21:07
 * @description
 */
public class Rectangle implements IShape {
    private Point ptTopLeft;
    private Point ptTopRight;
    private int width;
    private int height;

    // 默认构造函数
    public Rectangle() {
        this.ptTopLeft = new Point();
        this.ptTopRight = new Point();
        this.width = 0;
        this.height = 0;
    }

    // 带参数的构造函数
    public Rectangle(Point topLeft, int width, int height) {
        this.ptTopLeft = topLeft;
        this.ptTopRight = new Point(topLeft.getX() + width, topLeft.getY());
        this.width = width;
        this.height = height;
    }

    // 计算周长
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    // 计算面积
    @Override
    public double area() {
        return width * height;
    }

    // 绘制矩形
    @Override
    public void draw() {
        // 这里可以实现具体的绘制逻辑
        System.out.println("Draw rectangle with top left point (" + ptTopLeft.getX() + ", " + ptTopLeft.getY() + "), width " + width + ", height " + height);
    }
}

