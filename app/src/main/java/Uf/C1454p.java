package Uf;

import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import id.AbstractC3557B;
import ng.AbstractC4841h;
import ng.EnumC4839f;
import ng.EnumC4840g;

/* renamed from: Uf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454p implements AbstractC4841h {
    @Override // ng.AbstractC4841h
    public EnumC4840g a(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, AbstractC0997f abstractC0997f) {
        AbstractC3557B.c0("superDescriptor", abstractC0993b);
        AbstractC3557B.c0("subDescriptor", abstractC0993b2);
        boolean z10 = abstractC0993b2 instanceof Mf.P;
        EnumC4840g enumC4840g = EnumC4840g.f40346h0;
        if (z10 && (abstractC0993b instanceof Mf.P)) {
            Mf.P p10 = (Mf.P) abstractC0993b2;
            Mf.P p11 = (Mf.P) abstractC0993b;
            if (!AbstractC3557B.K(p10.getName(), p11.getName())) {
                return enumC4840g;
            }
            if (Ad.l.K0(p10) && Ad.l.K0(p11)) {
                return EnumC4840g.f40344Y;
            }
            if (!Ad.l.K0(p10) && !Ad.l.K0(p11)) {
                return enumC4840g;
            }
            return EnumC4840g.f40345Z;
        }
        return enumC4840g;
    }

    @Override // ng.AbstractC4841h
    public EnumC4839f b() {
        return EnumC4839f.f40342h0;
    }
}
