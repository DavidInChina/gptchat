package androidx.glance.appwidget.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* renamed from: androidx.glance.appwidget.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2048h extends C2050j {

    /* renamed from: j0  reason: collision with root package name */
    public final int f25220j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f25221k0;

    public C2048h(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2049i.r(i10, i10 + i11, bArr.length);
        this.f25220j0 = i10;
        this.f25221k0 = i11;
    }

    @Override // androidx.glance.appwidget.protobuf.C2050j, androidx.glance.appwidget.protobuf.AbstractC2049i
    public final byte I(int i10) {
        return this.f25226i0[this.f25220j0 + i10];
    }

    @Override // androidx.glance.appwidget.protobuf.C2050j
    public final int T() {
        return this.f25220j0;
    }

    @Override // androidx.glance.appwidget.protobuf.C2050j, androidx.glance.appwidget.protobuf.AbstractC2049i
    public final byte f(int i10) {
        int i11 = this.f25221k0;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(android.gov.nist.core.a.e("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC2469q0.i("Index > length: ", i10, ", ", i11));
        }
        return this.f25226i0[this.f25220j0 + i10];
    }

    @Override // androidx.glance.appwidget.protobuf.C2050j, androidx.glance.appwidget.protobuf.AbstractC2049i
    public final int size() {
        return this.f25221k0;
    }
}
