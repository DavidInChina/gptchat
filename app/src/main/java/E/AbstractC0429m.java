package E;

import l8.AbstractC4344b;

/* renamed from: E.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0429m {

    /* renamed from: a  reason: collision with root package name */
    public static final C0421f f3907a = new C0421f(7);

    /* renamed from: b  reason: collision with root package name */
    public static final C0421f f3908b = new C0421f(6);

    /* renamed from: c  reason: collision with root package name */
    public static final C0423g f3909c = new C0423g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final C0423g f3910d = new C0423g(0);

    /* renamed from: e  reason: collision with root package name */
    public static final C0424h f3911e = new C0424h(0);

    /* renamed from: f  reason: collision with root package name */
    public static final C0424h f3912f = new C0424h(2);

    /* renamed from: g  reason: collision with root package name */
    public static final C0424h f3913g = new C0424h(1);

    static {
        new C0424h(3);
    }

    public static void a(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f6 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = AbstractC4344b.Y0(f6);
                f6 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = AbstractC4344b.Y0(f6);
                f6 += i16;
            } else {
                return;
            }
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = i10;
                i10 += i14;
            } else {
                return;
            }
        }
    }

    public static void c(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = i14;
                i14 += i17;
            } else {
                return;
            }
        }
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        boolean z11;
        float f6;
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            f6 = (i10 - i12) / iArr.length;
        } else {
            f6 = 0.0f;
        }
        float f10 = f6 / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = AbstractC4344b.Y0(f10);
                f10 += i15 + f6;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            iArr2[length2] = AbstractC4344b.Y0(f10);
            f10 += i16 + f6;
        }
    }

    public static void e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        float f6;
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float max = (i10 - i12) / Math.max(iArr.length - 1, 1);
        if (z10 && iArr.length == 1) {
            f6 = max;
        } else {
            f6 = 0.0f;
        }
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = AbstractC4344b.Y0(f6);
                f6 += i15 + max;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            iArr2[length2] = AbstractC4344b.Y0(f6);
            f6 += i16 + max;
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (!z10) {
            int length2 = iArr.length;
            float f6 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = AbstractC4344b.Y0(f6);
                f6 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        float f10 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = AbstractC4344b.Y0(f10);
            f10 += i16 + length;
        }
    }

    public static C0426j g(float f6) {
        return new C0426j(f6, true, C0428l.f3883Z);
    }
}
