package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f28487c = new l0(t0.f28489a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC3557B.c0("<this>", sArr);
        return sArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        r0 r0Var = (r0) obj;
        AbstractC3557B.c0("builder", r0Var);
        short j6 = abstractC2430a.j(this.f28464b, i10);
        r0Var.b(r0Var.d() + 1);
        short[] sArr = r0Var.f28482a;
        int i11 = r0Var.f28483b;
        r0Var.f28483b = i11 + 1;
        sArr[i11] = j6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.r0, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC3557B.c0("<this>", sArr);
        ?? obj2 = new Object();
        obj2.f28482a = sArr;
        obj2.f28483b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new short[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        short[] sArr = (short[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", sArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.l(this.f28464b, i11, sArr[i11]);
        }
    }
}
