package Id;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Ed.i f8554a;

    public h(Ed.i iVar) {
        this.f8554a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.f8554a == ((h) obj).f8554a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8554a.hashCode();
    }

    public final String toString() {
        return "SelectVoice(voice=" + this.f8554a + Separators.RPAREN;
    }
}
