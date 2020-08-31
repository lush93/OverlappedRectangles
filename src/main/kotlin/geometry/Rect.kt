package geometry

class Rect(private val topLeft: Point, private val bottomRight: Point) {
    fun isRectangleOverlap(rect: Rect): Boolean{
        return !(bottomRight.y >= rect.topLeft.y || rect.bottomRight.y >= topLeft.y
                || bottomRight.x <= rect.topLeft.x || rect.bottomRight.x <= topLeft.x)
    }
}