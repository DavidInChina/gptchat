package x;

import id.AbstractC3557B;

/* renamed from: x.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6262a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f48621a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f48622b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f48623c = new Object[0];

    public static final int a(int i10, int i11, int[] iArr) {
        AbstractC3557B.c0("array", iArr);
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j6) {
        AbstractC3557B.c0("array", jArr);
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j6 ? 1 : (jArr[i13] == j6 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 > 0) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }
}
