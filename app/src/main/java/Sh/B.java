package Sh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.security.AccessController;
import yh.C6641v;
import yh.l1;

/* loaded from: classes2.dex */
public abstract class B implements AbstractC1396b {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f16689c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16690a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f16691b;

    static {
        boolean z10 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f16689c = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f16689c = z10;
            AbstractC2469q0.p(c(Th.y.a(t.class)));
            AbstractC2469q0.p(c(Th.y.a(n.class)));
            AbstractC2469q0.p(c(Th.y.a(s.class)));
            AbstractC2469q0.p(c(Th.y.a(r.class)));
            AbstractC2469q0.p(c(Th.y.a(p.class)));
            AbstractC2469q0.p(c(Th.y.a(o.class)));
            AbstractC2469q0.p(c(Th.y.a(q.class)));
        } catch (SecurityException unused2) {
            z10 = true;
            f16689c = z10;
            AbstractC2469q0.p(c(Th.y.a(t.class)));
            AbstractC2469q0.p(c(Th.y.a(n.class)));
            AbstractC2469q0.p(c(Th.y.a(s.class)));
            AbstractC2469q0.p(c(Th.y.a(r.class)));
            AbstractC2469q0.p(c(Th.y.a(p.class)));
            AbstractC2469q0.p(c(Th.y.a(o.class)));
            AbstractC2469q0.p(c(Th.y.a(q.class)));
        }
        AbstractC2469q0.p(c(Th.y.a(t.class)));
        AbstractC2469q0.p(c(Th.y.a(n.class)));
        AbstractC2469q0.p(c(Th.y.a(s.class)));
        AbstractC2469q0.p(c(Th.y.a(r.class)));
        AbstractC2469q0.p(c(Th.y.a(p.class)));
        AbstractC2469q0.p(c(Th.y.a(o.class)));
        AbstractC2469q0.p(c(Th.y.a(q.class)));
    }

    public B(Object obj, l1 l1Var) {
        this.f16690a = obj;
        this.f16691b = l1Var;
    }

    public static Object c(Th.y yVar) {
        if (f16689c) {
            return AccessController.doPrivileged(yVar);
        }
        return yVar.run();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sh.B, Sh.A] */
    public static A d(l1 l1Var) {
        if (!l1Var.a1()) {
            return new B(l1Var, C6641v.l1(Class.class));
        }
        throw new IllegalArgumentException("A primitive type cannot be represented as a type constant: " + l1Var);
    }

    @Override // Sh.AbstractC1396b
    public final l1 a() {
        return this.f16691b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f16690a.equals(((B) obj).f16690a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16690a.hashCode();
    }

    public final String toString() {
        return this.f16690a.toString();
    }
}
