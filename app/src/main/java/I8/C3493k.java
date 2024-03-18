package i8;

import D1.K;
import D1.Z;
import E1.B;
import G0.AbstractC0579h;
import G0.AbstractC0585n;
import V1.C1464e;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import id.AbstractC3557B;
import io.sentry.C3667n;
import io.sentry.C3679q;
import io.sentry.D0;
import io.sentry.E0;
import io.sentry.EnumC3642e1;
import io.sentry.N;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.y1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p2.H;
import p2.V;

/* renamed from: i8.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3493k implements E1.d, io.sentry.util.a, E0, s2.m, B, io.sentry.instrumentation.file.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32773Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f32774Z;

    public /* synthetic */ C3493k(int i10, Object obj) {
        this.f32773Y = i10;
        this.f32774Z = obj;
    }

    public Boolean a() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f32774Z;
        int i10 = io.sentry.android.core.cache.a.f34088n0;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        boolean z10 = false;
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean exists = file.exists();
                if (exists && !file.delete()) {
                    sentryAndroidOptions.getLogger().f(EnumC3642e1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z10 = exists;
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th2);
            }
        }
        return Boolean.valueOf(z10);
    }

    @Override // io.sentry.util.a
    public void accept(Object obj) {
        int i10 = this.f32773Y;
        Object obj2 = this.f32774Z;
        switch (i10) {
            case 1:
                C3679q c3679q = (C3679q) obj2;
                c3679q.getClass();
                if (!((io.sentry.hints.f) obj).d()) {
                    c3679q.f34683g.f(EnumC3642e1.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                    return;
                }
                return;
            default:
                io.sentry.transport.d dVar = (io.sentry.transport.d) obj2;
                C3667n c3667n = (C3667n) obj;
                dVar.getClass();
                c3667n.f34440g.add(c3667n.f34439f);
                dVar.f34736h0.getLogger().f(EnumC3642e1.DEBUG, "Envelope enqueued", new Object[0]);
                return;
        }
    }

    @Override // E1.B
    public boolean b(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f32774Z;
        sideSheetBehavior.getClass();
        int i10 = this.f32773Y;
        if (i10 != 1 && i10 != 2) {
            WeakReference weakReference = sideSheetBehavior.f27243p;
            if (weakReference != null && weakReference.get() != null) {
                View view2 = (View) sideSheetBehavior.f27243p.get();
                r1.m mVar = new r1.m(sideSheetBehavior, i10, 2);
                ViewParent parent = view2.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (K.b(view2)) {
                        view2.post(mVar);
                    }
                }
                mVar.run();
            } else {
                sideSheetBehavior.r(i10);
            }
            return true;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(R.a.t(sb2, str, " should not be set externally."));
    }

    public void c() {
        int i10;
        AbstractC0585n abstractC0585n = (AbstractC0585n) this.f32774Z;
        AbstractC3557B.c0("$this_hapticFeedbackPerformer", abstractC0585n);
        View view = (View) AbstractC0579h.p(abstractC0585n, H0.Z.f6892f);
        if (Build.VERSION.SDK_INT >= 30) {
            i10 = 13;
        } else {
            i10 = 6;
        }
        view.performHapticFeedback(i10);
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        ((io.sentry.instrumentation.file.e) this.f32774Z).f34384Y.write(this.f32773Y);
        return 1;
    }

    @Override // io.sentry.E0
    public void f(N n10) {
        y1 y1Var;
        Date date;
        switch (this.f32773Y) {
            case 2:
                ((AtomicReference) this.f32774Z).set(((D0) n10).f33765d);
                return;
            case 3:
            default:
                SentryNavigationListener sentryNavigationListener = (SentryNavigationListener) this.f32774Z;
                AbstractC3557B.c0("this$0", sentryNavigationListener);
                AbstractC3557B.c0("scope", n10);
                ((D0) n10).e(new C1464e(sentryNavigationListener, 22, n10));
                return;
            case 4:
                io.sentry.android.core.K k10 = (io.sentry.android.core.K) this.f32774Z;
                if (k10.f33983Y.get() == 0 && (y1Var = ((D0) n10).f33773l) != null) {
                    Date date2 = y1Var.f34835Y;
                    Date date3 = null;
                    if (date2 == null) {
                        date = null;
                    } else {
                        date = (Date) date2.clone();
                    }
                    if (date != null) {
                        AtomicLong atomicLong = k10.f33983Y;
                        Date date4 = y1Var.f34835Y;
                        if (date4 != null) {
                            date3 = (Date) date4.clone();
                        }
                        atomicLong.set(date3.getTime());
                        return;
                    }
                    return;
                }
                return;
            case 5:
                io.sentry.android.core.internal.gestures.e eVar = (io.sentry.android.core.internal.gestures.e) this.f32774Z;
                eVar.getClass();
                ((D0) n10).e(new C1464e(eVar, 21, n10));
                return;
        }
    }

    @Override // s2.m
    public void invoke(Object obj) {
        ((V) obj).w((H) this.f32774Z, this.f32773Y);
    }
}
