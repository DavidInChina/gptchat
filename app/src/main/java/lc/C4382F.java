package lc;

import id.AbstractC3557B;

/* renamed from: lc.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4382F extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4382F f38080Z = new C4382F(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4382F f38081h0 = new C4382F(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38082Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4382F(int i10) {
        super(1);
        this.f38082Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f38082Y) {
            case 0:
                return null;
            default:
                zd.n nVar = (zd.n) obj;
                AbstractC3557B.c0("$this$update", nVar);
                return zd.n.a(nVar, false, null, false, false, false, false, false, false, null, false, 3207);
        }
    }
}
