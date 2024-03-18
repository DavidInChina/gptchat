package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4933l extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final String f40883j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f40884k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40885l;

    public C4933l(String str, Object obj) {
        C4564c c4564c = new C4564c();
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", obj);
        this.f40883j = str;
        this.f40884k = obj;
        this.f40885l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4933l)) {
            return false;
        }
        C4933l c4933l = (C4933l) obj;
        if (AbstractC3557B.K(this.f40883j, c4933l.f40883j) && AbstractC3557B.K(this.f40884k, c4933l.f40884k) && AbstractC3557B.K(this.f40885l, c4933l.f40885l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f40884k.hashCode();
        return this.f40885l.hashCode() + ((hashCode + (this.f40883j.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AddFeatureFlagEvaluation(name=" + this.f40883j + ", value=" + this.f40884k + ", eventTime=" + this.f40885l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40885l;
    }
}
