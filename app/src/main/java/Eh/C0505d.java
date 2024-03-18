package Eh;

import Bh.AbstractC0265q;
import java.util.Collections;
import yh.C6633q0;

/* renamed from: Eh.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505d extends AbstractC0506e {

    /* renamed from: h0  reason: collision with root package name */
    public final String f4776h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f4777i0;

    public C0505d(String str) {
        jf.y yVar = jf.y.f36177a;
        this.f4776h0 = str;
        this.f4777i0 = yVar;
    }

    @Override // Eh.AbstractC0523w
    public final Hh.b c(Dh.n nVar) {
        return new C0504c(this, nVar.f4810a);
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        Object obj = this.f4777i0;
        return abstractC0265q.P0(new vh.f(this.f4776h0, 4169, C6633q0.i1(obj.getClass()), Collections.emptyList()), obj);
    }

    @Override // Eh.AbstractC0506e
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C0505d.class != obj.getClass()) {
            return false;
        }
        C0505d c0505d = (C0505d) obj;
        if (!this.f4776h0.equals(c0505d.f4776h0) || !this.f4777i0.equals(c0505d.f4777i0)) {
            return false;
        }
        return true;
    }

    @Override // Eh.AbstractC0506e
    public final int hashCode() {
        return this.f4777i0.hashCode() + E9.f.v(this.f4776h0, super.hashCode() * 31, 31);
    }
}
