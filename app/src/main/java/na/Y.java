package na;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Y implements Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f39891a;

    public Y(String str) {
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        this.f39891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Y) && AbstractC3557B.K(this.f39891a, ((Y) obj).f39891a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39891a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("WhisperTranscribed(text="), this.f39891a, Separators.RPAREN);
    }
}
