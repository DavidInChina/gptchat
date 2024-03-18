package Bg;

import id.AbstractC3557B;
import java.util.List;
import ud.C5902a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class B extends A {

    /* renamed from: Z  reason: collision with root package name */
    public final Ag.u f2059Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6216a f2060h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Ag.l f2061i0;

    public B(Ag.u uVar, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("storageManager", uVar);
        this.f2059Z = uVar;
        this.f2060h0 = abstractC6216a;
        this.f2061i0 = new Ag.l((Ag.q) uVar, abstractC6216a);
    }

    @Override // Bg.A
    public final A A0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return new B(this.f2059Z, new C5902a(iVar, 25, this));
    }

    @Override // Bg.A
    public final o0 B0() {
        A C02 = C0();
        while (C02 instanceof B) {
            C02 = ((B) C02).C0();
        }
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType", C02);
        return (o0) C02;
    }

    public final A C0() {
        return (A) this.f2061i0.mo122invoke();
    }

    /* renamed from: D0 */
    public final String toString() {
        Ag.l lVar = this.f2061i0;
        if (lVar.f858h0 != Ag.o.f863Y && lVar.f858h0 != Ag.o.f864Z) {
            return C0().toString();
        }
        return "<Not computed yet>";
    }

    @Override // Bg.A
    public final ug.n R() {
        return C0().R();
    }

    @Override // Bg.A
    public final List w0() {
        return C0().w0();
    }

    @Override // Bg.A
    public final Q x0() {
        return C0().x0();
    }

    @Override // Bg.A
    public final Y y0() {
        return C0().y0();
    }

    @Override // Bg.A
    public final boolean z0() {
        return C0().z0();
    }
}
