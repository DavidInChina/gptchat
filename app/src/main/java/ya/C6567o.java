package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ya.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6567o implements AbstractC6569q {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f50871a;

    public C6567o(Ed.m mVar) {
        AbstractC3557B.c0("voiceSessionInformation", mVar);
        this.f50871a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6567o) && AbstractC3557B.K(this.f50871a, ((C6567o) obj).f50871a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50871a.hashCode();
    }

    public final String toString() {
        return "VoiceFeedbackNegative(voiceSessionInformation=" + this.f50871a + Separators.RPAREN;
    }
}
