package ca;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.O;

/* renamed from: ca.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2312d extends AbstractC2314f {

    /* renamed from: a  reason: collision with root package name */
    public final String f26389a;

    public C2312d(String str) {
        AbstractC3557B.c0("gizmoId", str);
        this.f26389a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2312d)) {
            return false;
        }
        if (AbstractC3557B.K(this.f26389a, ((C2312d) obj).f26389a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26389a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("GizmoRating(gizmoId=", O.a(this.f26389a), Separators.RPAREN);
    }
}
