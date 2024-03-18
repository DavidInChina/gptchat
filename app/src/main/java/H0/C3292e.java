package h0;

/* renamed from: h0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3292e {

    /* renamed from: a  reason: collision with root package name */
    public final int f31685a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f31686b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f31687c;

    public C3292e(int i10, long[] jArr, Object[] objArr) {
        this.f31685a = i10;
        this.f31686b = jArr;
        this.f31687c = objArr;
    }

    public final int a(long j6) {
        int i10 = this.f31685a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f31686b;
        int i11 = 0;
        if (i10 != 0) {
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                int i13 = ((jArr[i12] - j6) > 0L ? 1 : ((jArr[i12] - j6) == 0L ? 0 : -1));
                if (i13 < 0) {
                    i11 = i12 + 1;
                } else if (i13 > 0) {
                    i10 = i12 - 1;
                } else {
                    return i12;
                }
            }
            return -(i11 + 1);
        }
        long j10 = jArr[0];
        if (j10 == j6) {
            return 0;
        }
        if (j10 <= j6) {
            return -1;
        }
        return -2;
    }

    public final C3292e b(long j6, Object obj) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f31687c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f31686b;
                i10 = this.f31685a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j10 = jArr[i14];
                Object obj3 = objArr[i14];
                if (j10 > j6) {
                    jArr2[i11] = j6;
                    objArr2[i11] = obj;
                    i11++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj3;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = j6;
                objArr2[i12] = obj;
            } else {
                while (i11 < i13) {
                    long j11 = jArr[i14];
                    Object obj4 = objArr[i14];
                    if (obj4 != null) {
                        jArr2[i11] = j11;
                        objArr2[i11] = obj4;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = j6;
            objArr2[0] = obj;
        }
        return new C3292e(i13, jArr2, objArr2);
    }
}
