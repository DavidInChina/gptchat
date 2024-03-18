package I8;

/* loaded from: classes.dex */
public final class u extends r {

    /* renamed from: Y  reason: collision with root package name */
    public final K8.m f8133Y = new K8.m(false);

    public final void U(String str, r rVar) {
        if (rVar == null) {
            rVar = t.f8132Y;
        }
        this.f8133Y.put(str, rVar);
    }

    public final void V(Number number, String str) {
        r rVar;
        if (number == null) {
            rVar = t.f8132Y;
        } else {
            rVar = new w(number);
        }
        U(str, rVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof u) || !((u) obj).f8133Y.equals(this.f8133Y))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8133Y.hashCode();
    }

    public final void i0(String str, Boolean bool) {
        U(str, new w(bool));
    }

    public final void m0(String str, String str2) {
        r rVar;
        if (str2 == null) {
            rVar = t.f8132Y;
        } else {
            rVar = new w(str2);
        }
        U(str, rVar);
    }

    public final r q0(String str) {
        return (r) this.f8133Y.get(str);
    }

    public final r r0(String str) {
        return (r) this.f8133Y.remove(str);
    }
}
