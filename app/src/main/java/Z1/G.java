package Z1;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final X1.m f22831a;

    /* renamed from: b  reason: collision with root package name */
    public final X1.m f22832b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ G(X1.m mVar, int i10) {
        this(r0, (i10 & 2) != 0 ? r0 : mVar);
        X1.k kVar = X1.k.f21752b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f22831a, g10.f22831a) && AbstractC3557B.K(this.f22832b, g10.f22832b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22832b.hashCode() + (this.f22831a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.f22831a + ", nonSizeModifiers=" + this.f22832b + ')';
    }

    public G(X1.m mVar, X1.m mVar2) {
        this.f22831a = mVar;
        this.f22832b = mVar2;
    }
}
