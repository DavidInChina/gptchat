package fb;

import id.AbstractC3557B;

/* renamed from: fb.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2990i extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2990i f30095Z = new C2990i(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2990i f30096h0 = new C2990i(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30097Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2990i(int i10) {
        super(1);
        this.f30097Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f30097Y) {
            case 0:
                C2995n c2995n = (C2995n) obj;
                AbstractC3557B.c0("it", c2995n);
                return c2995n.f30101a;
            default:
                return null;
        }
    }
}
