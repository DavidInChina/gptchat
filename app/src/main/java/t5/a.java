package T5;

import android.content.Context;
import id.AbstractC3557B;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import r5.AbstractC5366a;
import r5.d;

/* loaded from: classes2.dex */
public final class a implements AbstractC5366a {

    /* renamed from: a  reason: collision with root package name */
    public final d f16910a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f16911b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f16912c = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: d  reason: collision with root package name */
    public final String f16913d = "crash";

    public a(d dVar) {
        AbstractC3557B.c0("sdkCore", dVar);
        this.f16910a = dVar;
    }

    @Override // r5.AbstractC5366a
    public final void c() {
        Thread.setDefaultUncaughtExceptionHandler(this.f16912c);
        this.f16911b.set(false);
    }

    @Override // r5.AbstractC5366a
    public final void e(Context context) {
        this.f16912c = Thread.getDefaultUncaughtExceptionHandler();
        c cVar = new c(this.f16910a, context);
        cVar.f16921h0 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(cVar);
        this.f16911b.set(true);
    }

    @Override // r5.AbstractC5366a
    public final String getName() {
        return this.f16913d;
    }
}
