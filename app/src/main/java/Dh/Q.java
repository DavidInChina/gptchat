package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class Q extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Q f28416c = new l0(S.f28417a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC3557B.c0("<this>", jArr);
        return jArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        P p10 = (P) obj;
        AbstractC3557B.c0("builder", p10);
        long i11 = abstractC2430a.i(this.f28464b, i10);
        p10.b(p10.d() + 1);
        long[] jArr = p10.f28414a;
        int i12 = p10.f28415b;
        p10.f28415b = i12 + 1;
        jArr[i12] = i11;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.P, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC3557B.c0("<this>", jArr);
        ?? obj2 = new Object();
        obj2.f28414a = jArr;
        obj2.f28415b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new long[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        long[] jArr = (long[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", jArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.B(this.f28464b, i11, jArr[i11]);
        }
    }
}
