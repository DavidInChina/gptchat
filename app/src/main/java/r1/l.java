package r1;

import android.content.res.Resources;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f44298a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f44299b;

    public l(Resources resources, Resources.Theme theme) {
        this.f44298a = resources;
        this.f44299b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f44298a.equals(lVar.f44298a) && C1.b.a(this.f44299b, lVar.f44299b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C1.b.b(this.f44298a, this.f44299b);
    }
}
