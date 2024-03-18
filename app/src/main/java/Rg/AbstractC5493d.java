package rg;

import Cg.j;
import Ig.i;
import Jf.l;
import Lf.p;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1001j;
import Mf.AbstractC1003l;
import Mf.B;
import Mf.G;
import Mf.O;
import Mf.P;
import Mf.h0;
import Pf.I;
import Pf.M;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import wf.k;

/* renamed from: rg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5493d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f44985a = 0;

    static {
        C4294f.e("value");
    }

    public static final boolean a(h0 h0Var) {
        AbstractC3557B.c0("<this>", h0Var);
        Boolean h10 = i.h(AbstractC4344b.F0(h0Var), C5490a.f44982Y, C5491b.f44983Y);
        AbstractC3557B.b0("ifAny(...)", h10);
        return h10.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public static AbstractC0994c b(AbstractC0994c abstractC0994c, k kVar) {
        AbstractC3557B.c0("<this>", abstractC0994c);
        return (AbstractC0994c) i.f(AbstractC4344b.F0(abstractC0994c), new G6.a(false), new p(new Object(), kVar));
    }

    public static final C4291c c(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        C4293e h10 = h(abstractC1003l);
        if (!h10.d()) {
            h10 = null;
        }
        if (h10 == null) {
            return null;
        }
        return h10.g();
    }

    public static final AbstractC0997f d(Nf.c cVar) {
        AbstractC3557B.c0("<this>", cVar);
        AbstractC1000i k10 = cVar.getType().y0().k();
        if (k10 instanceof AbstractC0997f) {
            return (AbstractC0997f) k10;
        }
        return null;
    }

    public static final l e(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        return j(abstractC1003l).j();
    }

    public static final C4290b f(AbstractC1000i abstractC1000i) {
        AbstractC1003l mo20k;
        C4290b f6;
        if (abstractC1000i == null || (mo20k = abstractC1000i.mo20k()) == null) {
            return null;
        }
        if (mo20k instanceof G) {
            return new C4290b(((I) ((G) mo20k)).f14010j0, abstractC1000i.getName());
        }
        if (!(mo20k instanceof AbstractC1001j) || (f6 = f((AbstractC1000i) mo20k)) == null) {
            return null;
        }
        return f6.d(abstractC1000i.getName());
    }

    public static final C4291c g(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        C4291c h10 = AbstractC4838e.h(abstractC1003l);
        if (h10 == null) {
            h10 = AbstractC4838e.g(abstractC1003l.mo20k()).b(abstractC1003l.getName()).g();
        }
        if (h10 != null) {
            return h10;
        }
        AbstractC4838e.a(4);
        throw null;
    }

    public static final C4293e h(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        C4293e g10 = AbstractC4838e.g(abstractC1003l);
        AbstractC3557B.b0("getFqName(...)", g10);
        return g10;
    }

    public static final void i(B b10) {
        AbstractC3557B.c0("<this>", b10);
        AbstractC2469q0.p(b10.s0(j.f3128a));
    }

    public static final B j(AbstractC1003l abstractC1003l) {
        AbstractC3557B.c0("<this>", abstractC1003l);
        B d10 = AbstractC4838e.d(abstractC1003l);
        AbstractC3557B.b0("getContainingModule(...)", d10);
        return d10;
    }

    public static final AbstractC0994c k(AbstractC0994c abstractC0994c) {
        AbstractC3557B.c0("<this>", abstractC0994c);
        if (abstractC0994c instanceof O) {
            P w02 = ((M) ((O) abstractC0994c)).w0();
            AbstractC3557B.b0("getCorrespondingProperty(...)", w02);
            return w02;
        }
        return abstractC0994c;
    }
}
