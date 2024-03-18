package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.Z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356Z {
    public static final C2355Y Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Integer f26500a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26501b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f26502c;

    public C2356Z(int i10, Integer num, String str, Boolean bool) {
        if ((i10 & 1) == 0) {
            this.f26500a = null;
        } else {
            this.f26500a = num;
        }
        if ((i10 & 2) == 0) {
            this.f26501b = null;
        } else {
            this.f26501b = str;
        }
        if ((i10 & 4) == 0) {
            this.f26502c = Boolean.FALSE;
        } else {
            this.f26502c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356Z)) {
            return false;
        }
        C2356Z c2356z = (C2356Z) obj;
        if (AbstractC3557B.K(this.f26500a, c2356z.f26500a) && AbstractC3557B.K(this.f26501b, c2356z.f26501b) && AbstractC3557B.K(this.f26502c, c2356z.f26502c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Integer num = this.f26500a;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i13 = i10 * 31;
        String str = this.f26501b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        Boolean bool = this.f26502c;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return i14 + i12;
    }

    public final String toString() {
        return "GizmoReview(rating=" + this.f26500a + ", message=" + this.f26501b + ", includeFrom=" + this.f26502c + Separators.RPAREN;
    }

    public C2356Z(Integer num, String str, Boolean bool) {
        this.f26500a = num;
        this.f26501b = str;
        this.f26502c = bool;
    }
}
