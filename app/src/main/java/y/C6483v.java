package y;

import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* renamed from: y.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6483v implements E0.a0 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f50306b;

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6483v) && this.f50306b == ((C6483v) obj).f50306b) {
            return true;
        }
        return false;
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public final int hashCode() {
        if (this.f50306b) {
            return 1231;
        }
        return 1237;
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    public final String toString() {
        return AbstractC6463a.l(new StringBuilder("ChildData(isTarget="), this.f50306b, ')');
    }
}
