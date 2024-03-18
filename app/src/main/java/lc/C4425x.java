package lc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: lc.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4425x implements AbstractC4380D {

    /* renamed from: a  reason: collision with root package name */
    public final Ec.o f38277a;

    public C4425x(Ec.o oVar) {
        AbstractC3557B.c0("value", oVar);
        this.f38277a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4425x) && this.f38277a == ((C4425x) obj).f38277a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f38277a.hashCode();
    }

    public final String toString() {
        return "SetWhisperLanguage(value=" + this.f38277a + Separators.RPAREN;
    }
}
