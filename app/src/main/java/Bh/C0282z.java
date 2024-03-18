package Bh;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import sh.AbstractC5634f;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import yh.AbstractC6632q;
import yh.l1;

/* renamed from: Bh.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0282z implements A {

    /* renamed from: a  reason: collision with root package name */
    public final C0272u f2404a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6250o f2405b;

    /* renamed from: c  reason: collision with root package name */
    public final xh.e f2406c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2407d;

    public C0282z(C0272u c0272u, AbstractC6250o abstractC6250o, xh.e eVar, boolean z10) {
        this.f2404a = c0272u;
        this.f2405b = abstractC6250o;
        this.f2406c = eVar;
        this.f2407d = z10;
    }

    @Override // Bh.A
    public final A a(AbstractC6250o abstractC6250o, AbstractC0270t abstractC0270t) {
        boolean z10 = true;
        C0272u d10 = this.f2404a.d((AbstractC6242g) abstractC6250o.y(), abstractC0270t);
        AbstractC5634f abstractC5634f = (AbstractC5634f) abstractC6250o;
        xh.e c10 = this.f2406c.c(abstractC5634f.g1());
        AbstractC6632q mo118a = abstractC6250o.mo118a();
        AbstractC6250o abstractC6250o2 = this.f2405b;
        if (mo118a.equals(abstractC6250o2.mo118a())) {
            xh.e c11 = c10.c(abstractC5634f.g1()).c(((AbstractC5634f) abstractC6250o2).g1());
            if (abstractC6250o.H0() ^ abstractC6250o2.H0()) {
                if (abstractC6250o.H0()) {
                    abstractC6250o = abstractC6250o2;
                }
                return new C0282z(d10, abstractC6250o, c11, false);
            }
            return new C0276w(d10, new LinkedHashSet(Arrays.asList(abstractC6250o, abstractC6250o2)), c11);
        }
        xh.e c12 = c10.c(((AbstractC5634f) abstractC6250o2).g1()).c(abstractC5634f.g1());
        if (abstractC6250o.H0()) {
            if ((abstractC6250o2.mo118a().u0() & 5) != 0) {
                z10 = false;
            }
            return new C0282z(d10, abstractC6250o2, c12, z10);
        }
        return new C0282z(d10, abstractC6250o, c12, false);
    }

    @Override // Bh.A
    public final A b(A a5) {
        AbstractC6250o abstractC6250o = this.f2405b;
        boolean E02 = abstractC6250o.mo118a().E0();
        boolean z10 = this.f2407d;
        xh.e eVar = this.f2406c;
        C0272u c0272u = this.f2404a;
        if (E02) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(abstractC6250o);
            l1 l02 = abstractC6250o.mo118a().l0();
            for (AbstractC6250o abstractC6250o2 : a5.d()) {
                if (abstractC6250o2.mo118a().l0().K0(l02)) {
                    linkedHashSet.remove(abstractC6250o);
                    linkedHashSet.add(abstractC6250o2);
                } else if (!abstractC6250o2.mo118a().l0().f0(l02)) {
                    linkedHashSet.add(abstractC6250o2);
                }
            }
            if (linkedHashSet.size() == 1) {
                return new C0282z(c0272u.b(a5.getKey()), (AbstractC6250o) linkedHashSet.iterator().next(), eVar.c(a5.getVisibility()), z10);
            }
            return new C0276w(c0272u.b(a5.getKey()), linkedHashSet, eVar.c(a5.getVisibility()));
        }
        return new C0282z(c0272u.b(a5.getKey()), abstractC6250o, eVar.c(a5.getVisibility()), z10);
    }

    @Override // Bh.A
    public final M c(F f6) {
        AbstractC6250o abstractC6250o = this.f2405b;
        return new C0280y(this.f2404a.c(((AbstractC6236a) abstractC6250o).k1()), abstractC6250o, this.f2406c, this.f2407d);
    }

    @Override // Bh.A
    public final Set d() {
        return Collections.singleton(this.f2405b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0282z.class != obj.getClass()) {
            return false;
        }
        C0282z c0282z = (C0282z) obj;
        if (this.f2407d == c0282z.f2407d && this.f2406c.equals(c0282z.f2406c) && this.f2404a.equals(c0282z.f2404a) && this.f2405b.equals(c0282z.f2405b)) {
            return true;
        }
        return false;
    }

    @Override // Bh.A
    public final C0272u getKey() {
        return this.f2404a;
    }

    @Override // Bh.A
    public final xh.e getVisibility() {
        return this.f2406c;
    }

    public final int hashCode() {
        int hashCode = this.f2404a.hashCode();
        int hashCode2 = this.f2405b.hashCode();
        return ((this.f2406c.hashCode() + ((hashCode2 + ((hashCode + (C0282z.class.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f2407d ? 1 : 0);
    }
}
