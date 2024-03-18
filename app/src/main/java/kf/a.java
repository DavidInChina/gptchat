package Kf;

import Ag.u;
import Lg.n;
import Mf.AbstractC0997f;
import Mf.B;
import Pf.A;
import Pf.G;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kf.t;
import kf.x;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class a implements Of.c {

    /* renamed from: a  reason: collision with root package name */
    public final u f9787a;

    /* renamed from: b  reason: collision with root package name */
    public final B f9788b;

    public a(u uVar, G g10) {
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("module", g10);
        this.f9787a = uVar;
        this.f9788b = g10;
    }

    @Override // Of.c
    public final Collection a(C4291c c4291c) {
        AbstractC3557B.c0("packageFqName", c4291c);
        return x.f37485Y;
    }

    @Override // Of.c
    public final boolean b(C4291c c4291c, C4294f c4294f) {
        AbstractC3557B.c0("packageFqName", c4291c);
        AbstractC3557B.c0("name", c4294f);
        String b10 = c4294f.b();
        AbstractC3557B.b0("asString(...)", b10);
        if ((!n.I2(b10, "Function", false) && !n.I2(b10, "KFunction", false) && !n.I2(b10, "SuspendFunction", false) && !n.I2(b10, "KSuspendFunction", false)) || m.f9809b.a(b10, c4291c) == null) {
            return false;
        }
        return true;
    }

    @Override // Of.c
    public final AbstractC0997f c(C4290b c4290b) {
        AbstractC3557B.c0("classId", c4290b);
        if (c4290b.f37495c || (!c4290b.f37494b.e().d())) {
            return null;
        }
        String b10 = c4290b.h().b();
        if (!n.Z1(b10, "Function", false)) {
            return null;
        }
        C4291c g10 = c4290b.g();
        AbstractC3557B.b0("getPackageFqName(...)", g10);
        l a5 = m.f9809b.a(b10, g10);
        if (a5 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) A7.b.X0(((A) this.f9788b.r(g10)).f13977j0, A.f13974m0[0])) {
            if (obj instanceof Jf.d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        AbstractC2469q0.p(t.h2(arrayList2));
        k kVar = a5.f9807a;
        int i10 = a5.f9808b;
        return new c(this.f9787a, (Jf.d) t.f2(arrayList), kVar, i10);
    }
}
