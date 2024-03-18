package Lg;

import id.AbstractC3557B;
import java.util.NoSuchElementException;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public abstract class o extends n {
    public static String W2(int i10, String str) {
        AbstractC3557B.c0("<this>", str);
        if (i10 >= 0) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(i10);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested character count ", i10, " is less than zero.").toString());
    }

    public static String X2(String str) {
        AbstractC3557B.c0("<this>", str);
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return Z2(length, str);
    }

    public static char Y2(CharSequence charSequence) {
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence.length() != 0) {
            return charSequence.charAt(n.g2(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String Z2(int i10, String str) {
        AbstractC3557B.c0("<this>", str);
        if (i10 >= 0) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(0, i10);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested character count ", i10, " is less than zero.").toString());
    }

    public static String a3(int i10, String str) {
        if (i10 >= 0) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(length - i10);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Requested character count ", i10, " is less than zero.").toString());
    }
}
