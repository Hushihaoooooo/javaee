package cn.zust.edu.cn;

import java.util.ArrayList;
import java.util.List;
/**
 * @author ShiHaoHu
 * @since 2024/3/7 22:19 
 * @description 
 */
public class ShapeManager {
    private List<IShape> shapes; // 形状列表

    // 构造函数
    public ShapeManager() {
        this.shapes = new ArrayList<>();
    }

    // 添加形状到列表中
    public void addShape(IShape shape) {
        shapes.add(shape);
    }

    // 从列表中删除指定形状
    public void delShape(IShape shape) {
        shapes.remove(shape);
    }

    // 绘制所有形状
    public void drawShapes() {
        for (IShape shape : shapes) {
            shape.draw();
        }
    }

    // 获取只读属性 shapes
    public List<IShape> getShapes() {
        return shapes;
    }
}

