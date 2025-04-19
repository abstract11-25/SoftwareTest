package org.apache.commons.lang3;

import org.testng.annotations.Test;
import org.apache.commons.lang3.StringUtils;
import static org.testng.Assert.*;

public class StringUtilTest {

    @org.junit.Test
    public void isAnyEmpty() {
        String test1 = "123";
        assertFalse(StringUtils.isAnyEmpty(test1));

        String test2 = "abc";
        assertFalse(StringUtils.isAnyEmpty(test2));
    }

    @org.junit.Test
    public void isEmpty() {
        String test1 = "";
        assertTrue(StringUtils.isEmpty(test1));
    }

    @org.junit.Test
    public void abbreviateMiddle() {
        // 不满足 length < str.length()
        String str1 = "...";
        String mid1 = "2";
        int len1 = 3;
        assertEquals("...", StringUtils.abbreviateMiddle(str1, mid1, len1));

        // 满足条件
        String str3 = "asfveasdsa";
        String mid3 = "...";
        int len3 = 10;
        assertEquals("asf...sa", StringUtils.abbreviateMiddle(str3, mid3, len3));
    }
}
