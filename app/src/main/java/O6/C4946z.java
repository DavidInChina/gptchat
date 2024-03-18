package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4946z extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40919j;

    /* renamed from: k  reason: collision with root package name */
    public final String f40920k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40921l;

    public C4946z(String str, String str2) {
        C4564c c4564c = new C4564c();
        this.f40919j = str;
        this.f40920k = str2;
        this.f40921l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4946z)) {
            return false;
        }
        C4946z c4946z = (C4946z) obj;
        if (AbstractC3557B.K(this.f40919j, c4946z.f40919j) && AbstractC3557B.K(this.f40920k, c4946z.f40920k) && AbstractC3557B.K(this.f40921l, c4946z.f40921l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40921l.hashCode() + E9.f.v(this.f40920k, this.f40919j.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SetSyntheticsTestAttribute(testId=" + this.f40919j + ", resultId=" + this.f40920k + ", eventTime=" + this.f40921l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40921l;
    }
}
