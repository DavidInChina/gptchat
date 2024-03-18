package Ji;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import li.AbstractC4499c;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f9309a;

    static {
        Throwable e10;
        Unsafe unsafe = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            e10 = null;
            unsafe = obj;
        } catch (ClassNotFoundException e11) {
            e10 = e11;
        } catch (IllegalAccessException e12) {
            e10 = e12;
        } catch (IllegalArgumentException e13) {
            e10 = e13;
        } catch (NoSuchFieldException e14) {
            e10 = e14;
        } catch (SecurityException e15) {
            e10 = e15;
        }
        Unsafe unsafe2 = unsafe;
        f9309a = unsafe2;
        if (unsafe2 != null) {
            return;
        }
        throw new Error("Could not obtain access to sun.misc.Unsafe", e10);
    }

    public static void a(long j6, long j10, long j11, d dVar, d dVar2) {
        long j12;
        if (j6 >= 0 && j6 < dVar.f9301Z) {
            if (j10 >= 0 && j10 < dVar2.f9301Z) {
                if (j11 >= 0) {
                    if (!dVar2.f9303i0) {
                        int e10 = (int) AbstractC4499c.e(j11, c.f9290c);
                        if (e10 >= 2 && j11 >= c.f9291d) {
                            long j13 = j11 / e10;
                            Future[] futureArr = new Future[e10];
                            int i10 = 0;
                            while (i10 < e10) {
                                long j14 = i10 * j13;
                                if (i10 == e10 - 1) {
                                    j12 = j11;
                                } else {
                                    j12 = j14 + j13;
                                }
                                Future[] futureArr2 = futureArr;
                                int i11 = i10;
                                futureArr2[i11] = c.c(new Bi.b(j14, j12, dVar2, j10, dVar, j6, 2));
                                i10 = i11 + 1;
                                futureArr = futureArr2;
                                e10 = e10;
                            }
                            try {
                                c.d(futureArr);
                                return;
                            } catch (InterruptedException unused) {
                                long j15 = j6;
                                long j16 = j10;
                                while (j15 < j6 + j11) {
                                    dVar2.c(dVar.b(j15), j16);
                                    j15++;
                                    j16++;
                                }
                                return;
                            } catch (ExecutionException unused2) {
                                long j17 = j6;
                                long j18 = j10;
                                while (j17 < j6 + j11) {
                                    dVar2.c(dVar.b(j17), j18);
                                    j17++;
                                    j18++;
                                }
                                return;
                            }
                        }
                        long j19 = j6;
                        long j20 = j10;
                        while (j19 < j6 + j11) {
                            dVar2.c(dVar.b(j19), j20);
                            j19++;
                            j20++;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Constant arrays cannot be modified.");
                }
                throw new IllegalArgumentException("length < 0");
            }
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
    }
}
