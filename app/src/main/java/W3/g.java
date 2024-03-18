package W3;

import android.gov.nist.core.Separators;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements A8.a {

    /* renamed from: i0  reason: collision with root package name */
    public static final boolean f20714i0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j0  reason: collision with root package name */
    public static final Logger f20715j0 = Logger.getLogger(g.class.getName());

    /* renamed from: k0  reason: collision with root package name */
    public static final r.f f20716k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final Object f20717l0;

    /* renamed from: Y  reason: collision with root package name */
    public volatile Object f20718Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile c f20719Z;

    /* renamed from: h0  reason: collision with root package name */
    public volatile f f20720h0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        d dVar;
        Throwable th2;
        try {
            th2 = null;
            dVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "h0"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "Z"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "Y"));
        } catch (Throwable th3) {
            th2 = th3;
            dVar = new Object();
        }
        f20716k0 = dVar;
        if (th2 != null) {
            f20715j0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
        f20717l0 = new Object();
    }

    public static void c(g gVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            f fVar = gVar.f20720h0;
            if (f20716k0.k(gVar, fVar, f.f20711c)) {
                while (fVar != null) {
                    Thread thread = fVar.f20712a;
                    if (thread != null) {
                        fVar.f20712a = null;
                        LockSupport.unpark(thread);
                    }
                    fVar = fVar.f20713b;
                }
                do {
                    cVar = gVar.f20719Z;
                } while (!f20716k0.i(gVar, cVar, c.f20700d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 != null) {
                        cVar = cVar3.f20703c;
                        cVar3.f20703c = cVar2;
                    }
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f20703c;
                    Runnable runnable = cVar2.f20701a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        gVar = eVar.f20709Y;
                        if (gVar.f20718Y == eVar) {
                            if (f20716k0.j(gVar, eVar, f(eVar.f20710Z))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f20702b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f20715j0.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == f20717l0) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).f20699a);
        }
        Throwable th2 = ((a) obj).f20697b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public static Object f(A8.a aVar) {
        if (aVar instanceof g) {
            Object obj = ((g) aVar).f20718Y;
            if (obj instanceof a) {
                a aVar2 = (a) obj;
                if (aVar2.f20696a) {
                    if (aVar2.f20697b != null) {
                        return new a(aVar2.f20697b, false);
                    }
                    return a.f20695d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f20714i0) & isCancelled) {
            return a.f20695d;
        }
        try {
            Object g10 = g(aVar);
            if (g10 == null) {
                return f20717l0;
            }
            return g10;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
            }
            return new a(e10, false);
        } catch (ExecutionException e11) {
            return new b(e11.getCause());
        } catch (Throwable th2) {
            return new b(th2);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // A8.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f20719Z;
        c cVar2 = c.f20700d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f20703c = cVar;
                if (f20716k0.i(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f20719Z;
            } while (cVar != cVar2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        String str;
        try {
            Object g10 = g(this);
            sb2.append("SUCCESS, result=[");
            if (g10 == this) {
                str = "this future";
            } else {
                str = String.valueOf(g10);
            }
            sb2.append(str);
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        boolean z12;
        Object obj = this.f20718Y;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (f20714i0) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else if (z10) {
            aVar = a.f20694c;
        } else {
            aVar = a.f20695d;
        }
        g gVar = this;
        boolean z13 = false;
        while (true) {
            if (f20716k0.j(gVar, obj, aVar)) {
                c(gVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                A8.a aVar2 = ((e) obj).f20710Z;
                if (aVar2 instanceof g) {
                    gVar = (g) aVar2;
                    obj = gVar.f20718Y;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!(z12 | (obj instanceof e))) {
                        return true;
                    }
                    z13 = true;
                } else {
                    aVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = gVar.f20718Y;
                if (!(obj instanceof e)) {
                    return z13;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r19, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r19.f20718Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof W3.e))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j6, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j6);
        if (!Thread.interrupted()) {
            Object obj = this.f20718Y;
            if ((obj != null) & (!(obj instanceof e))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.f20720h0;
                f fVar2 = f.f20711c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        r.f fVar4 = f20716k0;
                        fVar4.S(fVar3, fVar);
                        if (fVar4.k(this, fVar, fVar3)) {
                            break;
                        }
                        fVar = this.f20720h0;
                    } while (fVar != fVar2);
                    return e(this.f20718Y);
                }
                return e(this.f20718Y);
            }
            long j10 = 0;
            if (nanos > j10) {
                Object obj2 = this.f20718Y;
                if ((obj2 != null) & (!(obj2 instanceof e))) {
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
                String gVar = toString();
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
                throw new TimeoutException(android.gov.nist.core.a.j(str, " for ", gVar));
            }
        } else {
            throw new InterruptedException();
        }
    }

    public final String h() {
        String str;
        Object obj = this.f20718Y;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            A8.a aVar = ((e) obj).f20710Z;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return R.a.t(sb2, str, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void i(f fVar) {
        fVar.f20712a = null;
        while (true) {
            f fVar2 = this.f20720h0;
            if (fVar2 == f.f20711c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f20713b;
                if (fVar2.f20712a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f20713b = fVar4;
                    if (fVar3.f20712a == null) {
                        break;
                    }
                } else if (!f20716k0.k(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20718Y instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z10;
        if (this.f20718Y != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof e)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f20718Y instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = h();
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f20718Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r3 & (!(r0 instanceof W3.e))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.f20718Y;
            if ((obj != null) & (!(obj instanceof e))) {
                return e(obj);
            }
            f fVar = this.f20720h0;
            f fVar2 = f.f20711c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    r.f fVar4 = f20716k0;
                    fVar4.S(fVar3, fVar);
                    if (fVar4.k(this, fVar, fVar3)) {
                        break;
                    }
                    fVar = this.f20720h0;
                } while (fVar != fVar2);
                return e(this.f20718Y);
            }
            return e(this.f20718Y);
        }
        throw new InterruptedException();
    }
}
