package S8;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: i  reason: collision with root package name */
    public static final N f16248i = new N(null, null, 255);

    /* renamed from: a  reason: collision with root package name */
    public final Z0.n f16249a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.n f16250b;

    /* renamed from: c  reason: collision with root package name */
    public final B f16251c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC1360d f16252d;

    /* renamed from: e  reason: collision with root package name */
    public final C1367k f16253e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f16254f;

    /* renamed from: g  reason: collision with root package name */
    public final C1381z f16255g;

    /* renamed from: h  reason: collision with root package name */
    public final U8.q f16256h;

    public /* synthetic */ N(Z0.n nVar, U8.q qVar, int i10) {
        this((i10 & 1) != 0 ? null : nVar, null, null, null, null, null, null, (i10 & 128) != 0 ? null : qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3557B.K(this.f16249a, n10.f16249a) && AbstractC3557B.K(this.f16250b, n10.f16250b) && AbstractC3557B.K(this.f16251c, n10.f16251c) && AbstractC3557B.K(this.f16252d, n10.f16252d) && AbstractC3557B.K(this.f16253e, n10.f16253e) && AbstractC3557B.K(this.f16254f, n10.f16254f) && AbstractC3557B.K(this.f16255g, n10.f16255g) && AbstractC3557B.K(this.f16256h, n10.f16256h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        Z0.n nVar = this.f16249a;
        if (nVar == null) {
            i10 = 0;
        } else {
            i10 = Z0.n.d(nVar.f22811a);
        }
        int i18 = i10 * 31;
        wf.n nVar2 = this.f16250b;
        if (nVar2 == null) {
            i11 = 0;
        } else {
            i11 = nVar2.hashCode();
        }
        int i19 = (i18 + i11) * 31;
        B b10 = this.f16251c;
        if (b10 == null) {
            i12 = 0;
        } else {
            i12 = b10.hashCode();
        }
        int i20 = (i19 + i12) * 31;
        AbstractC1360d abstractC1360d = this.f16252d;
        if (abstractC1360d == null) {
            i13 = 0;
        } else {
            i13 = abstractC1360d.hashCode();
        }
        int i21 = (i20 + i13) * 31;
        C1367k c1367k = this.f16253e;
        if (c1367k == null) {
            i14 = 0;
        } else {
            i14 = c1367k.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        c0 c0Var = this.f16254f;
        if (c0Var == null) {
            i15 = 0;
        } else {
            i15 = c0Var.hashCode();
        }
        int i23 = (i22 + i15) * 31;
        C1381z c1381z = this.f16255g;
        if (c1381z == null) {
            i16 = 0;
        } else {
            i16 = c1381z.hashCode();
        }
        int i24 = (i23 + i16) * 31;
        U8.q qVar = this.f16256h;
        if (qVar != null) {
            i17 = qVar.hashCode();
        }
        return i24 + i17;
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.f16249a + ", headingStyle=" + this.f16250b + ", listStyle=" + this.f16251c + ", blockQuoteGutter=" + this.f16252d + ", codeBlockStyle=" + this.f16253e + ", tableStyle=" + this.f16254f + ", infoPanelStyle=" + this.f16255g + ", stringStyle=" + this.f16256h + Separators.RPAREN;
    }

    public N(Z0.n nVar, wf.n nVar2, B b10, AbstractC1360d abstractC1360d, C1367k c1367k, c0 c0Var, C1381z c1381z, U8.q qVar) {
        this.f16249a = nVar;
        this.f16250b = nVar2;
        this.f16251c = b10;
        this.f16252d = abstractC1360d;
        this.f16253e = c1367k;
        this.f16254f = c0Var;
        this.f16255g = c1381z;
        this.f16256h = qVar;
    }
}
