package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lc.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4424w implements AbstractC4380D {

    /* renamed from: a  reason: collision with root package name */
    public final zd.d f38276a;

    public C4424w(zd.d dVar) {
        AbstractC3557B.c0("value", dVar);
        this.f38276a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4424w) && this.f38276a == ((C4424w) obj).f38276a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38276a.hashCode();
    }

    public final String toString() {
        return "SetNightMode(value=" + this.f38276a + Separators.RPAREN;
    }
}
