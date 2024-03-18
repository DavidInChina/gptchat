package io.sentry.android.core.internal.gestures;

import Ad.l;
import C2.r;
import V1.C1464e;
import android.app.Activity;
import android.gov.nist.core.Separators;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import i8.C3493k;
import io.sentry.C1;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.G;
import io.sentry.H;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.T;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.B;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f34121a;

    /* renamed from: b  reason: collision with root package name */
    public final G f34122b;

    /* renamed from: c  reason: collision with root package name */
    public final SentryAndroidOptions f34123c;

    /* renamed from: d  reason: collision with root package name */
    public io.sentry.internal.gestures.c f34124d = null;

    /* renamed from: e  reason: collision with root package name */
    public T f34125e = null;

    /* renamed from: f  reason: collision with root package name */
    public d f34126f;

    /* renamed from: g  reason: collision with root package name */
    public final U7.b f34127g;

    /* JADX WARN: Type inference failed for: r1v0, types: [U7.b, java.lang.Object] */
    public e(Activity activity, G g10, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.Unknown;
        this.f34126f = dVar;
        ?? obj = new Object();
        obj.f17505c = dVar;
        obj.f17503a = 0.0f;
        obj.f17504b = 0.0f;
        this.f34127g = obj;
        this.f34121a = new WeakReference(activity);
        this.f34122b = g10;
        this.f34123c = sentryAndroidOptions;
    }

    public static String c(d dVar) {
        int i10 = c.f34120a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return "unknown";
                }
                return "swipe";
            }
            return "scroll";
        }
        return "click";
    }

    public final void a(io.sentry.internal.gestures.c cVar, d dVar, Map map, MotionEvent motionEvent) {
        if (!this.f34123c.isEnableUserInteractionBreadcrumbs()) {
            return;
        }
        String c10 = c(dVar);
        C3686u c3686u = new C3686u();
        c3686u.c("android:motionEvent", motionEvent);
        c3686u.c("android:view", cVar.f34387a.get());
        C3640e c3640e = new C3640e();
        c3640e.f34320h0 = "user";
        c3640e.f34322j0 = "ui.".concat(c10);
        String str = cVar.f34389c;
        if (str != null) {
            c3640e.a("view.id", str);
        }
        String str2 = cVar.f34388b;
        if (str2 != null) {
            c3640e.a("view.class", str2);
        }
        String str3 = cVar.f34390d;
        if (str3 != null) {
            c3640e.a("view.tag", str3);
        }
        for (Map.Entry entry : map.entrySet()) {
            c3640e.f34321i0.put((String) entry.getKey(), entry.getValue());
        }
        c3640e.f34323k0 = EnumC3642e1.INFO;
        this.f34122b.o(c3640e, c3686u);
    }

    public final View b(String str) {
        Activity activity = (Activity) this.f34121a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f34123c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, android.gov.nist.core.a.A("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, android.gov.nist.core.a.A("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, android.gov.nist.core.a.A("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        return decorView;
    }

    public final void d(io.sentry.internal.gestures.c cVar, d dVar) {
        boolean z10;
        boolean z11;
        Activity activity;
        if (dVar == this.f34126f && cVar.equals(this.f34124d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (dVar == d.Click || !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f34123c;
        boolean isTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        G g10 = this.f34122b;
        if (isTracingEnabled && sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (((Activity) this.f34121a.get()) == null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            String str = cVar.f34389c;
            if (str == null) {
                String str2 = cVar.f34390d;
                l.Z0("UiElement.tag can't be null", str2);
                str = str2;
            }
            T t10 = this.f34125e;
            if (t10 != null) {
                if (!z11 && !t10.f()) {
                    sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, android.gov.nist.core.a.A("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                    if (sentryAndroidOptions.getIdleTimeout() != null) {
                        this.f34125e.q();
                        return;
                    }
                    return;
                }
                e(C1.OK);
            }
            String str3 = activity.getClass().getSimpleName() + Separators.DOT + str;
            String concat = "ui.action.".concat(c(dVar));
            J1 j12 = new J1();
            j12.f33811f = true;
            j12.f33813h = 300000L;
            j12.f33812g = sentryAndroidOptions.getIdleTimeout();
            j12.f552b = true;
            T m10 = g10.m(new I1(str3, B.COMPONENT, concat, null), j12);
            m10.s().f33722n0 = "auto.ui.gesture_listener." + cVar.f34391e;
            g10.p(new C1464e(this, 20, m10));
            this.f34125e = m10;
            this.f34124d = cVar;
            this.f34126f = dVar;
        } else if (z11) {
            g10.p(new r(5));
            this.f34124d = cVar;
            this.f34126f = dVar;
        }
    }

    public final void e(C1 c12) {
        T t10 = this.f34125e;
        if (t10 != null) {
            if (t10.a() == null) {
                this.f34125e.j(c12);
            } else {
                this.f34125e.b();
            }
        }
        this.f34122b.p(new C3493k(5, this));
        this.f34125e = null;
        if (this.f34124d != null) {
            this.f34124d = null;
        }
        this.f34126f = d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        U7.b bVar = this.f34127g;
        bVar.f17506d = null;
        bVar.f17505c = d.Unknown;
        bVar.f17503a = 0.0f;
        bVar.f17504b = 0.0f;
        bVar.f17503a = motionEvent.getX();
        bVar.f17504b = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        this.f34127g.f17505c = d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        View b10 = b("onScroll");
        if (b10 != null && motionEvent != null) {
            U7.b bVar = this.f34127g;
            if (((d) bVar.f17505c) == d.Unknown) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                io.sentry.internal.gestures.b bVar2 = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f34123c;
                io.sentry.internal.gestures.c A02 = R4.b.A0(sentryAndroidOptions, b10, x10, y10, bVar2);
                if (A02 == null) {
                    sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    return false;
                }
                H logger = sentryAndroidOptions.getLogger();
                EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
                String str = A02.f34389c;
                if (str == null) {
                    String str2 = A02.f34390d;
                    l.Z0("UiElement.tag can't be null", str2);
                    str = str2;
                }
                logger.f(enumC3642e1, "Scroll target found: ".concat(str), new Object[0]);
                bVar.f17506d = A02;
                bVar.f17505c = d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View b10 = b("onSingleTapUp");
        if (b10 != null && motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f34123c;
            io.sentry.internal.gestures.c A02 = R4.b.A0(sentryAndroidOptions, b10, x10, y10, bVar);
            if (A02 == null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            d dVar = d.Click;
            a(A02, dVar, Collections.emptyMap(), motionEvent);
            d(A02, dVar);
        }
        return false;
    }
}
