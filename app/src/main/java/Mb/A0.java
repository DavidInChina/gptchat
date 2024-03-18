package Mb;

import c9.C2308b;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class A0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11755Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2308b f11756Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(C2308b c2308b, int i10) {
        super(1);
        this.f11755Y = i10;
        this.f11756Z = c2308b;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f11755Y;
        C2308b c2308b = this.f11756Z;
        switch (i10) {
            case 0:
                C0986w0 c0986w0 = (C0986w0) obj;
                AbstractC3557B.c0("$this$setState", c0986w0);
                return C0986w0.e(c0986w0, c2308b.f26369b, null, new wd.n0(jf.y.f36177a), 6);
            default:
                Cb.Y y10 = (Cb.Y) obj;
                AbstractC3557B.c0("state", y10);
                return Cb.Y.a(y10, Cb.g0.f2943h0, c2308b.f26369b, null, null, null, null, null, 124);
        }
    }
}
