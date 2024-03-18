package ji;

import id.AbstractC3557B;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ji.M  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4124M {

    /* renamed from: d  reason: collision with root package name */
    public static final C4123L f36687d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f36688a;

    /* renamed from: b  reason: collision with root package name */
    public long f36689b;

    /* renamed from: c  reason: collision with root package name */
    public long f36690c;

    public C4124M a() {
        this.f36688a = false;
        return this;
    }

    public C4124M b() {
        this.f36690c = 0L;
        return this;
    }

    public long c() {
        if (this.f36688a) {
            return this.f36689b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public C4124M d(long j6) {
        this.f36688a = true;
        this.f36689b = j6;
        return this;
    }

    public boolean e() {
        return this.f36688a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f36688a && this.f36689b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public C4124M g(long j6, TimeUnit timeUnit) {
        AbstractC3557B.c0("unit", timeUnit);
        if (j6 >= 0) {
            this.f36690c = timeUnit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("timeout < 0: ", j6).toString());
    }

    public long h() {
        return this.f36690c;
    }
}
