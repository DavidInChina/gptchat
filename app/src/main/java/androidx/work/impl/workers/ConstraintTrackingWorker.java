package androidx.work.impl.workers;

import L3.r;
import L3.s;
import Q3.b;
import Q3.c;
import Q3.e;
import U3.q;
import W3.i;
import Y3.a;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import g.RunnableC3111d;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "LL3/r;", "LQ3/e;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends r implements e {

    /* renamed from: j0  reason: collision with root package name */
    public final WorkerParameters f25549j0;

    /* renamed from: l0  reason: collision with root package name */
    public volatile boolean f25551l0;

    /* renamed from: n0  reason: collision with root package name */
    public r f25553n0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f25550k0 = new Object();

    /* renamed from: m0  reason: collision with root package name */
    public final i f25552m0 = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, W3.i] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC3557B.c0("appContext", context);
        AbstractC3557B.c0("workerParameters", workerParameters);
        this.f25549j0 = workerParameters;
    }

    @Override // L3.r
    public final void b() {
        int i10;
        r rVar = this.f25553n0;
        if (rVar != null && rVar.f10727h0 == -256) {
            if (Build.VERSION.SDK_INT >= 31) {
                i10 = this.f10727h0;
            } else {
                i10 = 0;
            }
            rVar.d(i10);
        }
    }

    @Override // L3.r
    public final i c() {
        this.f10726Z.f25522d.execute(new RunnableC3111d(21, this));
        i iVar = this.f25552m0;
        AbstractC3557B.b0("future", iVar);
        return iVar;
    }

    @Override // Q3.e
    public final void e(q qVar, c cVar) {
        AbstractC3557B.c0("workSpec", qVar);
        AbstractC3557B.c0("state", cVar);
        s d10 = s.d();
        String str = a.f22098a;
        d10.a(str, "Constraints changed for " + qVar);
        if (cVar instanceof b) {
            synchronized (this.f25550k0) {
                this.f25551l0 = true;
            }
        }
    }
}
