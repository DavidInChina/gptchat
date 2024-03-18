package Bh;

import Qh.AbstractC1239q;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import yh.AbstractC6632q;
import yh.C6641v;
import yh.H1;
import yh.l1;

/* renamed from: Bh.a0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0234a0 implements X {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f2315a;

    public C0234a0(l1 l1Var) {
        this.f2315a = l1Var;
    }

    @Override // Bh.X
    public final c1 a(AbstractC6250o abstractC6250o, Fh.B b10, xh.e eVar) {
        boolean z10;
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
        if (!abstractC6236a.h1(1024) && !abstractC6236a.H0() && abstractC6236a.mo118a().E0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1 l1Var = this.f2315a;
        AbstractC6632q abstractC6632q = null;
        if (z10) {
            l1 l02 = abstractC6236a.mo118a().l0();
            for (l1 l1Var2 : (H1) ((AbstractC1239q) l1Var.o0().Q()).f(new Qh.Z(l02))) {
                if (abstractC6632q == null || l02.K0(abstractC6632q.l0())) {
                    abstractC6632q = l1Var2;
                }
            }
        }
        if (abstractC6632q == null && (abstractC6632q = l1Var.L()) == null) {
            abstractC6632q = C6641v.l1(Object.class);
        }
        return new Y0(new X0(abstractC6236a, l1Var), abstractC6236a, abstractC6632q.l0(), b10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0234a0.class != obj.getClass()) {
            return false;
        }
        if (this.f2315a.equals(((C0234a0) obj).f2315a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2315a.hashCode() + (C0234a0.class.hashCode() * 31);
    }
}
