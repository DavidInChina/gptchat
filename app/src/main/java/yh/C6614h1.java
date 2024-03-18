package yh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: yh.h1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6614h1 extends j1 {
    @Override // yh.j1, yh.k1
    public final Object a(l1.a aVar) {
        return Boolean.valueOf(this.f51029Y);
    }

    @Override // yh.j1, yh.k1
    public final /* bridge */ /* synthetic */ Object c(l1.a aVar) {
        return Boolean.FALSE;
    }

    @Override // yh.j1, yh.k1
    public final /* bridge */ /* synthetic */ Object d(l1.a aVar) {
        return Boolean.FALSE;
    }

    @Override // yh.j1
    /* renamed from: f */
    public final Boolean b(l1.a aVar) {
        return Boolean.valueOf(aVar.l0().h0(Throwable.class));
    }

    @Override // yh.j1
    public final Boolean g(l1.a aVar) {
        return Boolean.FALSE;
    }

    @Override // yh.j1
    /* renamed from: h */
    public final Boolean e(l1.a aVar) {
        for (l1.a aVar2 : aVar.getUpperBounds()) {
            if (((Boolean) aVar2.k(this)).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
