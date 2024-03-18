package ee;

import G.AbstractC0551f;
import G.C0548c;
import G.C0550e;
import G.F;
import G.d0;
import Z.AbstractC1725n;
import Z.C1741v0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import lf.C4436a;
import nf.AbstractC4828h;

/* renamed from: ee.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2888f implements F {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0551f f29303a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f29304b;

    /* renamed from: c  reason: collision with root package name */
    public final long f29305c;

    /* renamed from: d  reason: collision with root package name */
    public final int f29306d;

    public C2888f(d0 d0Var) {
        AbstractC3557B.c0("intervals", d0Var);
        this.f29303a = d0Var;
        C2887e c2887e = C2887e.f29302Y;
        C4436a c4436a = new C4436a();
        E9.f.k(d0Var, new Oc.c(c4436a, 8, c2887e));
        Map k12 = AbstractC4268D.k1(AbstractC4344b.Q(c4436a));
        this.f29304b = k12;
        float f6 = 0.0f;
        float f10 = 0.0f;
        for (Map.Entry entry : k12.entrySet()) {
            C2885c c2885c = (C2885c) entry.getValue();
            f6 = Math.max(f6, ((C2883a) c2885c.f29294c).f29291a + c2885c.f29292a);
            f10 = Math.max(f10, ((C2883a) c2885c.f29295d).f29291a + c2885c.f29293b);
        }
        this.f29305c = AbstractC4828h.i(f6, f10);
        this.f29306d = ((d0) this.f29303a).f5494b;
    }

    @Override // G.F
    public final int a() {
        return this.f29306d;
    }

    @Override // G.F
    public final Object b(int i10) {
        Object invoke;
        C0550e d10 = ((d0) this.f29303a).d(i10);
        int i11 = i10 - d10.f5496a;
        wf.k kVar = ((C2886d) d10.f5498c).f29299b;
        if (kVar == null || (invoke = kVar.invoke(Integer.valueOf(i11))) == null) {
            return new C0548c(i10);
        }
        return invoke;
    }

    @Override // G.F
    public final /* synthetic */ int c(Object obj) {
        return -1;
    }

    @Override // G.F
    public final Object d(int i10) {
        C0550e d10 = ((d0) this.f29303a).d(i10);
        return ((C2886d) d10.f5498c).f29300c.invoke(Integer.valueOf(i10 - d10.f5496a));
    }

    @Override // G.F
    public final void e(int i10, Object obj, AbstractC1725n abstractC1725n, int i11) {
        int i12;
        int i13;
        int i14;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-603431158);
        if ((i11 & 14) == 0) {
            if (rVar.e(i10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 896) == 0) {
            if (rVar.g(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 651) == 130 && rVar.B()) {
            rVar.P();
        } else {
            C0550e d10 = ((d0) this.f29303a).d(i10);
            ((C2886d) d10.f5498c).f29301d.invoke(Integer.valueOf(i10 - d10.f5496a), rVar, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new Hd.j(this, i10, obj, i11);
        }
    }
}
