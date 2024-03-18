package bb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: bb.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2150B implements AbstractC2151C {

    /* renamed from: a  reason: collision with root package name */
    public final String f25685a;

    public C2150B(String str) {
        AbstractC3557B.c0("note", str);
        this.f25685a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2150B) && AbstractC3557B.K(this.f25685a, ((C2150B) obj).f25685a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25685a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("UpdateNote(note="), this.f25685a, Separators.RPAREN);
    }
}
