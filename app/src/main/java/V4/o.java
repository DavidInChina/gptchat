package v4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f47235a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f47236b;

    public o(C5971a c5971a) {
        this.f47235a = c5971a;
        this.f47236b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        Object obj2 = this.f47235a;
        if (obj2 != null && obj2.equals(oVar.f47235a)) {
            return true;
        }
        Throwable th2 = this.f47236b;
        if (th2 == null || oVar.f47236b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47235a, this.f47236b});
    }

    public o(Throwable th2) {
        this.f47236b = th2;
        this.f47235a = null;
    }
}
