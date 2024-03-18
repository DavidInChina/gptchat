package e1;

import android.gov.nist.core.Separators;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.AbstractC4694e;

/* renamed from: e1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2767g implements A8.a {

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean f28735i0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j0  reason: collision with root package name */
    public static final Logger f28736j0 = Logger.getLogger(AbstractC2767g.class.getName());

    /* renamed from: k0  reason: collision with root package name */
    public static final AbstractC4694e f28737k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final Object f28738l0;

    /* renamed from: Y  reason: collision with root package name */
    public volatile Object f28739Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile C2764d f28740Z;

    /* renamed from: h0  reason: collision with root package name */
    public volatile C2766f f28741h0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C2765e c2765e;
        Throwable th2;
        try {
            th2 = null;
            c2765e = new C2765e(AtomicReferenceFieldUpdater.newUpdater(C2766f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2766f.class, C2766f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2767g.class, C2766f.class, "h0"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2767g.class, C2764d.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2767g.class, Object.class, "Y"));
        } catch (Throwable th3) {
            th2 = th3;
            c2765e = new Object();
        }
        f28737k0 = c2765e;
        if (th2 != null) {
            f28736j0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
        f28738l0 = new Object();
    }

    public static void c(AbstractC2767g abstractC2767g) {
        C2766f c2766f;
        C2764d c2764d;
        C2764d c2764d2;
        C2764d c2764d3;
        do {
            c2766f = abstractC2767g.f28741h0;
        } while (!f28737k0.j(abstractC2767g, c2766f, C2766f.f28732c));
        while (true) {
            c2764d = null;
            if (c2766f != null) {
                Thread thread = c2766f.f28733a;
                if (thread != null) {
                    c2766f.f28733a = null;
                    LockSupport.unpark(thread);
                }
                c2766f = c2766f.f28734b;
            }
        }
        do {
            c2764d2 = abstractC2767g.f28740Z;
        } while (!f28737k0.g(abstractC2767g, c2764d2, C2764d.f28723d));
        while (true) {
            c2764d3 = c2764d;
            c2764d = c2764d2;
            if (c2764d != null) {
                c2764d2 = c2764d.f28726c;
                c2764d.f28726c = c2764d3;
            }
        }
        while (c2764d3 != null) {
            C2764d c2764d4 = c2764d3.f28726c;
            d(c2764d3.f28724a, c2764d3.f28725b);
            c2764d3 = c2764d4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f28736j0.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof C2761a)) {
            if (!(obj instanceof AbstractC2763c)) {
                if (obj == f28738l0) {
                    return null;
                }
                return obj;
            }
            ((AbstractC2763c) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        Throwable th2 = ((C2761a) obj).f28721a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    @Override // A8.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C2764d c2764d = this.f28740Z;
        C2764d c2764d2 = C2764d.f28723d;
        if (c2764d != c2764d2) {
            C2764d c2764d3 = new C2764d(runnable, executor);
            do {
                c2764d3.f28726c = c2764d;
                if (f28737k0.g(this, c2764d, c2764d3)) {
                    return;
                }
                c2764d = this.f28740Z;
            } while (c2764d != c2764d2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        String str;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e11.getCause());
                sb2.append("]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb2.append(str);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        C2761a c2761a;
        Object obj = this.f28739Y;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (f28735i0) {
                c2761a = new C2761a(new CancellationException("Future.cancel() was called."), z10);
            } else if (z10) {
                c2761a = C2761a.f28719b;
            } else {
                c2761a = C2761a.f28720c;
            }
            if (f28737k0.i(this, obj, c2761a)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final void f(C2766f c2766f) {
        c2766f.f28733a = null;
        while (true) {
            C2766f c2766f2 = this.f28741h0;
            if (c2766f2 == C2766f.f28732c) {
                return;
            }
            C2766f c2766f3 = null;
            while (c2766f2 != null) {
                C2766f c2766f4 = c2766f2.f28734b;
                if (c2766f2.f28733a != null) {
                    c2766f3 = c2766f2;
                } else if (c2766f3 != null) {
                    c2766f3.f28734b = c2766f4;
                    if (c2766f3.f28733a == null) {
                        break;
                    }
                } else if (!f28737k0.j(this, c2766f2, c2766f4)) {
                    break;
                }
                c2766f2 = c2766f4;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (java.lang.Thread.interrupted() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        r4 = r19.f28739Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        if ((r5 & true) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        return e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j6, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f28739Y;
            if ((obj != null) & true) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C2766f c2766f = this.f28741h0;
                C2766f c2766f2 = C2766f.f28732c;
                if (c2766f != c2766f2) {
                    C2766f c2766f3 = new C2766f();
                    do {
                        AbstractC4694e abstractC4694e = f28737k0;
                        abstractC4694e.m(c2766f3, c2766f);
                        if (abstractC4694e.j(this, c2766f, c2766f3)) {
                            break;
                        }
                        c2766f = this.f28741h0;
                    } while (c2766f != c2766f2);
                    return e(this.f28739Y);
                }
                return e(this.f28739Y);
            }
            long j10 = 0;
            if (nanos > j10) {
                Object obj2 = this.f28739Y;
                if ((obj2 != null) & true) {
                    return e(obj2);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j10 = 0;
                    if (nanos > j10) {
                    }
                } else {
                    throw new InterruptedException();
                }
            } else {
                String abstractC2767g = toString();
                String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
                String str = "Waited " + j6 + Separators.SP + timeUnit.toString().toLowerCase(locale);
                if (nanos + 1000 < 0) {
                    String g10 = android.gov.nist.core.a.g(str, " (plus ");
                    long j11 = -nanos;
                    long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                    long nanos2 = j11 - timeUnit.toNanos(convert);
                    int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                    boolean z10 = i10 == 0 || nanos2 > 1000;
                    if (i10 > 0) {
                        String str2 = g10 + convert + Separators.SP + lowerCase;
                        if (z10) {
                            str2 = android.gov.nist.core.a.g(str2, Separators.COMMA);
                        }
                        g10 = android.gov.nist.core.a.g(str2, Separators.SP);
                    }
                    if (z10) {
                        g10 = g10 + nanos2 + " nanoseconds ";
                    }
                    str = android.gov.nist.core.a.g(g10, "delay)");
                }
                if (isDone()) {
                    throw new TimeoutException(android.gov.nist.core.a.g(str, " but future completed as timeout expired"));
                }
                throw new TimeoutException(android.gov.nist.core.a.j(str, " for ", abstractC2767g));
            }
        } else {
            throw new InterruptedException();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f28739Y instanceof C2761a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f28739Y != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 & true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f28739Y instanceof C2761a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (java.lang.Thread.interrupted() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r0 = r6.f28739Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
        if ((r3 & true) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        return e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
        f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.f28739Y;
            if ((obj != null) & true) {
                return e(obj);
            }
            C2766f c2766f = this.f28741h0;
            C2766f c2766f2 = C2766f.f28732c;
            if (c2766f != c2766f2) {
                C2766f c2766f3 = new C2766f();
                do {
                    AbstractC4694e abstractC4694e = f28737k0;
                    abstractC4694e.m(c2766f3, c2766f);
                    if (abstractC4694e.j(this, c2766f, c2766f3)) {
                        break;
                    }
                    c2766f = this.f28741h0;
                } while (c2766f != c2766f2);
                return e(this.f28739Y);
            }
            return e(this.f28739Y);
        }
        throw new InterruptedException();
    }
}
