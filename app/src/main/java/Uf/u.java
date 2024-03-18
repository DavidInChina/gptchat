package Uf;

import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1013w;
import Pf.AbstractC1158p;
import id.AbstractC3557B;
import kg.C4294f;
import ng.AbstractC4841h;
import ng.EnumC4839f;
import ng.EnumC4840g;

/* loaded from: classes.dex */
public final class u implements AbstractC4841h {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (Uf.Q.f17798k.contains(r2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (id.AbstractC3557B.K(r0, L4.a.e0(r2, 2)) != false) goto L41;
     */
    @Override // ng.AbstractC4841h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnumC4840g a(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, AbstractC0997f abstractC0997f) {
        AbstractC1013w abstractC1013w;
        AbstractC3557B.c0("superDescriptor", abstractC0993b);
        AbstractC3557B.c0("subDescriptor", abstractC0993b2);
        boolean z10 = abstractC0993b instanceof AbstractC0994c;
        EnumC4840g enumC4840g = EnumC4840g.f40345Z;
        if (z10 && (abstractC0993b2 instanceof AbstractC1013w) && !Jf.l.z(abstractC0993b2)) {
            int i10 = C1446h.f17820m;
            AbstractC1013w abstractC1013w2 = (AbstractC1013w) abstractC0993b2;
            AbstractC1158p abstractC1158p = (AbstractC1158p) abstractC1013w2;
            C4294f name = abstractC1158p.getName();
            AbstractC3557B.b0("getName(...)", name);
            if (!C1446h.b(name)) {
                Cf.k kVar = Q.f17788a;
                C4294f name2 = abstractC1158p.getName();
                AbstractC3557B.b0("getName(...)", name2);
            }
            AbstractC0994c X10 = P4.a.X((AbstractC0994c) abstractC0993b);
            boolean z11 = abstractC0993b instanceof AbstractC1013w;
            if (z11) {
                abstractC1013w = (AbstractC1013w) abstractC0993b;
            } else {
                abstractC1013w = null;
            }
            boolean z12 = false;
            if (abstractC1013w != null && abstractC1013w2.g0() == abstractC1013w.g0()) {
                z12 = true;
            }
            if (!(!z12) || (X10 != null && abstractC1013w2.g0())) {
                if ((abstractC0997f instanceof Wf.c) && abstractC1013w2.V() == null && X10 != null && !P4.a.b0(abstractC0997f, X10)) {
                    if ((X10 instanceof AbstractC1013w) && z11 && C1446h.a((AbstractC1013w) X10) != null) {
                        String e02 = L4.a.e0(abstractC1013w2, 2);
                        AbstractC1013w mo24a = ((AbstractC1013w) abstractC0993b).mo24a();
                        AbstractC3557B.b0("getOriginal(...)", mo24a);
                    }
                }
            }
            return enumC4840g;
        }
        if (Cf.k.h(abstractC0993b, abstractC0993b2)) {
            return enumC4840g;
        }
        return EnumC4840g.f40346h0;
    }

    @Override // ng.AbstractC4841h
    public EnumC4839f b() {
        return EnumC4839f.f40340Y;
    }
}
