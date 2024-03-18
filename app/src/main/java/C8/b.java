package C8;

import U3.u;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final long[] f2728d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(U3.c cVar) {
        super(r1, r2, r4);
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        this.f2728d = jArr3;
        u uVar = (u) cVar.f17396Z;
        c.o(jArr, (long[]) uVar.f17493h0, (long[]) uVar.f17492Z);
        u uVar2 = (u) cVar.f17396Z;
        c.n(jArr2, (long[]) uVar2.f17493h0, (long[]) uVar2.f17492Z);
        System.arraycopy((long[]) ((u) cVar.f17396Z).f17494i0, 0, jArr3, 0, 10);
        c.h(jArr4, (long[]) cVar.f17397h0, d.f2736b);
    }

    @Override // C8.a
    public final void a(long[] jArr, long[] jArr2) {
        c.h(jArr, jArr2, this.f2728d);
    }
}
