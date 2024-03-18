package Wg;

import Ng.AbstractC1070k;
import Ng.B;
import Ng.C1072l;
import Ng.P0;
import Q1.u;
import Sg.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class c implements AbstractC1070k, P0 {

    /* renamed from: Y  reason: collision with root package name */
    public final C1072l f21091Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f21092Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f21093h0;

    public c(d dVar, C1072l c1072l, Object obj) {
        this.f21093h0 = dVar;
        this.f21091Y = c1072l;
        this.f21092Z = obj;
    }

    @Override // Ng.AbstractC1070k
    public final void A(Object obj, wf.k kVar) {
        y yVar = y.f36177a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f21094h;
        Object obj2 = this.f21092Z;
        d dVar = this.f21093h0;
        atomicReferenceFieldUpdater.set(dVar, obj2);
        this.f21091Y.A(yVar, new b(dVar, this, 0));
    }

    @Override // Ng.AbstractC1070k
    public final void B(Object obj) {
        this.f21091Y.B(obj);
    }

    @Override // Ng.AbstractC1070k
    public final boolean a() {
        return this.f21091Y.a();
    }

    @Override // Ng.P0
    public final void c(z zVar, int i10) {
        this.f21091Y.c(zVar, i10);
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f21091Y.f12956j0;
    }

    @Override // Ng.AbstractC1070k
    public final boolean j() {
        return this.f21091Y.j();
    }

    @Override // Ng.AbstractC1070k
    public final boolean m() {
        return this.f21091Y.m();
    }

    @Override // Ng.AbstractC1070k
    public final u o(Throwable th2) {
        return this.f21091Y.o(th2);
    }

    @Override // Ng.AbstractC1070k
    public final void q(B b10) {
        this.f21091Y.q(b10);
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        this.f21091Y.resumeWith(obj);
    }

    @Override // Ng.AbstractC1070k
    public final boolean s(Throwable th2) {
        return this.f21091Y.s(th2);
    }

    @Override // Ng.AbstractC1070k
    public final u x(Object obj, wf.k kVar) {
        d dVar = this.f21093h0;
        b bVar = new b(dVar, this, 1);
        u H6 = this.f21091Y.H((y) obj, bVar);
        if (H6 != null) {
            d.f21094h.set(dVar, this.f21092Z);
        }
        return H6;
    }
}
