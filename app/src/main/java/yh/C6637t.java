package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import wh.AbstractC6242g;
import wh.AbstractC6256u;
import yh.l1;

/* renamed from: yh.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6637t extends AbstractC6635s {

    /* renamed from: i0  reason: collision with root package name */
    public final l1 f51080i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f51081j0;

    public C6637t(l1 l1Var, int i10) {
        this.f51080i0 = l1Var;
        this.f51081j0 = i10;
    }

    public static l1 l1(l1 l1Var, int i10) {
        if (i10 >= 0) {
            while (l1Var.T0()) {
                l1Var = l1Var.mo119g();
                i10++;
            }
            if (i10 != 0) {
                return new C6637t(l1Var, i10);
            }
            return l1Var;
        }
        throw new IllegalArgumentException("Arrays cannot have a negative arity");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.m, Qh.q] */
    @Override // yh.l1
    public final AbstractC6624m A() {
        return new AbstractC1239q(1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.H1, Qh.q] */
    @Override // yh.l1
    public final H1 F() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1
    public final boolean K() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final l1.a L() {
        return C6633q0.i1(Object.class);
    }

    @Override // yh.l1
    public final String R0() {
        String R02 = this.f51080i0.R0();
        if (R02 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(R02);
        for (int i10 = 0; i10 < this.f51081j0; i10++) {
            sb2.append("[]");
        }
        return sb2.toString();
    }

    @Override // yh.AbstractC6632q
    public final boolean T0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vh.l, Qh.q] */
    @Override // yh.l1
    public final vh.l U0() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1
    public final l1 W() {
        return null;
    }

    @Override // yh.AbstractC6632q
    public final boolean Y() {
        return false;
    }

    @Override // yh.AbstractC6632q
    public final boolean a1() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.H1, Qh.q] */
    @Override // yh.l1
    public final H1 b1() {
        return new AbstractC1239q(1);
    }

    @Override // yh.AbstractC6635s, yh.l1
    public final boolean c1() {
        return false;
    }

    @Override // yh.l1
    public final H1 d0() {
        return new q1(new l1[]{this});
    }

    @Override // yh.AbstractC6635s, yh.l1, yh.AbstractC6632q
    /* renamed from: g */
    public final l1 mo119g() {
        l1 l1Var = this.f51080i0;
        int i10 = this.f51081j0;
        if (i10 != 1) {
            return new C6637t(l1Var, i10 - 1);
        }
        return l1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }

    @Override // sh.AbstractC5637i.a
    public final String getDescriptor() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f51081j0; i10++) {
            sb2.append('[');
        }
        sb2.append(this.f51080i0.getDescriptor());
        return sb2.toString();
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        String descriptor = this.f51080i0.getDescriptor();
        int length = descriptor.length();
        int i10 = this.f51081j0;
        StringBuilder sb2 = new StringBuilder(length + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append('[');
        }
        for (int i12 = 0; i12 < descriptor.length(); i12++) {
            char charAt = descriptor.charAt(i12);
            if (charAt == '/') {
                charAt = '.';
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Qh.q, wh.u] */
    @Override // yh.l1, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1
    public final boolean m() {
        return false;
    }

    @Override // yh.l1
    public final String o() {
        StringBuilder sb2 = new StringBuilder(this.f51080i0.o());
        for (int i10 = 0; i10 < this.f51081j0; i10++) {
            sb2.append("[]");
        }
        return sb2.toString();
    }

    @Override // yh.AbstractC6632q
    public final G1 o0() {
        return l1.f51044g0;
    }

    @Override // yh.AbstractC6632q
    public final Hh.o p() {
        return Hh.o.SINGLE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.G1, Qh.q] */
    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1
    public final AbstractC6242g s0() {
        return null;
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return (mo119g().u0() & (-8713)) | 1040;
    }

    @Override // yh.l1
    public final AbstractC6597c z() {
        return null;
    }

    @Override // yh.AbstractC6635s, yh.l1, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return null;
    }

    @Override // yh.l1
    public final l1 v() {
        return this;
    }
}
