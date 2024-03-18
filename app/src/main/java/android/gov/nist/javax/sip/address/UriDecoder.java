package android.gov.nist.javax.sip.address;

import R.a;
import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes.dex */
public class UriDecoder {
    static Charset utf8CharSet;

    static {
        try {
            utf8CharSet = Charset.forName("UTF8");
        } catch (UnsupportedCharsetException e10) {
            throw new RuntimeException("Problem in decodePath: UTF-8 charset not supported.", e10);
        }
    }

    public static String decode(String str) {
        int indexOf = str.indexOf(Separators.PERCENT);
        StringBuilder sb2 = new StringBuilder();
        while (indexOf != -1) {
            sb2.append(str.substring(0, indexOf));
            if (indexOf + 2 < str.length()) {
                String substring = str.substring(indexOf + 1, indexOf + 3);
                try {
                    sb2.append(utf8CharSet.decode(ByteBuffer.wrap(new byte[]{(byte) Integer.parseInt(substring, 16)})).toString());
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(a.r("Illegal hex characters in pattern %", substring));
                }
            }
            str = str.substring(indexOf + 3);
            indexOf = str.indexOf(Separators.PERCENT);
        }
        sb2.append(str);
        return sb2.toString();
    }
}
