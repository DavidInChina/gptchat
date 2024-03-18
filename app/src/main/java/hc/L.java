package hc;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class L implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f32156a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32157b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32158c;

    /* renamed from: d  reason: collision with root package name */
    public final Ba.c f32159d;

    public L(boolean z10, boolean z11, boolean z12, Ba.c cVar) {
        this.f32156a = z10;
        this.f32157b = z11;
        this.f32158c = z12;
        this.f32159d = cVar;
    }

    public static L e(L l10, boolean z10, boolean z11, Ba.c cVar, int i10) {
        boolean z12;
        if ((i10 & 1) != 0) {
            z10 = l10.f32156a;
        }
        if ((i10 & 2) != 0) {
            z11 = l10.f32157b;
        }
        if ((i10 & 4) != 0) {
            z12 = l10.f32158c;
        } else {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            cVar = l10.f32159d;
        }
        l10.getClass();
        return new L(z10, z11, z12, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (this.f32156a == l10.f32156a && this.f32157b == l10.f32157b && this.f32158c == l10.f32158c && AbstractC3557B.K(this.f32159d, l10.f32159d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 1237;
        if (this.f32156a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = i10 * 31;
        if (this.f32157b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f32158c) {
            i13 = 1231;
        }
        int i16 = (i15 + i13) * 31;
        Ba.c cVar = this.f32159d;
        if (cVar == null) {
            i12 = 0;
        } else {
            i12 = cVar.hashCode();
        }
        return i16 + i12;
    }

    public final String toString() {
        return "CustomInstructionsState(seenIntroduction=" + this.f32156a + ", isWorkspace=" + this.f32157b + ", refreshing=" + this.f32158c + ", customInstructions=" + this.f32159d + Separators.RPAREN;
    }
}
