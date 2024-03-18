package N0;

import L.C0837a0;
import android.graphics.RectF;
import android.text.Layout;
import id.AbstractC3557B;
import java.text.BreakIterator;
import java.util.ArrayList;
import l8.AbstractC4344b;
import q0.C5251c;
import q0.C5252d;
import r0.C5344h;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final B f12477a;

    /* renamed from: b  reason: collision with root package name */
    public final i f12478b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12479c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12480d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12481e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f12482f;

    public C(B b10, i iVar, long j6) {
        float f6;
        O0.s sVar;
        this.f12477a = b10;
        this.f12478b = iVar;
        this.f12479c = j6;
        ArrayList arrayList = iVar.f12531h;
        float f10 = 0.0f;
        if (arrayList.isEmpty()) {
            f6 = 0.0f;
        } else {
            f6 = ((C1042a) ((m) arrayList.get(0)).f12539a).f12495d.c(0);
        }
        this.f12480d = f6;
        ArrayList arrayList2 = iVar.f12531h;
        if (!arrayList2.isEmpty()) {
            m mVar = (m) kf.t.o2(arrayList2);
            f10 = ((C1042a) mVar.f12539a).f12495d.c(sVar.f13321e - 1) + mVar.f12544f;
        }
        this.f12481e = f10;
        this.f12482f = iVar.f12530g;
    }

    public final Y0.h a(int i10) {
        int i11;
        i iVar = this.f12478b;
        iVar.d(i10);
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 == length) {
            i11 = AbstractC4344b.u0(arrayList);
        } else {
            i11 = Df.H.H(i10, arrayList);
        }
        m mVar = (m) arrayList.get(i11);
        l lVar = mVar.f12539a;
        if (((C1042a) lVar).f12495d.f13320d.isRtlCharAt(mVar.a(i10))) {
            return Y0.h.f22028Z;
        }
        return Y0.h.f22027Y;
    }

    public final C5252d b(int i10) {
        boolean z10;
        float f6;
        float f10;
        float g10;
        float g11;
        i iVar = this.f12478b;
        iVar.c(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.H(i10, arrayList));
        l lVar = mVar.f12539a;
        int a5 = mVar.a(i10);
        C1042a c1042a = (C1042a) lVar;
        CharSequence charSequence = c1042a.f12496e;
        if (a5 >= 0 && a5 < charSequence.length()) {
            O0.s sVar = c1042a.f12495d;
            Layout layout = sVar.f13320d;
            int lineForOffset = layout.getLineForOffset(a5);
            float f11 = sVar.f(lineForOffset);
            float d10 = sVar.d(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean isRtlCharAt = layout.isRtlCharAt(a5);
            if (z10 && !isRtlCharAt) {
                f10 = sVar.g(a5, false);
                f6 = sVar.g(a5 + 1, true);
            } else {
                if (z10 && isRtlCharAt) {
                    g10 = sVar.h(a5, false);
                    g11 = sVar.h(a5 + 1, true);
                } else if (isRtlCharAt) {
                    g10 = sVar.g(a5, false);
                    g11 = sVar.g(a5 + 1, true);
                } else {
                    f10 = sVar.h(a5, false);
                    f6 = sVar.h(a5 + 1, true);
                }
                float f12 = g10;
                f10 = g11;
                f6 = f12;
            }
            RectF rectF = new RectF(f10, f11, f6, d10);
            float f13 = rectF.left;
            float f14 = rectF.top;
            float f15 = rectF.right;
            float f16 = rectF.bottom;
            long r10 = R4.b.r(0.0f, mVar.f12544f);
            return new C5252d(C5251c.d(r10) + f13, C5251c.e(r10) + f14, C5251c.d(r10) + f15, C5251c.e(r10) + f16);
        }
        StringBuilder q10 = android.gov.nist.core.a.q("offset(", a5, ") is out of bounds [0,");
        q10.append(charSequence.length());
        q10.append(')');
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final C5252d c(int i10) {
        int i11;
        i iVar = this.f12478b;
        iVar.d(i10);
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 == length) {
            i11 = AbstractC4344b.u0(arrayList);
        } else {
            i11 = Df.H.H(i10, arrayList);
        }
        m mVar = (m) arrayList.get(i11);
        l lVar = mVar.f12539a;
        int a5 = mVar.a(i10);
        C1042a c1042a = (C1042a) lVar;
        CharSequence charSequence = c1042a.f12496e;
        if (a5 >= 0 && a5 <= charSequence.length()) {
            O0.s sVar = c1042a.f12495d;
            float g10 = sVar.g(a5, false);
            int lineForOffset = sVar.f13320d.getLineForOffset(a5);
            float f6 = sVar.f(lineForOffset);
            float d10 = sVar.d(lineForOffset);
            long r10 = R4.b.r(0.0f, mVar.f12544f);
            return new C5252d(C5251c.d(r10) + g10, C5251c.e(r10) + f6, C5251c.d(r10) + g10, C5251c.e(r10) + d10);
        }
        StringBuilder q10 = android.gov.nist.core.a.q("offset(", a5, ") is out of bounds [0,");
        q10.append(charSequence.length());
        q10.append(']');
        throw new IllegalArgumentException(q10.toString().toString());
    }

    public final boolean d() {
        long j6 = this.f12479c;
        i iVar = this.f12478b;
        if (((int) (j6 >> 32)) >= iVar.f12527d && !iVar.f12526c && ((int) (j6 & 4294967295L)) >= iVar.f12528e) {
            return false;
        }
        return true;
    }

    public final float e(int i10) {
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        return ((C1042a) mVar.f12539a).f12495d.d(i10 - mVar.f12542d) + mVar.f12544f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f12477a, c10.f12477a) && AbstractC3557B.K(this.f12478b, c10.f12478b) && Z0.k.a(this.f12479c, c10.f12479c) && this.f12480d == c10.f12480d && this.f12481e == c10.f12481e && AbstractC3557B.K(this.f12482f, c10.f12482f)) {
            return true;
        }
        return false;
    }

    public final int f(int i10, boolean z10) {
        int i11;
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        l lVar = mVar.f12539a;
        int i12 = i10 - mVar.f12542d;
        O0.s sVar = ((C1042a) lVar).f12495d;
        if (z10) {
            Layout layout = sVar.f13320d;
            if (layout.getEllipsisStart(i12) == 0) {
                O0.g gVar = (O0.g) sVar.f13331o.getValue();
                Layout layout2 = gVar.f13280a;
                i11 = gVar.c(layout2.getLineEnd(i12), layout2.getLineStart(i12));
            } else {
                i11 = layout.getEllipsisStart(i12) + layout.getLineStart(i12);
            }
        } else {
            i11 = sVar.e(i12);
        }
        return i11 + mVar.f12540b;
    }

    public final int g(int i10) {
        int i11;
        i iVar = this.f12478b;
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 >= length) {
            i11 = AbstractC4344b.u0(arrayList);
        } else if (i10 < 0) {
            i11 = 0;
        } else {
            i11 = Df.H.H(i10, arrayList);
        }
        m mVar = (m) arrayList.get(i11);
        l lVar = mVar.f12539a;
        return ((C1042a) lVar).f12495d.f13320d.getLineForOffset(mVar.a(i10)) + mVar.f12542d;
    }

    public final int h(float f6) {
        int i10;
        int i11 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        i iVar = this.f12478b;
        ArrayList arrayList = iVar.f12531h;
        if (i11 <= 0) {
            i10 = 0;
        } else if (f6 >= iVar.f12528e) {
            i10 = AbstractC4344b.u0(arrayList);
        } else {
            i10 = Df.H.J(f6, arrayList);
        }
        m mVar = (m) arrayList.get(i10);
        int i12 = mVar.f12541c - mVar.f12540b;
        int i13 = mVar.f12542d;
        if (i12 != 0) {
            O0.s sVar = ((C1042a) mVar.f12539a).f12495d;
            return i13 + sVar.f13320d.getLineForVertical(((int) (f6 - mVar.f12544f)) - sVar.f13322f);
        }
        return i13;
    }

    public final int hashCode() {
        int hashCode = this.f12478b.hashCode();
        long j6 = this.f12479c;
        float f6 = this.f12480d;
        return this.f12482f.hashCode() + AbstractC6463a.e(this.f12481e, AbstractC6463a.e(f6, (((int) (j6 ^ (j6 >>> 32))) + ((hashCode + (this.f12477a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final float i(int i10) {
        float f6;
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        l lVar = mVar.f12539a;
        int i11 = i10 - mVar.f12542d;
        O0.s sVar = ((C1042a) lVar).f12495d;
        float lineLeft = sVar.f13320d.getLineLeft(i11);
        if (i11 == sVar.f13321e - 1) {
            f6 = sVar.f13324h;
        } else {
            f6 = 0.0f;
        }
        return lineLeft + f6;
    }

    public final float j(int i10) {
        float f6;
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        l lVar = mVar.f12539a;
        int i11 = i10 - mVar.f12542d;
        O0.s sVar = ((C1042a) lVar).f12495d;
        float lineRight = sVar.f13320d.getLineRight(i11);
        if (i11 == sVar.f13321e - 1) {
            f6 = sVar.f13325i;
        } else {
            f6 = 0.0f;
        }
        return lineRight + f6;
    }

    public final int k(int i10) {
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        return ((C1042a) mVar.f12539a).f12495d.f13320d.getLineStart(i10 - mVar.f12542d) + mVar.f12540b;
    }

    public final float l(int i10) {
        i iVar = this.f12478b;
        iVar.e(i10);
        ArrayList arrayList = iVar.f12531h;
        m mVar = (m) arrayList.get(Df.H.I(i10, arrayList));
        return ((C1042a) mVar.f12539a).f12495d.f(i10 - mVar.f12542d) + mVar.f12544f;
    }

    public final int m(long j6) {
        int i10;
        i iVar = this.f12478b;
        iVar.getClass();
        int i11 = (C5251c.e(j6) > 0.0f ? 1 : (C5251c.e(j6) == 0.0f ? 0 : -1));
        ArrayList arrayList = iVar.f12531h;
        if (i11 <= 0) {
            i10 = 0;
        } else if (C5251c.e(j6) >= iVar.f12528e) {
            i10 = AbstractC4344b.u0(arrayList);
        } else {
            i10 = Df.H.J(C5251c.e(j6), arrayList);
        }
        m mVar = (m) arrayList.get(i10);
        int i12 = mVar.f12541c;
        int i13 = mVar.f12540b;
        if (i12 - i13 != 0) {
            long r10 = R4.b.r(C5251c.d(j6), C5251c.e(j6) - mVar.f12544f);
            C1042a c1042a = (C1042a) mVar.f12539a;
            c1042a.getClass();
            O0.s sVar = c1042a.f12495d;
            int e10 = ((int) C5251c.e(r10)) - sVar.f13322f;
            Layout layout = sVar.f13320d;
            int lineForVertical = layout.getLineForVertical(e10);
            return i13 + layout.getOffsetForHorizontal(lineForVertical, (sVar.b(lineForVertical) * (-1)) + C5251c.d(r10));
        }
        return i13;
    }

    public final Y0.h n(int i10) {
        int i11;
        i iVar = this.f12478b;
        iVar.d(i10);
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 == length) {
            i11 = AbstractC4344b.u0(arrayList);
        } else {
            i11 = Df.H.H(i10, arrayList);
        }
        m mVar = (m) arrayList.get(i11);
        l lVar = mVar.f12539a;
        int a5 = mVar.a(i10);
        O0.s sVar = ((C1042a) lVar).f12495d;
        if (sVar.f13320d.getParagraphDirection(sVar.f13320d.getLineForOffset(a5)) == 1) {
            return Y0.h.f22027Y;
        }
        return Y0.h.f22028Z;
    }

    public final C5344h o(int i10, int i11) {
        i iVar = this.f12478b;
        k kVar = iVar.f12524a;
        if (i10 >= 0 && i10 <= i11 && i11 <= kVar.f12534a.f12512Y.length()) {
            if (i10 == i11) {
                return androidx.compose.ui.graphics.a.g();
            }
            C5344h g10 = androidx.compose.ui.graphics.a.g();
            Df.H.K(iVar.f12531h, U3.f.e(i10, i11), new C0837a0(g10, i10, i11));
            return g10;
        }
        StringBuilder A10 = E9.f.A("Start(", i10, ") or End(", i11, ") is out of range [0..");
        A10.append(kVar.f12534a.f12512Y.length());
        A10.append("), or start > end!");
        throw new IllegalArgumentException(A10.toString().toString());
    }

    public final long p(int i10) {
        int i11;
        int i12;
        int i13;
        int following;
        int preceding;
        i iVar = this.f12478b;
        iVar.d(i10);
        int length = iVar.f12524a.f12534a.f12512Y.length();
        ArrayList arrayList = iVar.f12531h;
        if (i10 == length) {
            i11 = AbstractC4344b.u0(arrayList);
        } else {
            i11 = Df.H.H(i10, arrayList);
        }
        m mVar = (m) arrayList.get(i11);
        l lVar = mVar.f12539a;
        int a5 = mVar.a(i10);
        C1042a c1042a = (C1042a) lVar;
        P0.b bVar = ((P0.a) c1042a.f12498g.getValue()).f13769a;
        bVar.a(a5);
        BreakIterator breakIterator = bVar.f13773d;
        if (bVar.e(breakIterator.preceding(a5))) {
            bVar.a(a5);
            i12 = a5;
            while (i12 != -1 && (!bVar.e(i12) || bVar.c(i12))) {
                bVar.a(i12);
                i12 = breakIterator.preceding(i12);
            }
        } else {
            bVar.a(a5);
            if (bVar.d(a5)) {
                if (breakIterator.isBoundary(a5) && !bVar.b(a5)) {
                    preceding = a5;
                } else {
                    preceding = breakIterator.preceding(a5);
                }
            } else if (bVar.b(a5)) {
                preceding = breakIterator.preceding(a5);
            } else {
                i12 = -1;
            }
            i12 = preceding;
        }
        if (i12 == -1) {
            i12 = a5;
        }
        P0.b bVar2 = ((P0.a) c1042a.f12498g.getValue()).f13769a;
        bVar2.a(a5);
        BreakIterator breakIterator2 = bVar2.f13773d;
        if (bVar2.c(breakIterator2.following(a5))) {
            bVar2.a(a5);
            i13 = a5;
            while (i13 != -1 && (bVar2.e(i13) || !bVar2.c(i13))) {
                bVar2.a(i13);
                i13 = breakIterator2.following(i13);
            }
        } else {
            bVar2.a(a5);
            if (bVar2.b(a5)) {
                if (breakIterator2.isBoundary(a5) && !bVar2.d(a5)) {
                    following = a5;
                } else {
                    following = breakIterator2.following(a5);
                }
            } else if (bVar2.d(a5)) {
                following = breakIterator2.following(a5);
            } else {
                i13 = -1;
            }
            i13 = following;
        }
        if (i13 != -1) {
            a5 = i13;
        }
        long e10 = U3.f.e(i12, a5);
        int i14 = D.f12484c;
        int i15 = mVar.f12540b;
        return U3.f.e(((int) (e10 >> 32)) + i15, ((int) (e10 & 4294967295L)) + i15);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f12477a + ", multiParagraph=" + this.f12478b + ", size=" + ((Object) Z0.k.b(this.f12479c)) + ", firstBaseline=" + this.f12480d + ", lastBaseline=" + this.f12481e + ", placeholderRects=" + this.f12482f + ')';
    }
}
