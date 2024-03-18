package Hh;

import Eh.AbstractC0511j;

/* loaded from: classes2.dex */
public enum f implements n {
    /* JADX INFO: Fake field, exist only in values array */
    ZERO(o.ZERO, 0),
    SINGLE(o.SINGLE, 89),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(o.DOUBLE, 92);
    

    /* renamed from: Y  reason: collision with root package name */
    public final l f7805Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7806Z;

    f(o oVar, int i10) {
        this.f7805Y = oVar.a();
        this.f7806Z = i10;
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    public l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(this.f7806Z);
        return this.f7805Y;
    }
}
