package G0;

import k6.AbstractC4194d;
import l0.AbstractC4324p;
import l0.AbstractC4325q;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public abstract class X implements AbstractC4324p {
    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public abstract int hashCode();

    public abstract AbstractC4325q j();

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public abstract void m(AbstractC4325q abstractC4325q);
}
