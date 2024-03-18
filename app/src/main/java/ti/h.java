package ti;

import D1.C0373t;
import K4.J;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p3.H;
import r9.y;
import wi.s;
import wi.t;
import wi.u;

/* loaded from: classes2.dex */
public final class h extends yi.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46277a;

    public h(int i10) {
        this.f46277a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARN: Type inference failed for: r14v17, types: [wi.s, wi.q, wi.t] */
    /* JADX WARN: Type inference failed for: r6v29, types: [wi.s, wi.c, wi.q] */
    @Override // yi.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(yi.d dVar, S4.o oVar) {
        int i10;
        i iVar;
        n nVar;
        n nVar2;
        boolean z10;
        boolean z11;
        char charAt;
        int i11;
        char charAt2;
        char charAt3;
        g gVar;
        char c10 = '-';
        switch (this.f46277a) {
            case 0:
                f fVar = (f) dVar;
                if (fVar.f46264h < 4) {
                    xi.d dVar2 = fVar.f46257a;
                    int i12 = fVar.f46262f;
                    char charAt4 = dVar2.f50076a.charAt(i12);
                    CharSequence charSequence = dVar2.f50076a;
                    if (charAt4 == '#') {
                        xi.d a5 = dVar2.a(i12, charSequence.length());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a5);
                        H h10 = new H(arrayList);
                        int h11 = h10.h('#');
                        if (h11 != 0 && h11 <= 6) {
                            if (!h10.f()) {
                                iVar = new i(h11, new Q3.j(6));
                            } else {
                                char m10 = h10.m();
                                if (m10 == ' ' || m10 == '\t') {
                                    h10.p();
                                    C0373t n10 = h10.n();
                                    C0373t c0373t = n10;
                                    while (true) {
                                        boolean z12 = true;
                                        while (h10.f()) {
                                            char m11 = h10.m();
                                            if (m11 != '\t' && m11 != ' ') {
                                                if (m11 != '#') {
                                                    h10.j();
                                                    c0373t = h10.n();
                                                } else if (z12) {
                                                    h10.h('#');
                                                    int p10 = h10.p();
                                                    if (h10.f()) {
                                                        c0373t = h10.n();
                                                    }
                                                    if (p10 > 0) {
                                                        break;
                                                    }
                                                } else {
                                                    h10.j();
                                                    c0373t = h10.n();
                                                }
                                                z12 = false;
                                            } else {
                                                h10.j();
                                            }
                                        }
                                        Q3.j e10 = h10.e(n10, c0373t);
                                        if (e10.e().isEmpty()) {
                                            iVar = new i(h11, new Q3.j(6));
                                        } else {
                                            iVar = new i(h11, e10);
                                        }
                                    }
                                }
                            }
                            if (iVar != null) {
                                c cVar = new c(iVar);
                                cVar.f46243b = charSequence.length();
                                return cVar;
                            }
                        }
                        iVar = null;
                        if (iVar != null) {
                        }
                    }
                    char charAt5 = charSequence.charAt(i12);
                    if (charAt5 != '-') {
                        if (charAt5 == '=') {
                            int i13 = i12 + 1;
                            int length = charSequence.length();
                            while (true) {
                                if (i13 < length) {
                                    if (charSequence.charAt(i13) != '=') {
                                        length = i13;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            if (J.e0(length, charSequence.length(), charSequence) >= charSequence.length()) {
                                i10 = 1;
                                if (i10 > 0) {
                                    Q3.j m12 = oVar.m();
                                    if (!m12.f14418b.isEmpty()) {
                                        c cVar2 = new c(new i(i10, m12));
                                        cVar2.f46243b = charSequence.length();
                                        cVar2.f46245d = true;
                                        return cVar2;
                                    }
                                }
                            }
                        }
                        i10 = 0;
                        if (i10 > 0) {
                        }
                    }
                    int i14 = i12 + 1;
                    int length2 = charSequence.length();
                    while (true) {
                        if (i14 < length2) {
                            if (charSequence.charAt(i14) != '-') {
                                length2 = i14;
                            } else {
                                i14++;
                            }
                        }
                    }
                    if (J.e0(length2, charSequence.length(), charSequence) >= charSequence.length()) {
                        i10 = 2;
                        if (i10 > 0) {
                        }
                    }
                    i10 = 0;
                    if (i10 > 0) {
                    }
                }
                return null;
            case 1:
                f fVar2 = (f) dVar;
                int i15 = fVar2.f46262f;
                CharSequence charSequence2 = fVar2.f46257a.f50076a;
                if (fVar2.f46264h < 4 && charSequence2.charAt(i15) == '<') {
                    for (int i16 = 1; i16 <= 7; i16++) {
                        if (i16 != 7 || (!(((yi.a) oVar.f16184Z).f() instanceof u) && !fVar2.h().d())) {
                            Pattern[] patternArr = j.f46281e[i16];
                            Pattern pattern = patternArr[0];
                            Pattern pattern2 = patternArr[1];
                            if (pattern.matcher(charSequence2.subSequence(i15, charSequence2.length())).find()) {
                                c cVar3 = new c(new j(pattern2));
                                cVar3.f46243b = fVar2.f46259c;
                                return cVar3;
                            }
                        }
                    }
                }
                return null;
            case 2:
                yi.a aVar = (yi.a) oVar.f16184Z;
                f fVar3 = (f) dVar;
                int i17 = fVar3.f46264h;
                if (i17 < 4) {
                    int i18 = fVar3.f46262f;
                    int i19 = fVar3.f46260d + i17;
                    boolean z13 = !oVar.m().f14418b.isEmpty();
                    CharSequence charSequence3 = fVar3.f46257a.f50076a;
                    char charAt6 = charSequence3.charAt(i18);
                    if (charAt6 != '*' && charAt6 != '+' && charAt6 != '-') {
                        int length3 = charSequence3.length();
                        int i20 = 0;
                        for (int i21 = i18; i21 < length3; i21++) {
                            char charAt7 = charSequence3.charAt(i21);
                            if (charAt7 != ')' && charAt7 != '.') {
                                switch (charAt7) {
                                    case y.f44626f /* 48 */:
                                    case '1':
                                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i20++;
                                        if (i20 > 9) {
                                            break;
                                        }
                                }
                            } else if (i20 >= 1 && ((i11 = i21 + 1) >= charSequence3.length() || (charAt2 = charSequence3.charAt(i11)) == '\t' || charAt2 == ' ')) {
                                String charSequence4 = charSequence3.subSequence(i18, i21).toString();
                                ?? sVar = new s();
                                sVar.f48614g = Integer.parseInt(charSequence4);
                                sVar.f48615h = charAt7;
                                nVar = new n(sVar, i11);
                                if (nVar != null) {
                                }
                                nVar2 = null;
                                if (nVar2 != null) {
                                }
                            }
                            nVar = null;
                            if (nVar != null) {
                            }
                            nVar2 = null;
                            if (nVar2 != null) {
                            }
                        }
                        nVar = null;
                        if (nVar != null) {
                        }
                        nVar2 = null;
                        if (nVar2 != null) {
                        }
                    } else {
                        int i22 = i18 + 1;
                        if (i22 >= charSequence3.length() || (charAt = charSequence3.charAt(i22)) == '\t' || charAt == ' ') {
                            ?? sVar2 = new s();
                            sVar2.f48589g = charAt6;
                            nVar = new n(sVar2, i22);
                            if (nVar != null) {
                                int i23 = nVar.f46308b;
                                int i24 = (i23 - i18) + i19;
                                int length4 = charSequence3.length();
                                int i25 = i24;
                                while (true) {
                                    if (i23 < length4) {
                                        char charAt8 = charSequence3.charAt(i23);
                                        if (charAt8 == '\t') {
                                            i25 = (4 - (i25 % 4)) + i25;
                                        } else if (charAt8 == ' ') {
                                            i25++;
                                        } else {
                                            z11 = true;
                                        }
                                        i23++;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                wi.q qVar = nVar.f46307a;
                                if (!z13 || ((!(qVar instanceof t) || ((t) qVar).f48614g == 1) && z11)) {
                                    if (!z11 || i25 - i24 > 4) {
                                        i25 = i24 + 1;
                                    }
                                    nVar2 = new n(qVar, i25);
                                    if (nVar2 != null) {
                                        int i26 = fVar3.f46260d;
                                        int i27 = nVar2.f46308b;
                                        p pVar = new p(i27 - i26);
                                        boolean z14 = aVar instanceof o;
                                        wi.q qVar2 = nVar2.f46307a;
                                        if (z14) {
                                            wi.q qVar3 = (wi.q) aVar.f();
                                            if ((qVar3 instanceof wi.c) && (qVar2 instanceof wi.c)) {
                                                z10 = Character.valueOf(((wi.c) qVar3).f48589g).equals(Character.valueOf(((wi.c) qVar2).f48589g));
                                            } else if ((qVar3 instanceof t) && (qVar2 instanceof t)) {
                                                z10 = Character.valueOf(((t) qVar3).f48615h).equals(Character.valueOf(((t) qVar2).f48615h));
                                            }
                                            if (z10) {
                                                c cVar4 = new c(pVar);
                                                cVar4.f46244c = i27;
                                                return cVar4;
                                            }
                                        }
                                        o oVar2 = new o(qVar2);
                                        qVar2.getClass();
                                        c cVar5 = new c(oVar2, pVar);
                                        cVar5.f46244c = i27;
                                        return cVar5;
                                    }
                                }
                            }
                            nVar2 = null;
                            if (nVar2 != null) {
                            }
                        }
                        nVar = null;
                        if (nVar != null) {
                        }
                        nVar2 = null;
                        if (nVar2 != null) {
                        }
                    }
                }
                return null;
            case 3:
                int i28 = ((f) dVar).f46262f;
                if (b.j(dVar, i28)) {
                    f fVar4 = (f) dVar;
                    int i29 = fVar4.f46260d + fVar4.f46264h;
                    int i30 = i29 + 1;
                    CharSequence charSequence5 = fVar4.f46257a.f50076a;
                    int i31 = i28 + 1;
                    if (i31 < charSequence5.length() && ((charAt3 = charSequence5.charAt(i31)) == '\t' || charAt3 == ' ')) {
                        i30 = i29 + 2;
                    }
                    c cVar6 = new c(new b(0));
                    cVar6.f46244c = i30;
                    return cVar6;
                }
                return null;
            case 4:
                f fVar5 = (f) dVar;
                int i32 = fVar5.f46264h;
                if (i32 < 4) {
                    int i33 = fVar5.f46262f;
                    CharSequence charSequence6 = fVar5.f46257a.f50076a;
                    int length5 = charSequence6.length();
                    int i34 = 0;
                    int i35 = 0;
                    for (int i36 = i33; i36 < length5; i36++) {
                        char charAt9 = charSequence6.charAt(i36);
                        if (charAt9 != '`') {
                            if (charAt9 == '~') {
                                i35++;
                            } else if (i34 < 3 && i35 == 0) {
                                if (J.s('`', i33 + i34, charSequence6) == -1) {
                                    gVar = new g('`', i34, i32);
                                    if (gVar != null) {
                                    }
                                }
                                gVar = null;
                                if (gVar != null) {
                                }
                            } else {
                                if (i35 >= 3 && i34 == 0) {
                                    gVar = new g('~', i35, i32);
                                    if (gVar != null) {
                                        c cVar7 = new c(gVar);
                                        cVar7.f46243b = i33 + gVar.f46274a.f48593h;
                                        return cVar7;
                                    }
                                }
                                gVar = null;
                                if (gVar != null) {
                                }
                            }
                        } else {
                            i34++;
                        }
                    }
                    if (i34 < 3) {
                    }
                    if (i35 >= 3) {
                        gVar = new g('~', i35, i32);
                        if (gVar != null) {
                        }
                    }
                    gVar = null;
                    if (gVar != null) {
                    }
                }
                return null;
            case 5:
                f fVar6 = (f) dVar;
                if (fVar6.f46264h >= 4 && !fVar6.f46265i && !(fVar6.h().f() instanceof u)) {
                    c cVar8 = new c(new i());
                    cVar8.f46244c = fVar6.f46260d + 4;
                    return cVar8;
                }
                return null;
            default:
                f fVar7 = (f) dVar;
                if (fVar7.f46264h < 4) {
                    int i37 = fVar7.f46262f;
                    CharSequence charSequence7 = fVar7.f46257a.f50076a;
                    int length6 = charSequence7.length();
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 0;
                    while (true) {
                        if (i37 < length6) {
                            char charAt10 = charSequence7.charAt(i37);
                            if (charAt10 != '\t' && charAt10 != ' ') {
                                if (charAt10 != '*') {
                                    if (charAt10 != c10) {
                                        if (charAt10 == '_') {
                                            i39++;
                                        }
                                    } else {
                                        i38++;
                                    }
                                } else {
                                    i40++;
                                }
                            }
                            i37++;
                            c10 = '-';
                        } else if ((i38 >= 3 && i39 == 0 && i40 == 0) || ((i39 >= 3 && i38 == 0 && i40 == 0) || (i40 >= 3 && i38 == 0 && i39 == 0))) {
                            c cVar9 = new c(new b(2));
                            cVar9.f46243b = charSequence7.length();
                            return cVar9;
                        }
                    }
                }
                return null;
        }
    }
}
