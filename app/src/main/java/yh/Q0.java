package yh;

import Qh.AbstractC1239q;
import yh.l1;

/* loaded from: classes.dex */
public final class Q0 extends R0 {
    @Override // yh.R0
    /* renamed from: f */
    public final Ph.a a(l1.a aVar) {
        Ph.a aVar2 = this.f50966Y;
        aVar.k(new R0(aVar2.o('=')));
        return aVar2;
    }

    @Override // yh.R0
    /* renamed from: g */
    public final Ph.a b(l1.a aVar) {
        Ph.a aVar2 = this.f50966Y;
        aVar.k(new R0(aVar2.o('=')));
        return aVar2;
    }

    @Override // yh.R0
    /* renamed from: i */
    public final Ph.a c(l1.a aVar) {
        Ph.a aVar2 = this.f50966Y;
        aVar.k(new R0(aVar2.o('=')));
        return aVar2;
    }

    @Override // yh.R0
    /* renamed from: j */
    public final Ph.a e(l1.a aVar) {
        Ph.a aVar2 = this.f50966Y;
        aVar.k(new R0(aVar2.o('=')));
        return aVar2;
    }

    @Override // yh.R0
    /* renamed from: k */
    public final Ph.a d(l1.a aVar) {
        G1 upperBounds = aVar.getUpperBounds();
        G1 lowerBounds = aVar.getLowerBounds();
        boolean isEmpty = lowerBounds.isEmpty();
        Ph.a aVar2 = this.f50966Y;
        if (isEmpty && ((l1.a) ((AbstractC1239q) upperBounds).r()).H(Object.class)) {
            aVar2.p();
        } else if (!lowerBounds.isEmpty()) {
            ((l1.a) ((AbstractC1239q) lowerBounds).r()).k(new R0(aVar2.o('-')));
        } else {
            ((l1.a) ((AbstractC1239q) upperBounds).r()).k(new R0(aVar2.o('+')));
        }
        return aVar2;
    }
}
