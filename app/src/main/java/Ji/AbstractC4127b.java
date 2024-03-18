package ji;

import id.AbstractC3557B;

/* renamed from: ji.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4127b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4133h f36696a = new C4133h();

    public static final boolean a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        AbstractC3557B.c0("a", bArr);
        AbstractC3557B.c0("b", bArr2);
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j6, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j6 && j6 - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j10 + " byteCount=" + j11);
    }

    public static final int c(int i10, C4138m c4138m) {
        AbstractC3557B.c0("<this>", c4138m);
        if (i10 == -1234567890) {
            return c4138m.d();
        }
        return i10;
    }

    public static final int d(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }
}
