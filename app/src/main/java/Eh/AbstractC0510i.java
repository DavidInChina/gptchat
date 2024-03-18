package Eh;

import k6.AbstractC4194d;
import yh.l1;

/* renamed from: Eh.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0510i implements AbstractC0511j {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f4793a;

    /* renamed from: b  reason: collision with root package name */
    public final ph.f f4794b;

    /* renamed from: c  reason: collision with root package name */
    public final EnumC0516o f4795c;

    public AbstractC0510i(l1 l1Var, ph.f fVar, EnumC0516o enumC0516o) {
        this.f4793a = l1Var;
        this.f4794b = fVar;
        this.f4795c = enumC0516o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC0510i abstractC0510i = (AbstractC0510i) obj;
        if (this.f4795c.equals(abstractC0510i.f4795c) && this.f4793a.equals(abstractC0510i.f4793a) && this.f4794b.equals(abstractC0510i.f4794b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        l1 l1Var = this.f4793a;
        return this.f4795c.hashCode() + ((AbstractC4194d.t(l1Var, getClass().hashCode() * 31, 31) + this.f4794b.f43205Y) * 31);
    }
}
