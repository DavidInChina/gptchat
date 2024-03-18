package fc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import mc.C4616c;

/* loaded from: classes2.dex */
public final class y implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final C4616c f30237a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f30238b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f30239c;

    public y(C4616c c4616c, boolean z10, Map map) {
        AbstractC3557B.c0("hapticEffectsSupported", map);
        this.f30237a = c4616c;
        this.f30238b = z10;
        this.f30239c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (AbstractC3557B.K(this.f30237a, yVar.f30237a) && this.f30238b == yVar.f30238b && AbstractC3557B.K(this.f30239c, yVar.f30239c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        C4616c c4616c = this.f30237a;
        if (c4616c == null) {
            i10 = 0;
        } else {
            i10 = c4616c.hashCode();
        }
        int i12 = i10 * 31;
        if (this.f30238b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return this.f30239c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        return "DeveloperSettingsState(settings=" + this.f30237a + ", hapticsAvailable=" + this.f30238b + ", hapticEffectsSupported=" + this.f30239c + Separators.RPAREN;
    }
}
