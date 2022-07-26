import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.DefaultAsserter

internal class DistanceBetweenTwoPointsTest {

    @Test
    fun `should return 5 & 6 for (1,2,3),(4,5,6)`() {
        val x1 = 1
        val y1 = 2
        val z1 = 3
        val x2 = 4
        val y2 = 5
        val z2 = 6
        val point3D = Point3D(x1, y1, z1)
        val distance2D = point3D.dist2D(Point2D(x2, y2))
        val distance3D = point3D.dist3D(Point3D(x2, y2, z2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 5",
            expected = 5,
            actual = distance2D
        )
        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 6",
            expected = 6,
            actual = distance3D
        )
    }

    @Test
    fun `should return 5 & 6 for (-1,-2,-3),(-4,-5,-6)`() {
        val x1 = -1
        val y1 = -2
        val z1 = -3
        val x2 = -4
        val y2 = -5
        val z2 = -6
        val point3D = Point3D(x1, y1, z1)
        val distance2D = point3D.dist2D(Point2D(x2, y2))
        val distance3D = point3D.dist3D(Point3D(x2, y2, z2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 5",
            expected = 5,
            actual = distance2D
        )
        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 6",
            expected = 6,
            actual = distance3D
        )
    }

    @Test
    fun `should return 9 & 10 for (-1,2,3),(4,-5,6)`() {
        val x1 = -1
        val y1 = 2
        val z1 = 3
        val x2 = 4
        val y2 = -5
        val z2 = 6
        val point3D = Point3D(x1, y1, z1)
        val distance2D = point3D.dist2D(Point2D(x2, y2))
        val distance3D = point3D.dist3D(Point3D(x2, y2, z2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 9",
            expected = 9,
            actual = distance2D
        )
        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 10",
            expected = 10,
            actual = distance3D
        )
    }

    @Test
    fun `should return 9 & 13 for (-1,2,-3),(4,-5,6)`() {
        val x1 = -1
        val y1 = 2
        val z1 = -3
        val x2 = 4
        val y2 = -5
        val z2 = 6
        val point3D = Point3D(x1, y1, z1)
        val distance2D = point3D.dist2D(Point2D(x2, y2))
        val distance3D = point3D.dist3D(Point3D(x2, y2, z2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 9",
            expected = 9,
            actual = distance2D
        )
        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 13",
            expected = 13,
            actual = distance3D
        )
    }

    @Test
    fun `should return 0 & 0 for (0,0,0),(0,0,0)`() {
        val x1 = 0
        val y1 = 0
        val z1 = 0
        val x2 = 0
        val y2 = 0
        val z2 = 0
        val point3D = Point3D(x1, y1, z1)
        val distance2D = point3D.dist2D(Point2D(x2, y2))
        val distance3D = point3D.dist3D(Point3D(x2, y2, z2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 0",
            expected = 0,
            actual = distance2D
        )
        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 0",
            expected = 0,
            actual = distance3D
        )
    }
}