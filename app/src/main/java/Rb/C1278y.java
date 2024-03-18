package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Rb.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1278y implements AbstractC1279z {

    /* renamed from: a  reason: collision with root package name */
    public final C1265k f15380a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15381b;

    public C1278y(C1265k c1265k, String str) {
        AbstractC3557B.c0("field", c1265k);
        AbstractC3557B.c0("value", str);
        this.f15380a = c1265k;
        this.f15381b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1278y)) {
            return false;
        }
        C1278y c1278y = (C1278y) obj;
        if (AbstractC3557B.K(this.f15380a, c1278y.f15380a) && AbstractC3557B.K(this.f15381b, c1278y.f15381b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15381b.hashCode() + (this.f15380a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateAdditionalField(field=" + this.f15380a + ", value=" + this.f15381b + Separators.RPAREN;
    }
}
