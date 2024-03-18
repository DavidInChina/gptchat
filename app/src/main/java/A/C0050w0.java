package A;

import k6.AbstractC4194d;
import l0.AbstractC4326r;
import o0.AbstractC4871f;
import t0.AbstractC5646e;

/* renamed from: A.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0050w0 implements AbstractC4871f {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0042s0 f320b;

    public C0050w0(AbstractC0042s0 abstractC0042s0) {
        this.f320b = abstractC0042s0;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // o0.AbstractC4871f
    public final void f(AbstractC5646e abstractC5646e) {
        this.f320b.b(abstractC5646e);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
