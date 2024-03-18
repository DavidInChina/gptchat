package R8;

import android.gov.nist.core.Separators;

/* renamed from: R8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250c extends AbstractC1252e {

    /* renamed from: g  reason: collision with root package name */
    public final char f15142g;

    public C1250c(char c10) {
        this.f15142g = c10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1250c) && this.f15142g == ((C1250c) obj).f15142g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15142g;
    }

    public final String toString() {
        return "AstBulletList(bulletMarker=" + this.f15142g + Separators.RPAREN;
    }
}
