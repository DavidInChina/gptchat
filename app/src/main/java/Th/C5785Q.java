package th;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import wh.AbstractC6242g;
import yh.AbstractC6632q;
import yh.l1;

/* renamed from: th.Q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5785Q extends AbstractC5809q {

    /* renamed from: a  reason: collision with root package name */
    public final Class f46186a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f46187b;

    /* renamed from: c  reason: collision with root package name */
    public final List f46188c;

    /* renamed from: d  reason: collision with root package name */
    public transient /* synthetic */ int f46189d;

    public C5785Q(Class cls, l1 l1Var, List list) {
        this.f46186a = cls;
        this.f46187b = l1Var;
        this.f46188c = list;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        l1 l1Var = this.f46187b;
        List<h0> list = this.f46188c;
        ArrayList arrayList = new ArrayList(list.size());
        for (h0 h0Var : list) {
            arrayList.add(h0Var.a(classLoader));
        }
        try {
            return new C5812t(Class.forName(l1Var.getName(), false, classLoader), 1, arrayList);
        } catch (ClassNotFoundException e10) {
            return new C5786S(l1Var.getName(), e10);
        }
    }

    @Override // th.h0
    public final Object b() {
        List<h0> list = this.f46188c;
        Object newInstance = Array.newInstance(this.f46186a, list.size());
        int i10 = 0;
        for (h0 h0Var : list) {
            Array.set(newInstance, i10, h0Var.b());
            i10++;
        }
        return newInstance;
    }

    @Override // th.h0
    public final int c() {
        return 13;
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        boolean T02 = abstractC6632q.T0();
        l1 l1Var = this.f46187b;
        if (T02 && abstractC6632q.mo119g().l0().equals(l1Var)) {
            for (h0 h0Var : this.f46188c) {
                h0 d10 = h0Var.d(abstractC6242g, abstractC6632q.mo119g());
                if (d10.getState() != 3) {
                    return d10;
                }
            }
            return this;
        }
        return new C5787T(2, abstractC6242g, g0.JAVA_19_CAPABLE_VM.a(AbstractC4194d.c(l1Var)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        Object b10 = ((h0) obj).b();
        if (!b10.getClass().isArray()) {
            return false;
        }
        List list = this.f46188c;
        if (list.size() != Array.getLength(b10)) {
            return false;
        }
        Iterator it = list.iterator();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!((h0) it.next()).b().equals(Array.get(b10, i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // th.h0
    public final int getState() {
        return 3;
    }

    public final int hashCode() {
        int i10;
        if (this.f46189d != 0) {
            i10 = 0;
        } else {
            int i11 = 1;
            for (h0 h0Var : this.f46188c) {
                i11 = (i11 * 31) + h0Var.hashCode();
            }
            i10 = i11;
        }
        if (i10 == 0) {
            return this.f46189d;
        }
        this.f46189d = i10;
        return i10;
    }

    public final String toString() {
        return g0.JAVA_19_CAPABLE_VM.h(this.f46188c);
    }
}
