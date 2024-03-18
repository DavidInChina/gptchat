package z4;

import Z.C1724m0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import v4.C5971a;
import wf.AbstractC6216a;

/* renamed from: z4.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6768g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51617Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6770i f51618Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6768g(C6770i c6770i, int i10) {
        super(0);
        this.f51617Y = i10;
        this.f51618Z = c6770i;
    }

    public final Float a() {
        float f6;
        int i10 = this.f51617Y;
        C6770i c6770i = this.f51618Z;
        switch (i10) {
            case 0:
                float f10 = 0.0f;
                if (((C5971a) c6770i.f51632n0.getValue()) != null) {
                    int i11 = (((Number) c6770i.f51629k0.getValue()).floatValue() > 0.0f ? 1 : (((Number) c6770i.f51629k0.getValue()).floatValue() == 0.0f ? 0 : -1));
                    C1724m0 c1724m0 = c6770i.f51628j0;
                    if (i11 < 0) {
                        AbstractC2469q0.p(c1724m0.getValue());
                    } else {
                        AbstractC2469q0.p(c1724m0.getValue());
                        f10 = 1.0f;
                    }
                }
                return Float.valueOf(f10);
            default:
                boolean booleanValue = ((Boolean) c6770i.f51627i0.getValue()).booleanValue();
                C1724m0 c1724m02 = c6770i.f51629k0;
                if (booleanValue && c6770i.f() % 2 == 0) {
                    f6 = -((Number) c1724m02.getValue()).floatValue();
                } else {
                    f6 = ((Number) c1724m02.getValue()).floatValue();
                }
                return Float.valueOf(f6);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10;
        switch (this.f51617Y) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                C6770i c6770i = this.f51618Z;
                if (c6770i.f() == ((Number) c6770i.f51626h0.getValue()).intValue() && ((Number) c6770i.f51634p0.getValue()).floatValue() == c6770i.e()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
