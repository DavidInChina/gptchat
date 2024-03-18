package Z;

import j0.AbstractC3883H;
import j0.AbstractC3884I;
import j0.AbstractC3893i;

/* loaded from: classes.dex */
public abstract class S0 extends AbstractC3883H implements AbstractC1706d0, j0.s {

    /* renamed from: Z  reason: collision with root package name */
    public R0 f22567Z;

    @Override // j0.s
    public final Z0 c() {
        return o1.f22665a;
    }

    @Override // Z.l1
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((R0) j0.p.s(this.f22567Z, this)).f22565c;
    }

    public final void i(float f6) {
        AbstractC3893i i10;
        R0 r02 = (R0) j0.p.h(this.f22567Z);
        if (r02.f22565c != f6) {
            R0 r03 = this.f22567Z;
            synchronized (j0.p.f35918b) {
                int i11 = AbstractC3893i.f35891e;
                i10 = j0.p.i();
                ((R0) j0.p.n(r03, this, i10, r02)).f22565c = f6;
            }
            j0.p.m(i10, this);
        }
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f22567Z;
    }

    @Override // j0.AbstractC3883H, j0.AbstractC3882G
    public final AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        if (((R0) abstractC3884I2).f22565c != ((R0) abstractC3884I3).f22565c) {
            return null;
        }
        return abstractC3884I2;
    }

    @Override // Z.AbstractC1710f0
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((R0) j0.p.h(this.f22567Z)).f22565c + ")@" + hashCode();
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f22567Z = (R0) abstractC3884I;
    }
}
