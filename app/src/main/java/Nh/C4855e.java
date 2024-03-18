package nh;

import android.gov.nist.core.Separators;

/* renamed from: nh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4855e {

    /* renamed from: a  reason: collision with root package name */
    public final int f40374a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4855e)) {
            return false;
        }
        if (this.f40374a != ((C4855e) obj).f40374a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f40374a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("ResourceId(id="), this.f40374a, Separators.RPAREN);
    }
}
