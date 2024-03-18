package z;

import nf.AbstractC4829i;

/* renamed from: z.l */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6708l {

    /* renamed from: a */
    public static final /* synthetic */ int[] f51312a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static boolean a(AbstractC6706k abstractC6706k, long j6) {
        if (j6 >= abstractC6706k.b()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int b(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            return i10 - i11;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i10, int i11) {
        if (i10 != 0) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static int d(int i10, int i11, int i12) {
        return (f(i10) + i11) * i12;
    }

    public static /* synthetic */ void e(AbstractC4829i abstractC4829i) {
        if (abstractC4829i == null) {
            return;
        }
        throw new ClassCastException();
    }

    public static /* synthetic */ int f(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "Finished";
        }
        return "BoundReached";
    }

    public static /* synthetic */ int[] h(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f51312a, 0, iArr, 0, i10);
        return iArr;
    }
}
