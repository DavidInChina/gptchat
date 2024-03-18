package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ya.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6564l implements AbstractC6569q {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f50867a;

    public C6564l(Ed.m mVar) {
        AbstractC3557B.c0("voiceSessionInformation", mVar);
        this.f50867a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6564l) && AbstractC3557B.K(this.f50867a, ((C6564l) obj).f50867a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50867a.hashCode();
    }

    public final String toString() {
        return "ExitVoiceMode(voiceSessionInformation=" + this.f50867a + Separators.RPAREN;
    }
}
