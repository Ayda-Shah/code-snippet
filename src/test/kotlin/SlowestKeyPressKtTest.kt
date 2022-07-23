import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.*
import kotlin.test.DefaultAsserter.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class SlowestKeyPressKtTest {

    lateinit var sysInBackup: InputStream

    @BeforeAll
    fun backupSystemInputStream() {
        sysInBackup = System.`in`
    }

    @AfterEach
    fun restoreSystemInputStream() {
        System.setIn(sysInBackup)
    }

    @Test
    fun `should return e with 5 pairs of numbers`() {
        val value: String = "0 1\n" + "0 3\n"+ "4 5\n"+ "5 6\n" + "4 10"
        val input = ByteArrayInputStream(value.toByteArray())
        System.setIn(input)
        val scanner = Scanner(System.`in`)

        assertEquals(message = "failure - The returned character is not equal to e", expected = 'e', actual = findSlowestKeyPress(scanner, 5))
    }

    @Test
    fun `should return a with 3 pairs of numbers`() {
        val value: String = "0 2\n" + "1 3\n" + "0 7"
        val input = ByteArrayInputStream(value.toByteArray())
        System.setIn(input)
        val scanner = Scanner(System.`in`)

        assertEquals(message = "failure - The returned character is not equal to a", expected = 'a', actual = findSlowestKeyPress(scanner, 3))
    }

    @Test
    fun `should return b with 1 pair of numbers`() {
        val value: String = "1 3"
        val input = ByteArrayInputStream(value.toByteArray())
        System.setIn(input)
        val scanner = Scanner(System.`in`)

        assertEquals(message = "failure - The returned character is not equal to b", expected = 'b', actual = findSlowestKeyPress(scanner, 1))
    }

    @Test
    fun `should return d with 2 pairs of numbers`() {
        val value: String = "1 3\n"+"3 5"
        val input = ByteArrayInputStream(value.toByteArray())
        System.setIn(input)
        val scanner = Scanner(System.`in`)

        assertEquals(message = "failure - The returned character is not equal to d", expected = 'd', actual = findSlowestKeyPress(scanner, 2))
    }
}