package V0;

import A.C0046u0;
import F.C0534h;
import M3.H;
import N0.AbstractC1047f;
import N0.C1045d;
import N0.E;
import N0.o;
import N0.y;
import Q1.l;
import S0.A;
import S0.D;
import S0.r;
import S0.s;
import S0.z;
import U3.u;
import Y0.p;
import Y0.q;
import Z.l1;
import Z0.n;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import id.AbstractC3557B;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import jf.C3959i;
import kotlin.jvm.internal.m;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5342f;
import r0.J;
import r0.K;
import r0.N;
import t0.AbstractC5651j;
import v.C5934c;

/* loaded from: classes2.dex */
public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f17990a;

    /* renamed from: b  reason: collision with root package name */
    public final E f17991b;

    /* renamed from: c  reason: collision with root package name */
    public final List f17992c;

    /* renamed from: d  reason: collision with root package name */
    public final List f17993d;

    /* renamed from: e  reason: collision with root package name */
    public final r f17994e;

    /* renamed from: f  reason: collision with root package name */
    public final Z0.b f17995f;

    /* renamed from: g  reason: collision with root package name */
    public final d f17996g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f17997h;

    /* renamed from: i  reason: collision with root package name */
    public final O0.h f17998i;

    /* renamed from: j  reason: collision with root package name */
    public u f17999j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f18000k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18001l;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r7 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0213  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(E e10, r rVar, Z0.b bVar, String str, List list, List list2) {
        boolean z10;
        int i10;
        Y0.r rVar2;
        int i11;
        int i12;
        boolean z11;
        boolean a5;
        D d10;
        z zVar;
        s sVar;
        U0.d dVar;
        String str2;
        p pVar;
        long b10;
        long j6;
        long j10;
        boolean z12;
        long j11;
        boolean z13;
        Y0.a aVar;
        boolean z14;
        y yVar;
        String str3;
        float textSize;
        E e11;
        List list3;
        Z0.b bVar2;
        boolean z15;
        Spannable spannable;
        N0.u uVar;
        boolean z16;
        N0.p pVar2;
        int i13;
        q qVar;
        Z0.b bVar3;
        ArrayList arrayList;
        int size;
        int i14;
        y yVar2;
        s sVar2;
        y yVar3;
        int size2;
        boolean z17;
        int i15;
        int size3;
        int i16;
        int i17;
        long j12;
        int i18;
        int i19;
        int i20;
        Object obj;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z18;
        boolean z19;
        Integer[] numArr;
        ArrayList arrayList2;
        int i25;
        y yVar4;
        float f6;
        float f10;
        float y12;
        int i26;
        boolean z20;
        boolean z21;
        N0.s sVar3;
        int length;
        C1045d c1045d;
        long j13;
        Y0.a aVar2;
        U0.c cVar;
        int i27;
        A a10;
        int i28;
        Locale locale;
        this.f17990a = str;
        this.f17991b = e10;
        ?? r32 = list;
        this.f17992c = r32;
        this.f17993d = list2;
        this.f17994e = rVar;
        this.f17995f = bVar;
        d dVar2 = new d(bVar.b());
        this.f17996g = dVar2;
        if (!m.k(e10)) {
            z10 = false;
        } else {
            f fVar = h.f18011a;
            f fVar2 = h.f18011a;
            l1 l1Var = fVar2.f18009a;
            if (l1Var == null) {
                if (l.c()) {
                    l1Var = fVar2.a();
                    fVar2.f18009a = l1Var;
                } else {
                    l1Var = i.f18012a;
                }
            }
            z10 = ((Boolean) l1Var.getValue()).booleanValue();
        }
        this.f18000k = z10;
        N0.p pVar3 = e10.f12488b;
        int i29 = pVar3.f12550b;
        y yVar5 = e10.f12487a;
        U0.d dVar3 = yVar5.f12638k;
        if (!Y0.k.a(i29, 4)) {
            if (!Y0.k.a(i29, 5)) {
                if (Y0.k.a(i29, 1)) {
                    i10 = 0;
                } else if (Y0.k.a(i29, 2)) {
                    i10 = 1;
                } else if (Y0.k.a(i29, 3) || Y0.k.a(i29, Integer.MIN_VALUE)) {
                    if (dVar3 != null) {
                        U0.e eVar = dVar3.r().f17382a;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale", eVar);
                        locale = ((U0.a) eVar).f17378a;
                    }
                    locale = Locale.getDefault();
                    int i30 = B1.q.f1731a;
                    int a11 = B1.p.a(locale);
                    if (a11 != 0) {
                    }
                } else {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                this.f18001l = i10;
                C0534h c0534h = new C0534h(2, this);
                rVar2 = pVar3.f12557i;
                rVar2 = rVar2 == null ? Y0.r.f22045c : rVar2;
                if (rVar2.f22048b) {
                    i11 = dVar2.getFlags() | 128;
                } else {
                    i11 = dVar2.getFlags() & (-129);
                }
                dVar2.setFlags(i11);
                i12 = rVar2.f22047a;
                if (i12 == 1) {
                    dVar2.setFlags(dVar2.getFlags() | 64);
                    dVar2.setHinting(0);
                } else if (i12 == 2) {
                    dVar2.getFlags();
                    dVar2.setHinting(1);
                } else if (i12 == 3) {
                    dVar2.getFlags();
                    dVar2.setHinting(0);
                } else {
                    dVar2.getFlags();
                }
                z11 = !list.isEmpty();
                long b11 = n.b(yVar5.f12629b);
                a5 = Z0.o.a(b11, 4294967296L);
                long j14 = yVar5.f12629b;
                if (a5) {
                    dVar2.setTextSize(bVar.i0(j14));
                } else if (Z0.o.a(b11, 8589934592L)) {
                    dVar2.setTextSize(n.c(j14) * dVar2.getTextSize());
                }
                d10 = yVar5.f12630c;
                zVar = yVar5.f12631d;
                sVar = yVar5.f12633f;
                if (sVar == null || zVar != null || d10 != null) {
                    d10 = d10 == null ? D.f15971j0 : d10;
                    if (zVar != null) {
                        i27 = zVar.f16061a;
                    } else {
                        i27 = 0;
                    }
                    z zVar2 = new z(i27);
                    a10 = yVar5.f12632e;
                    if (a10 != null) {
                        i28 = a10.f15966a;
                    } else {
                        i28 = 1;
                    }
                    dVar2.setTypeface((Typeface) c0534h.h(sVar, d10, zVar2, new A(i28)));
                }
                dVar = yVar5.f12638k;
                if (dVar != null) {
                    U0.f fVar3 = U0.g.f17385a;
                    if (!AbstractC3557B.K(dVar, fVar3.a())) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            W0.a.f20671a.b(dVar2, dVar);
                        } else {
                            if (dVar.f17383Y.isEmpty()) {
                                cVar = fVar3.a().r();
                            } else {
                                cVar = dVar.r();
                            }
                            U0.e eVar2 = cVar.f17382a;
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale", eVar2);
                            dVar2.setTextLocale(((U0.a) eVar2).f17378a);
                        }
                    }
                }
                str2 = yVar5.f12634g;
                if (str2 != null && !AbstractC3557B.K(str2, "")) {
                    dVar2.setFontFeatureSettings(str2);
                }
                pVar = yVar5.f12637j;
                if (pVar != null && !AbstractC3557B.K(pVar, p.f22039c)) {
                    dVar2.setTextScaleX(dVar2.getTextScaleX() * pVar.f22040a);
                    dVar2.setTextSkewX(dVar2.getTextSkewX() + pVar.f22041b);
                }
                Y0.o oVar = yVar5.f12628a;
                b10 = oVar.b();
                j6 = r0.r.f44263k;
                if (b10 != j6) {
                    C5342f c5342f = dVar2.f18002a;
                    c5342f.f(b10);
                    c5342f.i(null);
                }
                dVar2.a(oVar.d(), C5254f.f43638c, oVar.a());
                dVar2.c(yVar5.f12641n);
                dVar2.d(yVar5.f12640m);
                dVar2.b(yVar5.f12643p);
                j10 = yVar5.f12635h;
                if (!Z0.o.a(n.b(j10), 4294967296L) && n.c(j10) != 0.0f) {
                    float textScaleX = dVar2.getTextScaleX() * dVar2.getTextSize();
                    float i02 = bVar.i0(j10);
                    if (textScaleX != 0.0f) {
                        dVar2.setLetterSpacing(i02 / textScaleX);
                    }
                } else if (Z0.o.a(n.b(j10), 8589934592L)) {
                    dVar2.setLetterSpacing(n.c(j10));
                }
                if (!z11 && Z0.o.a(n.b(j10), 4294967296L) && n.c(j10) != 0.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j11 = yVar5.f12639l;
                if (r0.r.c(j11, j6) && !r0.r.c(j11, r0.r.f44262j)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar = yVar5.f12636i;
                if (aVar == null && Float.compare(aVar.f22014a, 0.0f) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z12 && !z13 && !z14) {
                    yVar = null;
                } else {
                    long j15 = !z12 ? n.f22810c : j10;
                    if (z13) {
                        j13 = j11;
                    } else {
                        j13 = j6;
                    }
                    if (z14) {
                        aVar2 = aVar;
                    } else {
                        aVar2 = null;
                    }
                    yVar = new y(0L, 0L, null, null, null, null, null, j15, aVar2, null, null, j13, null, null, 63103);
                }
                if (yVar != null) {
                    int size4 = list.size() + 1;
                    r32 = new ArrayList(size4);
                    for (int i31 = 0; i31 < size4; i31++) {
                        if (i31 == 0) {
                            c1045d = new C1045d(yVar, 0, this.f17990a.length());
                        } else {
                            c1045d = (C1045d) this.f17992c.get(i31 - 1);
                        }
                        r32.add(c1045d);
                    }
                }
                str3 = this.f17990a;
                textSize = this.f17996g.getTextSize();
                e11 = this.f17991b;
                list3 = this.f17993d;
                bVar2 = this.f17995f;
                z15 = this.f18000k;
                a aVar3 = b.f17989a;
                if (!z15 && l.c()) {
                    l a12 = l.a();
                    if (str3 == null) {
                        length = 0;
                    } else {
                        a12.getClass();
                        length = str3.length();
                    }
                    CharSequence g10 = a12.g(0, length, str3);
                    AbstractC3557B.Z(g10);
                    spannable = g10;
                } else {
                    spannable = str3;
                }
                if (r32.isEmpty() || !list3.isEmpty() || !AbstractC3557B.K(e11.f12488b.f12552d, q.f22042c) || !H.a0(e11.f12488b.f12551c)) {
                    if (spannable instanceof Spannable) {
                        spannable = (Spannable) spannable;
                    } else {
                        spannable = new SpannableString(spannable);
                    }
                    if (AbstractC3557B.K(e11.f12487a.f12640m, Y0.j.f22032c)) {
                        A7.b.E1(spannable, b.f17989a, 0, str3.length());
                    }
                    uVar = e11.f12489c;
                    if (uVar == null && (sVar3 = uVar.f12568b) != null) {
                        z16 = sVar3.f12564a;
                    } else {
                        z16 = false;
                    }
                    pVar2 = e11.f12488b;
                    if (!z16 && pVar2.f12554f == null) {
                        float y13 = A7.b.y1(pVar2.f12551c, textSize, bVar2);
                        if (!Float.isNaN(y13)) {
                            spannable.setSpan(new Q0.g(y13), 0, spannable.length(), 33);
                        }
                    } else {
                        Y0.g gVar = pVar2.f12554f;
                        gVar = gVar == null ? Y0.g.f22024c : gVar;
                        y12 = A7.b.y1(pVar2.f12551c, textSize, bVar2);
                        if (!Float.isNaN(y12)) {
                            if (spannable.length() == 0 || Lg.o.Y2(spannable) == '\n') {
                                i26 = spannable.length() + 1;
                            } else {
                                i26 = spannable.length();
                            }
                            int i32 = i26;
                            int i33 = gVar.f22026b;
                            if ((i33 & 1) > 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if ((i33 & 16) > 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            i13 = 0;
                            spannable.setSpan(new Q0.h(y12, i32, z20, z21, gVar.f22025a), 0, spannable.length(), 33);
                            qVar = pVar2.f12552d;
                            if (qVar == null) {
                                long V10 = H.V(i13);
                                long j16 = qVar.f22043a;
                                boolean a13 = n.a(j16, V10);
                                long j17 = qVar.f22044b;
                                if ((a13 && n.a(j17, H.V(i13))) || H.a0(j16) || H.a0(j17)) {
                                    bVar3 = bVar2;
                                } else {
                                    long b12 = n.b(j16);
                                    if (Z0.o.a(b12, 4294967296L)) {
                                        bVar3 = bVar2;
                                        f6 = bVar3.i0(j16);
                                    } else {
                                        bVar3 = bVar2;
                                        if (Z0.o.a(b12, 8589934592L)) {
                                            f6 = n.c(j16) * textSize;
                                        } else {
                                            f6 = 0.0f;
                                        }
                                    }
                                    long b13 = n.b(j17);
                                    if (Z0.o.a(b13, 4294967296L)) {
                                        f10 = bVar3.i0(j17);
                                    } else if (Z0.o.a(b13, 8589934592L)) {
                                        f10 = textSize * n.c(j17);
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    spannable.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(f6), (int) Math.ceil(f10)), 0, spannable.length(), 33);
                                }
                            } else {
                                bVar3 = bVar2;
                            }
                            arrayList = new ArrayList(r32.size());
                            size = r32.size();
                            for (i14 = 0; i14 < size; i14++) {
                                Object obj2 = r32.get(i14);
                                Object obj3 = ((C1045d) obj2).f12508a;
                                y yVar6 = (y) obj3;
                                if (yVar6.f12633f != null || yVar6.f12631d != null || yVar6.f12630c != null || ((y) obj3).f12632e != null) {
                                    arrayList.add(obj2);
                                }
                            }
                            yVar2 = e11.f12487a;
                            sVar2 = yVar2.f12633f;
                            if (sVar2 != null && yVar2.f12631d == null && yVar2.f12630c == null && yVar2.f12632e == null) {
                                yVar3 = null;
                            } else {
                                yVar3 = new y(0L, 0L, yVar2.f12630c, yVar2.f12631d, yVar2.f12632e, sVar2, null, 0L, null, null, null, 0L, null, null, 65475);
                            }
                            C0046u0 c0046u0 = new C0046u0(spannable, 4, c0534h);
                            if (arrayList.size() > 1) {
                                if (!arrayList.isEmpty()) {
                                    y yVar7 = (y) ((C1045d) arrayList.get(0)).f12508a;
                                    c0046u0.invoke(yVar3 != null ? yVar3.c(yVar7) : yVar7, Integer.valueOf(((C1045d) arrayList.get(0)).f12509b), Integer.valueOf(((C1045d) arrayList.get(0)).f12510c));
                                }
                            } else {
                                int size5 = arrayList.size();
                                int i34 = size5 * 2;
                                Integer[] numArr2 = new Integer[i34];
                                for (int i35 = 0; i35 < i34; i35++) {
                                    numArr2[i35] = 0;
                                }
                                int i36 = 0;
                                int size6 = arrayList.size();
                                for (int i37 = 0; i37 < size6; i37++) {
                                    C1045d c1045d2 = (C1045d) arrayList.get(i37);
                                    numArr2[i37] = Integer.valueOf(c1045d2.f12509b);
                                    numArr2[i37 + size5] = Integer.valueOf(c1045d2.f12510c);
                                }
                                kf.q.w3(numArr2);
                                int intValue = ((Number) kf.q.i3(numArr2)).intValue();
                                int i38 = 0;
                                while (i38 < i34) {
                                    Integer num = numArr2[i38];
                                    int intValue2 = num.intValue();
                                    if (intValue2 == intValue) {
                                        arrayList2 = arrayList;
                                        yVar4 = yVar3;
                                        i25 = i34;
                                        numArr = numArr2;
                                    } else {
                                        int size7 = arrayList.size();
                                        yVar4 = yVar3;
                                        while (i36 < size7) {
                                            ArrayList arrayList3 = arrayList;
                                            C1045d c1045d3 = (C1045d) arrayList.get(i36);
                                            int i39 = i34;
                                            int i40 = c1045d3.f12509b;
                                            Integer[] numArr3 = numArr2;
                                            int i41 = c1045d3.f12510c;
                                            if (i40 != i41 && AbstractC1047f.c(intValue, intValue2, i40, i41)) {
                                                y yVar8 = (y) c1045d3.f12508a;
                                                yVar3 = yVar3 != null ? yVar3.c(yVar8) : yVar8;
                                            }
                                            i36++;
                                            i34 = i39;
                                            arrayList = arrayList3;
                                            numArr2 = numArr3;
                                        }
                                        arrayList2 = arrayList;
                                        i25 = i34;
                                        numArr = numArr2;
                                        if (yVar3 != null) {
                                            c0046u0.invoke(yVar3, Integer.valueOf(intValue), num);
                                        }
                                        intValue = intValue2;
                                    }
                                    i38++;
                                    yVar3 = yVar4;
                                    i34 = i25;
                                    arrayList = arrayList2;
                                    numArr2 = numArr;
                                    i36 = 0;
                                }
                            }
                            size2 = r32.size();
                            z17 = false;
                            i15 = 0;
                            while (i15 < size2) {
                                C1045d c1045d4 = (C1045d) r32.get(i15);
                                int i42 = c1045d4.f12509b;
                                if (i42 < 0 || i42 >= spannable.length() || (i22 = c1045d4.f12510c) <= i42 || i22 > spannable.length()) {
                                    i21 = size2;
                                } else {
                                    y yVar9 = (y) c1045d4.f12508a;
                                    Y0.a aVar4 = yVar9.f12636i;
                                    int i43 = c1045d4.f12509b;
                                    int i44 = c1045d4.f12510c;
                                    if (aVar4 != null) {
                                        spannable.setSpan(new Q0.a(aVar4.f22014a), i43, i44, 33);
                                    }
                                    Y0.o oVar2 = yVar9.f12628a;
                                    A7.b.B1(spannable, oVar2.b(), i43, i44);
                                    AbstractC5350n d11 = oVar2.d();
                                    float a14 = oVar2.a();
                                    if (d11 != null) {
                                        if (d11 instanceof N) {
                                            A7.b.B1(spannable, ((N) d11).f44223a, i43, i44);
                                        } else {
                                            spannable.setSpan(new X0.c((J) d11, a14), i43, i44, 33);
                                        }
                                    }
                                    Y0.j jVar = yVar9.f12640m;
                                    if (jVar != null) {
                                        int i45 = jVar.f22034a;
                                        if ((i45 | 1) == i45) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if ((i45 | 2) == i45) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        spannable.setSpan(new Q0.l(z18, z19), i43, i44, 33);
                                    }
                                    A7.b.C1(spannable, yVar9.f12629b, bVar3, i43, i44);
                                    String str4 = yVar9.f12634g;
                                    if (str4 != null) {
                                        Q0.b bVar4 = new Q0.b(str4);
                                        i23 = 33;
                                        spannable.setSpan(bVar4, i43, i44, 33);
                                    } else {
                                        i23 = 33;
                                    }
                                    p pVar4 = yVar9.f12637j;
                                    if (pVar4 != null) {
                                        spannable.setSpan(new ScaleXSpan(pVar4.f22040a), i43, i44, i23);
                                        spannable.setSpan(new Q0.k(pVar4.f22041b), i43, i44, i23);
                                    }
                                    A7.b.D1(spannable, yVar9.f12638k, i43, i44);
                                    long j18 = r0.r.f44263k;
                                    long j19 = yVar9.f12639l;
                                    if (j19 != j18) {
                                        spannable.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a.s(j19)), i43, i44, 33);
                                    }
                                    K k10 = yVar9.f12641n;
                                    if (k10 != null) {
                                        int s10 = androidx.compose.ui.graphics.a.s(k10.f44203a);
                                        long j20 = k10.f44204b;
                                        i21 = size2;
                                        float d12 = C5251c.d(j20);
                                        float e12 = C5251c.e(j20);
                                        float f11 = k10.f44205c;
                                        Q0.j jVar2 = new Q0.j(d12, e12, f11 == 0.0f ? Float.MIN_VALUE : f11, s10);
                                        i24 = 33;
                                        spannable.setSpan(jVar2, i43, i44, 33);
                                    } else {
                                        i21 = size2;
                                        i24 = 33;
                                    }
                                    AbstractC5651j abstractC5651j = yVar9.f12643p;
                                    if (abstractC5651j != null) {
                                        spannable.setSpan(new X0.a(abstractC5651j), i43, i44, i24);
                                    }
                                    long j21 = yVar9.f12635h;
                                    if (Z0.o.a(n.b(j21), 4294967296L) || Z0.o.a(n.b(j21), 8589934592L)) {
                                        z17 = true;
                                    }
                                }
                                i15++;
                                size2 = i21;
                            }
                            if (z17) {
                                int size8 = r32.size();
                                for (int i46 = 0; i46 < size8; i46++) {
                                    C1045d c1045d5 = (C1045d) r32.get(i46);
                                    int i47 = c1045d5.f12509b;
                                    y yVar10 = (y) c1045d5.f12508a;
                                    if (i47 >= 0 && i47 < spannable.length() && (i20 = c1045d5.f12510c) > i47 && i20 <= spannable.length()) {
                                        long j22 = yVar10.f12635h;
                                        long b14 = n.b(j22);
                                        if (Z0.o.a(b14, 4294967296L)) {
                                            obj = new Q0.f(bVar3.i0(j22));
                                        } else if (Z0.o.a(b14, 8589934592L)) {
                                            obj = new Q0.e(n.c(j22));
                                        } else {
                                            obj = null;
                                        }
                                        if (obj != null) {
                                            spannable.setSpan(obj, i47, i20, 33);
                                        }
                                    }
                                }
                            }
                            size3 = list3.size();
                            for (i16 = 0; i16 < size3; i16++) {
                                C1045d c1045d6 = (C1045d) list3.get(i16);
                                N0.r rVar3 = (N0.r) c1045d6.f12508a;
                                int i48 = c1045d6.f12509b;
                                int i49 = c1045d6.f12510c;
                                for (Object obj4 : spannable.getSpans(i48, i49, Q1.E.class)) {
                                    spannable.removeSpan((Q1.E) obj4);
                                }
                                float c10 = n.c(rVar3.f12560a);
                                long b15 = n.b(rVar3.f12560a);
                                if (Z0.o.a(b15, 4294967296L)) {
                                    j12 = 8589934592L;
                                    i17 = 0;
                                } else {
                                    j12 = 8589934592L;
                                    if (Z0.o.a(b15, 8589934592L)) {
                                        i17 = 1;
                                    } else {
                                        i17 = 2;
                                    }
                                }
                                long j23 = rVar3.f12561b;
                                float c11 = n.c(j23);
                                long b16 = n.b(j23);
                                if (Z0.o.a(b16, 4294967296L)) {
                                    i18 = 0;
                                } else if (Z0.o.a(b16, j12)) {
                                    i18 = 1;
                                } else {
                                    i18 = 2;
                                }
                                float b17 = bVar3.b() * bVar3.O();
                                int i50 = rVar3.f12562c;
                                if (r.f.v(i50, 1)) {
                                    i19 = 0;
                                } else if (r.f.v(i50, 2)) {
                                    i19 = 1;
                                } else if (r.f.v(i50, 3)) {
                                    i19 = 2;
                                } else if (r.f.v(i50, 4)) {
                                    i19 = 3;
                                } else if (r.f.v(i50, 5)) {
                                    i19 = 4;
                                } else if (r.f.v(i50, 6)) {
                                    i19 = 5;
                                } else if (r.f.v(i50, 7)) {
                                    i19 = 6;
                                } else {
                                    throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
                                }
                                spannable.setSpan(new Q0.i(c10, i17, c11, i18, b17, i19), i48, i49, 33);
                            }
                        }
                    }
                    i13 = 0;
                    qVar = pVar2.f12552d;
                    if (qVar == null) {
                    }
                    arrayList = new ArrayList(r32.size());
                    size = r32.size();
                    while (i14 < size) {
                    }
                    yVar2 = e11.f12487a;
                    sVar2 = yVar2.f12633f;
                    if (sVar2 != null) {
                    }
                    yVar3 = new y(0L, 0L, yVar2.f12630c, yVar2.f12631d, yVar2.f12632e, sVar2, null, 0L, null, null, null, 0L, null, null, 65475);
                    C0046u0 c0046u02 = new C0046u0(spannable, 4, c0534h);
                    if (arrayList.size() > 1) {
                    }
                    size2 = r32.size();
                    z17 = false;
                    i15 = 0;
                    while (i15 < size2) {
                    }
                    if (z17) {
                    }
                    size3 = list3.size();
                    while (i16 < size3) {
                    }
                }
                this.f17997h = spannable;
                this.f17998i = new O0.h(spannable, this.f17996g, this.f18001l);
            }
            i10 = 3;
            this.f18001l = i10;
            C0534h c0534h2 = new C0534h(2, this);
            rVar2 = pVar3.f12557i;
            if (rVar2 == null) {
            }
            if (rVar2.f22048b) {
            }
            dVar2.setFlags(i11);
            i12 = rVar2.f22047a;
            if (i12 == 1) {
            }
            z11 = !list.isEmpty();
            long b112 = n.b(yVar5.f12629b);
            a5 = Z0.o.a(b112, 4294967296L);
            long j142 = yVar5.f12629b;
            if (a5) {
            }
            d10 = yVar5.f12630c;
            zVar = yVar5.f12631d;
            sVar = yVar5.f12633f;
            if (sVar == null) {
            }
            if (d10 == null) {
            }
            if (zVar != null) {
            }
            z zVar22 = new z(i27);
            a10 = yVar5.f12632e;
            if (a10 != null) {
            }
            dVar2.setTypeface((Typeface) c0534h2.h(sVar, d10, zVar22, new A(i28)));
            dVar = yVar5.f12638k;
            if (dVar != null) {
            }
            str2 = yVar5.f12634g;
            if (str2 != null) {
                dVar2.setFontFeatureSettings(str2);
            }
            pVar = yVar5.f12637j;
            if (pVar != null) {
                dVar2.setTextScaleX(dVar2.getTextScaleX() * pVar.f22040a);
                dVar2.setTextSkewX(dVar2.getTextSkewX() + pVar.f22041b);
            }
            Y0.o oVar3 = yVar5.f12628a;
            b10 = oVar3.b();
            j6 = r0.r.f44263k;
            if (b10 != j6) {
            }
            dVar2.a(oVar3.d(), C5254f.f43638c, oVar3.a());
            dVar2.c(yVar5.f12641n);
            dVar2.d(yVar5.f12640m);
            dVar2.b(yVar5.f12643p);
            j10 = yVar5.f12635h;
            if (!Z0.o.a(n.b(j10), 4294967296L)) {
            }
            if (Z0.o.a(n.b(j10), 8589934592L)) {
            }
            if (!z11) {
            }
            z12 = false;
            j11 = yVar5.f12639l;
            if (r0.r.c(j11, j6)) {
            }
            z13 = false;
            aVar = yVar5.f12636i;
            if (aVar == null) {
            }
            z14 = false;
            if (z12) {
            }
            long j152 = !z12 ? n.f22810c : j10;
            if (z13) {
            }
            if (z14) {
            }
            yVar = new y(0L, 0L, null, null, null, null, null, j152, aVar2, null, null, j13, null, null, 63103);
            if (yVar != null) {
            }
            str3 = this.f17990a;
            textSize = this.f17996g.getTextSize();
            e11 = this.f17991b;
            list3 = this.f17993d;
            bVar2 = this.f17995f;
            z15 = this.f18000k;
            a aVar32 = b.f17989a;
            if (!z15) {
            }
            spannable = str3;
            if (r32.isEmpty()) {
            }
            if (spannable instanceof Spannable) {
            }
            if (AbstractC3557B.K(e11.f12487a.f12640m, Y0.j.f22032c)) {
            }
            uVar = e11.f12489c;
            if (uVar == null) {
            }
            z16 = false;
            pVar2 = e11.f12488b;
            if (!z16) {
            }
            Y0.g gVar2 = pVar2.f12554f;
            if (gVar2 == null) {
            }
            y12 = A7.b.y1(pVar2.f12551c, textSize, bVar2);
            if (!Float.isNaN(y12)) {
            }
            i13 = 0;
            qVar = pVar2.f12552d;
            if (qVar == null) {
            }
            arrayList = new ArrayList(r32.size());
            size = r32.size();
            while (i14 < size) {
            }
            yVar2 = e11.f12487a;
            sVar2 = yVar2.f12633f;
            if (sVar2 != null) {
            }
            yVar3 = new y(0L, 0L, yVar2.f12630c, yVar2.f12631d, yVar2.f12632e, sVar2, null, 0L, null, null, null, 0L, null, null, 65475);
            C0046u0 c0046u022 = new C0046u0(spannable, 4, c0534h2);
            if (arrayList.size() > 1) {
            }
            size2 = r32.size();
            z17 = false;
            i15 = 0;
            while (i15 < size2) {
            }
            if (z17) {
            }
            size3 = list3.size();
            while (i16 < size3) {
            }
            this.f17997h = spannable;
            this.f17998i = new O0.h(spannable, this.f17996g, this.f18001l);
        }
        i10 = 2;
        this.f18001l = i10;
        C0534h c0534h22 = new C0534h(2, this);
        rVar2 = pVar3.f12557i;
        if (rVar2 == null) {
        }
        if (rVar2.f22048b) {
        }
        dVar2.setFlags(i11);
        i12 = rVar2.f22047a;
        if (i12 == 1) {
        }
        z11 = !list.isEmpty();
        long b1122 = n.b(yVar5.f12629b);
        a5 = Z0.o.a(b1122, 4294967296L);
        long j1422 = yVar5.f12629b;
        if (a5) {
        }
        d10 = yVar5.f12630c;
        zVar = yVar5.f12631d;
        sVar = yVar5.f12633f;
        if (sVar == null) {
        }
        if (d10 == null) {
        }
        if (zVar != null) {
        }
        z zVar222 = new z(i27);
        a10 = yVar5.f12632e;
        if (a10 != null) {
        }
        dVar2.setTypeface((Typeface) c0534h22.h(sVar, d10, zVar222, new A(i28)));
        dVar = yVar5.f12638k;
        if (dVar != null) {
        }
        str2 = yVar5.f12634g;
        if (str2 != null) {
        }
        pVar = yVar5.f12637j;
        if (pVar != null) {
        }
        Y0.o oVar32 = yVar5.f12628a;
        b10 = oVar32.b();
        j6 = r0.r.f44263k;
        if (b10 != j6) {
        }
        dVar2.a(oVar32.d(), C5254f.f43638c, oVar32.a());
        dVar2.c(yVar5.f12641n);
        dVar2.d(yVar5.f12640m);
        dVar2.b(yVar5.f12643p);
        j10 = yVar5.f12635h;
        if (!Z0.o.a(n.b(j10), 4294967296L)) {
        }
        if (Z0.o.a(n.b(j10), 8589934592L)) {
        }
        if (!z11) {
        }
        z12 = false;
        j11 = yVar5.f12639l;
        if (r0.r.c(j11, j6)) {
        }
        z13 = false;
        aVar = yVar5.f12636i;
        if (aVar == null) {
        }
        z14 = false;
        if (z12) {
        }
        long j1522 = !z12 ? n.f22810c : j10;
        if (z13) {
        }
        if (z14) {
        }
        yVar = new y(0L, 0L, null, null, null, null, null, j1522, aVar2, null, null, j13, null, null, 63103);
        if (yVar != null) {
        }
        str3 = this.f17990a;
        textSize = this.f17996g.getTextSize();
        e11 = this.f17991b;
        list3 = this.f17993d;
        bVar2 = this.f17995f;
        z15 = this.f18000k;
        a aVar322 = b.f17989a;
        if (!z15) {
        }
        spannable = str3;
        if (r32.isEmpty()) {
        }
        if (spannable instanceof Spannable) {
        }
        if (AbstractC3557B.K(e11.f12487a.f12640m, Y0.j.f22032c)) {
        }
        uVar = e11.f12489c;
        if (uVar == null) {
        }
        z16 = false;
        pVar2 = e11.f12488b;
        if (!z16) {
        }
        Y0.g gVar22 = pVar2.f12554f;
        if (gVar22 == null) {
        }
        y12 = A7.b.y1(pVar2.f12551c, textSize, bVar2);
        if (!Float.isNaN(y12)) {
        }
        i13 = 0;
        qVar = pVar2.f12552d;
        if (qVar == null) {
        }
        arrayList = new ArrayList(r32.size());
        size = r32.size();
        while (i14 < size) {
        }
        yVar2 = e11.f12487a;
        sVar2 = yVar2.f12633f;
        if (sVar2 != null) {
        }
        yVar3 = new y(0L, 0L, yVar2.f12630c, yVar2.f12631d, yVar2.f12632e, sVar2, null, 0L, null, null, null, 0L, null, null, 65475);
        C0046u0 c0046u0222 = new C0046u0(spannable, 4, c0534h22);
        if (arrayList.size() > 1) {
        }
        size2 = r32.size();
        z17 = false;
        i15 = 0;
        while (i15 < size2) {
        }
        if (z17) {
        }
        size3 = list3.size();
        while (i16 < size3) {
        }
        this.f17997h = spannable;
        this.f17998i = new O0.h(spannable, this.f17996g, this.f18001l);
    }

    @Override // N0.o
    public final boolean a() {
        u uVar = this.f17999j;
        if (uVar == null || !uVar.G()) {
            if (!this.f18000k && m.k(this.f17991b)) {
                f fVar = h.f18011a;
                f fVar2 = h.f18011a;
                l1 l1Var = fVar2.f18009a;
                if (l1Var == null) {
                    if (l.c()) {
                        l1Var = fVar2.a();
                        fVar2.f18009a = l1Var;
                    } else {
                        l1Var = i.f18012a;
                    }
                }
                if (((Boolean) l1Var.getValue()).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // N0.o
    public final float b() {
        O0.h hVar = this.f17998i;
        if (!Float.isNaN(hVar.f13289e)) {
            return hVar.f13289e;
        }
        TextPaint textPaint = hVar.f13286b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hVar.f13285a;
        lineInstance.setText(new O0.c(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C5934c(3));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C3959i(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                C3959i c3959i = (C3959i) priorityQueue.peek();
                if (c3959i != null && ((Number) c3959i.f36156Z).intValue() - ((Number) c3959i.f36155Y).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new C3959i(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f6 = 0.0f;
        while (it.hasNext()) {
            C3959i c3959i2 = (C3959i) it.next();
            f6 = Math.max(f6, Layout.getDesiredWidth(charSequence, ((Number) c3959i2.f36155Y).intValue(), ((Number) c3959i2.f36156Z).intValue(), textPaint));
        }
        hVar.f13289e = f6;
        return f6;
    }

    @Override // N0.o
    public final float c() {
        return this.f17998i.b();
    }
}
