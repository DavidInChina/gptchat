package vc;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.O;

@AbstractC1998i
/* renamed from: vc.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6016f {
    public static final C6015e Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f47446a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f47447b;

    public C6016f(int i10, String str, boolean z10) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C6014d.f47445b);
            throw null;
        }
        this.f47446a = str;
        if ((i10 & 2) == 0) {
            this.f47447b = false;
        } else {
            this.f47447b = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6016f)) {
            return false;
        }
        C6016f c6016f = (C6016f) obj;
        String str = c6016f.f47446a;
        String str2 = this.f47446a;
        if (str2 != null ? !(str != null && AbstractC3557B.K(str2, str)) : str != null) {
            return false;
        }
        if (this.f47447b == c6016f.f47447b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.f47446a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        if (this.f47447b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return i12 + i11;
    }

    public final String toString() {
        String str;
        String str2 = this.f47446a;
        if (str2 == null) {
            str = "null";
        } else {
            str = O.a(str2);
        }
        return "ApiUserSettingsDelete(gizmoId=" + str + ", deleteAll=" + this.f47447b + Separators.RPAREN;
    }

    public C6016f(String str, boolean z10) {
        this.f47446a = str;
        this.f47447b = z10;
    }
}
