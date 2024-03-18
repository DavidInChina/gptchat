package Z;

import j0.AbstractC3883H;
import j0.AbstractC3884I;
import j0.AbstractC3893i;

/* loaded from: classes2.dex */
public abstract class Y0 extends AbstractC3883H implements j0.s {

    /* renamed from: Z  reason: collision with root package name */
    public final Z0 f22591Z;

    /* renamed from: h0  reason: collision with root package name */
    public X0 f22592h0;

    public Y0(Object obj, Z0 z02) {
        this.f22591Z = z02;
        this.f22592h0 = new X0(obj);
    }

    @Override // j0.s
    public final Z0 c() {
        return this.f22591Z;
    }

    @Override // Z.l1
    public final Object getValue() {
        return ((X0) j0.p.s(this.f22592h0, this)).f22587c;
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f22592h0;
    }

    @Override // j0.AbstractC3883H, j0.AbstractC3882G
    public final AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        X0 x02 = (X0) abstractC3884I;
        if (!this.f22591Z.a(((X0) abstractC3884I2).f22587c, ((X0) abstractC3884I3).f22587c)) {
            return null;
        }
        return abstractC3884I2;
    }

    @Override // Z.AbstractC1710f0
    public final void setValue(Object obj) {
        AbstractC3893i i10;
        X0 x02 = (X0) j0.p.h(this.f22592h0);
        if (!this.f22591Z.a(x02.f22587c, obj)) {
            X0 x03 = this.f22592h0;
            synchronized (j0.p.f35918b) {
                int i11 = AbstractC3893i.f35891e;
                i10 = j0.p.i();
                ((X0) j0.p.n(x03, this, i10, x02)).f22587c = obj;
            }
            j0.p.m(i10, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((X0) j0.p.h(this.f22592h0)).f22587c + ")@" + hashCode();
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f22592h0 = (X0) abstractC3884I;
    }
}
