package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final wf.n f16259a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.p f16260b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.n f16261c;

    /* renamed from: d  reason: collision with root package name */
    public final wf.p f16262d;

    public P(wf.n nVar, wf.p pVar, wf.n nVar2, wf.p pVar2) {
        AbstractC3557B.c0("textStyleProvider", nVar);
        AbstractC3557B.c0("textStyleBackProvider", pVar);
        AbstractC3557B.c0("contentColorProvider", nVar2);
        AbstractC3557B.c0("contentColorBackProvider", pVar2);
        this.f16259a = nVar;
        this.f16260b = pVar;
        this.f16261c = nVar2;
        this.f16262d = pVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f16259a, p10.f16259a) && AbstractC3557B.K(this.f16260b, p10.f16260b) && AbstractC3557B.K(this.f16261c, p10.f16261c) && AbstractC3557B.K(this.f16262d, p10.f16262d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f16260b.hashCode();
        int hashCode2 = this.f16261c.hashCode();
        return this.f16262d.hashCode() + ((hashCode2 + ((hashCode + (this.f16259a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.f16259a + ", textStyleBackProvider=" + this.f16260b + ", contentColorProvider=" + this.f16261c + ", contentColorBackProvider=" + this.f16262d + Separators.RPAREN;
    }

    public /* synthetic */ P() {
        this(C1378w.f16389h0, AbstractC1370n.f16344a, C1378w.f16390i0, AbstractC1370n.f16345b);
    }
}
