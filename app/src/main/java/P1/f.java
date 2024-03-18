package P1;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f13782a;

    public f(String str) {
        AbstractC3557B.c0("name", str);
        this.f13782a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return AbstractC3557B.K(this.f13782a, ((f) obj).f13782a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13782a.hashCode();
    }

    public final String toString() {
        return this.f13782a;
    }
}
