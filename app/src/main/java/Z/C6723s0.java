package z;

import id.AbstractC3557B;
import l8.AbstractC4344b;

/* renamed from: z.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6723s0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51370Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f51371Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f51372h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6723s0(float f6, int i10, Object obj) {
        super(1);
        this.f51370Y = i10;
        this.f51372h0 = obj;
        this.f51371Z = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        int i10 = this.f51370Y;
        float f10 = this.f51371Z;
        Object obj2 = this.f51372h0;
        switch (i10) {
            case 0:
                long longValue = ((Number) obj).longValue();
                C6729v0 c6729v0 = (C6729v0) obj2;
                if (!c6729v0.d()) {
                    c6729v0.e(f10, longValue);
                }
                return jf.y.f36177a;
            case 1:
                AbstractC3557B.c0("$this$offset", (Z0.b) obj);
                return new Z0.i(kotlin.jvm.internal.m.c(AbstractC4344b.Y0(((B.H) obj2).f1088h.h() - f10), 0));
            default:
                if (((Number) obj).intValue() == 0) {
                    f6 = (String.valueOf(((id.x) obj2).f33135d).length() * f10) + p9.r.f42840d;
                } else {
                    f6 = 164;
                }
                return new Z0.e(f6);
        }
    }
}
