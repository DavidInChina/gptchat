package Fe;

import id.AbstractC3557B;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f5332a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5333b;

    public k(String str) {
        AbstractC3557B.c0("content", str);
        this.f5332a = str;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        this.f5333b = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        k kVar;
        String str;
        if (obj instanceof k) {
            kVar = (k) obj;
        } else {
            kVar = null;
        }
        if (kVar == null || (str = kVar.f5332a) == null || !Lg.n.f2(str, this.f5332a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5333b;
    }

    public final String toString() {
        return this.f5332a;
    }
}
