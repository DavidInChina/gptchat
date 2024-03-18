package ji;

import fi.C3100a;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ji.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4131f extends C4124M {

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantLock f36703h;

    /* renamed from: i  reason: collision with root package name */
    public static final Condition f36704i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f36705j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f36706k;

    /* renamed from: l  reason: collision with root package name */
    public static C4131f f36707l;

    /* renamed from: e  reason: collision with root package name */
    public int f36708e;

    /* renamed from: f  reason: collision with root package name */
    public C4131f f36709f;

    /* renamed from: g  reason: collision with root package name */
    public long f36710g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f36703h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC3557B.b0("newCondition(...)", newCondition);
        f36704i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f36705j = millis;
        f36706k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        long j6 = this.f36690c;
        boolean z10 = this.f36688a;
        if (j6 == 0 && !z10) {
            return;
        }
        ReentrantLock reentrantLock = f36703h;
        reentrantLock.lock();
        try {
            if (this.f36708e == 0) {
                this.f36708e = 1;
                C3100a.c(this, j6, z10);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = f36703h;
        reentrantLock.lock();
        try {
            int i10 = this.f36708e;
            boolean z10 = false;
            this.f36708e = 0;
            if (i10 == 1) {
                C4131f c4131f = f36707l;
                while (c4131f != null) {
                    C4131f c4131f2 = c4131f.f36709f;
                    if (c4131f2 == this) {
                        c4131f.f36709f = this.f36709f;
                        this.f36709f = null;
                        return false;
                    }
                    c4131f = c4131f2;
                }
                throw new IllegalStateException("node was not found in the queue".toString());
            }
            if (i10 == 2) {
                z10 = true;
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
