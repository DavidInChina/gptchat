package xe;

import id.AbstractC3557B;
import java.util.Locale;

/* renamed from: xe.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6428q {

    /* renamed from: a  reason: collision with root package name */
    public final String f49948a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49949b;

    public C6428q(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        this.f49948a = str;
        this.f49949b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6428q) {
            C6428q c6428q = (C6428q) obj;
            if (Lg.n.f2(c6428q.f49948a, this.f49948a) && Lg.n.f2(c6428q.f49949b, this.f49949b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f49948a.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f49949b.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase2);
        return lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f49948a);
        sb2.append(", value=");
        return R.a.t(sb2, this.f49949b, ", escapeValue=false)");
    }
}
