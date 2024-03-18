package q6;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kf.q;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import v6.C5977a;

/* renamed from: q6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5276a {

    /* renamed from: a  reason: collision with root package name */
    public final C5977a[] f43941a;

    /* renamed from: b  reason: collision with root package name */
    public final y6.f f43942b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5091c f43943c;

    public C5276a(C5977a[] c5977aArr, y6.f fVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("interactionPredicate", fVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f43941a = c5977aArr;
        this.f43942b = fVar;
        this.f43943c = abstractC5091c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [U3.e, java.lang.Object] */
    public final void a(Activity activity, Window window, AbstractC5092d abstractC5092d) {
        AbstractC3557B.c0("context", activity);
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        if (window == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        Window.Callback callback2 = callback;
        if (callback == null) {
            callback2 = new Object();
        }
        Window.Callback callback3 = callback2;
        WeakReference weakReference = new WeakReference(window);
        WeakReference weakReference2 = new WeakReference(activity);
        C5279d c5279d = new C5279d(abstractC5092d, weakReference, this.f43941a, this.f43942b, weakReference2, this.f43943c);
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, c5279d);
        ?? obj = new Object();
        obj.f17400Y = c5279d;
        obj.f17401Z = gestureDetectorCompat;
        window.setCallback(new g(window, abstractC5092d, callback3, obj, this.f43942b, this.f43941a, this.f43943c));
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C5276a.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.datadog.android.rum.internal.instrumentation.gestures.DatadogGesturesTracker", obj);
        C5276a c5276a = (C5276a) obj;
        if (Arrays.equals(this.f43941a, c5276a.f43941a) && AbstractC3557B.K(this.f43942b.getClass(), c5276a.f43942b.getClass())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f43941a) + 544;
        return this.f43942b.getClass().hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return android.gov.nist.core.a.A("DatadogGesturesTracker(", q.r3(this.f43941a, null, null, null, null, 63), Separators.RPAREN);
    }
}
