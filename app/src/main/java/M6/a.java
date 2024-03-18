package M6;

import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements ff.c, S6.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f11651b;

    /* renamed from: d  reason: collision with root package name */
    public final long f11653d;

    /* renamed from: f  reason: collision with root package name */
    public volatile WeakReference f11655f;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicLong f11654e = new AtomicLong();

    /* renamed from: c  reason: collision with root package name */
    public final long f11652c = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());

    public a(b bVar) {
        this.f11651b = bVar;
        h hVar = bVar.f11658b;
        hVar.getClass();
        this.f11653d = Math.max(0L, System.nanoTime() - hVar.f11701i0) + hVar.f11700h0;
        h hVar2 = bVar.f11658b;
        BigInteger bigInteger = hVar2.f11699Z;
        if (bigInteger != null && bigInteger.equals(bVar.f11660d)) {
            AtomicReference atomicReference = hVar2.f11706n0;
            WeakReference weakReference = new WeakReference(this);
            while (!atomicReference.compareAndSet(null, weakReference) && atomicReference.get() == null) {
            }
            synchronized (this) {
                try {
                    if (this.f11655f == null) {
                        this.f11655f = new WeakReference(this, hVar2.f11702j0);
                        hVar2.f11703k0.add(this.f11655f);
                        hVar2.f11704l0.incrementAndGet();
                    }
                } finally {
                }
            }
        }
    }

    @Override // ff.c
    public final ff.c a(String str, String str2) {
        this.f11651b.i(str, str2);
        return this;
    }

    @Override // ff.c
    public final void b() {
        long j6 = this.f11653d;
        if (j6 > 0) {
            h hVar = this.f11651b.f11658b;
            hVar.getClass();
            e((Math.max(0L, System.nanoTime() - hVar.f11701i0) + hVar.f11700h0) - j6);
            return;
        }
        e(TimeUnit.MICROSECONDS.toNanos(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()) - this.f11652c));
    }

    @Override // ff.c
    public final ff.d c() {
        return this.f11651b;
    }

    @Override // ff.c
    public final ff.c d(Integer num) {
        this.f11651b.i("http.status_code", num);
        return this;
    }

    public final void e(long j6) {
        b bVar;
        if (this.f11654e.compareAndSet(0L, Math.max(1L, j6))) {
            h hVar = this.f11651b.f11658b;
            synchronized (hVar) {
                try {
                    if (this.f11654e.get() != 0) {
                        BigInteger bigInteger = hVar.f11699Z;
                        if (bigInteger != null && (bVar = this.f11651b) != null) {
                            if (bigInteger.equals(bVar.f11660d)) {
                                if (!hVar.f11707o0.get()) {
                                    hVar.addFirst(this);
                                }
                                hVar.s(this, true);
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final Map f() {
        Map unmodifiableMap;
        b bVar = this.f11651b;
        synchronized (bVar) {
            unmodifiableMap = Collections.unmodifiableMap(bVar.f11663g);
        }
        return unmodifiableMap;
    }

    public final String toString() {
        return this.f11651b.toString() + ", duration_ns=" + this.f11654e;
    }
}
