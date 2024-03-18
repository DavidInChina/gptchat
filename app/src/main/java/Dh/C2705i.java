package dh;

import ch.AbstractC2430a;
import ch.AbstractC2431b;
import id.AbstractC3557B;

/* renamed from: dh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2705i extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C2705i f28457c = new l0(C2707j.f28460a);

    @Override // dh.AbstractC2689a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC3557B.c0("<this>", bArr);
        return bArr.length;
    }

    @Override // dh.AbstractC2717t, dh.AbstractC2689a
    public final void f(AbstractC2430a abstractC2430a, int i10, Object obj, boolean z10) {
        C2703h c2703h = (C2703h) obj;
        AbstractC3557B.c0("builder", c2703h);
        byte A10 = abstractC2430a.A(this.f28464b, i10);
        c2703h.b(c2703h.d() + 1);
        byte[] bArr = c2703h.f28453a;
        int i11 = c2703h.f28454b;
        c2703h.f28454b = i11 + 1;
        bArr[i11] = A10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dh.h, java.lang.Object] */
    @Override // dh.AbstractC2689a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC3557B.c0("<this>", bArr);
        ?? obj2 = new Object();
        obj2.f28453a = bArr;
        obj2.f28454b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // dh.l0
    public final Object j() {
        return new byte[0];
    }

    @Override // dh.l0
    public final void k(AbstractC2431b abstractC2431b, Object obj, int i10) {
        byte[] bArr = (byte[]) obj;
        AbstractC3557B.c0("encoder", abstractC2431b);
        AbstractC3557B.c0("content", bArr);
        for (int i11 = 0; i11 < i10; i11++) {
            abstractC2431b.d(this.f28464b, i11, bArr[i11]);
        }
    }
}
