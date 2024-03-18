package androidx.work;

import A8.a;
import Ad.l;
import L3.C0893e;
import L3.f;
import L3.m;
import L3.r;
import Ng.B;
import Ng.C1079o0;
import Ng.Q;
import Sg.C1394f;
import Tg.e;
import W3.i;
import android.content.Context;
import g.RunnableC3111d;
import id.AbstractC3557B;
import kotlin.Metadata;
import nf.AbstractC4825e;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "LL3/r;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends r {

    /* renamed from: k0  reason: collision with root package name */
    public final i f25515k0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1079o0 f25514j0 = l.n();

    /* renamed from: l0  reason: collision with root package name */
    public final e f25516l0 = Q.f12904a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, W3.g, W3.i] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC3557B.c0("appContext", context);
        AbstractC3557B.c0("params", workerParameters);
        ?? obj = new Object();
        this.f25515k0 = obj;
        obj.a(new RunnableC3111d(20, this), workerParameters.f25523e.f21779a);
    }

    @Override // L3.r
    public final a a() {
        C1079o0 n10 = l.n();
        C1394f g10 = l.g(g().plus(n10));
        m mVar = new m(n10);
        l.O0(g10, null, null, new C0893e(mVar, this, null), 3);
        return mVar;
    }

    @Override // L3.r
    public final void b() {
        this.f25515k0.cancel(false);
    }

    @Override // L3.r
    public final i c() {
        l.O0(l.g(g().plus(this.f25514j0)), null, null, new f(this, null), 3);
        return this.f25515k0;
    }

    public abstract Object f(AbstractC4825e abstractC4825e);

    public B g() {
        return this.f25516l0;
    }
}
