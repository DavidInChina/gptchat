package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2699f extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2699f f28446c = new l0(C2701g.f28450a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC3557B.c0("<this>", zArr);
        return zArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2697e c2697e = (C2697e) obj;
        AbstractC3557B.c0("builder", c2697e);
        boolean q10 = abstractC2430a.q(this.f28464b, i10);
        c2697e.b(c2697e.d() + 1);
        boolean[] zArr = c2697e.f28442a;
        int i11 = c2697e.f28443b;
        c2697e.f28443b = i11 + 1;
        zArr[i11] = q10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.e, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC3557B.c0("<this>", zArr);
        ?? obj2 = new Object();
        obj2.f28442a = zArr;
        obj2.f28443b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new boolean[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", zArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.p(this.f28464b, i11, zArr[i11]);
        }
    }
}
