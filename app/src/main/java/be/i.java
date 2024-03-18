package be;

import Ii.D;
import U3.n;
import ae.AbstractC1979e;
import ae.AbstractC1981g;
import ae.C1977c;
import ae.C1982h;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public final class i extends b {

    /* renamed from: i0  reason: collision with root package name */
    public static final AbstractC3957g f25961i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final AbstractC3957g f25962j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final WeakHashMap f25963k0 = new WeakHashMap();

    /* renamed from: l0  reason: collision with root package name */
    public static final Object f25964l0 = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public final n f25965Z = new n(10);

    /* renamed from: h0  reason: collision with root package name */
    public final Window.Callback f25966h0;

    static {
        EnumC3958h enumC3958h = EnumC3958h.f36153Z;
        f25961i0 = R4.b.C1(enumC3958h, c.f25944j0);
        f25962j0 = R4.b.C1(enumC3958h, c.f25943i0);
    }

    public i(Window.Callback callback) {
        super(callback);
        this.f25966h0 = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object obj;
        Window.Callback callback = this.f25966h0;
        if (keyEvent != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f25965Z.f17427Z).iterator();
            AbstractC3557B.b0("listeners.keyEventInterceptors.iterator()", it);
            h hVar = new h(this, it, 0);
            if (it.hasNext()) {
                ((D) it.next()).getClass();
                obj = D.a(keyEvent, hVar);
            } else if (callback.dispatchKeyEvent(keyEvent)) {
                obj = C1977c.f24159b;
            } else {
                obj = AbstractC1979e.f24160a;
            }
            return obj instanceof C1977c;
        }
        return callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC1979e abstractC1979e;
        Window.Callback callback = this.f25966h0;
        if (motionEvent != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f25965Z.f17426Y).iterator();
            AbstractC3557B.b0("listeners.touchEventInterceptors.iterator()", it);
            h hVar = new h(this, it, 1);
            if (it.hasNext()) {
                abstractC1979e = ((AbstractC1981g) it.next()).a(motionEvent, hVar);
            } else if (callback.dispatchTouchEvent(motionEvent)) {
                abstractC1979e = C1977c.f24159b;
            } else {
                abstractC1979e = AbstractC1979e.f24160a;
            }
            return abstractC1979e instanceof C1977c;
        }
        return callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        for (C1982h c1982h : (CopyOnWriteArrayList) this.f25965Z.f17428h0) {
            ((CopyOnWriteArrayList) c1982h.f24161a.f17428h0).remove(c1982h);
            View peekDecorView = c1982h.f24162b.peekDecorView();
            AbstractC3557B.b0("peekDecorView()", peekDecorView);
            c1982h.f24163c.invoke(peekDecorView);
        }
        this.f25966h0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        Iterator it = ((CopyOnWriteArrayList) this.f25965Z.f17429i0).iterator();
        if (!it.hasNext()) {
            this.f25966h0.onWindowFocusChanged(z10);
        } else {
            AbstractC2469q0.p(it.next());
            throw null;
        }
    }
}
