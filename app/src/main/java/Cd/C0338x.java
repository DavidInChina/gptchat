package Cd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: Cd.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3075a;

    public C0338x(boolean z10) {
        this.f3075a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0338x) && this.f3075a == ((C0338x) obj).f3075a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3075a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("UpdatePressed(pressed="), this.f3075a, Separators.RPAREN);
    }
}
