package j$.time.format;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t implements AbstractC3713g {

    /* renamed from: a  reason: collision with root package name */
    private final j$.time.temporal.r f35047a;

    /* renamed from: b  reason: collision with root package name */
    private final H f35048b;

    /* renamed from: c  reason: collision with root package name */
    private final C f35049c;

    /* renamed from: d  reason: collision with root package name */
    private volatile l f35050d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(j$.time.temporal.r rVar, H h10, C c10) {
        this.f35047a = rVar;
        this.f35048b = h10;
        this.f35049c = c10;
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        String str;
        Long e10 = a5.e(this.f35047a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.k kVar = (j$.time.chrono.k) a5.d().z(j$.time.temporal.q.e());
        if (kVar == null || kVar == j$.time.chrono.r.f34946d) {
            str = this.f35049c.f(this.f35047a, e10.longValue(), this.f35048b, a5.c());
        } else {
            str = this.f35049c.e(kVar, this.f35047a, e10.longValue(), this.f35048b, a5.c());
        }
        if (str != null) {
            sb2.append(str);
            return true;
        }
        if (this.f35050d == null) {
            this.f35050d = new l(this.f35047a, 1, 19, G.NORMAL);
        }
        return this.f35050d.g(a5, sb2);
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        H h10 = yVar.l() ? this.f35048b : null;
        j$.time.chrono.k h11 = yVar.h();
        C c10 = this.f35049c;
        j$.time.temporal.r rVar = this.f35047a;
        Iterator h12 = (h11 == null || h11 == j$.time.chrono.r.f34946d) ? c10.h(rVar, h10, yVar.i()) : c10.g(h11, rVar, h10, yVar.i());
        if (h12 != null) {
            while (h12.hasNext()) {
                Map.Entry entry = (Map.Entry) h12.next();
                String str = (String) entry.getKey();
                if (yVar.s(str, 0, charSequence, i10, str.length())) {
                    return yVar.o(this.f35047a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                }
            }
            if (rVar == j$.time.temporal.a.ERA && !yVar.l()) {
                for (j$.time.chrono.l lVar : h11.I()) {
                    String obj = lVar.toString();
                    if (yVar.s(obj, 0, charSequence, i10, obj.length())) {
                        return yVar.o(this.f35047a, lVar.getValue(), i10, obj.length() + i10);
                    }
                }
            }
            if (yVar.l()) {
                return ~i10;
            }
        }
        if (this.f35050d == null) {
            this.f35050d = new l(this.f35047a, 1, 19, G.NORMAL);
        }
        return this.f35050d.p(yVar, charSequence, i10);
    }

    public final String toString() {
        StringBuilder sb2;
        H h10 = H.FULL;
        j$.time.temporal.r rVar = this.f35047a;
        H h11 = this.f35048b;
        if (h11 == h10) {
            sb2 = new StringBuilder("Text(");
            sb2.append(rVar);
        } else {
            sb2 = new StringBuilder("Text(");
            sb2.append(rVar);
            sb2.append(Separators.COMMA);
            sb2.append(h11);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
