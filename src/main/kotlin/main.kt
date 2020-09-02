import geometry.Point
import geometry.Rect

fun main(args: Array<String>) {
    testOverlap()
    testNonOverlap()
}

fun testOverlap(){
    val p1 = Point(0F,0F)
    val p2 = Point(2F,4F)
    val p3 = Point(1F, 3F)
    val p4 = Point(5F, 5F)

    val p5 = Point(0F, 0F)
    val p6 = Point(2F, 2F)
    val p7 = Point(1F, 1F)
    val p8 = Point(3F, 3F)

    val p9 = Point(7F, 8F)
    val p10 = Point(13F, 15F)
    val p11 = Point(10F, 8F)
    val p12 = Point(12F, 20F)

    // Given overlapping rectangles: rect1 and rect2
    val rect1 = Rect(p1, p2)
    val rect2 = Rect(p3, p4)

    // Do isRectangleOverlap() on rect1 and rect2
    // Assert the results to be true
    println(rect1.isRectangleOverlap(rect2) && rect2.isRectangleOverlap(rect1))

    // Given overlapping rectangles: rect3 and rect4
    val rect3 = Rect(p5, p6)
    val rect4 = Rect(p7, p8)

    // Do isRectangleOverlap() on rect3 and rect4
    // Assert the results to be true
    println(rect3.isRectangleOverlap(rect4) && rect4.isRectangleOverlap(rect3))

    // Given overlapping rectangles: rect5 and rect6
    val rect5 = Rect(p9, p10)
    val rect6 = Rect(p11, p12)

    // Do isRectangleOverlap() on rect5 and rect6
    // Assert the results to be true
    println(rect5.isRectangleOverlap(rect6) && rect6.isRectangleOverlap(rect5))
}

fun testNonOverlap(){
    val p1 = Point(0F,1F)
    val p2 = Point(1F,2F)
    val p3 = Point(-2F, -3F)
    val p4 = Point(0F, 2F)
    val p5 = Point(0F,0F)
    val p6 = Point(1F,1F)
    val p7 = Point(3F, 4F)


    // Given non-overlapping rectangles: rect1 and rect2
    val rect1 = Rect(p1, p2)
    val rect2 = Rect(p3, p4)

    // Do negation on isRectangleOverlap() on rect1 and rect2
    // Assert the results to be true
    println(!rect1.isRectangleOverlap(rect2) && !rect2.isRectangleOverlap(rect1))

    // Given non-overlapping rectangles: rect3 and rect4
    val rect3 = Rect(p5, p6)
    val rect4 = Rect(p2, p7)

    // Do negation on isRectangleOverlap() on rect3 and rect4
    // Assert the results to be true
    println(!rect3.isRectangleOverlap(rect4) && !rect4.isRectangleOverlap(rect3))
}