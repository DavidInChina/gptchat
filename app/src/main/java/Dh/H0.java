package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class H0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final H0 f28397c = new l0(I0.f28399a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        short[] sArr = ((jf.x) obj).f36176Y;
        AbstractC3557B.c0("$this$collectionSize", sArr);
        return sArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        G0 g02 = (G0) obj;
        AbstractC3557B.c0("builder", g02);
        short B10 = abstractC2430a.E(this.f28464b, i10).B();
        g02.b(g02.d() + 1);
        short[] sArr = g02.f28393a;
        int i11 = g02.f28394b;
        g02.f28394b = i11 + 1;
        sArr[i11] = B10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.G0, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        short[] sArr = ((jf.x) obj).f36176Y;
        AbstractC3557B.c0("$this$toBuilder", sArr);
        ?? obj2 = new Object();
        obj2.f28393a = sArr;
        obj2.f28394b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new jf.x(new short[0]);
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        short[] sArr = ((jf.x) obj).f36176Y;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", sArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.r(this.f28464b, i11).h(sArr[i11]);
        }
    }
}
