package p3;

import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: c  reason: collision with root package name */
    public boolean f42699c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42700d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f42701e;

    /* renamed from: a  reason: collision with root package name */
    public final s2.z f42697a = new s2.z(0);

    /* renamed from: f  reason: collision with root package name */
    public long f42702f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f42703g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f42704h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    public final s2.u f42698b = new s2.u();

    public static int b(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long c(s2.u uVar) {
        int i10 = uVar.f45194b;
        if (uVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        uVar.e(bArr, 0, 9);
        uVar.F(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) == 68) {
            byte b11 = bArr[2];
            if ((b11 & 4) == 4) {
                byte b12 = bArr[4];
                if ((b12 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j6 = b10;
                    long j10 = b11;
                    return ((j10 & 3) << 13) | ((j6 & 3) << 28) | (((56 & j6) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b12 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(L2.r rVar) {
        byte[] bArr = AbstractC5530A.f45136f;
        s2.u uVar = this.f42698b;
        uVar.getClass();
        uVar.D(bArr.length, bArr);
        this.f42699c = true;
        rVar.k();
    }
}
