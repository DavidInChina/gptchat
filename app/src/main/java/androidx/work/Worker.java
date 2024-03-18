package androidx.work;

import A8.a;
import L3.p;
import L3.r;
import W3.i;
import android.content.Context;
import g.RunnableC3118k;
import q.RunnableC5216j;

/* loaded from: classes2.dex */
public abstract class Worker extends r {

    /* renamed from: j0  reason: collision with root package name */
    public i f25518j0;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A8.a, java.lang.Object] */
    @Override // L3.r
    public final a a() {
        ?? obj = new Object();
        this.f10726Z.f25522d.execute(new RunnableC5216j(this, 7, (Object) obj));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, W3.i] */
    @Override // L3.r
    public final i c() {
        this.f25518j0 = new Object();
        this.f10726Z.f25522d.execute(new RunnableC3118k(12, this));
        return this.f25518j0;
    }

    public abstract p f();
}
