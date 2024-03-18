package th;

import java.util.HashMap;
import wh.AbstractC6242g;
import yh.AbstractC6632q;
import yh.C6641v;
import yh.l1;

/* renamed from: th.Y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5792Y extends AbstractC5809q {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f46201b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final l1 f46202a;

    static {
        Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
        for (int i10 = 0; i10 < 9; i10++) {
            Class cls = clsArr[i10];
            f46201b.put(C6641v.l1(cls), cls);
        }
    }

    public C5792Y(l1 l1Var) {
        this.f46202a = l1Var;
    }

    @Override // th.h0
    public final a0 a(ClassLoader classLoader) {
        Class<?> cls;
        l1 l1Var = this.f46202a;
        try {
            if (l1Var.a1()) {
                cls = (Class) f46201b.get(l1Var);
            } else {
                cls = Class.forName(l1Var.getName(), false, classLoader);
            }
            return new C5810r(2, cls);
        } catch (ClassNotFoundException e10) {
            return new C5786S(l1Var.getName(), e10);
        }
    }

    @Override // th.h0
    public final Object b() {
        return this.f46202a;
    }

    @Override // th.h0
    public final int c() {
        return 10;
    }

    @Override // th.h0
    public final h0 d(AbstractC6242g abstractC6242g, AbstractC6632q abstractC6632q) {
        String str;
        if (abstractC6632q.l0().H(Class.class)) {
            return this;
        }
        if (abstractC6242g.getReturnType().T0()) {
            str = g0.JAVA_19_CAPABLE_VM.a(10);
        } else {
            str = Class.class.getName() + '[' + this.f46202a.getName() + ']';
        }
        return new C5787T(2, abstractC6242g, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h0) {
                if (this.f46202a.equals(((h0) obj).b())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // th.h0
    public final int getState() {
        return 3;
    }

    public final int hashCode() {
        return this.f46202a.hashCode();
    }

    public final String toString() {
        return g0.JAVA_19_CAPABLE_VM.i(this.f46202a);
    }
}
