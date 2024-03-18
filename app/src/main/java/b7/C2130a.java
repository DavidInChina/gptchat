package b7;

/* renamed from: b7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2130a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f25646a;

    public C2130a(Object obj) {
        this.f25646a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2130a)) {
            return false;
        }
        C2130a c2130a = (C2130a) obj;
        c2130a.getClass();
        if (this.f25646a.equals(c2130a.f25646a)) {
            Object obj2 = c.f25648Y;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c.f25648Y.hashCode() ^ (((1000003 * 1000003) ^ this.f25646a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f25646a + ", priority=" + c.f25648Y + "}";
    }
}
