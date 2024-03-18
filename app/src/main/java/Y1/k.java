package y1;

import android.gov.nist.core.Separators;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final k f50326b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final m f50327a;

    public k(m mVar) {
        this.f50327a = mVar;
    }

    public static k a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new k(new n(j.a(localeArr)));
        }
        return new k(new l(localeArr));
    }

    public static k b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(Separators.COMMA, -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = i.a(split[i10]);
            }
            return a(localeArr);
        }
        return f50326b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.f50327a.equals(((k) obj).f50327a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50327a.hashCode();
    }

    public final String toString() {
        return this.f50327a.toString();
    }
}
