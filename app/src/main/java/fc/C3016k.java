package fc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: fc.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3016k implements AbstractC3022q {

    /* renamed from: a  reason: collision with root package name */
    public final Vc.A f30214a;

    public C3016k(Vc.A a5) {
        AbstractC3557B.c0("voiceApiHost", a5);
        this.f30214a = a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3016k) && this.f30214a == ((C3016k) obj).f30214a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30214a.hashCode();
    }

    public final String toString() {
        return "SetVoiceApiHost(voiceApiHost=" + this.f30214a + Separators.RPAREN;
    }
}
