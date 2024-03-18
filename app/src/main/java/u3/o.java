package U3;

import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public String f17430a;

    /* renamed from: b  reason: collision with root package name */
    public int f17431b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (AbstractC3557B.K(this.f17430a, oVar.f17430a) && this.f17431b == oVar.f17431b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f17431b) + (this.f17430a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f17430a + ", state=" + E9.f.R(this.f17431b) + ')';
    }
}
