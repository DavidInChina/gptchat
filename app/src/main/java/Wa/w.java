package Wa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes.dex */
public final class w {
    public static final v Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f20875b = {z.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final z f20876a;

    public w(int i10, z zVar) {
        if (1 == (i10 & 1)) {
            this.f20876a = zVar;
        } else {
            R4.b.e2(i10, 1, u.f20874b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w) && this.f20876a == ((w) obj).f20876a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20876a.hashCode();
    }

    public final String toString() {
        return "GizmoSidebarAction(action=" + this.f20876a + Separators.RPAREN;
    }

    public w(z zVar) {
        this.f20876a = zVar;
    }
}
