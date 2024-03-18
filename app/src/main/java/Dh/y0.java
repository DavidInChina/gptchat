package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;
import jf.C3967q;

/* loaded from: classes.dex */
public final class y0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final y0 f28507c = new l0(z0.f28513a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        byte[] bArr = ((C3967q) obj).f36169Y;
        AbstractC3557B.c0("$this$collectionSize", bArr);
        return bArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        x0 x0Var = (x0) obj;
        AbstractC3557B.c0("builder", x0Var);
        byte z11 = abstractC2430a.E(this.f28464b, i10).z();
        x0Var.b(x0Var.d() + 1);
        byte[] bArr = x0Var.f28503a;
        int i11 = x0Var.f28504b;
        x0Var.f28504b = i11 + 1;
        bArr[i11] = z11;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.x0, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        byte[] bArr = ((C3967q) obj).f36169Y;
        AbstractC3557B.c0("$this$toBuilder", bArr);
        ?? obj2 = new Object();
        obj2.f28503a = bArr;
        obj2.f28504b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new C3967q(new byte[0]);
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        byte[] bArr = ((C3967q) obj).f36169Y;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", bArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.r(this.f28464b, i11).j(bArr[i11]);
        }
    }
}
