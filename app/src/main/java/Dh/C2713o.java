package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2713o extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2713o f28471c = new l0(C2714p.f28474a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC3557B.c0("<this>", cArr);
        return cArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2712n c2712n = (C2712n) obj;
        AbstractC3557B.c0("builder", c2712n);
        char h10 = abstractC2430a.h(this.f28464b, i10);
        c2712n.b(c2712n.d() + 1);
        char[] cArr = c2712n.f28468a;
        int i11 = c2712n.f28469b;
        c2712n.f28469b = i11 + 1;
        cArr[i11] = h10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dh.n] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC3557B.c0("<this>", cArr);
        ?? obj2 = new Object();
        obj2.f28468a = cArr;
        obj2.f28469b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new char[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", cArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.f(this.f28464b, i11, cArr[i11]);
        }
    }
}
