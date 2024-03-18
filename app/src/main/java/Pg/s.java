package Pg;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final r f14246b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f14247a;

    public /* synthetic */ s(Object obj) {
        this.f14247a = obj;
    }

    public static final Throwable a(Object obj) {
        q qVar;
        if (obj instanceof q) {
            qVar = (q) obj;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            return null;
        }
        return qVar.f14245a;
    }

    public static final Object b(Object obj) {
        if (obj instanceof r) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f14247a, ((s) obj).f14247a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f14247a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f14247a;
        if (obj instanceof q) {
            return ((q) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
