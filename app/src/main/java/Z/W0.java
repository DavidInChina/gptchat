package Z;

import j0.AbstractC3883H;
import j0.AbstractC3884I;
import j0.AbstractC3893i;

/* loaded from: classes.dex */
public abstract class W0 extends AbstractC3883H implements AbstractC1710f0, l1, j0.s {

    /* renamed from: Z  reason: collision with root package name */
    public V0 f22582Z;

    @Override // j0.s
    public final Z0 c() {
        return o1.f22665a;
    }

    @Override // Z.l1
    public final Object getValue() {
        return Long.valueOf(((V0) j0.p.s(this.f22582Z, this)).f22577c);
    }

    public final void h(long j6) {
        AbstractC3893i i10;
        V0 v02 = (V0) j0.p.h(this.f22582Z);
        if (v02.f22577c != j6) {
            V0 v03 = this.f22582Z;
            synchronized (j0.p.f35918b) {
                int i11 = AbstractC3893i.f35891e;
                i10 = j0.p.i();
                ((V0) j0.p.n(v03, this, i10, v02)).f22577c = j6;
            }
            j0.p.m(i10, this);
        }
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f22582Z;
    }

    @Override // j0.AbstractC3883H, j0.AbstractC3882G
    public final AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        if (((V0) abstractC3884I2).f22577c != ((V0) abstractC3884I3).f22577c) {
            return null;
        }
        return abstractC3884I2;
    }

    @Override // Z.AbstractC1710f0
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((V0) j0.p.h(this.f22582Z)).f22577c + ")@" + hashCode();
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f22582Z = (V0) abstractC3884I;
    }
}
