package xe;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: xe.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6430s {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f49952a = R4.b.X1('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');

    public static final boolean a(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.length() >= 2) {
            if (str.length() != 0) {
                if (str.charAt(0) == '\"' && Lg.o.Y2(str) == '\"') {
                    int i10 = 1;
                    do {
                        int k22 = Lg.n.k2(str, '\"', i10, false, 4);
                        if (k22 == Lg.n.g2(str)) {
                            break;
                        }
                        int i11 = 0;
                        for (int i12 = k22 - 1; str.charAt(i12) == '\\'; i12--) {
                            i11++;
                        }
                        if (i11 % 2 != 0) {
                            i10 = k22 + 1;
                        }
                    } while (i10 < str.length());
                    return false;
                }
            } else {
                throw new NoSuchElementException("Char sequence is empty.");
            }
        }
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (f49952a.contains(Character.valueOf(str.charAt(i13)))) {
                return true;
            }
        }
        return false;
    }

    public static final String b(String str) {
        AbstractC3557B.c0("<this>", str);
        StringBuilder sb2 = new StringBuilder(Separators.DOUBLE_QUOTE);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                sb2.append("\\\\");
            } else if (charAt == '\n') {
                sb2.append("\\n");
            } else if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\t') {
                sb2.append("\\t");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else {
                sb2.append(charAt);
            }
        }
        sb2.append(Separators.DOUBLE_QUOTE);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }
}
