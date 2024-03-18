package Wh;

import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f21259c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f21260d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f21261a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f21262b;

    public u(String str, String[] strArr) {
        this.f21261a = str;
        this.f21262b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f21262b;
        int i10 = 0;
        int J10 = r.f.J(0, strArr.length - 1, 2);
        if (J10 >= 0) {
            while (!Lg.n.f2(strArr[i10], "charset")) {
                if (i10 != J10) {
                    i10 += 2;
                }
            }
            str = strArr[i10 + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u) && AbstractC3557B.K(((u) obj).f21261a, this.f21261a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21261a.hashCode();
    }

    public final String toString() {
        return this.f21261a;
    }
}
