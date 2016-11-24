package io.vcode.tutorial

import jdk.internal.dynalink.linker.LinkerServices.Implementation


object T3Class {
    def main(args: Array[String]) {
        val pt = new Point(10, 20);
        // Move to a new location
        pt.move(10, 10);
        pt.print();
        Point.print();
        var entity = new Entity();
        entity.print();
    }
}


class Point(val xc: Int, val yc: Int) extends Entity {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
        Point.move(this, dx, dy);
    }
    override def print(){
        super.print();
        println("Point Class name: " + this.getClass.getName);
        println("Point x location : " + x);
        println("Point y location : " + y);
    }
}
object Point extends Entity{
    def move(p1: Point, dx: Int, dy: Int) {
        p1.x += dx
        p1.y += dy
    }
    override def print(){
        super.print();
        println("Point Object Class name: " + this.getClass.getName);
    }

}
class Entity{
    def print(){
        println("Class name: " + this.getClass.getName);
    }
}