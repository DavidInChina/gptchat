package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class H0 extends I0 {
    @Override // com.google.android.gms.internal.play_billing.I0
    public final double a(long j6, Object obj) {
        return Double.longBitsToDouble(this.f26850a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final float b(long j6, Object obj) {
        return Float.intBitsToFloat(this.f26850a.getInt(obj, j6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.I0
    public final void c(Object obj, long j6, boolean z10) {
        if (J0.f26859g) {
            J0.b(obj, j6, z10);
        } else {
            J0.c(obj, j6, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final void d(Object obj, long j6, byte b10) {
        if (J0.f26859g) {
            J0.b(obj, j6, b10);
        } else {
            J0.c(obj, j6, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final void e(Object obj, long j6, double d10) {
        this.f26850a.putLong(obj, j6, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final void f(Object obj, long j6, float f6) {
        this.f26850a.putInt(obj, j6, Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.play_billing.I0
    public final boolean g(long j6, Object obj) {
        if (J0.f26859g) {
            return J0.q(j6, obj);
        }
        return J0.r(j6, obj);
    }
}
