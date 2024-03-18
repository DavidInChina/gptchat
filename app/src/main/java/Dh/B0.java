package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import jf.C3969s;

/* loaded from: classes2.dex */
public final class B0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final B0 f28380c = new l0(C0.f28383a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        int[] iArr = ((C3969s) obj).f36171Y;
        AbstractC3557B.c0("$this$collectionSize", iArr);
        return iArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        A0 a02 = (A0) obj;
        AbstractC3557B.c0("builder", a02);
        int l10 = abstractC2430a.E(this.f28464b, i10).l();
        a02.b(a02.d() + 1);
        int[] iArr = a02.f28374a;
        int i11 = a02.f28375b;
        a02.f28375b = i11 + 1;
        iArr[i11] = l10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.A0, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        int[] iArr = ((C3969s) obj).f36171Y;
        AbstractC3557B.c0("$this$toBuilder", iArr);
        ?? obj2 = new Object();
        obj2.f28374a = iArr;
        obj2.f28375b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new C3969s(new int[0]);
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        int[] iArr = ((C3969s) obj).f36171Y;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", iArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.r(this.f28464b, i11).u(iArr[i11]);
        }
    }
}
