package x8;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: x8.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6376u extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final w8.f f49616Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j0 f49617Z;

    public C6376u(w8.f fVar, j0 j0Var) {
        this.f49616Y = fVar;
        this.f49617Z = j0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w8.f fVar = this.f49616Y;
        return this.f49617Z.compare(fVar.apply(obj), fVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6376u)) {
            return false;
        }
        C6376u c6376u = (C6376u) obj;
        if (this.f49616Y.equals(c6376u.f49616Y) && this.f49617Z.equals(c6376u.f49617Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49616Y, this.f49617Z});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f49617Z);
        String valueOf2 = String.valueOf(this.f49616Y);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 13);
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
