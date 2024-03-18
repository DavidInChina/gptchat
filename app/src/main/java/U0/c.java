package U0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f17382a;

    public c(e eVar) {
        this.f17382a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC3557B.K(((a) this.f17382a).f17378a.toLanguageTag(), ((a) ((c) obj).f17382a).f17378a.toLanguageTag());
    }

    public final int hashCode() {
        return ((a) this.f17382a).f17378a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return ((a) this.f17382a).f17378a.toLanguageTag();
    }
}
