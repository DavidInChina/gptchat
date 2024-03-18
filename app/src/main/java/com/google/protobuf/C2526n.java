package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: com.google.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2526n extends C2532p {

    /* renamed from: j0  reason: collision with root package name */
    public final int f27570j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f27571k0;

    public C2526n(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2534q.r(i10, i10 + i11, bArr.length);
        this.f27570j0 = i10;
        this.f27571k0 = i11;
    }

    @Override // com.google.protobuf.C2532p, com.google.protobuf.AbstractC2534q
    public final void I(int i10, byte[] bArr) {
        System.arraycopy(this.f27575i0, this.f27570j0, bArr, 0, i10);
    }

    @Override // com.google.protobuf.C2532p, com.google.protobuf.AbstractC2534q
    public final byte M(int i10) {
        return this.f27575i0[this.f27570j0 + i10];
    }

    @Override // com.google.protobuf.C2532p, com.google.protobuf.AbstractC2534q
    public final byte f(int i10) {
        int i11 = this.f27571k0;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.gov.nist.core.a.e("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC2469q0.i("Index > length: ", i10, ", ", i11));
        }
        return this.f27575i0[this.f27570j0 + i10];
    }

    @Override // com.google.protobuf.C2532p, com.google.protobuf.AbstractC2534q
    public final int size() {
        return this.f27571k0;
    }

    @Override // com.google.protobuf.C2532p
    public final int u0() {
        return this.f27570j0;
    }
}
