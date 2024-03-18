package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4931j extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40870j;

    /* renamed from: k  reason: collision with root package name */
    public final int f40871k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40872l;

    public C4931j(String str, int i10) {
        C4564c c4564c = new C4564c();
        this.f40870j = str;
        this.f40871k = i10;
        this.f40872l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4931j)) {
            return false;
        }
        C4931j c4931j = (C4931j) obj;
        if (AbstractC3557B.K(this.f40870j, c4931j.f40870j) && this.f40871k == c4931j.f40871k && AbstractC3557B.K(this.f40872l, c4931j.f40872l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40872l.hashCode() + (((this.f40870j.hashCode() * 31) + this.f40871k) * 31);
    }

    public final String toString() {
        return "ActionSent(viewId=" + this.f40870j + ", frustrationCount=" + this.f40871k + ", eventTime=" + this.f40872l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40872l;
    }
}
