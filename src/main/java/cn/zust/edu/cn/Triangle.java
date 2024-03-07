package cn.zust.edu.cn;
/**
 * @author ShiHaoHu
 * @since 2024/3/7 22:10
 * @description
 */
public class Triangle implements IShape {
    private Point ptA;  // 第一个顶点坐标
    private Point ptB;  // 第二个顶点坐标
    private Point ptC;  // 第三个顶点坐标

    // 构造函数
    public Triangle(Point ptA, Point ptB, Point ptC) {
        this.ptA = ptA;
        this.ptB = ptB;
        this.ptC = ptC;
    }

    // 计算周长
    @Override
    public double perimeter() {
        double edgeA = distance(ptA, ptB);
        double edgeB = distance(ptB, ptC);
        double edgeC = distance(ptC, ptA);
        return edgeA + edgeB + edgeC;
    }

    // 计算面积
    @Override
    public double area() {
        double edgeA = distance(ptA, ptB);
        double edgeB = distance(ptB, ptC);
        double edgeC = distance(ptC, ptA);
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }

    // 绘制三角形
    @Override
    public void draw() {
        System.out.println("Draw triangle with vertices A(" + ptA.getX() + ", " + ptA.getY() + "), B(" +
                ptB.getX() + ", " + ptB.getY() + "), C(" + ptC.getX() + ", " + ptC.getY() + ")");
    }

    // 计算两点间距离
    private double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    // 计算边长
    public double getEdgeA() {
        return distance(ptA, ptB);
    }

    public double getEdgeB() {
        return distance(ptB, ptC);
    }

    public double getEdgeC() {
        return distance(ptC, ptA);
    }
}

