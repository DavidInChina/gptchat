package ng;

import Bg.A;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.a0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kg.C4294f;
import ug.C5925g;
import zg.C6862i;
import zg.t;

/* renamed from: ng.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4834a extends P4.a {
    public static final void Z0(C6862i c6862i, LinkedHashSet linkedHashSet, ug.n nVar, boolean z10) {
        for (AbstractC1003l abstractC1003l : Bi.c.Q0(nVar, C5925g.f46783n, 2)) {
            if (abstractC1003l instanceof AbstractC0997f) {
                AbstractC0997f abstractC0997f = (AbstractC0997f) abstractC1003l;
                if (abstractC0997f.H()) {
                    C4294f name = abstractC0997f.getName();
                    AbstractC3557B.b0("getName(...)", name);
                    AbstractC1000i e10 = nVar.e(name, Tf.d.f17214i0);
                    if (e10 instanceof AbstractC0997f) {
                        abstractC0997f = (AbstractC0997f) e10;
                    } else if (e10 instanceof a0) {
                        abstractC0997f = ((t) ((a0) e10)).w0();
                    } else {
                        abstractC0997f = null;
                    }
                }
                if (abstractC0997f != null) {
                    int i10 = AbstractC4838e.f40339a;
                    Iterator it = abstractC0997f.f().l().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (AbstractC4838e.p((A) it.next(), c6862i)) {
                            linkedHashSet.add(abstractC0997f);
                            break;
                        }
                    }
                    if (z10) {
                        ug.n i02 = abstractC0997f.i0();
                        AbstractC3557B.b0("getUnsubstitutedInnerClassesScope(...)", i02);
                        Z0(c6862i, linkedHashSet, i02, z10);
                    }
                }
            }
        }
    }
}
