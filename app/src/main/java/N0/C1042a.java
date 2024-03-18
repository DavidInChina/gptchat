package N0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import nf.AbstractC4828h;
import q0.C5252d;
import q0.C5254f;
import r0.AbstractC5340d;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.C5342f;
import r0.K;
import t0.AbstractC5651j;
import z.C6672L;

/* renamed from: N0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042a implements l {

    /* renamed from: a  reason: collision with root package name */
    public final V0.c f12492a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12493b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12494c;

    /* renamed from: d  reason: collision with root package name */
    public final O0.s f12495d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f12496e;

    /* renamed from: f  reason: collision with root package name */
    public final List f12497f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC3957g f12498g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ea A[LOOP:1: B:107:0x01e8->B:108:0x01ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Type inference failed for: r17v0, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1042a(V0.c cVar, int i10, boolean z10, long j6) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TextUtils.TruncateAt truncateAt;
        O0.s a5;
        O0.s sVar;
        X0.c[] cVarArr;
        CharSequence charSequence;
        List list;
        boolean z11;
        boolean z12;
        boolean z13;
        C5252d c5252d;
        Y0.h hVar;
        float f6;
        float f10;
        float c10;
        int b10;
        float f11;
        float c11;
        int i18;
        SpannableString spannableString;
        this.f12492a = cVar;
        this.f12493b = i10;
        this.f12494c = j6;
        if (Z0.a.i(j6) == 0 && Z0.a.j(j6) == 0) {
            if (i10 >= 1) {
                E e10 = cVar.f17991b;
                CharSequence charSequence2 = cVar.f17997h;
                Spannable spannable = charSequence2;
                if (z10) {
                    spannable = charSequence2;
                    if (!Z0.n.a(e10.f12487a.f12635h, M3.H.V(0))) {
                        spannable = charSequence2;
                        if (!Z0.n.a(e10.f12487a.f12635h, Z0.n.f22810c)) {
                            p pVar = e10.f12488b;
                            spannable = charSequence2;
                            if (!Y0.i.a(pVar.f12549a, Integer.MIN_VALUE)) {
                                int i19 = pVar.f12549a;
                                spannable = charSequence2;
                                if (!Y0.i.a(i19, 5)) {
                                    spannable = charSequence2;
                                    if (!Y0.i.a(i19, 4)) {
                                        int length = charSequence2.length();
                                        spannable = charSequence2;
                                        if (length != 0) {
                                            if (charSequence2 instanceof Spannable) {
                                                spannableString = (Spannable) charSequence2;
                                            } else {
                                                spannableString = new SpannableString(charSequence2);
                                            }
                                            spannableString.setSpan(new Object(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                            spannable = spannableString;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.f12496e = spannable;
                int i20 = e10.f12488b.f12549a;
                if (Y0.i.a(i20, 1)) {
                    i11 = 3;
                } else if (Y0.i.a(i20, 2)) {
                    i11 = 4;
                } else if (Y0.i.a(i20, 3)) {
                    i11 = 2;
                } else if (Y0.i.a(i20, 5) || !Y0.i.a(i20, 6)) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                p pVar2 = e10.f12488b;
                ?? a10 = Y0.i.a(pVar2.f12549a, 4);
                if (Y0.d.a(pVar2.f12556h, 2)) {
                    if (Build.VERSION.SDK_INT <= 32) {
                        i12 = 2;
                    } else {
                        i12 = 4;
                    }
                } else {
                    i12 = 0;
                }
                int i21 = pVar2.f12555g;
                int i22 = i21 & 255;
                if (!U3.f.x(i22, 1)) {
                    if (U3.f.x(i22, 2)) {
                        i13 = 1;
                    } else if (U3.f.x(i22, 3)) {
                        i13 = 2;
                    }
                    i14 = (i21 >> 8) & 255;
                    if (!N.z(i14, 1)) {
                        if (N.z(i14, 2)) {
                            i15 = 1;
                        } else if (N.z(i14, 3)) {
                            i15 = 2;
                        } else if (N.z(i14, 4)) {
                            i15 = 3;
                        }
                        i16 = (i21 >> 16) & 255;
                        if (i16 == 1 || i16 != 2) {
                            i17 = 0;
                        } else {
                            i17 = 1;
                        }
                        if (!z10) {
                            truncateAt = TextUtils.TruncateAt.END;
                        } else {
                            truncateAt = null;
                        }
                        a5 = a(i11, a10 == true ? 1 : 0, truncateAt, i10, i12, i13, i15, i17);
                        if (!z10 && a5.a() > Z0.a.g(j6) && i10 > 1) {
                            int g10 = Z0.a.g(j6);
                            int i23 = 0;
                            while (true) {
                                int i24 = a5.f13321e;
                                if (i23 < i24) {
                                    if (a5.d(i23) > g10) {
                                        break;
                                    }
                                    i23++;
                                } else {
                                    i23 = i24;
                                    break;
                                }
                            }
                            if (i23 >= 0 && i23 != this.f12493b) {
                                if (i23 < 1) {
                                    i18 = 1;
                                } else {
                                    i18 = i23;
                                }
                                a5 = a(i11, a10, truncateAt, i18, i12, i13, i15, i17);
                            }
                            this.f12495d = a5;
                        } else {
                            this.f12495d = a5;
                        }
                        V0.d dVar = this.f12492a.f17996g;
                        y yVar = e10.f12487a;
                        dVar.a(yVar.f12628a.d(), AbstractC4828h.i(c(), b()), yVar.f12628a.a());
                        sVar = this.f12495d;
                        if (sVar.f13320d.getText() instanceof Spanned) {
                            cVarArr = new X0.c[0];
                        } else {
                            Layout layout = sVar.f13320d;
                            CharSequence text = layout.getText();
                            AbstractC3557B.a0("null cannot be cast to non-null type android.text.Spanned", text);
                            cVarArr = (X0.c[]) ((Spanned) text).getSpans(0, layout.getText().length(), X0.c.class);
                            if (cVarArr.length == 0) {
                                cVarArr = new X0.c[0];
                            }
                        }
                        for (X0.c cVar2 : cVarArr) {
                            cVar2.f21721c.setValue(new C5254f(AbstractC4828h.i(c(), b())));
                        }
                        charSequence = this.f12496e;
                        if (charSequence instanceof Spanned) {
                            list = kf.v.f37483Y;
                        } else {
                            Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), Q0.i.class);
                            ArrayList arrayList = new ArrayList(spans.length);
                            for (Object obj : spans) {
                                Q0.i iVar = (Q0.i) obj;
                                Spanned spanned = (Spanned) charSequence;
                                int spanStart = spanned.getSpanStart(iVar);
                                int spanEnd = spanned.getSpanEnd(iVar);
                                int lineForOffset = this.f12495d.f13320d.getLineForOffset(spanStart);
                                if (lineForOffset >= this.f12493b) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (this.f12495d.f13320d.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.f12495d.f13320d.getEllipsisStart(lineForOffset)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (spanEnd > this.f12495d.e(lineForOffset)) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (!z12 && !z13 && !z11) {
                                    if (this.f12495d.f13320d.isRtlCharAt(spanStart)) {
                                        hVar = Y0.h.f22028Z;
                                    } else {
                                        hVar = Y0.h.f22027Y;
                                    }
                                    int ordinal = hVar.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal == 1) {
                                            f6 = this.f12495d.g(spanStart, false) - iVar.c();
                                        } else {
                                            throw new RuntimeException();
                                        }
                                    } else {
                                        f6 = this.f12495d.g(spanStart, false);
                                    }
                                    float c12 = iVar.c() + f6;
                                    O0.s sVar2 = this.f12495d;
                                    switch (iVar.f14285f) {
                                        case 0:
                                            c10 = sVar2.c(lineForOffset);
                                            b10 = iVar.b();
                                            f10 = c10 - b10;
                                            break;
                                        case 1:
                                            f10 = sVar2.f(lineForOffset);
                                            break;
                                        case 2:
                                            c10 = sVar2.d(lineForOffset);
                                            b10 = iVar.b();
                                            f10 = c10 - b10;
                                            break;
                                        case 3:
                                            f10 = ((sVar2.d(lineForOffset) + sVar2.f(lineForOffset)) - iVar.b()) / 2;
                                            break;
                                        case 4:
                                            f11 = iVar.a().ascent;
                                            c11 = sVar2.c(lineForOffset);
                                            f10 = c11 + f11;
                                            break;
                                        case 5:
                                            c10 = sVar2.c(lineForOffset) + iVar.a().descent;
                                            b10 = iVar.b();
                                            f10 = c10 - b10;
                                            break;
                                        case 6:
                                            Paint.FontMetricsInt a11 = iVar.a();
                                            f11 = ((a11.ascent + a11.descent) - iVar.b()) / 2;
                                            c11 = sVar2.c(lineForOffset);
                                            f10 = c11 + f11;
                                            break;
                                        default:
                                            throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                    c5252d = new C5252d(f6, f10, c12, iVar.b() + f10);
                                } else {
                                    c5252d = null;
                                }
                                arrayList.add(c5252d);
                            }
                            list = arrayList;
                        }
                        this.f12497f = list;
                        this.f12498g = R4.b.C1(EnumC3958h.f36153Z, new C6672L(26, this));
                        return;
                    }
                    i15 = 0;
                    i16 = (i21 >> 16) & 255;
                    if (i16 == 1) {
                        i17 = 1;
                        if (!z10) {
                        }
                        a5 = a(i11, a10 == true ? 1 : 0, truncateAt, i10, i12, i13, i15, i17);
                        if (!z10) {
                        }
                        this.f12495d = a5;
                        V0.d dVar2 = this.f12492a.f17996g;
                        y yVar2 = e10.f12487a;
                        dVar2.a(yVar2.f12628a.d(), AbstractC4828h.i(c(), b()), yVar2.f12628a.a());
                        sVar = this.f12495d;
                        if (sVar.f13320d.getText() instanceof Spanned) {
                        }
                        while (r2 < r1) {
                        }
                        charSequence = this.f12496e;
                        if (charSequence instanceof Spanned) {
                        }
                        this.f12497f = list;
                        this.f12498g = R4.b.C1(EnumC3958h.f36153Z, new C6672L(26, this));
                        return;
                    }
                    i17 = 0;
                    if (!z10) {
                    }
                    a5 = a(i11, a10 == true ? 1 : 0, truncateAt, i10, i12, i13, i15, i17);
                    if (!z10) {
                    }
                    this.f12495d = a5;
                    V0.d dVar22 = this.f12492a.f17996g;
                    y yVar22 = e10.f12487a;
                    dVar22.a(yVar22.f12628a.d(), AbstractC4828h.i(c(), b()), yVar22.f12628a.a());
                    sVar = this.f12495d;
                    if (sVar.f13320d.getText() instanceof Spanned) {
                    }
                    while (r2 < r1) {
                    }
                    charSequence = this.f12496e;
                    if (charSequence instanceof Spanned) {
                    }
                    this.f12497f = list;
                    this.f12498g = R4.b.C1(EnumC3958h.f36153Z, new C6672L(26, this));
                    return;
                }
                i13 = 0;
                i14 = (i21 >> 8) & 255;
                if (!N.z(i14, 1)) {
                }
                i15 = 0;
                i16 = (i21 >> 16) & 255;
                if (i16 == 1) {
                }
                i17 = 0;
                if (!z10) {
                }
                a5 = a(i11, a10 == true ? 1 : 0, truncateAt, i10, i12, i13, i15, i17);
                if (!z10) {
                }
                this.f12495d = a5;
                V0.d dVar222 = this.f12492a.f17996g;
                y yVar222 = e10.f12487a;
                dVar222.a(yVar222.f12628a.d(), AbstractC4828h.i(c(), b()), yVar222.f12628a.a());
                sVar = this.f12495d;
                if (sVar.f13320d.getText() instanceof Spanned) {
                }
                while (r2 < r1) {
                }
                charSequence = this.f12496e;
                if (charSequence instanceof Spanned) {
                }
                this.f12497f = list;
                this.f12498g = R4.b.C1(EnumC3958h.f36153Z, new C6672L(26, this));
                return;
            }
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public final O0.s a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        s sVar;
        float c10 = c();
        V0.c cVar = this.f12492a;
        V0.d dVar = cVar.f17996g;
        V0.a aVar = V0.b.f17989a;
        u uVar = cVar.f17991b.f12489c;
        if (uVar != null && (sVar = uVar.f12568b) != null) {
            z10 = sVar.f12564a;
        } else {
            z10 = false;
        }
        return new O0.s(this.f12496e, c10, dVar, i10, truncateAt, cVar.f18001l, z10, i12, i14, i15, i16, i13, i11, cVar.f17998i);
    }

    public final float b() {
        return this.f12495d.a();
    }

    public final float c() {
        return Z0.a.h(this.f12494c);
    }

    public final void d(AbstractC5352p abstractC5352p) {
        Canvas a5 = AbstractC5340d.a(abstractC5352p);
        O0.s sVar = this.f12495d;
        if (sVar.f13319c) {
            a5.save();
            a5.clipRect(0.0f, 0.0f, c(), b());
        }
        if (a5.getClipBounds(sVar.f13330n)) {
            int i10 = sVar.f13322f;
            if (i10 != 0) {
                a5.translate(0.0f, i10);
            }
            O0.r rVar = O0.t.f13332a;
            rVar.f13316a = a5;
            sVar.f13320d.draw(rVar);
            if (i10 != 0) {
                a5.translate(0.0f, (-1) * i10);
            }
        }
        if (sVar.f13319c) {
            a5.restore();
        }
    }

    public final void e(AbstractC5352p abstractC5352p, long j6, K k10, Y0.j jVar, AbstractC5651j abstractC5651j, int i10) {
        V0.c cVar = this.f12492a;
        V0.d dVar = cVar.f17996g;
        C5342f c5342f = dVar.f18002a;
        int i11 = c5342f.f44236b;
        if (j6 != r0.r.f44263k) {
            c5342f.f(j6);
            c5342f.i(null);
        }
        dVar.c(k10);
        dVar.d(jVar);
        dVar.b(abstractC5651j);
        dVar.f18002a.e(i10);
        d(abstractC5352p);
        cVar.f17996g.f18002a.e(i11);
    }

    public final void f(AbstractC5352p abstractC5352p, AbstractC5350n abstractC5350n, float f6, K k10, Y0.j jVar, AbstractC5651j abstractC5651j, int i10) {
        V0.c cVar = this.f12492a;
        V0.d dVar = cVar.f17996g;
        int i11 = dVar.f18002a.f44236b;
        dVar.a(abstractC5350n, AbstractC4828h.i(c(), b()), f6);
        dVar.c(k10);
        dVar.d(jVar);
        dVar.b(abstractC5651j);
        dVar.f18002a.e(i10);
        d(abstractC5352p);
        cVar.f17996g.f18002a.e(i11);
    }
}
