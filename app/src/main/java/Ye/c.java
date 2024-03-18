package ye;

import Lg.n;
import id.AbstractC3557B;
import java.util.Locale;
import kf.q;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f50903b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        super(str);
        AbstractC3557B.c0("blob", str2);
        this.f50903b = str2;
        if (e.f50907c.b(str2)) {
            return;
        }
        throw new Ae.e("Invalid blob value: it should be token68");
    }

    @Override // ye.d
    public final String a() {
        return this.f50904a + ' ' + this.f50903b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!n.f2(cVar.f50904a, this.f50904a) || !n.f2(cVar.f50903b, this.f50903b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f50904a.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
        String lowerCase2 = this.f50903b.toLowerCase(locale);
        AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase2);
        return q.z3(new Object[]{lowerCase, lowerCase2}).hashCode();
    }
}
