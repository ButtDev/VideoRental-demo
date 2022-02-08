package video.rental.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoRentalTest {
    private GoldenMasterHelper helper = new GoldenMasterHelper();

    @Test
    @Disabled
    void generate_goldenmaster() throws Exception {
        helper.generate();
    }

    @Test
    //@Disabled
    void check_runResult_against_goldenmaster() throws Exception {
        // Given
        var expected = helper.getGoldenMaster();

        // When
        var actual = helper.getRunResult();

        // Then
        assertEquals(expected, actual.replaceAll("\r\n", "\n"));
    }
}
