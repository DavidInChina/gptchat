package X1;

import d2.C2590b;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final f f21736Z = new f(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final f f21737h0 = new f(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final f f21738i0 = new f(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final f f21739j0 = new f(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final f f21740k0 = new f(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21741Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(0);
        this.f21741Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f21741Y) {
            case 0:
                return C2590b.f27951A;
            case 1:
                throw new IllegalStateException("No default context".toString());
            case 2:
                throw new IllegalStateException("No default glance id".toString());
            case 3:
                throw new IllegalStateException("No default size".toString());
            default:
                return null;
        }
    }
}
