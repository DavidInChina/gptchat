package c3;

import L2.r;

/* renamed from: c3.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2285e {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f26232d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f26233a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f26234b;

    /* renamed from: c  reason: collision with root package name */
    public int f26235c;

    public static long a(byte[] bArr, boolean z10, int i10) {
        long j6 = bArr[0] & 255;
        if (z10) {
            j6 &= ~f26232d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j6 = (j6 << 8) | (bArr[i11] & 255);
        }
        return j6;
    }

    public static int b(int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            if ((f26232d[i11] & i10) != 0) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public final long c(r rVar, boolean z10, boolean z11, int i10) {
        int i11 = this.f26234b;
        byte[] bArr = this.f26233a;
        if (i11 == 0) {
            if (!rVar.b(bArr, 0, 1, z10)) {
                return -1L;
            }
            int b10 = b(bArr[0] & 255);
            this.f26235c = b10;
            if (b10 != -1) {
                this.f26234b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i12 = this.f26235c;
        if (i12 > i10) {
            this.f26234b = 0;
            return -2L;
        }
        if (i12 != 1) {
            rVar.readFully(bArr, 1, i12 - 1);
        }
        this.f26234b = 0;
        return a(bArr, z11, this.f26235c);
    }
}
