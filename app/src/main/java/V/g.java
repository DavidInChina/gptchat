package V;

import A.AbstractC0040r0;
import A.AbstractC0042s0;
import H0.Z;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.l1;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class g implements AbstractC0040r0 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17929a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17930b;

    /* renamed from: c  reason: collision with root package name */
    public final l1 f17931c;

    public g(boolean z10, float f6, AbstractC1710f0 abstractC1710f0) {
        this.f17929a = z10;
        this.f17930b = f6;
        this.f17931c = abstractC1710f0;
    }

    @Override // A.AbstractC0040r0
    public final AbstractC0042s0 a(D.l lVar, AbstractC1725n abstractC1725n) {
        long j6;
        u uVar;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(988743187);
        w wVar = (w) rVar.m(y.f17982a);
        rVar.W(-1524341038);
        l1 l1Var = this.f17931c;
        if (((r0.r) l1Var.getValue()).f44265a != r0.r.f44263k) {
            j6 = ((r0.r) l1Var.getValue()).f44265a;
        } else {
            j6 = wVar.b(rVar);
        }
        rVar.t(false);
        AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(j6), rVar);
        AbstractC1710f0 g03 = AbstractC4828h.g0(wVar.a(rVar), rVar);
        e eVar = (e) this;
        rVar.W(331259447);
        rVar.W(-1737891121);
        Object m10 = rVar.m(Z.f6892f);
        while (!(m10 instanceof ViewGroup)) {
            ViewParent parent = ((View) m10).getParent();
            if (parent instanceof View) {
                m10 = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + m10 + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) m10;
        rVar.t(false);
        rVar.W(1643267293);
        boolean isInEditMode = viewGroup.isInEditMode();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        boolean z10 = this.f17929a;
        float f6 = this.f17930b;
        if (isInEditMode) {
            rVar.W(511388516);
            boolean g10 = rVar.g(eVar) | rVar.g(lVar);
            Object K10 = rVar.K();
            if (g10 || K10 == iVar) {
                K10 = new C1458c(z10, f6, g02, g03);
                rVar.h0(K10);
            }
            rVar.t(false);
            uVar = (C1458c) K10;
            rVar.t(false);
            rVar.t(false);
        } else {
            rVar.t(false);
            rVar.W(1618982084);
            boolean g11 = rVar.g(eVar) | rVar.g(lVar) | rVar.g(viewGroup);
            Object K11 = rVar.K();
            if (g11 || K11 == iVar) {
                K11 = new C1456a(z10, f6, g02, g03, viewGroup);
                rVar.h0(K11);
            }
            rVar.t(false);
            uVar = (C1456a) K11;
            rVar.t(false);
        }
        AbstractC1734s.d(uVar, lVar, new f(lVar, uVar, null), rVar);
        rVar.t(false);
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f17929a == gVar.f17929a && Z0.e.a(this.f17930b, gVar.f17930b) && AbstractC3557B.K(this.f17931c, gVar.f17931c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f17929a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f17931c.hashCode() + AbstractC6463a.e(this.f17930b, i10 * 31, 31);
    }
}
