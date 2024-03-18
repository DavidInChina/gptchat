package Z;

import A.C0043t;
import Ng.C1072l;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* renamed from: Z.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713h implements AbstractC1700a0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6216a f22632Y;

    /* renamed from: h0  reason: collision with root package name */
    public Throwable f22634h0;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f22633Z = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public List f22635i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public List f22636j0 = new ArrayList();

    public C1713h(AbstractC6216a abstractC6216a) {
        this.f22632Y = abstractC6216a;
    }

    public static final void b(C1713h c1713h, Throwable th2) {
        synchronized (c1713h.f22633Z) {
            try {
                if (c1713h.f22634h0 == null) {
                    c1713h.f22634h0 = th2;
                    List list = c1713h.f22635i0;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((C1711g) list.get(i10)).f22622b.resumeWith(com.google.android.gms.internal.play_billing.N.w(th2));
                    }
                    c1713h.f22635i0.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    @Override // Z.AbstractC1700a0
    public final Object S(wf.k kVar, AbstractC4825e abstractC4825e) {
        AbstractC6216a abstractC6216a;
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        ?? obj = new Object();
        synchronized (this.f22633Z) {
            Throwable th2 = this.f22634h0;
            if (th2 != null) {
                c1072l.resumeWith(com.google.android.gms.internal.play_billing.N.w(th2));
            } else {
                obj.f37622Y = new C1711g(kVar, c1072l);
                boolean isEmpty = this.f22635i0.isEmpty();
                List list = this.f22635i0;
                Object obj2 = obj.f37622Y;
                if (obj2 != null) {
                    list.add((C1711g) obj2);
                    c1072l.w(new C0043t(this, 11, obj));
                    if (isEmpty && (abstractC6216a = this.f22632Y) != null) {
                        try {
                            abstractC6216a.mo122invoke();
                        } catch (Throwable th3) {
                            b(this, th3);
                        }
                    }
                } else {
                    AbstractC3557B.C2("awaiter");
                    throw null;
                }
            }
        }
        Object t10 = c1072l.t();
        if (t10 == EnumC5000a.f41328Y) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        return t10;
    }

    public final void c(long j6) {
        synchronized (this.f22633Z) {
            try {
                List list = this.f22635i0;
                this.f22635i0 = this.f22636j0;
                this.f22636j0 = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C1711g c1711g = (C1711g) list.get(i10);
                    c1711g.getClass();
                    c1711g.f22622b.resumeWith(c1711g.f22621a.invoke(Long.valueOf(j6)));
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return C1723m.f22655Z;
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }
}
