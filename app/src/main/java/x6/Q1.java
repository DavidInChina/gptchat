package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Q1 {

    /* renamed from: a  reason: collision with root package name */
    public final Number f49067a;

    /* renamed from: b  reason: collision with root package name */
    public final Number f49068b;

    /* renamed from: c  reason: collision with root package name */
    public final Number f49069c;

    /* renamed from: d  reason: collision with root package name */
    public final Number f49070d;

    public Q1(Number number, Number number2, Number number3, Number number4) {
        this.f49067a = number;
        this.f49068b = number2;
        this.f49069c = number3;
        this.f49070d = number4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q1)) {
            return false;
        }
        Q1 q12 = (Q1) obj;
        if (AbstractC3557B.K(this.f49067a, q12.f49067a) && AbstractC3557B.K(this.f49068b, q12.f49068b) && AbstractC3557B.K(this.f49069c, q12.f49069c) && AbstractC3557B.K(this.f49070d, q12.f49070d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f49068b.hashCode();
        int hashCode2 = this.f49069c.hashCode();
        return this.f49070d.hashCode() + ((hashCode2 + ((hashCode + (this.f49067a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Scroll(maxDepth=" + this.f49067a + ", maxDepthScrollTop=" + this.f49068b + ", maxScrollHeight=" + this.f49069c + ", maxScrollHeightTime=" + this.f49070d + Separators.RPAREN;
    }
}
