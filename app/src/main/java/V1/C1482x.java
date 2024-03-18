package V1;

import D1.AbstractC0367o;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g.AbstractC3106E;
import g.C3104C;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import n.AbstractC4694e;

/* renamed from: V1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482x extends AbstractC4694e implements p1.n, p1.o, o1.N, o1.O, androidx.lifecycle.e0, AbstractC3106E, j.i, A3.f, N, AbstractC0367o {

    /* renamed from: Y  reason: collision with root package name */
    public final Activity f18308Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Context f18309Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Handler f18310h0;

    /* renamed from: i0  reason: collision with root package name */
    public final K f18311i0 = new K();

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1483y f18312j0;

    public C1482x(AbstractActivityC1483y abstractActivityC1483y) {
        this.f18312j0 = abstractActivityC1483y;
        Handler handler = new Handler();
        this.f18308Y = abstractActivityC1483y;
        this.f18309Z = abstractActivityC1483y;
        this.f18310h0 = handler;
    }

    public final void A(B b10) {
        this.f18312j0.f30978s0.remove(b10);
    }

    @Override // g.AbstractC3106E
    public final C3104C a() {
        return this.f18312j0.a();
    }

    @Override // V1.N
    public final void b() {
        this.f18312j0.getClass();
    }

    @Override // j.i
    public final j.h d() {
        return this.f18312j0.f30976q0;
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.d0 e() {
        return this.f18312j0.e();
    }

    @Override // A3.f
    public final A3.d f() {
        return this.f18312j0.f30969j0.f645b;
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final androidx.lifecycle.S h() {
        return this.f18312j0.f18318z0;
    }

    @Override // n.AbstractC4694e
    public final View k(int i10) {
        return this.f18312j0.findViewById(i10);
    }

    @Override // n.AbstractC4694e
    public final boolean l() {
        Window window = this.f18312j0.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    public final void r(D d10) {
        U3.u uVar = this.f18312j0.f30967h0;
        ((CopyOnWriteArrayList) uVar.f17493h0).add(d10);
        ((Runnable) uVar.f17492Z).run();
    }

    public final void s(C1.a aVar) {
        this.f18312j0.f30977r0.add(aVar);
    }

    public final void t(B b10) {
        this.f18312j0.f30980u0.add(b10);
    }

    public final void u(B b10) {
        this.f18312j0.f30981v0.add(b10);
    }

    public final void v(B b10) {
        this.f18312j0.f30978s0.add(b10);
    }

    public final void w(D d10) {
        U3.u uVar = this.f18312j0.f30967h0;
        ((CopyOnWriteArrayList) uVar.f17493h0).remove(d10);
        AbstractC2469q0.p(((Map) uVar.f17494i0).remove(d10));
        ((Runnable) uVar.f17492Z).run();
    }

    public final void x(B b10) {
        this.f18312j0.f30977r0.remove(b10);
    }

    public final void y(B b10) {
        this.f18312j0.f30980u0.remove(b10);
    }

    public final void z(B b10) {
        this.f18312j0.f30981v0.remove(b10);
    }
}
