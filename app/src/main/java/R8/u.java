package R8;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class u extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final int f15171g;

    /* renamed from: h  reason: collision with root package name */
    public final char f15172h;

    public u(char c10, int i10) {
        this.f15171g = i10;
        this.f15172h = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f15171g == uVar.f15171g && this.f15172h == uVar.f15172h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15171g * 31) + this.f15172h;
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.f15171g + ", delimiter=" + this.f15172h + Separators.RPAREN;
    }
}
