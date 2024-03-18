package lh;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lh.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4492k implements AbstractC4493l {

    /* renamed from: a  reason: collision with root package name */
    public final r0.z f38485a;

    public C4492k(r0.z zVar) {
        AbstractC3557B.c0("bitmap", zVar);
        this.f38485a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4492k) && AbstractC3557B.K(this.f38485a, ((C4492k) obj).f38485a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38485a.hashCode();
    }

    public final String toString() {
        return "Loaded(bitmap=" + this.f38485a + Separators.RPAREN;
    }
}
