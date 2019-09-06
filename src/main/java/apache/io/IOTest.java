package apache.io;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

@Slf4j
public class IOTest {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = IOTest.class.getClassLoader();
        String str = IOUtils.toString(classLoader.getResourceAsStream("json1.json"));
        log.info("[字符串==={}====]", str);
    }
}
