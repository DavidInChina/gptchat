package Rf;

import Lg.n;
import dg.AbstractC2653B;
import id.AbstractC3557B;
import o1.C4885I;

/* loaded from: classes2.dex */
public final class c implements AbstractC2653B {

    /* renamed from: a  reason: collision with root package name */
    public final Class f15499a;

    /* renamed from: b  reason: collision with root package name */
    public final C4885I f15500b;

    public c(Class cls, C4885I c4885i) {
        this.f15499a = cls;
        this.f15500b = c4885i;
    }

    public final String a() {
        return n.z2(this.f15499a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (AbstractC3557B.K(this.f15499a, ((c) obj).f15499a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15499a.hashCode();
    }

    public final String toString() {
        return c.class.getName() + ": " + this.f15499a;
    }
}
