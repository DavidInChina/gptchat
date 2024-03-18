package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2024i extends C2026k {

    /* renamed from: j0  reason: collision with root package name */
    public final int f25057j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f25058k0;

    public C2024i(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2025j.r(i10, i10 + i11, bArr.length);
        this.f25057j0 = i10;
        this.f25058k0 = i11;
    }

    @Override // androidx.datastore.preferences.protobuf.C2026k, androidx.datastore.preferences.protobuf.AbstractC2025j
    public final byte I(int i10) {
        return this.f25069i0[this.f25057j0 + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2026k
    public final int T() {
        return this.f25057j0;
    }

    @Override // androidx.datastore.preferences.protobuf.C2026k, androidx.datastore.preferences.protobuf.AbstractC2025j
    public final byte f(int i10) {
        int i11 = this.f25058k0;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.gov.nist.core.a.e("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC2469q0.i("Index > length: ", i10, ", ", i11));
        }
        return this.f25069i0[this.f25057j0 + i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C2026k, androidx.datastore.preferences.protobuf.AbstractC2025j
    public final int size() {
        return this.f25058k0;
    }
}
