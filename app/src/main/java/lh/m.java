package Lh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public enum m implements Hh.n {
    ZERO(9),
    ONE(10);
    

    /* renamed from: i0  reason: collision with root package name */
    public static final Hh.l f11205i0 = Hh.o.DOUBLE.a();

    /* renamed from: Y  reason: collision with root package name */
    public final int f11207Y;

    m(int i10) {
        this.f11207Y = i10;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f11207Y);
        return f11205i0;
    }
}
