package Mb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Mb.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953f0 implements AbstractC0957h0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11931a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11932b;

    public C0953f0(String str, boolean z10) {
        this.f11931a = str;
        this.f11932b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0953f0)) {
            return false;
        }
        C0953f0 c0953f0 = (C0953f0) obj;
        if (AbstractC3557B.K(this.f11931a, c0953f0.f11931a) && this.f11932b == c0953f0.f11932b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f11931a.hashCode() * 31;
        if (this.f11932b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        String F22 = AbstractC3557B.F2(this.f11931a);
        return "NavigateTo(route=" + F22 + ", replace=" + this.f11932b + Separators.RPAREN;
    }
}
