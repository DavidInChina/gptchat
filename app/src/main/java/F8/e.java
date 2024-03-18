package f8;

import A.AbstractC0044t0;
import A.M;
import I8.w;
import M3.H;
import N0.E;
import S0.D;
import S0.z;
import Z.AbstractC1734s;
import Z.AbstractC1743w0;
import Z.C1705d;
import Z.C1723m;
import Z.C1741v0;
import Z.Q0;
import Z.S;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Typeface;
import b4.AbstractC2121b;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k.AbstractC4148d;
import k.C4146b;
import k.C4147c;
import k6.AbstractC4194d;
import kf.v;
import p.B;
import q0.C5252d;
import q0.C5254f;
import q5.C5274d;
import r0.C5336C;
import r0.G;
import r0.L;
import r9.y;
import u8.AbstractC5856f;
import u8.C5865o;
import w7.AbstractC6137i;
import wd.C6168C;
import wd.C6182c0;

/* loaded from: classes2.dex */
public class e implements B, L, R5.b, AbstractC2121b, AbstractC6137i, AbstractC5856f, C8.i, K8.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29664Y;

    public /* synthetic */ e(int i10) {
        this.f29664Y = i10;
    }

    public static void h(Q0 q02, List list, AbstractC1743w0 abstractC1743w0) {
        Object obj;
        C1741v0 c1741v0;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int c10 = q02.c((C1705d) list.get(i10));
                int G10 = q02.G(q02.f22544b, q02.o(c10));
                if (G10 < q02.f(q02.f22544b, q02.o(c10 + 1))) {
                    obj = q02.f22545c[q02.g(G10)];
                } else {
                    obj = C1723m.f22654Y;
                }
                if (obj instanceof C1741v0) {
                    c1741v0 = (C1741v0) obj;
                } else {
                    c1741v0 = null;
                }
                if (c1741v0 != null) {
                    c1741v0.f22737b = abstractC1743w0;
                }
            }
        }
    }

    public static float j(int i10) {
        int i11;
        if (Y.c.a(i10, 2)) {
            i11 = 840;
        } else if (Y.c.a(i10, 1)) {
            i11 = 600;
        } else {
            i11 = 0;
        }
        return i11;
    }

    public static float k(int i10) {
        int i11;
        if (Y.a.a(i10, 2)) {
            i11 = 900;
        } else if (Y.a.a(i10, 1)) {
            i11 = 480;
        } else {
            i11 = 0;
        }
        return i11;
    }

    public static Typeface l(String str, D d10, int i10) {
        Typeface typeface;
        Typeface create;
        if (z.a(i10, 0) && AbstractC3557B.K(d10, D.f15971j0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (str == null) {
            typeface = Typeface.DEFAULT;
        } else {
            typeface = Typeface.create(str, 0);
        }
        create = Typeface.create(typeface, d10.f15975Y, z.a(i10, 1));
        return create;
    }

    public static Typeface m(String str, D d10, int i10) {
        if (z.a(i10, 0) && AbstractC3557B.K(d10, D.f15971j0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int j02 = y.j0(d10, i10);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, j02);
        }
        return Typeface.defaultFromStyle(j02);
    }

    public static M.b n(M.b bVar, Z0.l lVar, E e10, Z0.b bVar2, S0.r rVar) {
        if (bVar != null && lVar == bVar.f11263a && AbstractC3557B.K(e10, bVar.f11264b) && bVar2.b() == bVar.f11265c.b() && rVar == bVar.f11266d) {
            return bVar;
        }
        M.b bVar3 = M.b.f11262h;
        if (bVar3 != null && lVar == bVar3.f11263a && AbstractC3557B.K(e10, bVar3.f11264b) && bVar2.b() == bVar3.f11265c.b() && rVar == bVar3.f11266d) {
            return bVar3;
        }
        M.b bVar4 = new M.b(lVar, R4.b.U1(e10, lVar), bVar2, rVar);
        M.b.f11262h = bVar4;
        return bVar4;
    }

    public static String o(AbstractC4148d abstractC4148d) {
        AbstractC3557B.c0("input", abstractC4148d);
        if (abstractC4148d instanceof C4147c) {
            return "image/*";
        }
        if (abstractC4148d instanceof C4146b) {
            return null;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List p(Q0 q02, int i10, Q0 q03, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        v vVar;
        boolean z14;
        int i11;
        int i12;
        boolean z15;
        HashMap hashMap;
        int i13;
        int i14;
        int p10 = q02.p(i10);
        int i15 = i10 + p10;
        int f6 = q02.f(q02.f22544b, q02.o(i10));
        int f10 = q02.f(q02.f22544b, q02.o(i15));
        int i16 = f10 - f6;
        if (i10 >= 0 && (q02.f22544b[(q02.o(i10) * 5) + 1] & 201326592) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        q03.r(p10);
        q03.s(i16, q03.f22560r);
        if (q02.f22548f < i15) {
            q02.v(i15);
        }
        if (q02.f22552j < f10) {
            q02.w(f10, i15);
        }
        int[] iArr = q03.f22544b;
        int i17 = q03.f22560r;
        int i18 = i17 * 5;
        kf.q.V2(i18, i10 * 5, i15 * 5, q02.f22544b, iArr);
        Object[] objArr = q03.f22545c;
        int i19 = q03.f22550h;
        kf.q.W2(i19, f6, f10, q02.f22545c, objArr);
        int i20 = q03.f22562t;
        iArr[i18 + 2] = i20;
        int i21 = i17 - i10;
        int i22 = i17 + p10;
        int f11 = i19 - q03.f(iArr, i17);
        int i23 = q03.f22554l;
        int i24 = q03.f22553k;
        int length = objArr.length;
        boolean z16 = z13;
        int i25 = i23;
        int i26 = i17;
        while (i26 < i22) {
            if (i26 != i17) {
                int i27 = (i26 * 5) + 2;
                iArr[i27] = iArr[i27] + i21;
            }
            int i28 = i22;
            int f12 = q03.f(iArr, i26) + f11;
            if (i25 < i26) {
                i13 = i17;
                i14 = 0;
            } else {
                i13 = i17;
                i14 = q03.f22552j;
            }
            iArr[(i26 * 5) + 4] = Q0.h(f12, i14, i24, length);
            if (i26 == i25) {
                i25++;
            }
            i26++;
            i17 = i13;
            i22 = i28;
        }
        int i29 = i17;
        int i30 = i22;
        q03.f22554l = i25;
        int r10 = H.r(q02.f22546d, i10, q02.n());
        int r11 = H.r(q02.f22546d, i15, q02.n());
        if (r10 < r11) {
            ArrayList arrayList = q02.f22546d;
            ArrayList arrayList2 = new ArrayList(r11 - r10);
            for (int i31 = r10; i31 < r11; i31++) {
                C1705d c1705d = (C1705d) arrayList.get(i31);
                c1705d.f22611a += i21;
                arrayList2.add(c1705d);
            }
            q03.f22546d.addAll(H.r(q03.f22546d, q03.f22560r, q03.n()), arrayList2);
            arrayList.subList(r10, r11).clear();
            vVar = arrayList2;
        } else {
            vVar = v.f37483Y;
        }
        if ((!vVar.isEmpty()) && (hashMap = q02.f22547e) != null) {
            HashMap hashMap2 = q03.f22547e;
            int size = vVar.size();
            for (int i32 = 0; i32 < size; i32++) {
                S s10 = (S) hashMap.get((C1705d) vVar.get(i32));
            }
            if (hashMap.isEmpty()) {
                q02.f22547e = null;
            }
        }
        int i33 = q03.f22562t;
        q03.H(i20);
        int y10 = q02.y(q02.f22544b, i10);
        if (!z12) {
            i11 = 1;
            z14 = false;
        } else if (z10) {
            if (y10 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                q02.I();
                q02.a(y10 - q02.f22560r);
                q02.I();
            }
            q02.a(i10 - q02.f22560r);
            boolean A10 = q02.A();
            if (z15) {
                q02.F();
                q02.i();
                q02.F();
                q02.i();
            }
            z14 = A10;
            i11 = 1;
        } else {
            z14 = q02.B(i10, p10);
            i11 = 1;
            q02.C(f6, i16, i10 - 1);
        }
        if (!z14) {
            int i34 = q03.f22556n;
            if (H.q(iArr, i29)) {
                i12 = i11;
            } else {
                i12 = H.s(iArr, i29);
            }
            q03.f22556n = i34 + i12;
            if (z11) {
                q03.f22560r = i30;
                q03.f22550h = i19 + i16;
            }
            if (z16) {
                q03.N(i20);
            }
            return vVar;
        }
        AbstractC1734s.j("Unexpectedly removed anchors".toString());
        throw null;
    }

    @Override // p.B
    public boolean A(p.o oVar) {
        return false;
    }

    @Override // u8.AbstractC5857g
    public /* synthetic */ Object a() {
        return new C5865o("StandardIntegrity");
    }

    @Override // r0.L
    public G c(long j6, Z0.l lVar, Z0.b bVar) {
        switch (this.f29664Y) {
            case 0:
                float a02 = bVar.a0(M.f91a);
                return new C5336C(new C5252d(0.0f, -a02, C5254f.d(j6), C5254f.b(j6) + a02));
            default:
                float a03 = bVar.a0(M.f91a);
                return new C5336C(new C5252d(-a03, 0.0f, C5254f.d(j6) + a03, C5254f.b(j6)));
        }
    }

    @Override // b4.AbstractC2121b
    public String d(Object obj) {
        switch (this.f29664Y) {
            case 0:
                String str = ((C6168C) obj).f48321a;
                AbstractC3557B.c0("value", str);
                return str;
            default:
                String str2 = ((C6182c0) obj).f48393Y;
                AbstractC3557B.c0("value", str2);
                return str2;
        }
    }

    @Override // R5.b
    public String e(Object obj) {
        switch (this.f29664Y) {
            case 0:
                C5274d c5274d = (C5274d) obj;
                AbstractC3557B.c0("model", c5274d);
                I8.u uVar = new I8.u();
                uVar.U("connectivity", new w(AbstractC4194d.n(c5274d.f43924a)));
                String str = c5274d.f43925b;
                if (str != null) {
                    uVar.m0("carrier_name", str);
                }
                Long l10 = c5274d.f43926c;
                if (l10 != null) {
                    AbstractC0044t0.C(l10, uVar, "carrier_id");
                }
                Long l11 = c5274d.f43927d;
                if (l11 != null) {
                    AbstractC0044t0.C(l11, uVar, "up_kbps");
                }
                Long l12 = c5274d.f43928e;
                if (l12 != null) {
                    AbstractC0044t0.C(l12, uVar, "down_kbps");
                }
                Long l13 = c5274d.f43929f;
                if (l13 != null) {
                    AbstractC0044t0.C(l13, uVar, "strength");
                }
                String str2 = c5274d.f43930g;
                if (str2 != null) {
                    uVar.m0("cellular_technology", str2);
                }
                String rVar = uVar.y().toString();
                AbstractC3557B.b0("model.toJson().asJsonObject.toString()", rVar);
                return rVar;
            case 1:
                q5.g gVar = (q5.g) obj;
                AbstractC3557B.c0("model", gVar);
                I8.u uVar2 = new I8.u();
                String str3 = gVar.f43937a;
                if (str3 != null) {
                    uVar2.m0(ParameterNames.ID, str3);
                }
                String str4 = gVar.f43938b;
                if (str4 != null) {
                    uVar2.m0("name", str4);
                }
                String str5 = gVar.f43939c;
                if (str5 != null) {
                    uVar2.m0("email", str5);
                }
                for (Map.Entry entry : gVar.f43940d.entrySet()) {
                    String str6 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (!kf.q.S2(str6, q5.g.f43936e)) {
                        uVar2.U(str6, Gi.e.T(value));
                    }
                }
                String rVar2 = uVar2.y().toString();
                AbstractC3557B.b0("model.toJson().asJsonObject.toString()", rVar2);
                return rVar2;
            default:
                n6.e eVar = (n6.e) obj;
                AbstractC3557B.c0("model", eVar);
                I8.u uVar3 = new I8.u();
                uVar3.m0("type", eVar.f39641c);
                uVar3.m0("viewId", eVar.f39639a);
                uVar3.V(Long.valueOf(eVar.f39640b), "documentVersion");
                String rVar3 = uVar3.toString();
                AbstractC3557B.b0("model.toJson().toString()", rVar3);
                return rVar3;
        }
    }

    @Override // C8.i
    public Object f(Provider provider) {
        switch (this.f29664Y) {
            case 11:
                if (provider == null) {
                    return Cipher.getInstance("SHA-512");
                }
                return Cipher.getInstance("SHA-512", provider);
            case 12:
                if (provider == null) {
                    return KeyFactory.getInstance("SHA-512");
                }
                return KeyFactory.getInstance("SHA-512", provider);
            case 13:
                if (provider == null) {
                    return Mac.getInstance("SHA-512");
                }
                return Mac.getInstance("SHA-512", provider);
            default:
                if (provider == null) {
                    return Signature.getInstance("SHA-512");
                }
                return Signature.getInstance("SHA-512", provider);
        }
    }

    @Override // b4.AbstractC2121b
    public Object g(String str) {
        switch (this.f29664Y) {
            case 0:
                return new C6168C(str);
            default:
                return new C6182c0(str);
        }
    }

    @Override // K8.n
    public Object i() {
        switch (this.f29664Y) {
            case 15:
                return new LinkedHashSet();
            case 16:
                return new ArrayList();
            case 17:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        this(2);
        this.f29664Y = i10;
        if (i10 == 3) {
            this(3);
        } else if (i10 != 4) {
            switch (i10) {
                case 7:
                    this(7);
                    return;
                case 8:
                    this(8);
                    return;
                case 9:
                    this(9);
                    return;
                case 10:
                    this(10);
                    return;
                case 11:
                    this(11);
                    return;
                case 12:
                    this(12);
                    return;
                case 13:
                    this(13);
                    return;
                case 14:
                    this(14);
                    return;
                case 15:
                    this(15);
                    return;
                case 16:
                    this(16);
                    return;
                case 17:
                    this(17);
                    return;
                case 18:
                    this(18);
                    return;
                case 19:
                    this(19);
                    return;
                case 20:
                    this(20);
                    return;
                case 21:
                    this(21);
                    return;
                case 22:
                    this(22);
                    return;
                case 23:
                    this(23);
                    return;
                case 24:
                    this(24);
                    return;
                case 25:
                    this(25);
                    return;
                case 26:
                    this(26);
                    return;
                case 27:
                    this(27);
                    return;
                case 28:
                    this(28);
                    return;
                case 29:
                    this(29);
                    return;
                default:
                    return;
            }
        } else {
            this(4);
        }
    }

    @Override // p.B
    public void b(p.o oVar, boolean z10) {
    }
}
