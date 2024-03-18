package Z;

import j0.AbstractC3883H;
import j0.AbstractC3884I;
import j0.AbstractC3893i;

/* loaded from: classes.dex */
public abstract class U0 extends AbstractC3883H implements AbstractC1708e0, j0.s {

    /* renamed from: Z  reason: collision with root package name */
    public T0 f22574Z;

    @Override // j0.s
    public final Z0 c() {
        return o1.f22665a;
    }

    @Override // Z.l1
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((T0) j0.p.s(this.f22574Z, this)).f22570c;
    }

    public final void i(int i10) {
        AbstractC3893i i11;
        T0 t02 = (T0) j0.p.h(this.f22574Z);
        if (t02.f22570c != i10) {
            T0 t03 = this.f22574Z;
            synchronized (j0.p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = j0.p.i();
                ((T0) j0.p.n(t03, this, i11, t02)).f22570c = i10;
            }
            j0.p.m(i11, this);
        }
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f22574Z;
    }

    @Override // j0.AbstractC3883H, j0.AbstractC3882G
    public final AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        if (((T0) abstractC3884I2).f22570c != ((T0) abstractC3884I3).f22570c) {
            return null;
        }
        return abstractC3884I2;
    }

    @Override // Z.AbstractC1710f0
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((T0) j0.p.h(this.f22574Z)).f22570c + ")@" + hashCode();
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f22574Z = (T0) abstractC3884I;
    }
}
