package z4;

import A.F0;
import Z.C1724m0;
import Z.I;
import Z.o1;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.UtilsKt;
import nf.AbstractC4828h;
import v4.C5971a;

/* renamed from: z4.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6770i implements AbstractC6763b {

    /* renamed from: Y  reason: collision with root package name */
    public final C1724m0 f51624Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1724m0 f51625Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C1724m0 f51626h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C1724m0 f51627i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1724m0 f51628j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1724m0 f51629k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1724m0 f51630l0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1724m0 f51632n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1724m0 f51633o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C1724m0 f51634p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C1724m0 f51635q0;

    /* renamed from: m0  reason: collision with root package name */
    public final I f51631m0 = AbstractC4828h.E(new C6768g(this, 1));

    /* renamed from: r0  reason: collision with root package name */
    public final I f51636r0 = AbstractC4828h.E(new C6768g(this, 0));

    /* renamed from: s0  reason: collision with root package name */
    public final F0 f51637s0 = new F0();

    public C6770i() {
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f51624Y = AbstractC4828h.Z(bool, o1Var);
        this.f51625Z = AbstractC4828h.Z(1, o1Var);
        this.f51626h0 = AbstractC4828h.Z(1, o1Var);
        this.f51627i0 = AbstractC4828h.Z(bool, o1Var);
        this.f51628j0 = AbstractC4828h.Z(null, o1Var);
        this.f51629k0 = AbstractC4828h.Z(Float.valueOf(1.0f), o1Var);
        this.f51630l0 = AbstractC4828h.Z(bool, o1Var);
        this.f51632n0 = AbstractC4828h.Z(null, o1Var);
        Float valueOf = Float.valueOf(0.0f);
        this.f51633o0 = AbstractC4828h.Z(valueOf, o1Var);
        this.f51634p0 = AbstractC4828h.Z(valueOf, o1Var);
        this.f51635q0 = AbstractC4828h.Z(Long.MIN_VALUE, o1Var);
        AbstractC4828h.E(new C6768g(this, 2));
    }

    public static final boolean b(C6770i c6770i, int i10, long j6) {
        long j10;
        float f6;
        float f10;
        C5971a c5971a = (C5971a) c6770i.f51632n0.getValue();
        if (c5971a == null) {
            return true;
        }
        C1724m0 c1724m0 = c6770i.f51635q0;
        if (((Number) c1724m0.getValue()).longValue() == Long.MIN_VALUE) {
            j10 = 0;
        } else {
            j10 = j6 - ((Number) c1724m0.getValue()).longValue();
        }
        c1724m0.setValue(Long.valueOf(j6));
        C1724m0 c1724m02 = c6770i.f51628j0;
        AbstractC2469q0.p(c1724m02.getValue());
        AbstractC2469q0.p(c1724m02.getValue());
        float b10 = ((float) (j10 / ((long) UtilsKt.MICROS_MULTIPLIER))) / c5971a.b();
        I i11 = c6770i.f51631m0;
        float floatValue = ((Number) i11.getValue()).floatValue() * b10;
        int i12 = (((Number) i11.getValue()).floatValue() > 0.0f ? 1 : (((Number) i11.getValue()).floatValue() == 0.0f ? 0 : -1));
        C1724m0 c1724m03 = c6770i.f51633o0;
        if (i12 < 0) {
            f6 = 0.0f - (((Number) c1724m03.getValue()).floatValue() + floatValue);
        } else {
            f6 = (((Number) c1724m03.getValue()).floatValue() + floatValue) - 1.0f;
        }
        if (f6 < 0.0f) {
            c6770i.h(N.o(((Number) c1724m03.getValue()).floatValue(), 0.0f, 1.0f) + floatValue);
            return true;
        }
        int i13 = (int) (f6 / 1.0f);
        int i14 = i13 + 1;
        if (c6770i.f() + i14 > i10) {
            c6770i.h(c6770i.e());
            c6770i.g(i10);
            return false;
        }
        c6770i.g(c6770i.f() + i14);
        float f11 = f6 - (i13 * 1.0f);
        if (((Number) i11.getValue()).floatValue() < 0.0f) {
            f10 = 1.0f - f11;
        } else {
            f10 = 0.0f + f11;
        }
        c6770i.h(f10);
        return true;
    }

    public static final void d(C6770i c6770i, boolean z10) {
        c6770i.f51624Y.setValue(Boolean.valueOf(z10));
    }

    public final float e() {
        return ((Number) this.f51636r0.getValue()).floatValue();
    }

    public final int f() {
        return ((Number) this.f51625Z.getValue()).intValue();
    }

    public final void g(int i10) {
        this.f51625Z.setValue(Integer.valueOf(i10));
    }

    @Override // Z.l1
    public final Object getValue() {
        return Float.valueOf(((Number) this.f51634p0.getValue()).floatValue());
    }

    public final void h(float f6) {
        C5971a c5971a;
        this.f51633o0.setValue(Float.valueOf(f6));
        if (((Boolean) this.f51630l0.getValue()).booleanValue() && (c5971a = (C5971a) this.f51632n0.getValue()) != null) {
            f6 -= f6 % (1 / c5971a.f47161n);
        }
        this.f51634p0.setValue(Float.valueOf(f6));
    }
}
