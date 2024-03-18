package Y8;

import g.RunnableC3118k;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f22122a = new AtomicReference(e.f22117Y);

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f22123b = new AtomicLong(0);

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f22124c = Executors.newSingleThreadExecutor(f.f22121a);

    /* renamed from: d  reason: collision with root package name */
    public final c f22125d;

    /* renamed from: e  reason: collision with root package name */
    public final W8.a f22126e;

    /* renamed from: f  reason: collision with root package name */
    public final d f22127f;

    /* renamed from: g  reason: collision with root package name */
    public final O5.c f22128g;

    /* renamed from: h  reason: collision with root package name */
    public final List f22129h;

    /* renamed from: i  reason: collision with root package name */
    public final long f22130i;

    /* renamed from: j  reason: collision with root package name */
    public final long f22131j;

    /* renamed from: k  reason: collision with root package name */
    public final long f22132k;

    /* renamed from: l  reason: collision with root package name */
    public final long f22133l;

    public g(c cVar, P5.c cVar2, d dVar, O5.c cVar3, List list, long j6, long j10, long j11, long j12) {
        this.f22125d = cVar;
        this.f22126e = cVar2;
        this.f22127f = dVar;
        this.f22128g = cVar3;
        this.f22129h = list;
        this.f22130i = j6;
        this.f22131j = j10;
        this.f22132k = j11;
        this.f22133l = j12;
    }

    public final void a() {
        if (((e) this.f22122a.get()) != e.f22119h0) {
            return;
        }
        throw new IllegalStateException("Service already shutdown");
    }

    public final void b() {
        a();
        if (((e) this.f22122a.get()) != e.f22118Z) {
            this.f22124c.submit(new RunnableC3118k(18, this));
        }
    }
}
