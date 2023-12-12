package be.thebeehive.wouterbauweraerts.common

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUtilKtTest {

    private val testFile = "test.txt"
    private val expectedText = "This is a test file"

    @Test
    internal fun `readFromFile reads text from file`() {
        assertThat(readFromFile(testFile)).isEqualTo(expectedText)
    }
}