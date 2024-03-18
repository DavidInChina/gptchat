package Kd;

import android.gov.nist.core.Separators;
import k6.AbstractC4194d;

/* renamed from: Kd.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0833i implements m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9746a;

    public C0833i(boolean z10) {
        this.f9746a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0833i) && this.f9746a == ((C0833i) obj).f9746a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9746a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("Connected(hasPoorConnectionQuality="), this.f9746a, Separators.RPAREN);
    }
}
