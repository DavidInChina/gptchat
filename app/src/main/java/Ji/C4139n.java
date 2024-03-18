package ji;

import id.AbstractC3557B;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ji.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4139n implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final w f36726Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f36727Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f36728h0;

    public C4139n(w wVar, long j6) {
        AbstractC3557B.c0("fileHandle", wVar);
        this.f36726Y = wVar;
        this.f36727Z = j6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36728h0) {
            return;
        }
        this.f36728h0 = true;
        w wVar = this.f36726Y;
        ReentrantLock reentrantLock = wVar.f36757h0;
        reentrantLock.lock();
        try {
            int i10 = wVar.f36756Z - 1;
            wVar.f36756Z = i10;
            if (i10 == 0) {
                if (wVar.f36755Y) {
                    synchronized (wVar) {
                        wVar.f36758i0.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return C4124M.f36687d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
        r8 = r8 - r16;
        r2 = -1;
     */
    @Override // ji.AbstractC4122K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g0(C4135j c4135j, long j6) {
        long j10;
        long j11;
        long j12;
        int i10;
        AbstractC3557B.c0("sink", c4135j);
        int i11 = 1;
        if (!this.f36728h0) {
            w wVar = this.f36726Y;
            long j13 = this.f36727Z;
            wVar.getClass();
            if (j6 >= 0) {
                long j14 = j6 + j13;
                long j15 = j13;
                while (true) {
                    if (j15 < j14) {
                        C4117F d02 = c4135j.d0(i11);
                        byte[] bArr = d02.f36674a;
                        int i12 = d02.f36676c;
                        j10 = j13;
                        int min = (int) Math.min(j14 - j15, 8192 - i12);
                        synchronized (wVar) {
                            AbstractC3557B.c0("array", bArr);
                            wVar.f36758i0.seek(j15);
                            i10 = 0;
                            while (true) {
                                if (i10 >= min) {
                                    break;
                                }
                                int read = wVar.f36758i0.read(bArr, i12, min - i10);
                                if (read == -1) {
                                    if (i10 == 0) {
                                        i10 = -1;
                                    }
                                } else {
                                    i10 += read;
                                }
                            }
                        }
                        if (i10 == -1) {
                            if (d02.f36675b == d02.f36676c) {
                                c4135j.f36720Y = d02.a();
                                AbstractC4118G.a(d02);
                            }
                            if (j10 == j15) {
                                j12 = -1;
                                j11 = -1;
                            }
                        } else {
                            d02.f36676c += i10;
                            long j16 = i10;
                            j15 += j16;
                            c4135j.f36721Z += j16;
                            j13 = j10;
                            i11 = 1;
                        }
                    } else {
                        j10 = j13;
                        break;
                    }
                }
                if (j11 != j12) {
                    this.f36727Z += j11;
                }
                return j11;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
        }
        throw new IllegalStateException("closed".toString());
    }
}
