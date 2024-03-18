package Yg;

import ah.AbstractC1998i;

@AbstractC1998i(with = Zg.c.class)
/* loaded from: classes.dex */
public abstract class l {
    public static final c Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public static final g f22413a = new g(1);

    /* renamed from: b  reason: collision with root package name */
    public static final i f22414b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Yg.c] */
    static {
        new k(1L).b(1000).b(1000).b(1000).b(60).b(60);
        long j6 = 1 * 7;
        int i10 = (int) j6;
        if (j6 == i10) {
            new g(i10);
            new i(1);
            long j10 = 1 * 3;
            int i11 = (int) j10;
            if (j10 == i11) {
                new i(i11);
                long j11 = 1 * 12;
                int i12 = (int) j11;
                if (j11 == i12) {
                    f22414b = new i(i12);
                    long j12 = i12 * 100;
                    int i13 = (int) j12;
                    if (j12 == i13) {
                        new i(i13);
                        return;
                    }
                    throw new ArithmeticException();
                }
                throw new ArithmeticException();
            }
            throw new ArithmeticException();
        }
        throw new ArithmeticException();
    }

    public static String a(int i10, String str) {
        if (i10 != 1) {
            return i10 + '-' + str;
        }
        return str;
    }
}
