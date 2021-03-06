package lv.ctco.cukesrest.loadrunner.dto;

import lv.ctco.cukesrest.loadrunner.function.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class WebCustomRequestTest {

    @Test
    public void formatShouldEscapeDoubleQuotes() throws Exception {
        WebCustomRequest request = new WebCustomRequest() {{
            setBody("hello \"world\"");
        }};
        assertThat(request.format(), containsString("hello \\\"world\\\""));
    }
}