package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ya.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6562j implements AbstractC6563k {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f50866a;

    public C6562j(Ed.m mVar) {
        this.f50866a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6562j) && AbstractC3557B.K(this.f50866a, ((C6562j) obj).f50866a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50866a.hashCode();
    }

    public final String toString() {
        return "ShowVoiceFeedbackSnackbar(voiceSessionInformation=" + this.f50866a + Separators.RPAREN;
    }
}
