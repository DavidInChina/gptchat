package Fe;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f5298a;

    public a(String str) {
        AbstractC3557B.c0("name", str);
        this.f5298a = str;
        if (str.length() != 0) {
            return;
        }
        throw new IllegalStateException("Name can't be blank");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass() && AbstractC3557B.K(this.f5298a, ((a) obj).f5298a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5298a.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.f5298a;
    }
}
