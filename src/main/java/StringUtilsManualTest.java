import org.apache.commons.lang3.StringUtils;
import java.util.Objects;

public static void main(String[] args) {
    // 测试 abbreviateMiddle 方法
    testAbbreviateMiddle();
    // 测试 isEmpty 方法
    testIsEmpty();
    // 测试 isAnyEmpty 方法
    testIsAnyEmpty();
}

public static void testAbbreviateMiddle() {
    System.out.println("-----Test AbbreviateMiddle----");
    String str1 = "asfveasdsa";
    String mid1 = "...";
    int len1 = 8;
    String result1 = StringUtils.abbreviateMiddle(str1, mid1, len1);
    System.out.println("abbreviateMiddle(\"asf...sa\"): " + result1);
    if (Objects.equals(result1, "asf...sa")) {
        System.out.println("AbbreviateMiddle test 1 passed");
    } else {
        System.out.println("AbbreviateMiddle test 1 failed");
    }


    String str2 = null;
    String mid2 = "abc";
    int len2 = 8;
    String result2 = StringUtils.abbreviateMiddle(str2, mid2, len2);
    System.out.println("abbreviateMiddle(null): " + result2);
    if (Objects.equals(result2, null)) {
        System.out.println("AbbreviateMiddle test 1 passed");
    } else {
        System.out.println("AbbreviateMiddle test 1 failed");
    }
}

public static void testIsEmpty() {
    System.out.println("---------Test IsEmpty---------");
    String test1 = "";
    boolean result1 = StringUtils.isEmpty(test1);
    System.out.println("isEmpty(\"\"): " + result1);
    if (result1) {
        System.out.println("isEmpty test 1 passed");
    } else {
        System.out.println("isEmpty test 1 failed");
    }

    String test2 = "abc";
    boolean result2 = StringUtils.isEmpty(test2);
    System.out.println("isEmpty(\"abc\"): " + result2);
    if (!result2) {
        System.out.println("isEmpty test 2 passed");
    } else {
        System.out.println("isEmpty test 2 failed");
    }
}

public static void testIsAnyEmpty() {
    System.out.println("-------Test IsAnyEmpty-------- ");
    String test1 = "123";
    boolean result1 = StringUtils.isAnyEmpty(test1);
    System.out.println("isAnyEmpty(\"123\"): " + result1);
    if (!result1) {
        System.out.println("isAnyEmpty test 1 passed");
    } else {
        System.out.println("isAnyEmpty test 1 failed");
    }

    String test2 = "abc";
    boolean result2 = StringUtils.isAnyEmpty(test2);
    System.out.println("isAnyEmpty(\"abc\"): " + result2);
    if (!result2) {
        System.out.println("isAnyEmpty test 2 passed");
    } else {
        System.out.println("isAnyEmpty test 2 failed");
    }
}