package cn.zust.edu.cn;

public class Circle implements IShape {
    private Point ptCenter; // 圆心坐标
    private int radius;     // 半径

    // 构造函数
    public Circle(Point center, int r) {
        this.ptCenter = center;
        this.radius = r;
    }

    // 计算周长
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // 计算面积
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // 绘制圆形
    @Override
    public void draw() {
        System.out.println("Draw circle with center point (" + ptCenter.getX() + ", " + ptCenter.getY() + ") and radius " + radius);
    }
}
