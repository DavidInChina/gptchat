package Vb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class i {
    public static final h Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer[] f18515b = {c.Companion.serializer()};

    /* renamed from: a  reason: collision with root package name */
    public final c f18516a;

    public i() {
        this.f18516a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f18516a == ((i) obj).f18516a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        c cVar = this.f18516a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "ServerStatusRequest(overrideStatusForTesting=" + this.f18516a + Separators.RPAREN;
    }

    public i(int i10, c cVar) {
        if ((i10 & 1) == 0) {
            this.f18516a = null;
        } else {
            this.f18516a = cVar;
        }
    }
}
