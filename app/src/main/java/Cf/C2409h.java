package cf;

import Df.v;
import Qg.AbstractC1207j;
import Qg.D0;
import Qg.F0;
import Qg.l0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import wf.n;

/* renamed from: cf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2409h implements l0 {

    /* renamed from: Y  reason: collision with root package name */
    public final l0 f26613Y;

    /* renamed from: Z  reason: collision with root package name */
    public final n f26614Z;

    public C2409h(F0 f02, n nVar) {
        this.f26613Y = f02;
        this.f26614Z = nVar;
    }

    @Override // Qg.AbstractC1206i
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        return this.f26613Y.b(abstractC1207j, abstractC4825e);
    }

    @Override // Qg.k0, Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        return this.f26613Y.c(obj, abstractC4825e);
    }

    public final Object d(v vVar) {
        AbstractC3557B.c0("property", vVar);
        if (AbstractC3557B.K(AbstractC2403b.f26610b.get(), Boolean.TRUE)) {
            AbstractC2403b.f26609a.set(this);
        }
        return this.f26613Y.getValue();
    }

    @Override // Qg.l0
    public final boolean e(Object obj, Object obj2) {
        return this.f26613Y.e(obj, obj2);
    }

    @Override // Qg.k0
    public final void f() {
        this.f26613Y.f();
    }

    @Override // Qg.k0
    public final boolean g(Object obj) {
        return this.f26613Y.g(obj);
    }

    @Override // Qg.l0, Qg.D0
    public final Object getValue() {
        return this.f26613Y.getValue();
    }

    public final void h(Object obj, v vVar) {
        AbstractC3557B.c0("property", vVar);
        l0 l0Var = this.f26613Y;
        Object value = l0Var.getValue();
        l0Var.setValue(obj);
        n nVar = this.f26614Z;
        if (nVar != null) {
            nVar.invoke(obj, value);
        }
    }

    @Override // Qg.k0
    public final D0 i() {
        return this.f26613Y.i();
    }

    @Override // Qg.l0
    public final void setValue(Object obj) {
        this.f26613Y.setValue(obj);
    }
}
