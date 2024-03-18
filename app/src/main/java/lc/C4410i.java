package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lc.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4410i implements AbstractC4411j {

    /* renamed from: a  reason: collision with root package name */
    public final zd.d f38263a;

    public C4410i(zd.d dVar) {
        AbstractC3557B.c0("mode", dVar);
        this.f38263a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4410i) && this.f38263a == ((C4410i) obj).f38263a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38263a.hashCode();
    }

    public final String toString() {
        return "SetNightMode(mode=" + this.f38263a + Separators.RPAREN;
    }
}
