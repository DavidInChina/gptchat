package V3;

import android.content.Context;
import android.os.Build;
import m.RunnableC4517N;
import q.RunnableC5216j;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: l0  reason: collision with root package name */
    public static final String f18367l0 = L3.s.f("WorkForegroundRunnable");

    /* renamed from: Y  reason: collision with root package name */
    public final W3.i f18368Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public final Context f18369Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U3.q f18370h0;

    /* renamed from: i0  reason: collision with root package name */
    public final L3.r f18371i0;

    /* renamed from: j0  reason: collision with root package name */
    public final L3.j f18372j0;

    /* renamed from: k0  reason: collision with root package name */
    public final X3.b f18373k0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, W3.i] */
    public r(Context context, U3.q qVar, L3.r rVar, s sVar, X3.b bVar) {
        this.f18369Z = context;
        this.f18370h0 = qVar;
        this.f18371i0 = rVar;
        this.f18372j0 = sVar;
        this.f18373k0 = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, W3.g] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18370h0.f17466q && Build.VERSION.SDK_INT < 31) {
            ?? obj = new Object();
            X3.b bVar = this.f18373k0;
            bVar.f21782d.execute(new RunnableC4517N(this, 23, obj));
            obj.a(new RunnableC5216j(this, 13, (Object) obj), bVar.f21782d);
            return;
        }
        this.f18368Y.j(null);
    }
}
