package io.sentry.android.core;

import H0.C0714y;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.Owner;
import id.AbstractC3557B;
import io.sentry.C3607a;
import io.sentry.C3636c1;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.Z0;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.r {

    /* renamed from: Y  reason: collision with root package name */
    public final SentryAndroidOptions f34071Y;

    /* renamed from: Z  reason: collision with root package name */
    public final io.sentry.android.core.internal.util.d f34072Z = new io.sentry.android.core.internal.util.d();

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34071Y = sentryAndroidOptions;
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            r.f.e(ViewHierarchyEventProcessor.class);
        }
    }

    public static void b(View view, io.sentry.protocol.E e10, List list) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
            composeViewHierarchyExporter.getClass();
            if (view instanceof Owner) {
                if (composeViewHierarchyExporter.f34313b == null) {
                    synchronized (composeViewHierarchyExporter) {
                        try {
                            if (composeViewHierarchyExporter.f34313b == null) {
                                composeViewHierarchyExporter.f34313b = new C3636c1(composeViewHierarchyExporter.f34312a);
                            }
                        } finally {
                        }
                    }
                }
                ComposeViewHierarchyExporter.a(null, ((C0714y) ((Owner) view)).getRoot(), composeViewHierarchyExporter.f34313b, e10);
                return;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                io.sentry.protocol.E c10 = c(childAt);
                arrayList.add(c10);
                b(childAt, c10, list);
            }
        }
        e10.f34492p0 = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.E, java.lang.Object] */
    public static io.sentry.protocol.E c(View view) {
        ?? obj = new Object();
        obj.f34483Z = AbstractC3557B.j1(view);
        try {
            obj.f34484h0 = R4.b.q1(view);
        } catch (Throwable unused) {
        }
        obj.f34488l0 = Double.valueOf(view.getX());
        obj.f34489m0 = Double.valueOf(view.getY());
        obj.f34486j0 = Double.valueOf(view.getWidth());
        obj.f34487k0 = Double.valueOf(view.getHeight());
        obj.f34491o0 = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                if (visibility == 8) {
                    obj.f34490n0 = "gone";
                }
            } else {
                obj.f34490n0 = "invisible";
            }
        } else {
            obj.f34490n0 = "visible";
        }
        return obj;
    }

    @Override // io.sentry.r
    public final Z0 a(Z0 z02, C3686u c3686u) {
        Activity activity;
        C4.c cVar = z02.f33903y0;
        if (cVar != null && !cVar.f2667Y.isEmpty()) {
            SentryAndroidOptions sentryAndroidOptions = this.f34071Y;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return z02;
            } else if (AbstractC3557B.L1(c3686u)) {
                return z02;
            } else {
                boolean a5 = this.f34072Z.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (a5) {
                    return z02;
                }
                WeakReference weakReference = C.f33952b.f33953a;
                io.sentry.protocol.D d10 = null;
                if (weakReference != null) {
                    activity = (Activity) weakReference.get();
                } else {
                    activity = null;
                }
                List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                io.sentry.util.thread.a mainThreadChecker = sentryAndroidOptions.getMainThreadChecker();
                io.sentry.H logger = sentryAndroidOptions.getLogger();
                if (activity == null) {
                    logger.f(EnumC3642e1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                } else {
                    Window window = activity.getWindow();
                    if (window == null) {
                        logger.f(EnumC3642e1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                    } else {
                        View peekDecorView = window.peekDecorView();
                        if (peekDecorView == null) {
                            logger.f(EnumC3642e1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                        } else {
                            try {
                                if (mainThreadChecker.a()) {
                                    ArrayList arrayList = new ArrayList(1);
                                    io.sentry.protocol.D d11 = new io.sentry.protocol.D("android_view_system", arrayList);
                                    io.sentry.protocol.E c10 = c(peekDecorView);
                                    arrayList.add(c10);
                                    b(peekDecorView, c10, viewHierarchyExporters);
                                    d10 = d11;
                                } else {
                                    CountDownLatch countDownLatch = new CountDownLatch(1);
                                    AtomicReference atomicReference = new AtomicReference(null);
                                    activity.runOnUiThread(new A2.B(atomicReference, peekDecorView, viewHierarchyExporters, countDownLatch, logger, 2));
                                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                        d10 = (io.sentry.protocol.D) atomicReference.get();
                                    }
                                }
                            } catch (Throwable th2) {
                                logger.d(EnumC3642e1.ERROR, "Failed to process view hierarchy.", th2);
                            }
                        }
                    }
                }
                if (d10 != null) {
                    c3686u.f34767d = new C3607a(d10);
                }
            }
        }
        return z02;
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        return zVar;
    }
}
