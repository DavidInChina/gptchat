package Kg;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final o f9842Z = new o(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final o f9843h0 = new o(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final o f9844i0 = new o(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9845Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10) {
        super(1);
        this.f9845Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.f9845Y) {
            case 0:
                k kVar = (k) obj;
                AbstractC3557B.c0("it", kVar);
                return kVar.iterator();
            case 1:
                return obj;
            default:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
