package Bg;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Mf.b0 f2104a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0210c f2105b;

    public b0(Mf.b0 b0Var, AbstractC0210c abstractC0210c) {
        AbstractC3557B.c0("typeParameter", b0Var);
        AbstractC3557B.c0("typeAttr", abstractC0210c);
        this.f2104a = b0Var;
        this.f2105b = abstractC0210c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!AbstractC3557B.K(b0Var.f2104a, this.f2104a) || !AbstractC3557B.K(b0Var.f2105b, this.f2105b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2104a.hashCode();
        return this.f2105b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f2104a + ", typeAttr=" + this.f2105b + ')';
    }
}
