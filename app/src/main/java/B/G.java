package B;

import Z.C1724m0;
import jf.C3959i;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1077Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ H f1078Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h10, int i10) {
        super(0);
        this.f1077Y = i10;
        this.f1078Z = h10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10 = true;
        int i10 = this.f1077Y;
        float f6 = 0.0f;
        H h10 = this.f1078Z;
        switch (i10) {
            case 0:
                float c10 = h10.d().c(h10.f1085e.getValue());
                float c11 = h10.d().c(h10.f1087g.getValue()) - c10;
                float abs = Math.abs(c11);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    if (true ^ Float.isNaN(h10.e())) {
                        float e10 = (h10.e() - c10) / c11;
                        if (e10 >= 1.0E-6f) {
                            if (e10 <= 0.999999f) {
                                f6 = e10;
                            }
                        }
                        return Float.valueOf(f6);
                    }
                    throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
                }
                f6 = 1.0f;
                return Float.valueOf(f6);
            case 1:
                return h10.d();
            case 2:
                return new C3959i(h10.d(), h10.f1086f.getValue());
            case 3:
                Object value = h10.f1090j.getValue();
                if (value == null) {
                    float h11 = h10.f1088h.h();
                    boolean isNaN = Float.isNaN(h11);
                    C1724m0 c1724m0 = h10.f1085e;
                    if (!isNaN) {
                        Object value2 = c1724m0.getValue();
                        P0 d10 = h10.d();
                        float c12 = d10.c(value2);
                        if (c12 != h11 && !Float.isNaN(c12)) {
                            if (h11 - c12 <= 0.0f) {
                                z10 = false;
                            }
                            Object b10 = d10.b(h11, z10);
                            if (b10 != null) {
                                value2 = b10;
                            }
                        }
                        return value2;
                    }
                    return c1724m0.getValue();
                }
                return value;
            default:
                Object value3 = h10.f1090j.getValue();
                if (value3 == null) {
                    float h12 = h10.f1088h.h();
                    boolean isNaN2 = Float.isNaN(h12);
                    C1724m0 c1724m02 = h10.f1085e;
                    if (!isNaN2) {
                        return h10.c(h12, 0.0f, c1724m02.getValue());
                    }
                    return c1724m02.getValue();
                }
                return value3;
        }
    }
}
