package Uf;

import Mf.AbstractC0994c;
import id.AbstractC3557B;
import kf.AbstractC4268D;
import rg.AbstractC5493d;

/* loaded from: classes.dex */
public final class L extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final L f17772Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC0994c b10;
        String f02;
        N n10;
        AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
        AbstractC3557B.c0("it", abstractC0994c);
        if (Jf.l.z(abstractC0994c)) {
            int i10 = C1446h.f17820m;
            N n11 = null;
            if (Q.f17793f.contains(abstractC0994c.getName()) && (b10 = AbstractC5493d.b(abstractC0994c, C1445g.f17819Y)) != null && (f02 = L4.a.f0(b10)) != null) {
                if (Q.f17790c.contains(f02)) {
                    n10 = N.f17778Y;
                } else if (((P) AbstractC4268D.Z0(f02, Q.f17792e)) == P.f17782Z) {
                    n10 = N.f17780h0;
                } else {
                    n10 = N.f17779Z;
                }
                n11 = n10;
            }
            if (n11 != null) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
