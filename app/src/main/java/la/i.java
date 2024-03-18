package la;

import Ad.s;
import Qg.F0;
import Z8.AbstractC1809m0;
import Z8.C1823u;
import Z8.C1825v;
import android.content.Intent;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kf.w;
import m9.AbstractC4569a;
import m9.C4570b;
import m9.C4571c;
import m9.C4573e;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC4569a f37905j;

    /* renamed from: k  reason: collision with root package name */
    public final ld.p f37906k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(AbstractC4569a abstractC4569a, ld.p pVar) {
        super(r1);
        s sVar;
        F0 f02 = ((D9.e) abstractC4569a).f3436d;
        C4573e c4573e = (C4573e) f02.getValue();
        if (c4573e == null) {
            sVar = k.f37909a;
        } else {
            sVar = new l(c4573e, false, false);
        }
        this.f37905j = abstractC4569a;
        this.f37906k = pVar;
        L4.a.E0(L4.a.I0(new g(this, null), f02), pVar);
    }

    public static Map m(m mVar) {
        if (mVar instanceof k) {
            return w.f37484Y;
        }
        if (mVar instanceof l) {
            ((l) mVar).f37910a.f39003a.getClass();
            return P4.a.o0(new C3959i("type", "terms_of_use"));
        }
        throw new RuntimeException();
    }

    public static void p(i iVar, Boolean bool, Boolean bool2, int i10) {
        if ((i10 & 1) != 0) {
            bool = null;
        }
        if ((i10 & 2) != 0) {
            bool2 = null;
        }
        iVar.getClass();
        iVar.l(new C6.a(bool, bool2, (Object) null, 6));
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        A7.b bVar;
        A7.b bVar2;
        e eVar = (e) iVar;
        AbstractC3557B.c0("intent", eVar);
        boolean K10 = AbstractC3557B.K(eVar, C4359c.f37898a);
        F0 f02 = this.f808e;
        if (K10) {
            AbstractC1809m0.a().b(C1823u.f23412c, m((m) f02.getValue()));
            C4573e n10 = n();
            if (n10 != null && (bVar2 = n10.f39006d) != null) {
                o(bVar2);
            }
        } else if (AbstractC3557B.K(eVar, C4360d.f37899a)) {
            AbstractC1809m0.a().b(C1825v.f23414c, m((m) f02.getValue()));
            C4573e n11 = n();
            if (n11 != null && (bVar = n11.f39008f) != null) {
                o(bVar);
            }
            C4573e n12 = n();
            if (n12 != null && n12.f39009g) {
                ((D9.e) this.f37905j).f3435c.setValue(null);
            }
        }
    }

    public final C4573e n() {
        l lVar;
        Object value = this.f808e.getValue();
        if (value instanceof l) {
            lVar = (l) value;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        return lVar.f37910a;
    }

    public final void o(A7.b bVar) {
        if (bVar instanceof C4570b) {
            Ad.l.O0(this.f37906k, null, null, new h(this, ((C4570b) bVar).f38999m, null), 3);
        } else if (bVar instanceof C4571c) {
            Intent intent = new Intent();
            A7.b.G0(intent, ((C4571c) bVar).f39000m);
            f(new C4357a(intent));
        }
    }
}
