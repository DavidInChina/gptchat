package G;

import A.C0043t;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1724m0;
import Z.C1741v0;
import Z.m1;
import Z.o1;
import java.util.LinkedHashSet;
import java.util.Map;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c0 implements i0.m, i0.e {

    /* renamed from: a  reason: collision with root package name */
    public final i0.m f5488a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f5489b = AbstractC4828h.Z(null, o1.f22665a);

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f5490c = new LinkedHashSet();

    public c0(i0.m mVar, Map map) {
        a0 a0Var = new a0(mVar, 0);
        m1 m1Var = i0.p.f32433a;
        this.f5488a = new i0.o(map, a0Var);
    }

    @Override // i0.m
    public final boolean a(Object obj) {
        return this.f5488a.a(obj);
    }

    @Override // i0.m
    public final Map b() {
        i0.e eVar = (i0.e) this.f5489b.getValue();
        if (eVar != null) {
            for (Object obj : this.f5490c) {
                eVar.e(obj);
            }
        }
        return this.f5488a.b();
    }

    @Override // i0.m
    public final Object c(String str) {
        return this.f5488a.c(str);
    }

    @Override // i0.m
    public final i0.l d(String str, AbstractC6216a abstractC6216a) {
        return this.f5488a.d(str, abstractC6216a);
    }

    @Override // i0.e
    public final void e(Object obj) {
        i0.e eVar = (i0.e) this.f5489b.getValue();
        if (eVar != null) {
            eVar.e(obj);
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder".toString());
    }

    @Override // i0.e
    public final void f(Object obj, wf.n nVar, AbstractC1725n abstractC1725n, int i10) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-697180401);
        i0.e eVar = (i0.e) this.f5489b.getValue();
        if (eVar != null) {
            eVar.f(obj, nVar, rVar, (i10 & 112) | 520);
            AbstractC1734s.b(obj, new C0043t(this, 4, obj), rVar);
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new U(this, obj, nVar, i10, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null wrappedHolder".toString());
    }
}
