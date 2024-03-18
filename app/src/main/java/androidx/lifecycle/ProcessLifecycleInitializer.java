package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import id.AbstractC3557B;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "LE3/b;", "Landroidx/lifecycle/v;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements E3.b {
    @Override // E3.b
    public final List a() {
        return kf.v.f37483Y;
    }

    @Override // E3.b
    public final Object b(Context context) {
        AbstractC3557B.c0("context", context);
        E3.a c10 = E3.a.c(context);
        AbstractC3557B.b0("getInstance(context)", c10);
        if (c10.f4428b.contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC2083s.f25381a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                AbstractC3557B.a0("null cannot be cast to non-null type android.app.Application", applicationContext);
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new r());
            }
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f25313n0;
            processLifecycleOwner.getClass();
            processLifecycleOwner.f25318j0 = new Handler();
            processLifecycleOwner.f25319k0.k(EnumC2081p.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            AbstractC3557B.a0("null cannot be cast to non-null type android.app.Application", applicationContext2);
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new J(processLifecycleOwner));
            return processLifecycleOwner;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
