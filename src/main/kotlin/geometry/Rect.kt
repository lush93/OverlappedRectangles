package geometry

class Rect(private val bottomLeft: Point, private val topRight: Point) {
    fun isRectangleOverlap(rect: Rect): Boolean{
        return !(bottomLeft.y >= rect.topRight.y || rect.bottomLeft.y >= topRight.y
                || topRight.x <= rect.bottomLeft.x || rect.topRight.x <= bottomLeft.x)
    }
}