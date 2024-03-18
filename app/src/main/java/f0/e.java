package F0;

import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.C0576e;
import H0.C0714y;
import androidx.compose.ui.node.Owner;
import b0.C2104h;
import java.util.HashSet;
import l0.AbstractC4325q;
import z.C6672L;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Owner f5023a;

    /* renamed from: b  reason: collision with root package name */
    public final C2104h f5024b = new C2104h(new C0576e[16]);

    /* renamed from: c  reason: collision with root package name */
    public final C2104h f5025c = new C2104h(new c[16]);

    /* renamed from: d  reason: collision with root package name */
    public final C2104h f5026d = new C2104h(new androidx.compose.ui.node.a[16]);

    /* renamed from: e  reason: collision with root package name */
    public final C2104h f5027e = new C2104h(new c[16]);

    /* renamed from: f  reason: collision with root package name */
    public boolean f5028f;

    public e(Owner owner) {
        this.f5023a = owner;
    }

    public static void b(AbstractC4325q abstractC4325q, c cVar, HashSet hashSet) {
        AbstractC4325q abstractC4325q2 = abstractC4325q.f37720Y;
        if (abstractC4325q2.f37732r0) {
            C2104h c2104h = new C2104h(new AbstractC4325q[16]);
            AbstractC4325q abstractC4325q3 = abstractC4325q2.f37725k0;
            if (abstractC4325q3 == null) {
                AbstractC0579h.b(c2104h, abstractC4325q2);
            } else {
                c2104h.b(abstractC4325q3);
            }
            while (c2104h.l()) {
                AbstractC4325q abstractC4325q4 = (AbstractC4325q) c2104h.n(c2104h.f25569h0 - 1);
                if ((abstractC4325q4.f37723i0 & 32) != 0) {
                    for (AbstractC4325q abstractC4325q5 = abstractC4325q4; abstractC4325q5 != null; abstractC4325q5 = abstractC4325q5.f37725k0) {
                        if ((abstractC4325q5.f37722h0 & 32) != 0) {
                            AbstractC4325q abstractC4325q6 = abstractC4325q5;
                            C2104h c2104h2 = null;
                            while (abstractC4325q6 != null) {
                                if (abstractC4325q6 instanceof f) {
                                    f fVar = (f) abstractC4325q6;
                                    if (fVar instanceof C0576e) {
                                        C0576e c0576e = (C0576e) fVar;
                                        if ((c0576e.f5726s0 instanceof d) && c0576e.f5728u0.contains(cVar)) {
                                            hashSet.add(fVar);
                                        }
                                    }
                                    if (!(!fVar.M().G0(cVar))) {
                                        break;
                                    }
                                } else if ((abstractC4325q6.f37722h0 & 32) != 0 && (abstractC4325q6 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q7 = ((AbstractC0587p) abstractC4325q6).f5816t0; abstractC4325q7 != null; abstractC4325q7 = abstractC4325q7.f37725k0) {
                                        if ((abstractC4325q7.f37722h0 & 32) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q6 = abstractC4325q7;
                                            } else {
                                                if (c2104h2 == null) {
                                                    c2104h2 = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q6 != null) {
                                                    c2104h2.b(abstractC4325q6);
                                                    abstractC4325q6 = null;
                                                }
                                                c2104h2.b(abstractC4325q7);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q6 = AbstractC0579h.f(c2104h2);
                            }
                            continue;
                        }
                    }
                }
                AbstractC0579h.b(c2104h, abstractC4325q4);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    public final void a() {
        if (!this.f5028f) {
            this.f5028f = true;
            C6672L c6672l = new C6672L(20, this);
            C2104h c2104h = ((C0714y) this.f5023a).f7124r1;
            if (!c2104h.g(c6672l)) {
                c2104h.b(c6672l);
            }
        }
    }
}
