package W;

import Z.C1724m0;
import jf.C3959i;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18964Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f18965Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(C c10, int i10) {
        super(0);
        this.f18964Y = i10;
        this.f18965Z = c10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object b10;
        int i10 = this.f18964Y;
        float f6 = 0.0f;
        C c10 = this.f18965Z;
        switch (i10) {
            case 0:
                float c11 = c10.d().c(c10.f18997f.getValue());
                float c12 = c10.d().c(c10.f18999h.getValue()) - c11;
                float abs = Math.abs(c12);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float g10 = (c10.g() - c11) / c12;
                    if (g10 >= 1.0E-6f) {
                        if (g10 <= 0.999999f) {
                            f6 = g10;
                        }
                    }
                    return Float.valueOf(f6);
                }
                f6 = 1.0f;
                return Float.valueOf(f6);
            case 1:
                return c10.d();
            case 2:
                return new C3959i(c10.d(), c10.f18998g.getValue());
            case 3:
                Object value = c10.f19002k.getValue();
                if (value == null) {
                    float h10 = c10.f19000i.h();
                    boolean isNaN = Float.isNaN(h10);
                    C1724m0 c1724m0 = c10.f18997f;
                    if (!isNaN) {
                        Object value2 = c1724m0.getValue();
                        F1 d10 = c10.d();
                        float c13 = d10.c(value2);
                        int i11 = (c13 > h10 ? 1 : (c13 == h10 ? 0 : -1));
                        if (i11 != 0 && !Float.isNaN(c13) && (i11 >= 0 ? (b10 = d10.b(h10, false)) != null : (b10 = d10.b(h10, true)) != null)) {
                            value2 = b10;
                        }
                        return value2;
                    }
                    return c1724m0.getValue();
                }
                return value;
            default:
                Object value3 = c10.f19002k.getValue();
                if (value3 == null) {
                    float h11 = c10.f19000i.h();
                    boolean isNaN2 = Float.isNaN(h11);
                    C1724m0 c1724m02 = c10.f18997f;
                    if (!isNaN2) {
                        return c10.c(h11, 0.0f, c1724m02.getValue());
                    }
                    return c1724m02.getValue();
                }
                return value3;
        }
    }
}
