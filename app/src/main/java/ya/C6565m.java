package ya;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: ya.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6565m implements AbstractC6569q {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.m f50868a;

    /* renamed from: b  reason: collision with root package name */
    public final List f50869b;

    public C6565m(Ed.m mVar, List list) {
        AbstractC3557B.c0("feedbackReasons", list);
        this.f50868a = mVar;
        this.f50869b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6565m)) {
            return false;
        }
        C6565m c6565m = (C6565m) obj;
        if (AbstractC3557B.K(this.f50868a, c6565m.f50868a) && AbstractC3557B.K(this.f50869b, c6565m.f50869b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50869b.hashCode() + (this.f50868a.hashCode() * 31);
    }

    public final String toString() {
        return "VoiceFeedbackDetails(voiceSessionInformation=" + this.f50868a + ", feedbackReasons=" + this.f50869b + Separators.RPAREN;
    }
}
