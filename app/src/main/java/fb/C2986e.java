package fb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: fb.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2986e implements AbstractC2987f {

    /* renamed from: a  reason: collision with root package name */
    public final C2995n f30089a;

    public C2986e(C2995n c2995n) {
        AbstractC3557B.c0("artifact", c2995n);
        this.f30089a = c2995n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2986e) && AbstractC3557B.K(this.f30089a, ((C2986e) obj).f30089a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30089a.hashCode();
    }

    public final String toString() {
        return "SelectArtifact(artifact=" + this.f30089a + Separators.RPAREN;
    }
}
