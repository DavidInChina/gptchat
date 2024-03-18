package p2;

import android.net.Uri;
import id.AbstractC3557B;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: c  reason: collision with root package name */
    public Uri f41779c;

    /* renamed from: d  reason: collision with root package name */
    public Object f41780d;

    /* renamed from: a  reason: collision with root package name */
    public int f41777a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f41778b = 5;

    /* renamed from: e  reason: collision with root package name */
    public Serializable f41781e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public Serializable f41782f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public Serializable f41783g = new ArrayDeque();

    /* JADX WARN: Type inference failed for: r0v0, types: [p2.G, p2.E] */
    public static E a(F f6) {
        return new G(f6);
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (((ExecutorService) this.f41780d) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = Xh.b.f22002g + " Dispatcher";
                AbstractC3557B.c0("name", str);
                this.f41780d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Xh.a(str, false));
            }
            executorService = (ExecutorService) this.f41780d;
            AbstractC3557B.Z(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final ai.g c(String str) {
        Iterator it = ((ArrayDeque) this.f41782f).iterator();
        while (it.hasNext()) {
            ai.g gVar = (ai.g) it.next();
            if (AbstractC3557B.K(gVar.f24252h0.f24256Z.f21336a.f21253d, str)) {
                return gVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f41781e).iterator();
        while (it2.hasNext()) {
            ai.g gVar2 = (ai.g) it2.next();
            if (AbstractC3557B.K(gVar2.f24252h0.f24256Z.f21336a.f21253d, str)) {
                return gVar2;
            }
        }
        return null;
    }

    public final void d(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                runnable = (Runnable) this.f41779c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!f() && runnable != null) {
            runnable.run();
        }
    }

    public final void e(ai.g gVar) {
        AbstractC3557B.c0("call", gVar);
        gVar.f24251Z.decrementAndGet();
        d((ArrayDeque) this.f41782f, gVar);
    }

    public final boolean f() {
        int i10;
        boolean z10;
        byte[] bArr = Xh.b.f21996a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f41781e).iterator();
                AbstractC3557B.b0("readyAsyncCalls.iterator()", it);
                while (it.hasNext()) {
                    ai.g gVar = (ai.g) it.next();
                    if (((ArrayDeque) this.f41782f).size() >= this.f41777a) {
                        break;
                    } else if (gVar.f24251Z.get() < this.f41778b) {
                        it.remove();
                        gVar.f24251Z.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f41782f).add(gVar);
                    }
                }
                if (g() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ai.g gVar2 = (ai.g) arrayList.get(i10);
            ExecutorService b10 = b();
            gVar2.getClass();
            ai.j jVar = gVar2.f24252h0;
            F f6 = jVar.f24255Y.f21302Y;
            byte[] bArr2 = Xh.b.f21996a;
            try {
                try {
                    b10.execute(gVar2);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    jVar.j(interruptedIOException);
                    gVar2.f24250Y.a(jVar, interruptedIOException);
                    jVar.f24255Y.f21302Y.e(gVar2);
                }
            } catch (Throwable th3) {
                jVar.f24255Y.f21302Y.e(gVar2);
                throw th3;
            }
        }
        return z10;
    }

    public final synchronized int g() {
        return ((ArrayDeque) this.f41782f).size() + ((ArrayDeque) this.f41783g).size();
    }
}
