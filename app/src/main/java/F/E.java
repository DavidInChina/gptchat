package F;

import B.AbstractC0168u1;
import E0.h0;
import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class E implements h0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4855b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0168u1 f4856c;

    public /* synthetic */ E(AbstractC0168u1 abstractC0168u1, int i10) {
        this.f4855b = i10;
        this.f4856c = abstractC0168u1;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        switch (this.f4855b) {
            case 0:
                return nVar.invoke(obj, this);
            default:
                return nVar.invoke(obj, this);
        }
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        int i10 = this.f4855b;
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        switch (this.f4855b) {
            case 0:
                return ((Boolean) kVar.invoke(this)).booleanValue();
            default:
                return ((Boolean) kVar.invoke(this)).booleanValue();
        }
    }
}
