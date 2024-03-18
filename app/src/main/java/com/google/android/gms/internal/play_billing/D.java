package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: i0  reason: collision with root package name */
    public final int f26838i0;

    public D(byte[] bArr, int i10) {
        super(bArr);
        E.M(0, i10, bArr.length);
        this.f26838i0 = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.F, com.google.android.gms.internal.play_billing.E
    public final int I() {
        return this.f26838i0;
    }

    @Override // com.google.android.gms.internal.play_billing.F, com.google.android.gms.internal.play_billing.E
    public final byte s(int i10) {
        int i11 = this.f26838i0;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.gov.nist.core.a.e("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC2469q0.i("Index > length: ", i10, ", ", i11));
        }
        return this.f26842h0[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.F, com.google.android.gms.internal.play_billing.E
    public final byte y(int i10) {
        return this.f26842h0[i10];
    }
}
