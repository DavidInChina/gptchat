package yh;

import yh.l1;

/* loaded from: classes.dex */
public class R0 implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public final Ph.a f50966Y;

    public R0(Ph.a aVar) {
        this.f50966Y = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f50966Y.equals(((R0) obj).f50966Y)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Ph.a a(l1.a aVar) {
        l1.a mo119g = aVar.mo119g();
        Ph.a aVar2 = this.f50966Y;
        mo119g.k(new R0(aVar2.a()));
        return aVar2;
    }

    /* renamed from: g */
    public Ph.a b(l1.a aVar) {
        boolean T02 = aVar.T0();
        Ph.a aVar2 = this.f50966Y;
        if (T02) {
            aVar.mo119g().k(new R0(aVar2.a()));
        } else if (aVar.a1()) {
            aVar2.b(aVar.l0().getDescriptor().charAt(0));
        } else {
            aVar2.e(aVar.l0().D0());
            aVar2.f();
        }
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[LOOP:0: B:9:0x0035->B:11:0x003b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(l1.a aVar) {
        l1.a ownerType = aVar.getOwnerType();
        Ph.a aVar2 = this.f50966Y;
        if (ownerType != null) {
            EnumC6628o c10 = ownerType.c();
            c10.getClass();
            if (c10 == EnumC6628o.f51059h0) {
                h(ownerType);
                aVar2.i(aVar.l0().o());
                for (l1.a aVar3 : aVar.y0()) {
                    aVar3.k(new R0(aVar2));
                }
            }
        }
        aVar2.e(aVar.l0().D0());
        while (r5.hasNext()) {
        }
    }

    public final int hashCode() {
        return this.f50966Y.hashCode() + (getClass().hashCode() * 31);
    }

    /* renamed from: i */
    public Ph.a c(l1.a aVar) {
        h(aVar);
        Ph.a aVar2 = this.f50966Y;
        aVar2.f();
        return aVar2;
    }

    /* renamed from: j */
    public Ph.a e(l1.a aVar) {
        String A02 = aVar.A0();
        Ph.a aVar2 = this.f50966Y;
        aVar2.q(A02);
        return aVar2;
    }

    /* renamed from: k */
    public Ph.a d(l1.a aVar) {
        throw new IllegalStateException("Unexpected wildcard: " + aVar);
    }
}
