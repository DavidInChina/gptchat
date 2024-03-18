package Rh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import wh.AbstractC6242g;
import wh.AbstractC6256u;

/* renamed from: Rh.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1317o implements AbstractC1291b {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15933Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1319p f15934Z;

    public C1317o(C1319p c1319p, String str) {
        this.f15934Z = c1319p;
        this.f15933Y = str;
    }

    @Override // Rh.AbstractC1291b
    public final String a() {
        C1319p c1319p = this.f15934Z;
        yh.l1 mo119g = ((AbstractC6242g) ((AbstractC1239q) ((AbstractC6256u) ((AbstractC1239q) c1319p.f15935Y.a(c1319p.f15936Z).a().i()).f(AbstractC1235m.c(this.f15933Y)))).r()).getReturnType().l0().mo119g();
        if (mo119g == null) {
            return null;
        }
        return mo119g.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1317o.class != obj.getClass()) {
            return false;
        }
        C1317o c1317o = (C1317o) obj;
        if (this.f15933Y.equals(c1317o.f15933Y) && this.f15934Z.equals(c1317o.f15934Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15934Z.hashCode() + E9.f.v(this.f15933Y, C1317o.class.hashCode() * 31, 31);
    }
}
