package Rh;

import Qh.AbstractC1239q;
import Qh.C1228f;
import Qh.C1236n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import th.AbstractC5793a;
import th.AbstractC5806n;
import th.AbstractC5809q;
import th.C5787T;
import th.C5805m;
import wh.AbstractC6242g;
import wh.AbstractC6256u;

/* loaded from: classes.dex */
public class B0 extends AbstractC5793a {

    /* renamed from: e  reason: collision with root package name */
    public final p1 f15600e;

    /* renamed from: f  reason: collision with root package name */
    public final yh.l1 f15601f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f15602g;

    public B0(p1 p1Var, yh.l1 l1Var, Map map) {
        this.f15600e = p1Var;
        this.f15601f = l1Var;
        this.f15602g = map;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Rh.A0, th.m] */
    public static A0 h(p1 p1Var, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            J a5 = K.a((K) it.next(), p1Var);
            if (a5.b() && a5.a().d().M0()) {
                arrayList.add(a5.a());
            }
        }
        return new C5805m(0, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [th.n, Qh.q] */
    public static AbstractC5806n i(p1 p1Var, List list) {
        if (list == null) {
            return new AbstractC1239q(1);
        }
        return h(p1Var, list);
    }

    @Override // th.AbstractC5802j
    public final th.h0 c(AbstractC6242g abstractC6242g) {
        yh.l1 l02 = abstractC6242g.mo118a().l0();
        yh.l1 l1Var = this.f15601f;
        if (l02.equals(l1Var)) {
            th.h0 h0Var = (th.h0) this.f15602g.get(abstractC6242g.getName());
            if (h0Var != null) {
                return ((AbstractC5809q) h0Var).d(abstractC6242g, abstractC6242g.getReturnType());
            }
            th.h0 f6 = ((AbstractC6242g) ((AbstractC1239q) ((AbstractC6256u) ((AbstractC1239q) l1Var.i()).f(new C1228f(new C1236n(abstractC6242g))))).r()).f();
            if (f6 == null) {
                return new C5787T(1, l1Var, abstractC6242g.getName());
            }
            return f6;
        }
        throw new IllegalArgumentException(abstractC6242g + " is not declared by " + l1Var);
    }

    @Override // th.AbstractC5802j
    public final yh.l1 d() {
        return this.f15601f;
    }

    /* renamed from: j */
    public final C1339z0 b(Class cls) {
        yh.l1 l1Var = this.f15601f;
        if (l1Var.H(cls)) {
            return new C1339z0(this.f15600e, cls, this.f15602g);
        }
        throw new IllegalArgumentException(cls + " does not represent " + l1Var);
    }
}
