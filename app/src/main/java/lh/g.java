package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public enum g implements Hh.n {
    ZERO(11),
    ONE(12),
    TWO(13);
    

    /* renamed from: j0  reason: collision with root package name */
    public static final Hh.l f11186j0 = Hh.o.SINGLE.a();

    /* renamed from: Y  reason: collision with root package name */
    public final int f11188Y;

    g(int i10) {
        this.f11188Y = i10;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f11188Y);
        return f11186j0;
    }
}
