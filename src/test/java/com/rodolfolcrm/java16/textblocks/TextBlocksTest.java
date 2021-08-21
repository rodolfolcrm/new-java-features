package com.rodolfolcrm.java16.textblocks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBlocksTest {
    private static final String HTML = "<html>\n" +
            "    <body>\n" +
            "        <p>Hello, world</p>\n" +
            "    </body>\n" +
            "</html>\n";

    private static final String TEXT_BLOCK_HTML = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;

    @Test
    public void should_be_equals() {
        assertThat(HTML).isEqualTo(TEXT_BLOCK_HTML);
    }

}
