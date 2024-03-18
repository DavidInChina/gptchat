package jc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.O;

@AbstractC1998i
/* renamed from: jc.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3945m {
    public static final C3944l Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f36115a;

    public C3945m(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f36115a = str;
        } else {
            R4.b.e2(i10, 1, C3943k.f36114b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3945m)) {
            return false;
        }
        String str = ((C3945m) obj).f36115a;
        String str2 = this.f36115a;
        if (str2 != null ? str != null && AbstractC3557B.K(str2, str) : str == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36115a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f36115a;
        if (str2 == null) {
            str = "null";
        } else {
            str = O.a(str2);
        }
        return android.gov.nist.core.a.A("MemoryRequest(gizmoId=", str, Separators.RPAREN);
    }

    public C3945m(String str) {
        this.f36115a = str;
    }
}
