package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2471s {

    /* renamed from: Y  reason: collision with root package name */
    public static final char[] f26969Y = "0123456789abcdef".toCharArray();

    public abstract int a();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof AbstractC2471s) {
            AbstractC2471s abstractC2471s = (AbstractC2471s) obj;
            byte[] bArr = ((r) this).f26956Z;
            if (bArr.length * 8 == ((r) abstractC2471s).f26956Z.length * 8) {
                byte[] bArr2 = ((r) abstractC2471s).f26956Z;
                if (bArr.length == bArr2.length) {
                    boolean z11 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        if (bArr[i10] == bArr2[i10]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                    if (z11) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((r) this).f26956Z;
        if (bArr.length * 8 >= 32) {
            return a();
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 |= (bArr[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] bArr = ((r) this).f26956Z;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f26969Y;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
