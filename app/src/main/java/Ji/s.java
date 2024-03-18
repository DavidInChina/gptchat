package Ji;

import K4.J;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import li.AbstractC4499c;
import sun.misc.Cleaner;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class s extends g {

    /* renamed from: k0  reason: collision with root package name */
    public long[] f9310k0;

    public s(long j6, boolean z10) {
        this.f9300Y = q.f9305Y;
        this.f9302h0 = 8L;
        if (j6 > 0) {
            this.f9301Z = j6;
            if (j6 > 1073741824) {
                this.f9304j0 = r.f9309a.allocateMemory(8 * j6);
                if (z10) {
                    a(j6);
                }
                Cleaner.create(this, new f(this.f9304j0, this.f9301Z, this.f9302h0));
                J.G(this.f9301Z * this.f9302h0);
                return;
            }
            this.f9310k0 = new long[(int) j6];
            return;
        }
        throw new IllegalArgumentException(j6 + " is not a positive long value");
    }

    public final long b(long j6) {
        long j10 = this.f9304j0;
        if (j10 != 0) {
            return r.f9309a.getLong((this.f9302h0 * j6) + j10);
        }
        boolean z10 = this.f9303i0;
        long[] jArr = this.f9310k0;
        if (z10) {
            return jArr[0];
        }
        return jArr[(int) j6];
    }

    public final void c(long j6, long j10) {
        long j11 = this.f9304j0;
        if (j11 != 0) {
            r.f9309a.putLong((this.f9302h0 * j6) + j11, j10);
        } else if (!this.f9303i0) {
            this.f9310k0[(int) j6] = j10;
        } else {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [Ji.s, java.lang.Object, Ji.g] */
    public final Object clone() {
        long j6;
        if (this.f9303i0) {
            long j10 = this.f9301Z;
            long b10 = b(0L);
            ?? gVar = new g();
            gVar.f9300Y = q.f9307h0;
            gVar.f9302h0 = 8L;
            if (j10 > 0) {
                gVar.f9301Z = j10;
                gVar.f9303i0 = true;
                gVar.f9310k0 = new long[]{b10};
                return gVar;
            }
            throw new IllegalArgumentException(j10 + " is not a positive long value");
        }
        s sVar = new s(this.f9301Z, false);
        long j11 = this.f9301Z;
        Unsafe unsafe = r.f9309a;
        if (0 < j11) {
            if (0 < sVar.f9301Z) {
                if (j11 >= 0) {
                    if (!sVar.f9303i0) {
                        int e10 = (int) AbstractC4499c.e(j11, c.f9290c);
                        if (e10 >= 2 && j11 >= c.f9291d) {
                            long j12 = j11 / e10;
                            Future[] futureArr = new Future[e10];
                            int i10 = 0;
                            while (i10 < e10) {
                                long j13 = i10 * j12;
                                if (i10 == e10 - 1) {
                                    j6 = j11;
                                } else {
                                    j6 = j13 + j12;
                                }
                                int i11 = i10;
                                Future[] futureArr2 = futureArr;
                                futureArr2[i11] = c.c(new Bi.b(j13, j6, sVar, 0L, this, 0L, 3));
                                i10 = i11 + 1;
                                futureArr = futureArr2;
                                j11 = j11;
                                e10 = e10;
                            }
                            long j14 = j11;
                            try {
                                c.d(futureArr);
                            } catch (InterruptedException unused) {
                                long j15 = 0;
                                long j16 = 0;
                                while (j15 < j14) {
                                    sVar.c(j16, b(j15));
                                    j15++;
                                    j16++;
                                }
                            } catch (ExecutionException unused2) {
                                long j17 = 0;
                                long j18 = 0;
                                while (j17 < j14) {
                                    sVar.c(j18, b(j17));
                                    j17++;
                                    j18++;
                                }
                            }
                        } else {
                            long j19 = 0;
                            long j20 = 0;
                            while (j19 < j11) {
                                sVar.c(j20, b(j19));
                                j19++;
                                j20++;
                            }
                        }
                        return sVar;
                    }
                    throw new IllegalArgumentException("Constant arrays cannot be modified.");
                }
                throw new IllegalArgumentException("length < 0");
            }
            throw new ArrayIndexOutOfBoundsException("destPos < 0 || destPos >= dest.length()");
        }
        throw new ArrayIndexOutOfBoundsException("srcPos < 0 || srcPos >= src.length()");
    }

    @Override // Ji.g
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || this.f9310k0 != ((s) obj).f9310k0) {
            return false;
        }
        return true;
    }

    @Override // Ji.g
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 29;
        long[] jArr = this.f9310k0;
        if (jArr != null) {
            i10 = jArr.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
