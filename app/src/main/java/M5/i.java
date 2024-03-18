package M5;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11647a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11648b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11649c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11650d;

    public /* synthetic */ i() {
        this(-1, false, false, false);
    }

    public static i a(i iVar, boolean z10, int i10, boolean z11, boolean z12, int i11) {
        if ((i11 & 1) != 0) {
            z10 = iVar.f11647a;
        }
        if ((i11 & 2) != 0) {
            i10 = iVar.f11648b;
        }
        if ((i11 & 4) != 0) {
            z11 = iVar.f11649c;
        }
        if ((i11 & 8) != 0) {
            z12 = iVar.f11650d;
        }
        iVar.getClass();
        return new i(i10, z10, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11647a == iVar.f11647a && this.f11648b == iVar.f11648b && this.f11649c == iVar.f11649c && this.f11650d == iVar.f11650d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        boolean z10 = this.f11647a;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = ((i11 * 31) + this.f11648b) * 31;
        boolean z11 = this.f11649c;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f11650d;
        if (!z12) {
            i10 = z12 ? 1 : 0;
        }
        return i16 + i10;
    }

    public final String toString() {
        return "SystemInfo(batteryFullOrCharging=" + this.f11647a + ", batteryLevel=" + this.f11648b + ", powerSaveMode=" + this.f11649c + ", onExternalPowerSource=" + this.f11650d + Separators.RPAREN;
    }

    public i(int i10, boolean z10, boolean z11, boolean z12) {
        this.f11647a = z10;
        this.f11648b = i10;
        this.f11649c = z11;
        this.f11650d = z12;
    }
}
