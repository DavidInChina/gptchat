package Ec;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C implements F {

    /* renamed from: a  reason: collision with root package name */
    public final Yg.p f4601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4602b;

    public C(int i10, Yg.p pVar) {
        AbstractC3557B.c0("startTime", pVar);
        this.f4601a = pVar;
        this.f4602b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f4601a, c10.f4601a) && this.f4602b == c10.f4602b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4601a.f22419Y.hashCode() * 31) + this.f4602b;
    }

    public final String toString() {
        return "Recording(startTime=" + this.f4601a + ", maxAmplitude=" + this.f4602b + Separators.RPAREN;
    }
}
