package ye;

import Lg.i;
import java.util.ArrayList;
import java.util.Set;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f50905a = R4.b.X1('!', '#', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~');

    /* renamed from: b  reason: collision with root package name */
    public static final Set f50906b = R4.b.X1('-', '.', '_', '~', '+', '/');

    /* renamed from: c  reason: collision with root package name */
    public static final i f50907c = new i("[a-zA-Z0-9\\-._~+/]+=*");

    /* renamed from: d  reason: collision with root package name */
    public static final i f50908d = new i("\\\\.");

    public static final boolean a(char c10) {
        if (('a' > c10 || c10 >= '{') && (('A' > c10 || c10 >= '[') && !AbstractC5260f.B(c10))) {
            if (!f50905a.contains(Character.valueOf(c10))) {
                return false;
            }
        }
        return true;
    }

    public static final Integer b(ArrayList arrayList, d dVar, int i10, String str) {
        if (i10 != str.length() && str.charAt(i10) != ',') {
            return null;
        }
        arrayList.add(dVar);
        if (i10 == str.length()) {
            return -1;
        }
        if (str.charAt(i10) == ',') {
            return Integer.valueOf(i10 + 1);
        }
        throw new IllegalStateException("".toString());
    }

    public static final int c(int i10, String str) {
        while (i10 < str.length() && str.charAt(i10) == ' ') {
            i10++;
        }
        return i10;
    }
}
