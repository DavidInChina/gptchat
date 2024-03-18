package z;

/* renamed from: z.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6667I implements AbstractC6661F {

    /* renamed from: a  reason: collision with root package name */
    public final int f51149a;

    /* renamed from: b  reason: collision with root package name */
    public final int f51150b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6653B f51151c;

    public C6667I(int i10, int i11, AbstractC6653B abstractC6653B) {
        this.f51149a = i10;
        this.f51150b = i11;
        this.f51151c = abstractC6653B;
    }

    @Override // z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6654B0 mo121a(C6737z0 c6737z0) {
        return new C6658D0(this);
    }

    @Override // z.AbstractC6661F
    public final float b(long j6, float f6, float f10, float f11) {
        long q10 = com.google.android.gms.internal.play_billing.N.q((j6 / 1000000) - this.f51150b, 0L, this.f51149a);
        int i10 = (q10 > 0L ? 1 : (q10 == 0L ? 0 : -1));
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f11;
        }
        return (e(q10 * 1000000, f6, f10, f11) - e((q10 - 1) * 1000000, f6, f10, f11)) * 1000.0f;
    }

    @Override // z.AbstractC6661F
    public final long c(float f6, float f10, float f11) {
        return (this.f51150b + this.f51149a) * 1000000;
    }

    @Override // z.AbstractC6661F
    public final float d(float f6, float f10, float f11) {
        return b(c(f6, f10, f11), f6, f10, f11);
    }

    @Override // z.AbstractC6661F
    public final float e(long j6, float f6, float f10, float f11) {
        float f12;
        long j10 = (j6 / 1000000) - this.f51150b;
        int i10 = this.f51149a;
        long q10 = com.google.android.gms.internal.play_billing.N.q(j10, 0L, i10);
        if (i10 == 0) {
            f12 = 1.0f;
        } else {
            f12 = ((float) q10) / i10;
        }
        float a5 = this.f51151c.a(com.google.android.gms.internal.play_billing.N.o(f12, 0.0f, 1.0f));
        C6737z0 c6737z0 = AbstractC6652A0.f51116a;
        return (f10 * a5) + ((1 - a5) * f6);
    }
}
