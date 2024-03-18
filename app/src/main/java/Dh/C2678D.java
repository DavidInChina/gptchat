package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.D  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2678D extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2678D f28385c = new l0(C2679E.f28388a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC3557B.c0("<this>", fArr);
        return fArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2677C c2677c = (C2677C) obj;
        AbstractC3557B.c0("builder", c2677c);
        float y10 = abstractC2430a.y(this.f28464b, i10);
        c2677c.b(c2677c.d() + 1);
        float[] fArr = c2677c.f28381a;
        int i11 = c2677c.f28382b;
        c2677c.f28382b = i11 + 1;
        fArr[i11] = y10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.C, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC3557B.c0("<this>", fArr);
        ?? obj2 = new Object();
        obj2.f28381a = fArr;
        obj2.f28382b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new float[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        float[] fArr = (float[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", fArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.A(this.f28464b, i11, fArr[i11]);
        }
    }
}
