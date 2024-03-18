package zc;

import Cd.X;
import id.AbstractC3557B;

/* renamed from: zc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6823b extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6823b f51888Z = new C6823b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6823b f51889h0 = new C6823b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6823b f51890i0 = new C6823b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51891Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6823b(int i10) {
        super(1);
        this.f51891Y = i10;
    }

    public final X a(X x10) {
        switch (this.f51891Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, true, null, null, null, 7679);
            case 1:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, false, false, null, null, null, 7679);
            default:
                AbstractC3557B.c0("$this$setState", x10);
                return X.e(x10, null, null, false, false, true, false, null, null, null, 7935);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f51891Y) {
            case 0:
                return a((X) obj);
            case 1:
                return a((X) obj);
            default:
                return a((X) obj);
        }
    }
}
