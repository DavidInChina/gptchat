package x3;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import id.AbstractC3557B;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public volatile B3.b f48750a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f48751b;

    /* renamed from: c  reason: collision with root package name */
    public B3.f f48752c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f48754e;

    /* renamed from: f  reason: collision with root package name */
    public List f48755f;

    /* renamed from: j  reason: collision with root package name */
    public final Map f48759j;

    /* renamed from: d  reason: collision with root package name */
    public final n f48753d = d();

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashMap f48756g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f48757h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal f48758i = new ThreadLocal();

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f48760k = new LinkedHashMap();

    public y() {
        Map synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC3557B.b0("synchronizedMap(mutableMapOf())", synchronizedMap);
        this.f48759j = synchronizedMap;
    }

    public static Object o(Class cls, B3.f fVar) {
        if (cls.isInstance(fVar)) {
            return fVar;
        }
        if (fVar instanceof f) {
            return o(cls, ((f) fVar).a());
        }
        return null;
    }

    public final void a() {
        boolean z10;
        if (this.f48754e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    public final void b() {
        if (!g().getWritableDatabase().y0() && this.f48758i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        B3.b writableDatabase = g().getWritableDatabase();
        this.f48753d.d(writableDatabase);
        if (writableDatabase.B0()) {
            writableDatabase.X();
        } else {
            writableDatabase.n();
        }
    }

    public abstract n d();

    public abstract B3.f e(e eVar);

    public List f(LinkedHashMap linkedHashMap) {
        AbstractC3557B.c0("autoMigrationSpecs", linkedHashMap);
        return kf.v.f37483Y;
    }

    public final B3.f g() {
        B3.f fVar = this.f48752c;
        if (fVar != null) {
            return fVar;
        }
        AbstractC3557B.C2("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return kf.x.f37485Y;
    }

    public Map i() {
        return kf.w.f37484Y;
    }

    public final void j() {
        g().getWritableDatabase().j0();
        if (!g().getWritableDatabase().y0()) {
            n nVar = this.f48753d;
            if (nVar.f48702f.compareAndSet(false, true)) {
                Executor executor = nVar.f48697a.f48751b;
                if (executor != null) {
                    executor.execute(nVar.f48709m);
                } else {
                    AbstractC3557B.C2("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final boolean k() {
        Boolean bool;
        B3.b bVar = this.f48750a;
        if (bVar != null) {
            bool = Boolean.valueOf(bVar.isOpen());
        } else {
            bool = null;
        }
        return AbstractC3557B.K(bool, Boolean.TRUE);
    }

    public final Cursor l(B3.h hVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return g().getWritableDatabase().z(hVar, cancellationSignal);
        }
        return g().getWritableDatabase().x0(hVar);
    }

    public final Object m(Callable callable) {
        c();
        try {
            Object call = callable.call();
            n();
            return call;
        } finally {
            j();
        }
    }

    public final void n() {
        g().getWritableDatabase().U();
    }
}
