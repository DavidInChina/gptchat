package U8;

import N0.y;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import u7.C5848d;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: i  reason: collision with root package name */
    public static final C5848d f17548i = new C5848d(20, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final q f17549j = new q(null, null, 255);

    /* renamed from: a  reason: collision with root package name */
    public final y f17550a;

    /* renamed from: b  reason: collision with root package name */
    public final y f17551b;

    /* renamed from: c  reason: collision with root package name */
    public final y f17552c;

    /* renamed from: d  reason: collision with root package name */
    public final y f17553d;

    /* renamed from: e  reason: collision with root package name */
    public final y f17554e;

    /* renamed from: f  reason: collision with root package name */
    public final y f17555f;

    /* renamed from: g  reason: collision with root package name */
    public final y f17556g;

    /* renamed from: h  reason: collision with root package name */
    public final y f17557h;

    public /* synthetic */ q(y yVar, y yVar2, int i10) {
        this(null, null, null, null, null, null, (i10 & 64) != 0 ? null : yVar, (i10 & 128) != 0 ? null : yVar2);
    }

    public final q a() {
        y yVar = this.f17550a;
        if (yVar == null) {
            f fVar = f.f17525e;
            yVar = f.f17526f;
        }
        y yVar2 = yVar;
        y yVar3 = this.f17551b;
        if (yVar3 == null) {
            i iVar = i.f17530e;
            yVar3 = i.f17531f;
        }
        y yVar4 = yVar3;
        y yVar5 = this.f17552c;
        if (yVar5 == null) {
            n nVar = n.f17540e;
            yVar5 = n.f17541f;
        }
        y yVar6 = yVar5;
        y yVar7 = this.f17553d;
        if (yVar7 == null) {
            k kVar = k.f17534e;
            yVar7 = k.f17535f;
        }
        y yVar8 = yVar7;
        y yVar9 = this.f17554e;
        if (yVar9 == null) {
            l lVar = l.f17536e;
            yVar9 = l.f17537f;
        }
        y yVar10 = yVar9;
        y yVar11 = this.f17555f;
        if (yVar11 == null) {
            m mVar = m.f17538e;
            yVar11 = m.f17539f;
        }
        y yVar12 = yVar11;
        y yVar13 = this.f17556g;
        if (yVar13 == null) {
            g gVar = g.f17527e;
            yVar13 = g.f17528f;
        }
        y yVar14 = yVar13;
        y yVar15 = this.f17557h;
        if (yVar15 == null) {
            y yVar16 = j.f17532f;
            yVar15 = j.f17532f;
        }
        return new q(yVar2, yVar4, yVar6, yVar8, yVar10, yVar12, yVar14, yVar15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (AbstractC3557B.K(this.f17550a, qVar.f17550a) && AbstractC3557B.K(this.f17551b, qVar.f17551b) && AbstractC3557B.K(this.f17552c, qVar.f17552c) && AbstractC3557B.K(this.f17553d, qVar.f17553d) && AbstractC3557B.K(this.f17554e, qVar.f17554e) && AbstractC3557B.K(this.f17555f, qVar.f17555f) && AbstractC3557B.K(this.f17556g, qVar.f17556g) && AbstractC3557B.K(this.f17557h, qVar.f17557h)) {
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
        y yVar = this.f17550a;
        if (yVar == null) {
            i10 = 0;
        } else {
            i10 = yVar.hashCode();
        }
        int i18 = i10 * 31;
        y yVar2 = this.f17551b;
        if (yVar2 == null) {
            i11 = 0;
        } else {
            i11 = yVar2.hashCode();
        }
        int i19 = (i18 + i11) * 31;
        y yVar3 = this.f17552c;
        if (yVar3 == null) {
            i12 = 0;
        } else {
            i12 = yVar3.hashCode();
        }
        int i20 = (i19 + i12) * 31;
        y yVar4 = this.f17553d;
        if (yVar4 == null) {
            i13 = 0;
        } else {
            i13 = yVar4.hashCode();
        }
        int i21 = (i20 + i13) * 31;
        y yVar5 = this.f17554e;
        if (yVar5 == null) {
            i14 = 0;
        } else {
            i14 = yVar5.hashCode();
        }
        int i22 = (i21 + i14) * 31;
        y yVar6 = this.f17555f;
        if (yVar6 == null) {
            i15 = 0;
        } else {
            i15 = yVar6.hashCode();
        }
        int i23 = (i22 + i15) * 31;
        y yVar7 = this.f17556g;
        if (yVar7 == null) {
            i16 = 0;
        } else {
            i16 = yVar7.hashCode();
        }
        int i24 = (i23 + i16) * 31;
        y yVar8 = this.f17557h;
        if (yVar8 != null) {
            i17 = yVar8.hashCode();
        }
        return i24 + i17;
    }

    public final String toString() {
        return "RichTextStringStyle(boldStyle=" + this.f17550a + ", italicStyle=" + this.f17551b + ", underlineStyle=" + this.f17552c + ", strikethroughStyle=" + this.f17553d + ", subscriptStyle=" + this.f17554e + ", superscriptStyle=" + this.f17555f + ", codeStyle=" + this.f17556g + ", linkStyle=" + this.f17557h + Separators.RPAREN;
    }

    public q(y yVar, y yVar2, y yVar3, y yVar4, y yVar5, y yVar6, y yVar7, y yVar8) {
        this.f17550a = yVar;
        this.f17551b = yVar2;
        this.f17552c = yVar3;
        this.f17553d = yVar4;
        this.f17554e = yVar5;
        this.f17555f = yVar6;
        this.f17556g = yVar7;
        this.f17557h = yVar8;
    }
}
