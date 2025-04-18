package org.apache.commons.lang3;


public class StringUtils {

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isAnyEmpty(CharSequence... css) {
        if (ArrayUtils.isEmpty(css)) {
            return false;
        } else {
            CharSequence[] var1 = css;
            int var2 = css.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                CharSequence cs = var1[var3];
                if (isEmpty(cs)) {
                    return true;
                }
            }
            return false;
        }
    }
    public static String abbreviateMiddle(String str, String middle, int length) {
        if (!isAnyEmpty(str, middle) && length < str.length() && length >= middle.length() + 2) {
            int targetSting = length - middle.length();
            int startOffset = targetSting / 2 + targetSting % 2;
            int endOffset = str.length() - targetSting / 2;
            return str.substring(0, endOffset) + middle + str.substring(startOffset);
        } else {
            return str;
        }
    }
}