package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2720w extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2720w f28499c = new l0(C2721x.f28501a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC3557B.c0("<this>", dArr);
        return dArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2719v c2719v = (C2719v) obj;
        AbstractC3557B.c0("builder", c2719v);
        double x10 = abstractC2430a.x(this.f28464b, i10);
        c2719v.b(c2719v.d() + 1);
        double[] dArr = c2719v.f28493a;
        int i11 = c2719v.f28494b;
        c2719v.f28494b = i11 + 1;
        dArr[i11] = x10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.v, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC3557B.c0("<this>", dArr);
        ?? obj2 = new Object();
        obj2.f28493a = dArr;
        obj2.f28494b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new double[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        double[] dArr = (double[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", dArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.x(this.f28464b, i11, dArr[i11]);
        }
    }
}
