package sh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import yh.G1;
import yh.l1;

/* renamed from: sh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5639k extends AbstractC5634f implements AbstractC5641m {
    @Override // sh.AbstractC5641m
    public final l1.a O0(String str) {
        l1.a Z02 = Z0(str);
        if (Z02 != null) {
            return Z02;
        }
        StringBuilder s10 = android.gov.nist.core.a.s("Cannot resolve ", str, " from ");
        s10.append(i1());
        throw new IllegalArgumentException(s10.toString());
    }

    @Override // sh.AbstractC5641m
    public final l1.a Z0(String str) {
        G1 g1 = (G1) ((AbstractC1239q) r0()).f(AbstractC1235m.c(str));
        if (g1.isEmpty()) {
            AbstractC5641m I10 = I();
            if (I10 == null) {
                l1.a aVar = l1.a.f51045N;
                return null;
            }
            return I10.Z0(str);
        }
        return (l1.a) ((AbstractC1239q) g1).r();
    }

    public abstract String i1();
}
