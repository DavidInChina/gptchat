package Jd;

import Ad.s;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class h implements s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9095a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9096b;

    public h(boolean z10, boolean z11) {
        this.f9095a = z10;
        this.f9096b = z11;
    }

    public static h e(h hVar, boolean z10, boolean z11, int i10) {
        if ((i10 & 1) != 0) {
            z10 = hVar.f9095a;
        }
        if ((i10 & 2) != 0) {
            z11 = hVar.f9096b;
        }
        hVar.getClass();
        return new h(z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f9095a == hVar.f9095a && this.f9096b == hVar.f9096b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1237;
        if (this.f9095a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = i10 * 31;
        if (this.f9096b) {
            i11 = 1231;
        }
        return i12 + i11;
    }

    public final String toString() {
        return "VoiceTrainingState(enrollInProgress=" + this.f9095a + ", declineInProgress=" + this.f9096b + Separators.RPAREN;
    }
}
