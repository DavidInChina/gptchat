package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class G implements W {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 < i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                int i13 = bArr[i10];
                if (i13 < 0) {
                    if (i13 < -32) {
                        if (i12 < i11) {
                            if (i13 >= -62) {
                                i10 += 2;
                                if (bArr[i12] > -65) {
                                }
                            }
                            return false;
                        } else if (i13 != 0) {
                            return false;
                        }
                    } else if (i13 < -16) {
                        if (i12 >= i11 - 1) {
                            i13 = L0.a(bArr, i12, i11);
                            if (i13 != 0) {
                            }
                        } else {
                            int i14 = i10 + 2;
                            char c10 = bArr[i12];
                            if (c10 <= -65 && ((i13 != -32 || c10 >= -96) && (i13 != -19 || c10 < -96))) {
                                i10 += 3;
                                if (bArr[i14] > -65) {
                                }
                            }
                            return false;
                        }
                    } else if (i12 >= i11 - 2) {
                        i13 = L0.a(bArr, i12, i11);
                        if (i13 != 0) {
                        }
                    } else {
                        int i15 = i10 + 2;
                        int i16 = bArr[i12];
                        if (i16 <= -65) {
                            if ((((i16 + 112) + (i13 << 28)) >> 30) == 0) {
                                int i17 = i10 + 3;
                                if (bArr[i15] <= -65) {
                                    i10 += 4;
                                    if (bArr[i17] > -65) {
                                    }
                                }
                            }
                        }
                        return false;
                    }
                } else {
                    i10 = i12;
                }
            }
        }
        return true;
    }
}
