package V1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2081p;
import g.RunnableC3111d;
import l2.C4333d;

/* loaded from: classes2.dex */
public final class a0 implements AbstractC2077l, A3.f, androidx.lifecycle.e0 {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractComponentCallbacksC1480v f18150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final androidx.lifecycle.d0 f18151Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f18152h0;

    /* renamed from: i0  reason: collision with root package name */
    public androidx.lifecycle.b0 f18153i0;

    /* renamed from: j0  reason: collision with root package name */
    public C2088x f18154j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public A3.e f18155k0 = null;

    public a0(AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v, androidx.lifecycle.d0 d0Var, RunnableC3111d runnableC3111d) {
        this.f18150Y = abstractComponentCallbacksC1480v;
        this.f18151Z = d0Var;
        this.f18152h0 = runnableC3111d;
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final androidx.lifecycle.b0 b() {
        Application application;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18150Y;
        androidx.lifecycle.b0 b10 = abstractComponentCallbacksC1480v.b();
        if (!b10.equals(abstractComponentCallbacksC1480v.f18281V0)) {
            this.f18153i0 = b10;
            return b10;
        }
        if (this.f18153i0 == null) {
            Context applicationContext = abstractComponentCallbacksC1480v.K().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f18153i0 = new androidx.lifecycle.V(application, abstractComponentCallbacksC1480v, abstractComponentCallbacksC1480v.f18290k0);
        }
        return this.f18153i0;
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final C4333d c() {
        Application application;
        AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = this.f18150Y;
        Context applicationContext = abstractComponentCallbacksC1480v.K().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C4333d c4333d = new C4333d(0);
        if (application != null) {
            c4333d.a(androidx.lifecycle.Z.f25347Y, application);
        }
        c4333d.a(androidx.lifecycle.S.f25325a, abstractComponentCallbacksC1480v);
        c4333d.a(androidx.lifecycle.S.f25326b, this);
        Bundle bundle = abstractComponentCallbacksC1480v.f18290k0;
        if (bundle != null) {
            c4333d.a(androidx.lifecycle.S.f25327c, bundle);
        }
        return c4333d;
    }

    public final void d(EnumC2081p enumC2081p) {
        this.f18154j0.k(enumC2081p);
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.d0 e() {
        g();
        return this.f18151Z;
    }

    @Override // A3.f
    public final A3.d f() {
        g();
        return this.f18155k0.f645b;
    }

    public final void g() {
        if (this.f18154j0 == null) {
            this.f18154j0 = new C2088x(this);
            A3.e eVar = new A3.e(this);
            this.f18155k0 = eVar;
            eVar.a();
            this.f18152h0.run();
        }
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final androidx.lifecycle.S h() {
        g();
        return this.f18154j0;
    }
}
