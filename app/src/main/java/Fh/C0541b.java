package Fh;

import java.lang.reflect.Array;
import th.AbstractC5793a;
import th.AbstractC5802j;
import uh.AbstractC5929a;
import wh.AbstractC6242g;
import yh.l1;

/* renamed from: Fh.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final i f5383a;

    public C0541b(i iVar) {
        this.f5383a = iVar;
    }

    public static void c(io.sentry.vendor.b bVar, l1 l1Var, String str, Object obj) {
        if (l1Var.T0()) {
            io.sentry.vendor.b e10 = bVar.e(str);
            int length = Array.getLength(obj);
            l1 mo119g = l1Var.mo119g();
            for (int i10 = 0; i10 < length; i10++) {
                c(e10, mo119g, null, Array.get(obj, i10));
            }
            e10.g();
        } else if (l1Var.M0()) {
            d(bVar.c(str, l1Var.getDescriptor()), (AbstractC5802j) obj, m.f5394Y);
        } else if (l1Var.q0()) {
            bVar.h(str, l1Var.getDescriptor(), ((AbstractC5929a) obj).d());
        } else if (l1Var.H(Class.class)) {
            bVar.b(str, Nh.r.u(((l1) obj).getDescriptor()));
        } else {
            bVar.b(str, obj);
        }
    }

    public static void d(io.sentry.vendor.b bVar, AbstractC5802j abstractC5802j, o oVar) {
        for (AbstractC6242g abstractC6242g : abstractC5802j.d().i()) {
            if (oVar.a(abstractC5802j, abstractC6242g)) {
                c(bVar, abstractC6242g.getReturnType().l0(), abstractC6242g.getName(), abstractC5802j.c(abstractC6242g).b());
            }
        }
        bVar.g();
    }

    public final C0541b a(AbstractC5802j abstractC5802j, o oVar) {
        AbstractC5793a abstractC5793a = (AbstractC5793a) abstractC5802j;
        int i10 = AbstractC0540a.f5382a[abstractC5793a.e().ordinal()];
        i iVar = this.f5383a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unexpected retention policy: " + abstractC5793a.e());
                }
            } else {
                io.sentry.vendor.b b10 = iVar.b(abstractC5793a.d().getDescriptor(), false);
                if (b10 != null) {
                    d(b10, abstractC5793a, oVar);
                }
            }
        } else {
            io.sentry.vendor.b b11 = iVar.b(abstractC5793a.d().getDescriptor(), true);
            if (b11 != null) {
                d(b11, abstractC5793a, oVar);
            }
        }
        return this;
    }

    public final C0541b b(AbstractC5802j abstractC5802j, o oVar, int i10, String str) {
        AbstractC5793a abstractC5793a = (AbstractC5793a) abstractC5802j;
        int i11 = AbstractC0540a.f5382a[abstractC5793a.e().ordinal()];
        i iVar = this.f5383a;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("Unexpected retention policy: " + abstractC5793a.e());
                }
            } else {
                io.sentry.vendor.b a5 = iVar.a(i10, abstractC5793a.d().getDescriptor(), str, false);
                if (a5 != null) {
                    d(a5, abstractC5793a, oVar);
                }
            }
        } else {
            io.sentry.vendor.b a10 = iVar.a(i10, abstractC5793a.d().getDescriptor(), str, true);
            if (a10 != null) {
                d(a10, abstractC5793a, oVar);
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0541b.class != obj.getClass()) {
            return false;
        }
        if (this.f5383a.equals(((C0541b) obj).f5383a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5383a.hashCode() + (C0541b.class.hashCode() * 31);
    }
}
