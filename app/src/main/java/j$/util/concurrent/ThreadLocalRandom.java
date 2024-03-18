package j$.util.concurrent;

import j$.util.stream.AbstractC3855y0;
import j$.util.stream.C3806o0;
import j$.util.stream.F;
import j$.util.stream.IntStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a  reason: collision with root package name */
    long f35283a;

    /* renamed from: b  reason: collision with root package name */
    int f35284b;

    /* renamed from: c  reason: collision with root package name */
    boolean f35285c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f35279d = new ThreadLocal();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f35280e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal f35281f = new ThreadLocal();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLong f35282g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        if (((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j6 = seed[0] & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j6 = (j6 << 8) | (seed[i10] & 255);
            }
            f35282g.set(j6);
        }
    }

    private ThreadLocalRandom() {
        this.f35285c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i10) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f35281f.get()).f35284b = i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f35281f.get()).f35284b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f35281f.get();
        if (threadLocalRandom.f35284b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f35280e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f35282g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f35281f.get();
        threadLocalRandom.f35283a = h10;
        threadLocalRandom.f35284b = addAndGet;
    }

    private static int g(long j6) {
        long j10 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        return (int) (((j10 ^ (j10 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j6) {
        long j10 = (j6 ^ (j6 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f35283a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 < d11) {
            double d12 = ((d11 - d10) * nextLong) + d10;
            return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i10, int i11) {
        int i12;
        int g10 = g(i());
        if (i10 < i11) {
            int i13 = i11 - i10;
            int i14 = i13 - 1;
            if ((i13 & i14) == 0) {
                i12 = g10 & i14;
            } else if (i13 > 0) {
                int i15 = g10 >>> 1;
                while (true) {
                    int i16 = i15 + i14;
                    i12 = i15 % i13;
                    if (i16 - i12 >= 0) {
                        break;
                    }
                    i15 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g10 >= i10 && g10 < i11) {
                        return g10;
                    }
                    g10 = g(i());
                }
            }
            return i12 + i10;
        }
        return g10;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return F.h(AbstractC3855y0.i0(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return F.h(AbstractC3855y0.i0(new y(0L, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j6) {
        if (j6 >= 0) {
            return F.h(AbstractC3855y0.i0(new y(0L, j6, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j6, double d10, double d11) {
        if (j6 >= 0) {
            if (d10 >= d11) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return F.h(AbstractC3855y0.i0(new y(0L, j6, d10, d11)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j6, long j10) {
        long h10 = h(i());
        if (j6 < j10) {
            long j11 = j10 - j6;
            long j12 = j11 - 1;
            if ((j11 & j12) == 0) {
                return (h10 & j12) + j6;
            }
            if (j11 > 0) {
                while (true) {
                    long j13 = h10 >>> 1;
                    long j14 = j13 + j12;
                    long j15 = j13 % j11;
                    if (j14 - j15 >= 0) {
                        return j15 + j6;
                    }
                    h10 = h(i());
                }
            } else {
                while (true) {
                    if (h10 >= j6 && h10 < j10) {
                        return h10;
                    }
                    h10 = h(i());
                }
            }
        } else {
            return h10;
        }
    }

    final long i() {
        long j6 = this.f35283a - 7046029254386353131L;
        this.f35283a = j6;
        return j6;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC3855y0.u0(new z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return IntStream.Wrapper.convert(AbstractC3855y0.u0(new z(0L, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j6) {
        if (j6 >= 0) {
            return IntStream.Wrapper.convert(AbstractC3855y0.u0(new z(0L, j6, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j6, int i10, int i11) {
        if (j6 >= 0) {
            if (i10 >= i11) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return IntStream.Wrapper.convert(AbstractC3855y0.u0(new z(0L, j6, i10, i11)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C3806o0.h(AbstractC3855y0.w0(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j6) {
        if (j6 >= 0) {
            return C3806o0.h(AbstractC3855y0.w0(new A(0L, j6, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j6, long j10) {
        if (j6 < j10) {
            return C3806o0.h(AbstractC3855y0.w0(new A(0L, Long.MAX_VALUE, j6, j10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j6, long j10, long j11) {
        if (j6 >= 0) {
            if (j10 >= j11) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return C3806o0.h(AbstractC3855y0.w0(new A(0L, j6, j10, j11)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    protected final int next(int i10) {
        return nextInt() >>> (32 - i10);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f35279d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i10) {
        if (i10 > 0) {
            int g10 = g(i());
            int i11 = i10 - 1;
            if ((i10 & i11) == 0) {
                return g10 & i11;
            }
            while (true) {
                int i12 = g10 >>> 1;
                int i13 = i12 + i11;
                int i14 = i12 % i10;
                if (i13 - i14 >= 0) {
                    return i14;
                }
                g10 = g(i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public int nextInt(int i10, int i11) {
        if (i10 < i11) {
            return d(i10, i11);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public long nextLong(long j6, long j10) {
        if (j6 < j10) {
            return e(j6, j10);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final void setSeed(long j6) {
        if (!this.f35285c) {
            return;
        }
        throw new UnsupportedOperationException();
    }
}
