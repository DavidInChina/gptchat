package Uf;

import Mf.AbstractC0994c;
import Mf.AbstractC1013w;
import id.AbstractC3557B;

/* renamed from: Uf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C1445g f17819Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
        AbstractC3557B.c0("it", abstractC0994c);
        if (abstractC0994c instanceof AbstractC1013w) {
            int i10 = C1446h.f17820m;
            if (kf.t.X1(Q.f17794g, L4.a.f0(abstractC0994c))) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
