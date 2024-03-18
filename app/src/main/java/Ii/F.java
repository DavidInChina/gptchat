package Ii;

import A.S0;
import ae.AbstractC1979e;
import ae.AbstractC1980f;
import ae.AbstractC1981g;
import ae.AbstractC1983i;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import f.AbstractC2929a;
import id.AbstractC3557B;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.AbstractC3957g;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class F implements AbstractC1980f {

    /* renamed from: a  reason: collision with root package name */
    public static final F f8630a = new Object();

    @Override // ae.AbstractC1980f
    public final void a(View view, boolean z10) {
        AbstractC3557B.c0("view", view);
        if (z10) {
            b(view);
        }
    }

    public final void b(View view) {
        AbstractC3557B.c0("view", view);
        final Window a5 = AbstractC1983i.a(view);
        if (a5 != null && AbstractC2929a.a(view) == 0) {
            AbstractC1983i.b(a5).add(new AbstractC1981g() { // from class: Ii.C
                @Override // ae.AbstractC1981g
                public final AbstractC1979e a(MotionEvent motionEvent, wf.k kVar) {
                    boolean z10;
                    final ViewGroup viewGroup;
                    AbstractC1979e abstractC1979e;
                    ViewGroup viewGroup2;
                    View view2;
                    ViewGroup viewGroup3;
                    B b10;
                    long j6;
                    Window window = a5;
                    AbstractC3557B.c0("$window", window);
                    AbstractC3557B.c0("motionEvent", motionEvent);
                    AbstractC3557B.c0("dispatch", kVar);
                    Mg.a aVar = Mg.b.f12127Z;
                    long y02 = Df.H.y0(System.nanoTime(), Mg.d.f12132Z);
                    if (motionEvent.getAction() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long e10 = Mg.b.e(y02);
                    if (z10) {
                        int i10 = (int) (e10 % Integer.MAX_VALUE);
                        Hi.q.a("Tap Interaction", i10);
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        if (obtain.getEventTime() > e10) {
                            j6 = e10;
                        } else {
                            j6 = obtain.getEventTime();
                        }
                        viewGroup = null;
                        B b11 = new B(new Hi.j(obtain, y02, Df.H.y0(j6, Mg.d.f12133h0), 0, new S0(i10, 2)));
                        b11.f8626Z.postFrameCallback(b11);
                        b10 = b11;
                    } else {
                        viewGroup = null;
                        b10 = null;
                    }
                    Runnable runnable = new Runnable() { // from class: Ii.E
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i11 = r2;
                            B b12 = viewGroup;
                            switch (i11) {
                                case 0:
                                    G.f8631a.set(b12);
                                    return;
                                default:
                                    AbstractC3557B.Z(b12);
                                    b12.f8626Z.removeFrameCallback(b12);
                                    Hi.j jVar = b12.f8625Y;
                                    ((MotionEvent) jVar.f7881a).recycle();
                                    AbstractC6216a abstractC6216a = jVar.f7885e;
                                    jVar.f7885e = null;
                                    if (abstractC6216a != null) {
                                        abstractC6216a.mo122invoke();
                                    }
                                    ThreadLocal threadLocal = G.f8631a;
                                    if (threadLocal.get() == b12) {
                                        threadLocal.set(null);
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    if (viewGroup != null) {
                        G.f8633c.post(runnable);
                    }
                    if (!Hi.q.d()) {
                        ThreadLocal threadLocal = G.f8631a;
                        threadLocal.set(viewGroup);
                        try {
                            abstractC1979e = (AbstractC1979e) kVar.invoke(motionEvent);
                            threadLocal.set(viewGroup);
                        } finally {
                            G.f8631a.set(viewGroup);
                        }
                    } else {
                        try {
                            String actionToString = MotionEvent.actionToString(motionEvent.getAction());
                            AbstractC3557B.b0("actionToString(motionEvent.action)", actionToString);
                            Hi.q.b(actionToString);
                            abstractC1979e = (AbstractC1979e) kVar.invoke(motionEvent);
                            r6.set(viewGroup);
                            if (Hi.q.d()) {
                                Trace.endSection();
                            }
                        } finally {
                            if (Hi.q.d()) {
                                Trace.endSection();
                            }
                        }
                    }
                    if (z10) {
                        Runnable runnable2 = new Runnable() { // from class: Ii.E
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i11 = r2;
                                B b12 = viewGroup;
                                switch (i11) {
                                    case 0:
                                        G.f8631a.set(b12);
                                        return;
                                    default:
                                        AbstractC3557B.Z(b12);
                                        b12.f8626Z.removeFrameCallback(b12);
                                        Hi.j jVar = b12.f8625Y;
                                        ((MotionEvent) jVar.f7881a).recycle();
                                        AbstractC6216a abstractC6216a = jVar.f7885e;
                                        jVar.f7885e = null;
                                        if (abstractC6216a != null) {
                                            abstractC6216a.mo122invoke();
                                        }
                                        ThreadLocal threadLocal2 = G.f8631a;
                                        if (threadLocal2.get() == b12) {
                                            threadLocal2.set(null);
                                            return;
                                        }
                                        return;
                                }
                            }
                        };
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (!Hi.q.d()) {
                            View decorView = window.getDecorView();
                            if (decorView instanceof ViewGroup) {
                                viewGroup3 = (ViewGroup) decorView;
                            } else {
                                viewGroup3 = viewGroup;
                            }
                            if (viewGroup3 == null) {
                                view2 = viewGroup;
                            } else {
                                view2 = r9.y.h0(viewGroup3);
                            }
                        } else {
                            try {
                                Hi.q.b("findPressedView()");
                                View decorView2 = window.getDecorView();
                                if (decorView2 instanceof ViewGroup) {
                                    viewGroup2 = (ViewGroup) decorView2;
                                } else {
                                    viewGroup2 = viewGroup;
                                }
                                if (viewGroup2 == null) {
                                    view2 = viewGroup;
                                } else {
                                    view2 = r9.y.h0(viewGroup2);
                                }
                            } finally {
                            }
                        }
                        if (view2 instanceof AbsListView) {
                            long pressedStateDuration = ViewConfiguration.getPressedStateDuration();
                            Handler handler = G.f8633c;
                            handler.removeCallbacks(runnable);
                            handler.postAtTime(runnable, (e10 + pressedStateDuration) - 1);
                            handler.postAtTime(runnable2, uptimeMillis + pressedStateDuration);
                        } else {
                            G.f8633c.post(runnable2);
                        }
                    }
                    return abstractC1979e;
                }
            });
            AbstractC3957g abstractC3957g = be.i.f25961i0;
            ((CopyOnWriteArrayList) M3.H.S(a5).f17427Z).add(new Object());
        }
    }
}
