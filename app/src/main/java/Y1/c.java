package Y1;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f22050a;

    public c(String str) {
        this.f22050a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (AbstractC3557B.K(this.f22050a, ((c) obj).f22050a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22050a.hashCode();
    }

    public final String toString() {
        return this.f22050a;
    }
}
