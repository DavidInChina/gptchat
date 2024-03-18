package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ya.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6568p implements AbstractC6569q {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f50872a;

    public C6568p(Ed.m mVar) {
        AbstractC3557B.c0("voiceSessionInformation", mVar);
        this.f50872a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6568p) && AbstractC3557B.K(this.f50872a, ((C6568p) obj).f50872a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50872a.hashCode();
    }

    public final String toString() {
        return "VoiceFeedbackPositive(voiceSessionInformation=" + this.f50872a + Separators.RPAREN;
    }
}
