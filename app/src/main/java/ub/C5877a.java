package ub;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ub.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5877a {

    /* renamed from: a  reason: collision with root package name */
    public final int f46533a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f46534b;

    public C5877a(int i10, Object obj) {
        AbstractC3557B.c0("params", obj);
        this.f46533a = i10;
        this.f46534b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5877a)) {
            return false;
        }
        C5877a c5877a = (C5877a) obj;
        if (this.f46533a == c5877a.f46533a && AbstractC3557B.K(this.f46534b, c5877a.f46534b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46534b.hashCode() + (this.f46533a * 31);
    }

    public final String toString() {
        return "BrowsingContentParameters(stringRes=" + this.f46533a + ", params=" + this.f46534b + Separators.RPAREN;
    }
}
