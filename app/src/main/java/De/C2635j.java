package de;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import x3.C6272b;

/* renamed from: de.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2635j {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f28239a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f28240b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f28241c;

    public C2635j(boolean z10, C6272b c6272b, C6272b c6272b2) {
        this.f28239a = c6272b;
        this.f28240b = c6272b2;
        this.f28241c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2635j)) {
            return false;
        }
        C2635j c2635j = (C2635j) obj;
        if (AbstractC3557B.K(this.f28239a, c2635j.f28239a) && AbstractC3557B.K(this.f28240b, c2635j.f28240b) && this.f28241c == c2635j.f28241c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f28240b.hashCode() + (this.f28239a.hashCode() * 31)) * 31;
        if (this.f28241c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LazyTablePinConfiguration(columns=");
        sb2.append(this.f28239a);
        sb2.append(", rows=");
        sb2.append(this.f28240b);
        sb2.append(", footer=");
        return AbstractC4194d.w(sb2, this.f28241c, Separators.RPAREN);
    }
}
