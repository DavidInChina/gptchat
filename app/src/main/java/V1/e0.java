package V1;

import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import h.C3276b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import y1.AbstractC6496f;
import y1.C6497g;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f18183a;

    /* renamed from: b  reason: collision with root package name */
    public int f18184b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractComponentCallbacksC1480v f18185c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f18186d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f18187e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f18188f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18189g;

    public e0(int i10, int i11, AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, C6497g c6497g) {
        AbstractC2469q0.q("finalState", i10);
        AbstractC2469q0.q("lifecycleImpact", i11);
        this.f18183a = i10;
        this.f18184b = i11;
        this.f18185c = abstractComponentCallbacksC1480v;
        c6497g.a(new C3276b(3, this));
    }

    public final void a() {
        if (this.f18188f) {
            return;
        }
        this.f18188f = true;
        if (this.f18187e.isEmpty()) {
            b();
            return;
        }
        for (C6497g c6497g : kf.t.O2(this.f18187e)) {
            synchronized (c6497g) {
                try {
                    if (!c6497g.f50322a) {
                        c6497g.f50322a = true;
                        c6497g.f50324c = true;
                        AbstractC6496f abstractC6496f = c6497g.f50323b;
                        if (abstractC6496f != null) {
                            try {
                                abstractC6496f.b();
                            } catch (Throwable th2) {
                                synchronized (c6497g) {
                                    c6497g.f50324c = false;
                                    c6497g.notifyAll();
                                    throw th2;
                                }
                            }
                        }
                        synchronized (c6497g) {
                            c6497g.f50324c = false;
                            c6497g.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void b();

    public final void c(int i10, int i11) {
        AbstractC2469q0.q("finalState", i10);
        AbstractC2469q0.q("lifecycleImpact", i11);
        int f6 = AbstractC6708l.f(i11);
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18185c;
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1480v + " mFinalState = " + R.a.F(this.f18183a) + " -> REMOVED. mLifecycleImpact  = " + R.a.E(this.f18184b) + " to REMOVING.");
                    }
                    this.f18183a = 1;
                    this.f18184b = 3;
                }
            } else if (this.f18183a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1480v + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + R.a.E(this.f18184b) + " to ADDING.");
                }
                this.f18183a = 2;
                this.f18184b = 2;
            }
        } else if (this.f18183a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1480v + " mFinalState = " + R.a.F(this.f18183a) + " -> " + R.a.F(i10) + '.');
            }
            this.f18183a = i10;
        }
    }

    public abstract void d();

    public final String toString() {
        StringBuilder s10 = android.gov.nist.core.a.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        s10.append(R.a.F(this.f18183a));
        s10.append(" lifecycleImpact = ");
        s10.append(R.a.E(this.f18184b));
        s10.append(" fragment = ");
        s10.append(this.f18185c);
        s10.append('}');
        return s10.toString();
    }
}
