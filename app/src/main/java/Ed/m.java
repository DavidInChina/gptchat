package Ed;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Mg.b f4688a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4689b;

    public m(Mg.b bVar, String str) {
        this.f4688a = bVar;
        this.f4689b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!AbstractC3557B.K(this.f4688a, mVar.f4688a)) {
            return false;
        }
        String str = this.f4689b;
        String str2 = mVar.f4689b;
        if (str != null ? str2 != null && AbstractC3557B.K(str, str2) : str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        Mg.b bVar = this.f4688a;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = Mg.b.g(bVar.f12130Y);
        }
        int i12 = i10 * 31;
        String str = this.f4689b;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f4689b;
        if (str2 == null) {
            str = "null";
        } else {
            str = l.a(str2);
        }
        return "VoiceSessionInformation(duration=" + this.f4688a + ", voiceSessionId=" + str + Separators.RPAREN;
    }
}
