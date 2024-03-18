package wd;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: wd.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6171F {
    public static final C6170E Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f48332a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48333b;

    public C6171F(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C6169D.f48324b);
            throw null;
        }
        this.f48332a = str;
        this.f48333b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6171F)) {
            return false;
        }
        C6171F c6171f = (C6171F) obj;
        if (AbstractC3557B.K(this.f48332a, c6171f.f48332a) && AbstractC3557B.K(this.f48333b, c6171f.f48333b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48333b.hashCode() + (this.f48332a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = O.a(this.f48333b);
        return "ConversationMode(kind=" + this.f48332a + ", gizmoId=" + a5 + Separators.RPAREN;
    }

    public C6171F(String str) {
        AbstractC3557B.c0("gizmoId", str);
        this.f48332a = "gizmo_interaction";
        this.f48333b = str;
    }
}
