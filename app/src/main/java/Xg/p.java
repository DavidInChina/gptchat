package xg;

import id.AbstractC3557B;
import java.util.Iterator;
import kg.C4290b;
import kg.C4291c;

/* loaded from: classes2.dex */
public final class p implements AbstractC6453h {

    /* renamed from: a  reason: collision with root package name */
    public final Mf.H f50034a;

    public p(Mf.L l10) {
        this.f50034a = l10;
    }

    @Override // xg.AbstractC6453h
    public final C6452g a(C4290b c4290b) {
        C6452g a5;
        AbstractC3557B.c0("classId", c4290b);
        C4291c g10 = c4290b.g();
        AbstractC3557B.b0("getPackageFqName(...)", g10);
        Iterator it = r.f.R(this.f50034a, g10).iterator();
        while (it.hasNext()) {
            Mf.G g11 = (Mf.G) it.next();
            if ((g11 instanceof q) && (a5 = ((q) g11).f50038o0.a(c4290b)) != null) {
                return a5;
            }
        }
        return null;
    }
}
