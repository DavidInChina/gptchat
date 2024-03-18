package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import jf.C3971u;

/* loaded from: classes2.dex */
public final class E0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final E0 f28390c = new l0(F0.f28391a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        long[] jArr = ((C3971u) obj).f36173Y;
        AbstractC3557B.c0("$this$collectionSize", jArr);
        return jArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        D0 d02 = (D0) obj;
        AbstractC3557B.c0("builder", d02);
        long p10 = abstractC2430a.E(this.f28464b, i10).p();
        d02.b(d02.d() + 1);
        long[] jArr = d02.f28386a;
        int i11 = d02.f28387b;
        d02.f28387b = i11 + 1;
        jArr[i11] = p10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.D0, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        long[] jArr = ((C3971u) obj).f36173Y;
        AbstractC3557B.c0("$this$toBuilder", jArr);
        ?? obj2 = new Object();
        obj2.f28386a = jArr;
        obj2.f28387b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new C3971u(new long[0]);
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        long[] jArr = ((C3971u) obj).f36173Y;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", jArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.r(this.f28464b, i11).y(jArr[i11]);
        }
    }
}
