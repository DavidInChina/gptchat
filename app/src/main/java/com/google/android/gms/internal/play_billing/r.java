package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r extends AbstractC2471s implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public final byte[] f26956Z;

    public r(byte[] bArr) {
        bArr.getClass();
        this.f26956Z = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2471s
    public final int a() {
        byte[] bArr = this.f26956Z;
        int length = bArr.length;
        if (length >= 4) {
            return ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        }
        throw new IllegalStateException(r9.y.i1("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }
}
