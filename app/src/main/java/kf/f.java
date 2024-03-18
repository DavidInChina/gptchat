package Kf;

import Bg.j0;
import Hg.A;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.V;
import Mf.h0;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import Pf.C1164w;
import Pf.T;
import Pf.b0;
import Pf.c0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import kf.t;
import kg.C4294f;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class f extends T {
    public f(AbstractC1003l abstractC1003l, f fVar, int i10, boolean z10) {
        super(abstractC1003l, fVar, Nf.h.f12822a, A.f7740g, i10, V.f12075a);
        this.f14177r0 = true;
        this.f14160A0 = z10;
        this.f14161B0 = false;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean L() {
        return false;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1016z
    public final boolean isExternal() {
        return false;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean isInline() {
        return false;
    }

    @Override // Pf.T, Pf.AbstractC1165x
    public final AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar, C4294f c4294f) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("annotations", iVar);
        return new f(abstractC1003l, (f) abstractC1013w, i10, this.f14160A0);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    @Override // Pf.AbstractC1165x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1165x z0(C1164w c1164w) {
        C4294f c4294f;
        AbstractC3557B.c0("configuration", c1164w);
        f fVar = (f) super.z0(c1164w);
        if (fVar == null) {
            return null;
        }
        List<h0> S = fVar.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        if (!S.isEmpty()) {
            for (h0 h0Var : S) {
                Bg.A type = ((c0) h0Var).getType();
                AbstractC3557B.b0("getType(...)", type);
                if (Ad.l.l0(type) != null) {
                    List<h0> S10 = fVar.S();
                    AbstractC3557B.b0("getValueParameters(...)", S10);
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(S10, 10));
                    for (h0 h0Var2 : S10) {
                        Bg.A type2 = ((c0) h0Var2).getType();
                        AbstractC3557B.b0("getType(...)", type2);
                        arrayList.add(Ad.l.l0(type2));
                    }
                    int size = fVar.S().size() - arrayList.size();
                    boolean z10 = true;
                    if (size == 0) {
                        List S11 = fVar.S();
                        AbstractC3557B.b0("getValueParameters(...)", S11);
                        ArrayList S22 = t.S2(arrayList, S11);
                        if (!S22.isEmpty()) {
                            Iterator it = S22.iterator();
                            while (it.hasNext()) {
                                C3959i c3959i = (C3959i) it.next();
                                if (!AbstractC3557B.K((C4294f) c3959i.f36155Y, ((AbstractC1158p) ((h0) c3959i.f36156Z)).getName())) {
                                    List<h0> S12 = fVar.S();
                                    AbstractC3557B.b0("getValueParameters(...)", S12);
                                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(S12, 10));
                                    for (h0 h0Var3 : S12) {
                                        C4294f name = ((AbstractC1158p) h0Var3).getName();
                                        AbstractC3557B.b0("getName(...)", name);
                                        int i10 = ((b0) h0Var3).f14081k0;
                                        int i11 = i10 - size;
                                        if (i11 >= 0 && (c4294f = (C4294f) arrayList.get(i11)) != null) {
                                            name = c4294f;
                                        }
                                        arrayList2.add(h0Var3.s(fVar, name, i10));
                                    }
                                    C1164w C02 = fVar.C0(j0.f2127b);
                                    if (!arrayList.isEmpty()) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            if (((C4294f) it2.next()) == null) {
                                                break;
                                            }
                                        }
                                    }
                                    z10 = false;
                                    C02.f14157v = Boolean.valueOf(z10);
                                    C02.f14142g = arrayList2;
                                    C02.f14140e = fVar.p0();
                                    AbstractC1165x z02 = super.z0(C02);
                                    AbstractC3557B.Z(z02);
                                    return z02;
                                }
                            }
                            return fVar;
                        }
                        return fVar;
                    }
                    List<h0> S122 = fVar.S();
                    AbstractC3557B.b0("getValueParameters(...)", S122);
                    ArrayList arrayList22 = new ArrayList(AbstractC6583a.H1(S122, 10));
                    while (r4.hasNext()) {
                    }
                    C1164w C022 = fVar.C0(j0.f2127b);
                    if (!arrayList.isEmpty()) {
                    }
                    z10 = false;
                    C022.f14157v = Boolean.valueOf(z10);
                    C022.f14142g = arrayList22;
                    C022.f14140e = fVar.p0();
                    AbstractC1165x z022 = super.z0(C022);
                    AbstractC3557B.Z(z022);
                    return z022;
                }
            }
            return fVar;
        }
        return fVar;
    }
}
