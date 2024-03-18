package ji;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class w implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f36755Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f36756Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ReentrantLock f36757h0 = new ReentrantLock();

    /* renamed from: i0  reason: collision with root package name */
    public final RandomAccessFile f36758i0;

    public w(RandomAccessFile randomAccessFile) {
        this.f36758i0 = randomAccessFile;
    }

    /* renamed from: a */
    public final void close() {
        ReentrantLock reentrantLock = this.f36757h0;
        reentrantLock.lock();
        try {
            if (this.f36755Y) {
                return;
            }
            this.f36755Y = true;
            if (this.f36756Z != 0) {
                return;
            }
            synchronized (this) {
                this.f36758i0.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long h() {
        long length;
        ReentrantLock reentrantLock = this.f36757h0;
        reentrantLock.lock();
        try {
            if (!this.f36755Y) {
                synchronized (this) {
                    length = this.f36758i0.length();
                }
                return length;
            }
            throw new IllegalStateException("closed".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final C4139n i(long j6) {
        ReentrantLock reentrantLock = this.f36757h0;
        reentrantLock.lock();
        try {
            if (!this.f36755Y) {
                this.f36756Z++;
                reentrantLock.unlock();
                return new C4139n(this, j6);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
