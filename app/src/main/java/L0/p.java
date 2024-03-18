package L0;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.v0;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f10425a;

    public p(androidx.compose.ui.node.a aVar) {
        this.f10425a = aVar;
    }

    public final o a() {
        androidx.compose.ui.node.a aVar = this.f10425a;
        AbstractC4325q abstractC4325q = aVar.f24831B0.f5704e;
        v0 v0Var = null;
        if ((abstractC4325q.f37723i0 & 8) != 0) {
            loop0: while (true) {
                if (abstractC4325q == null) {
                    break;
                }
                if ((abstractC4325q.f37722h0 & 8) != 0) {
                    AbstractC4325q abstractC4325q2 = abstractC4325q;
                    C2104h c2104h = null;
                    while (abstractC4325q2 != null) {
                        if (abstractC4325q2 instanceof v0) {
                            v0Var = abstractC4325q2;
                            break loop0;
                        }
                        if ((abstractC4325q2.f37722h0 & 8) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                            int i10 = 0;
                            for (AbstractC4325q abstractC4325q3 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q3 != null; abstractC4325q3 = abstractC4325q3.f37725k0) {
                                if ((abstractC4325q3.f37722h0 & 8) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC4325q2 = abstractC4325q3;
                                    } else {
                                        if (c2104h == null) {
                                            c2104h = new C2104h(new AbstractC4325q[16]);
                                        }
                                        if (abstractC4325q2 != null) {
                                            c2104h.b(abstractC4325q2);
                                            abstractC4325q2 = null;
                                        }
                                        c2104h.b(abstractC4325q3);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC4325q2 = AbstractC0579h.f(c2104h);
                    }
                }
                if ((abstractC4325q.f37723i0 & 8) == 0) {
                    break;
                }
                abstractC4325q = abstractC4325q.f37725k0;
            }
        }
        AbstractC3557B.Z(v0Var);
        return new o(((AbstractC4325q) v0Var).f37720Y, false, aVar, new j());
    }
}
