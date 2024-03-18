package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2685K extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2685K f28405c = new l0(C2686L.f28406a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC3557B.c0("<this>", iArr);
        return iArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2684J c2684j = (C2684J) obj;
        AbstractC3557B.c0("builder", c2684j);
        int m10 = abstractC2430a.m(this.f28464b, i10);
        c2684j.b(c2684j.d() + 1);
        int[] iArr = c2684j.f28401a;
        int i11 = c2684j.f28402b;
        c2684j.f28402b = i11 + 1;
        iArr[i11] = m10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dh.J] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC3557B.c0("<this>", iArr);
        ?? obj2 = new Object();
        obj2.f28401a = iArr;
        obj2.f28402b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new int[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        int[] iArr = (int[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", iArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.m(i11, iArr[i11], this.f28464b);
        }
    }
}
