import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.DefaultAsserter

internal class DistanceBetweenTwoPointsTest {

    @Test
    fun `should return 5 for (1,2),(4,5)`() {
        val x1 = 1
        val y1 = 2
        val x2 = 4
        val y2 = 5
        val point2D = Point2D(x1, y1)
        val distance = point2D(Point2D(x2, y2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 5",
            expected = 5,
            actual = distance
        )
    }

    @Test
    fun `should return 5 for (-1,-2),(-4,-5)`() {
        val x1 = -1
        val y1 = -2
        val x2 = -4
        val y2 = -5
        val point2D = Point2D(x1, y1)
        val distance = point2D(Point2D(x2, y2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 5",
            expected = 5,
            actual = distance
        )
    }

    @Test
    fun `should return 9 for (-1,2),(4,-5)`() {
        val x1 = -1
        val y1 = 2
        val x2 = 4
        val y2 = -5
        val point2D = Point2D(x1, y1)
        val distance = point2D(Point2D(x2, y2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 9",
            expected = 9,
            actual = distance
        )
    }

    @Test
    fun `should return 0 for (0,0),(0,0)`() {
        val x1 = 0
        val y1 = 0
        val x2 = 0
        val y2 = 0
        val point2D = Point2D(x1, y1)
        val distance = point2D(Point2D(x2, y2))

        DefaultAsserter.assertEquals(
            message = "failure - The returned value is not equal to 0",
            expected = 0,
            actual = distance
        )
    }
}