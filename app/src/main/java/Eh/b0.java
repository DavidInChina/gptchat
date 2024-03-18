package Eh;

import Bh.AbstractC0261o;
import Bh.AbstractC0265q;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k6.AbstractC4194d;
import wh.AbstractC6240e;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public class b0 implements AbstractC0523w {

    /* renamed from: Y  reason: collision with root package name */
    public final K f4767Y;

    /* renamed from: Z  reason: collision with root package name */
    public final L f4768Z;

    /* renamed from: h0  reason: collision with root package name */
    public final List f4769h0;

    /* renamed from: i0  reason: collision with root package name */
    public final F f4770i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U f4771j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Ih.a f4772k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f4773l0;

    public b0(K k10, L l10, List list, F f6, U u10, Ih.a aVar, int i10) {
        this.f4767Y = k10;
        this.f4768Z = l10;
        this.f4769h0 = list;
        this.f4770i0 = f6;
        this.f4771j0 = u10;
        this.f4772k0 = aVar;
        this.f4773l0 = i10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wh.c, wh.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Eh.b0, Eh.a0] */
    public static a0 a(Method method) {
        return new b0(new K(new AbstractC6240e(method)), O.f4757Y, Collections.emptyList(), G.f4749Y, Y.f4762Y, Ih.a.f8608k, 1);
    }

    @Override // Eh.AbstractC0523w
    public final Hh.b c(Dh.n nVar) {
        Y y10 = (Y) this.f4771j0;
        y10.getClass();
        return new B(this, nVar, y10);
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        for (AbstractC0261o abstractC0261o : this.f4769h0) {
            abstractC0265q = abstractC0261o.e(abstractC0265q);
        }
        return this.f4768Z.e(abstractC0265q);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (AbstractC6708l.c(this.f4773l0, b0Var.f4773l0) && this.f4767Y.equals(b0Var.f4767Y) && this.f4768Z.equals(b0Var.f4768Z) && this.f4769h0.equals(b0Var.f4769h0) && this.f4770i0.equals(b0Var.f4770i0) && this.f4771j0.equals(b0Var.f4771j0) && this.f4772k0.equals(b0Var.f4772k0)) {
            return true;
        }
        return false;
    }

    public final b0 f(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            if (i10 >= 0) {
                arrayList.add(new C(i10));
            } else {
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Negative index: ", i10));
            }
        }
        return new b0(this.f4767Y, this.f4768Z, A7.b.l1(this.f4769h0, arrayList), this.f4770i0, this.f4771j0, this.f4772k0, this.f4773l0);
    }

    public final int hashCode() {
        int hashCode = this.f4767Y.hashCode();
        int hashCode2 = this.f4768Z.hashCode();
        int s10 = AbstractC4194d.s(this.f4769h0, (hashCode2 + ((hashCode + (getClass().hashCode() * 31)) * 31)) * 31, 31);
        int hashCode3 = this.f4771j0.hashCode();
        int hashCode4 = this.f4772k0.hashCode();
        return AbstractC6708l.f(this.f4773l0) + ((hashCode4 + ((hashCode3 + ((this.f4770i0.hashCode() + s10) * 31)) * 31)) * 31);
    }
}
