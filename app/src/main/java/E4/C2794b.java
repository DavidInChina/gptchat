package e4;

import id.AbstractC3557B;

/* renamed from: e4.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2794b implements AbstractC2802j {

    /* renamed from: Y  reason: collision with root package name */
    public final B3.i f28945Y;

    public C2794b(B3.i iVar) {
        AbstractC3557B.c0("statement", iVar);
        this.f28945Y = iVar;
    }

    @Override // d4.AbstractC2598g
    public final void b(int i10, String str) {
        B3.i iVar = this.f28945Y;
        int i11 = i10 + 1;
        if (str == null) {
            iVar.s0(i11);
        } else {
            iVar.b(i11, str);
        }
    }

    @Override // e4.AbstractC2802j
    public final long c() {
        return this.f28945Y.w();
    }

    @Override // e4.AbstractC2802j
    public final void close() {
        this.f28945Y.close();
    }

    @Override // e4.AbstractC2802j
    public final Object d(wf.k kVar) {
        AbstractC3557B.c0("mapper", kVar);
        throw new UnsupportedOperationException();
    }
}
