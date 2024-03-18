package g;

import D1.AbstractC0367o;
import K4.J;
import a1.C1915c;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2077l;
import androidx.lifecycle.C2088x;
import androidx.lifecycle.EnumC2082q;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import c1.AbstractC2279d;
import com.openai.chatgpt.R;
import i.AbstractC3453b;
import i.C3452a;
import id.AbstractC3557B;
import j.AbstractC3873c;
import j.C3874d;
import j.C3875e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l2.C4333d;
import o1.AbstractActivityC4898m;
import o1.C4901p;
import o1.N;
import o1.O;
import o1.P;
import q1.AbstractC5260f;
import wf.AbstractC6216a;

/* renamed from: g.o */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3122o extends AbstractActivityC4898m implements e0, AbstractC2077l, A3.f, AbstractC3106E, j.i, p1.n, p1.o, N, O, AbstractC0367o {

    /* renamed from: i0 */
    public final C2088x f30968i0;

    /* renamed from: j0 */
    public final A3.e f30969j0;

    /* renamed from: k0 */
    public d0 f30970k0;

    /* renamed from: l0 */
    public V f30971l0;

    /* renamed from: n0 */
    public final ExecutorC3121n f30973n0;

    /* renamed from: o0 */
    public final C3124q f30974o0;

    /* renamed from: Z */
    public final C3452a f30966Z = new C3452a();

    /* renamed from: h0 */
    public final U3.u f30967h0 = new U3.u(new RunnableC3111d(0, this));

    /* renamed from: m0 */
    public C3104C f30972m0 = null;

    /* renamed from: p0 */
    public final AtomicInteger f30975p0 = new AtomicInteger();

    /* renamed from: q0 */
    public final C3116i f30976q0 = new C3116i(this);

    /* renamed from: r0 */
    public final CopyOnWriteArrayList f30977r0 = new CopyOnWriteArrayList();

    /* renamed from: s0 */
    public final CopyOnWriteArrayList f30978s0 = new CopyOnWriteArrayList();

    /* renamed from: t0 */
    public final CopyOnWriteArrayList f30979t0 = new CopyOnWriteArrayList();

    /* renamed from: u0 */
    public final CopyOnWriteArrayList f30980u0 = new CopyOnWriteArrayList();

    /* renamed from: v0 */
    public final CopyOnWriteArrayList f30981v0 = new CopyOnWriteArrayList();

    /* renamed from: w0 */
    public boolean f30982w0 = false;

    /* renamed from: x0 */
    public boolean f30983x0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.u, java.lang.Object, g.r] */
    /* JADX WARN: Type inference failed for: r5v0, types: [g.e] */
    public AbstractActivityC3122o() {
        this.f40465Y = new C2088x(this);
        C2088x c2088x = new C2088x(this);
        this.f30968i0 = c2088x;
        A3.e eVar = new A3.e(this);
        this.f30969j0 = eVar;
        ExecutorC3121n executorC3121n = new ExecutorC3121n(this);
        this.f30973n0 = executorC3121n;
        this.f30974o0 = new C3124q(executorC3121n, new AbstractC6216a() { // from class: g.e
            @Override // wf.AbstractC6216a
            /* renamed from: invoke */
            public final Object mo122invoke() {
                AbstractActivityC3122o.this.reportFullyDrawn();
                return null;
            }
        });
        int i10 = Build.VERSION.SDK_INT;
        c2088x.a(new C3117j(this, 0));
        c2088x.a(new C3117j(this, 1));
        c2088x.a(new C3117j(this, 2));
        eVar.a();
        S.e(this);
        if (i10 <= 23) {
            ?? obj = new Object();
            obj.f30994Y = this;
            c2088x.a(obj);
        }
        eVar.f645b.c("android:support:activity-result", new C3113f(0, this));
        j(new C3114g(this, 0));
    }

    public static /* synthetic */ void i(AbstractActivityC3122o abstractActivityC3122o) {
        super.onBackPressed();
    }

    @Override // g.AbstractC3106E
    public final C3104C a() {
        if (this.f30972m0 == null) {
            this.f30972m0 = new C3104C(new RunnableC3118k(0, this));
            this.f30968i0.a(new C3117j(this, 3));
        }
        return this.f30972m0;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.f30973n0.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final b0 b() {
        Bundle bundle;
        if (this.f30971l0 == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.f30971l0 = new V(application, this, bundle);
        }
        return this.f30971l0;
    }

    @Override // androidx.lifecycle.AbstractC2077l
    public final C4333d c() {
        C4333d c4333d = new C4333d(0);
        if (getApplication() != null) {
            c4333d.a(Z.f25347Y, getApplication());
        }
        c4333d.a(S.f25325a, this);
        c4333d.a(S.f25326b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c4333d.a(S.f25327c, getIntent().getExtras());
        }
        return c4333d;
    }

    @Override // j.i
    public final j.h d() {
        return this.f30976q0;
    }

    @Override // androidx.lifecycle.e0
    public final d0 e() {
        if (getApplication() != null) {
            if (this.f30970k0 == null) {
                C3120m c3120m = (C3120m) getLastNonConfigurationInstance();
                if (c3120m != null) {
                    this.f30970k0 = c3120m.f30961a;
                }
                if (this.f30970k0 == null) {
                    this.f30970k0 = new d0();
                }
            }
            return this.f30970k0;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // A3.f
    public final A3.d f() {
        return this.f30969j0.f645b;
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final S h() {
        return this.f30968i0;
    }

    public final void j(AbstractC3453b abstractC3453b) {
        C3452a c3452a = this.f30966Z;
        c3452a.getClass();
        if (c3452a.f32392b != null) {
            abstractC3453b.a();
        }
        c3452a.f32391a.add(abstractC3453b);
    }

    public final void k() {
        J.Z(getWindow().getDecorView(), this);
        AbstractC2279d.w(getWindow().getDecorView(), this);
        AbstractC5260f.N(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC3557B.c0("<this>", decorView);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC3557B.c0("<this>", decorView2);
        decorView2.setTag(R.id.report_drawn, this);
    }

    public final C3875e l(AbstractC3873c abstractC3873c, k.h hVar) {
        String str = "activity_rq#" + this.f30975p0.getAndIncrement();
        C3116i c3116i = this.f30976q0;
        c3116i.getClass();
        C2088x c2088x = this.f30968i0;
        if (!c2088x.f25386f.a(EnumC2082q.f25378i0)) {
            c3116i.d(str);
            HashMap hashMap = c3116i.f35812c;
            j.g gVar = (j.g) hashMap.get(str);
            if (gVar == null) {
                gVar = new j.g(c2088x);
            }
            C3874d c3874d = new C3874d(c3116i, str, abstractC3873c, hVar);
            gVar.f35808a.a(c3874d);
            gVar.f35809b.add(c3874d);
            hashMap.put(str, gVar);
            return new C3875e(c3116i, str, hVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + this + " is attempting to register while current state is " + c2088x.f25386f + ". LifecycleOwners must call register before they are STARTED.");
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f30976q0.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f30977r0.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(configuration);
        }
    }

    @Override // o1.AbstractActivityC4898m, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f30969j0.b(bundle);
        C3452a c3452a = this.f30966Z;
        c3452a.getClass();
        c3452a.f32392b = this;
        Iterator it = c3452a.f32391a.iterator();
        while (it.hasNext()) {
            ((AbstractC3453b) it.next()).a();
        }
        super.onCreate(bundle);
        C1915c.p(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f30967h0.f17493h0).iterator();
            while (it.hasNext()) {
                ((V1.D) it.next()).f18020a.j();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f30967h0.J();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f30982w0 = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f30982w0 = false;
            Iterator it = this.f30980u0.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new C4901p(z10, 0));
            }
        } catch (Throwable th2) {
            this.f30982w0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f30979t0.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f30967h0.f17493h0).iterator();
        while (it.hasNext()) {
            ((V1.D) it.next()).f18020a.p();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f30983x0 = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f30983x0 = false;
            Iterator it = this.f30981v0.iterator();
            while (it.hasNext()) {
                ((C1.a) it.next()).accept(new P(z10, 0));
            }
        } catch (Throwable th2) {
            this.f30983x0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f30967h0.f17493h0).iterator();
            while (it.hasNext()) {
                ((V1.D) it.next()).f18020a.s();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, o1.AbstractC4890e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f30976q0.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [g.m, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C3120m c3120m;
        d0 d0Var = this.f30970k0;
        if (d0Var == null && (c3120m = (C3120m) getLastNonConfigurationInstance()) != null) {
            d0Var = c3120m.f30961a;
        }
        if (d0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f30961a = d0Var;
        return obj;
    }

    @Override // o1.AbstractActivityC4898m, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C2088x c2088x = this.f30968i0;
        if (c2088x instanceof C2088x) {
            c2088x.m(EnumC2082q.f25377h0);
        }
        super.onSaveInstanceState(bundle);
        this.f30969j0.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f30978s0.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Gi.e.D()) {
                Trace.beginSection(Gi.e.V("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            this.f30974o0.a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        k();
        this.f30973n0.a(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        k();
        this.f30973n0.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        this.f30973n0.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f30982w0) {
            return;
        }
        Iterator it = this.f30980u0.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new C4901p(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f30983x0) {
            return;
        }
        Iterator it = this.f30981v0.iterator();
        while (it.hasNext()) {
            ((C1.a) it.next()).accept(new P(z10));
        }
    }
}
