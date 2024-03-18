package G4;

import android.graphics.Color;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import v4.C5971a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f6030a = U3.c.y("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b  reason: collision with root package name */
    public static final U3.c f6031b = U3.c.y("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final U3.c f6032c = U3.c.y("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0463  */
    /* JADX WARN: Type inference failed for: r3v53, types: [G4.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static E4.e a(H4.b bVar, C5971a c5971a) {
        ArrayList arrayList;
        long j6;
        boolean z10;
        String str;
        C4.e eVar;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        char c10;
        String str3;
        char c11;
        int i12;
        boolean z14;
        C4.b bVar2;
        C4.b bVar3;
        C4.b bVar4;
        C4.b bVar5;
        char c12;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        bVar.h();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        boolean z15 = false;
        int i13 = 1;
        float f6 = 1.0f;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z16 = false;
        int i18 = 1;
        int i19 = 1;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        long j10 = -1;
        String str4 = null;
        String str5 = null;
        C4.a aVar = null;
        U3.i iVar = null;
        C4.b bVar6 = null;
        J0.a aVar2 = null;
        s3.z zVar = null;
        C4.e eVar2 = null;
        float f14 = 0.0f;
        long j11 = 0;
        String str6 = "UNSET";
        boolean z17 = 0;
        while (bVar.m()) {
            switch (bVar.V(f6030a)) {
                case 0:
                    str2 = str4;
                    z11 = z15;
                    str6 = bVar.O();
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 1:
                    str2 = str4;
                    z11 = z15;
                    j11 = bVar.F();
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 2:
                    str2 = str4;
                    z11 = z15;
                    str5 = bVar.O();
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 3:
                    z12 = z17;
                    str2 = str4;
                    z13 = z15;
                    i10 = i13;
                    int F10 = bVar.F();
                    i14 = 7;
                    if (F10 < 6) {
                        i14 = AbstractC6708l.h(7)[F10];
                    }
                    i13 = i10;
                    z15 = z13;
                    z17 = z12;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 4:
                    j10 = bVar.F();
                    z17 = z17;
                    i13 = i13;
                    z15 = z15;
                    str4 = str4;
                    continue;
                case 5:
                    str2 = str4;
                    z11 = z15;
                    i11 = i13;
                    i15 = (int) (I4.g.c() * bVar.F());
                    i13 = i11;
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 6:
                    str2 = str4;
                    z11 = z15;
                    i11 = i13;
                    i16 = (int) (I4.g.c() * bVar.F());
                    i13 = i11;
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 7:
                    str2 = str4;
                    z11 = z15;
                    i17 = Color.parseColor(bVar.O());
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 8:
                    str2 = str4;
                    z11 = z15;
                    eVar2 = AbstractC0610c.a(bVar, c5971a);
                    z15 = z11;
                    str4 = str2;
                    z17 = z17;
                    break;
                case 9:
                    z12 = z17;
                    str2 = str4;
                    z13 = z15;
                    int F11 = bVar.F();
                    if (F11 >= AbstractC6708l.h(6).length) {
                        c5971a.a("Unsupported matte type: " + F11);
                        z15 = z13;
                        z17 = z12;
                        str4 = str2;
                        i13 = 1;
                        z17 = z17;
                        break;
                    } else {
                        i18 = AbstractC6708l.h(6)[F11];
                        int f15 = AbstractC6708l.f(i18);
                        if (f15 != 3) {
                            if (f15 == 4) {
                                c5971a.a("Unsupported matte type: Luma Inverted");
                            }
                        } else {
                            c5971a.a("Unsupported matte type: Luma");
                        }
                        i10 = 1;
                        c5971a.f47163p++;
                        i13 = i10;
                        z15 = z13;
                        z17 = z12;
                        str4 = str2;
                        z17 = z17;
                        break;
                    }
                case 10:
                    z12 = z17;
                    C4.a aVar3 = null;
                    bVar.a();
                    while (bVar.m()) {
                        bVar.h();
                        C4.a aVar4 = aVar3;
                        C4.a aVar5 = aVar4;
                        int i20 = 0;
                        boolean z18 = false;
                        while (bVar.m()) {
                            String F02 = bVar.F0();
                            F02.getClass();
                            switch (F02.hashCode()) {
                                case 111:
                                    if (F02.equals("o")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 3588:
                                    if (F02.equals("pt")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 104433:
                                    if (F02.equals("inv")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 3357091:
                                    if (F02.equals("mode")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                default:
                                    c10 = '\uffff';
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    str3 = str4;
                                    aVar5 = M3.H.e0(bVar, c5971a);
                                    break;
                                case 1:
                                    str3 = str4;
                                    aVar4 = new C4.a(5, s.a(bVar, c5971a, I4.g.c(), D.f5987Y, false));
                                    break;
                                case 2:
                                    str3 = str4;
                                    z18 = bVar.p();
                                    break;
                                case 3:
                                    String O10 = bVar.O();
                                    O10.getClass();
                                    int hashCode = O10.hashCode();
                                    str3 = str4;
                                    if (hashCode != 97) {
                                        if (hashCode != 105) {
                                            if (hashCode != 110) {
                                                if (hashCode == 115 && O10.equals("s")) {
                                                    c11 = 3;
                                                    if (c11 != 0) {
                                                        if (c11 != 1) {
                                                            if (c11 != 2) {
                                                                if (c11 != 3) {
                                                                    I4.b.a("Unknown mask mode " + F02 + ". Defaulting to Add.");
                                                                } else {
                                                                    i12 = 2;
                                                                }
                                                            } else {
                                                                i12 = 4;
                                                            }
                                                        } else {
                                                            c5971a.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                            i12 = 3;
                                                        }
                                                        i20 = i12;
                                                    }
                                                    i12 = 1;
                                                    i20 = i12;
                                                }
                                                c11 = '\uffff';
                                                if (c11 != 0) {
                                                }
                                                i12 = 1;
                                                i20 = i12;
                                            } else {
                                                if (O10.equals("n")) {
                                                    c11 = 2;
                                                    if (c11 != 0) {
                                                    }
                                                    i12 = 1;
                                                    i20 = i12;
                                                }
                                                c11 = '\uffff';
                                                if (c11 != 0) {
                                                }
                                                i12 = 1;
                                                i20 = i12;
                                            }
                                        } else {
                                            if (O10.equals("i")) {
                                                c11 = 1;
                                                if (c11 != 0) {
                                                }
                                                i12 = 1;
                                                i20 = i12;
                                            }
                                            c11 = '\uffff';
                                            if (c11 != 0) {
                                            }
                                            i12 = 1;
                                            i20 = i12;
                                        }
                                    } else {
                                        if (O10.equals("a")) {
                                            c11 = 0;
                                            if (c11 != 0) {
                                            }
                                            i12 = 1;
                                            i20 = i12;
                                        }
                                        c11 = '\uffff';
                                        if (c11 != 0) {
                                        }
                                        i12 = 1;
                                        i20 = i12;
                                    }
                                    break;
                                default:
                                    bVar.d0();
                                    str3 = str4;
                                    break;
                            }
                            str4 = str3;
                        }
                        bVar.j();
                        arrayList2.add(new D4.f(i20, aVar4, aVar5, z18));
                        str4 = str4;
                        aVar3 = null;
                    }
                    str2 = str4;
                    z13 = false;
                    c5971a.f47163p += arrayList2.size();
                    bVar.i();
                    z15 = z13;
                    z17 = z12;
                    str4 = str2;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 11:
                    z12 = z17;
                    bVar.a();
                    while (bVar.m()) {
                        D4.b a5 = AbstractC0614g.a(bVar, c5971a);
                        if (a5 != null) {
                            arrayList3.add(a5);
                        }
                    }
                    bVar.i();
                    str2 = str4;
                    z13 = false;
                    z15 = z13;
                    z17 = z12;
                    str4 = str2;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 12:
                    z14 = z17;
                    bVar.h();
                    while (bVar.m()) {
                        int V10 = bVar.V(f6031b);
                        if (V10 != 0) {
                            if (V10 != 1) {
                                bVar.a0();
                                bVar.d0();
                            } else {
                                bVar.a();
                                if (bVar.m()) {
                                    U3.c cVar = AbstractC0609b.f5996a;
                                    bVar.h();
                                    U3.i iVar2 = null;
                                    while (bVar.m()) {
                                        if (bVar.V(AbstractC0609b.f5996a) != 0) {
                                            bVar.a0();
                                            bVar.d0();
                                        } else {
                                            bVar.h();
                                            C4.a aVar6 = null;
                                            C4.a aVar7 = null;
                                            C4.b bVar7 = null;
                                            C4.b bVar8 = null;
                                            while (bVar.m()) {
                                                int V11 = bVar.V(AbstractC0609b.f5997b);
                                                if (V11 != 0) {
                                                    if (V11 != 1) {
                                                        if (V11 != 2) {
                                                            if (V11 != 3) {
                                                                bVar.a0();
                                                                bVar.d0();
                                                            } else {
                                                                bVar8 = M3.H.d0(bVar, c5971a, true);
                                                            }
                                                        } else {
                                                            bVar7 = M3.H.d0(bVar, c5971a, true);
                                                        }
                                                    } else {
                                                        aVar7 = M3.H.c0(bVar, c5971a);
                                                    }
                                                } else {
                                                    aVar6 = M3.H.c0(bVar, c5971a);
                                                }
                                            }
                                            bVar.j();
                                            iVar2 = new U3.i(aVar6, aVar7, bVar7, bVar8);
                                        }
                                    }
                                    bVar.j();
                                    if (iVar2 == null) {
                                        iVar2 = new U3.i(null, null, null, null);
                                    }
                                    iVar = iVar2;
                                }
                                while (bVar.m()) {
                                    bVar.d0();
                                }
                                bVar.i();
                            }
                        } else {
                            aVar = new C4.a(6, s.a(bVar, c5971a, I4.g.c(), C0615h.f6005Y, false));
                        }
                    }
                    bVar.j();
                    z17 = z14;
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 13:
                    z14 = z17;
                    bVar.a();
                    ArrayList arrayList4 = new ArrayList();
                    while (bVar.m()) {
                        bVar.h();
                        while (bVar.m()) {
                            int V12 = bVar.V(f6032c);
                            if (V12 != 0) {
                                if (V12 != 1) {
                                    bVar.a0();
                                    bVar.d0();
                                } else {
                                    arrayList4.add(bVar.O());
                                }
                            } else {
                                int F12 = bVar.F();
                                if (F12 == 29) {
                                    U3.c cVar2 = AbstractC0611d.f6000a;
                                    aVar2 = null;
                                    while (bVar.m()) {
                                        if (bVar.V(AbstractC0611d.f6000a) != 0) {
                                            bVar.a0();
                                            bVar.d0();
                                        } else {
                                            bVar.a();
                                            while (bVar.m()) {
                                                bVar.h();
                                                boolean z19 = false;
                                                J0.a aVar8 = null;
                                                while (bVar.m()) {
                                                    int V13 = bVar.V(AbstractC0611d.f6001b);
                                                    if (V13 != 0) {
                                                        if (V13 != 1) {
                                                            bVar.a0();
                                                            bVar.d0();
                                                        } else if (z19) {
                                                            aVar8 = new J0.a(M3.H.d0(bVar, c5971a, true));
                                                        } else {
                                                            bVar.d0();
                                                        }
                                                    } else if (bVar.F() == 0) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                }
                                                bVar.j();
                                                if (aVar8 != null) {
                                                    aVar2 = aVar8;
                                                }
                                            }
                                            bVar.i();
                                        }
                                    }
                                } else if (F12 == 25) {
                                    ?? obj = new Object();
                                    while (bVar.m()) {
                                        if (bVar.V(C0616i.f6007f) != 0) {
                                            bVar.a0();
                                            bVar.d0();
                                        } else {
                                            bVar.a();
                                            while (bVar.m()) {
                                                bVar.h();
                                                String str7 = "";
                                                while (bVar.m()) {
                                                    int V14 = bVar.V(C0616i.f6008g);
                                                    if (V14 != 0) {
                                                        if (V14 != 1) {
                                                            bVar.a0();
                                                            bVar.d0();
                                                        } else {
                                                            str7.getClass();
                                                            switch (str7.hashCode()) {
                                                                case 353103893:
                                                                    if (str7.equals("Distance")) {
                                                                        c12 = 0;
                                                                        break;
                                                                    }
                                                                    c12 = '\uffff';
                                                                    break;
                                                                case 397447147:
                                                                    if (str7.equals("Opacity")) {
                                                                        c12 = 1;
                                                                        break;
                                                                    }
                                                                    c12 = '\uffff';
                                                                    break;
                                                                case 1041377119:
                                                                    if (str7.equals("Direction")) {
                                                                        c12 = 2;
                                                                        break;
                                                                    }
                                                                    c12 = '\uffff';
                                                                    break;
                                                                case 1379387491:
                                                                    if (str7.equals("Shadow Color")) {
                                                                        c12 = 3;
                                                                        break;
                                                                    }
                                                                    c12 = '\uffff';
                                                                    break;
                                                                case 1383710113:
                                                                    if (str7.equals("Softness")) {
                                                                        c12 = 4;
                                                                        break;
                                                                    }
                                                                    c12 = '\uffff';
                                                                    break;
                                                                default:
                                                                    c12 = '\uffff';
                                                                    break;
                                                            }
                                                            switch (c12) {
                                                                case 0:
                                                                    obj.f6012d = M3.H.d0(bVar, c5971a, true);
                                                                    break;
                                                                case 1:
                                                                    obj.f6010b = M3.H.d0(bVar, c5971a, false);
                                                                    break;
                                                                case 2:
                                                                    obj.f6011c = M3.H.d0(bVar, c5971a, false);
                                                                    break;
                                                                case 3:
                                                                    obj.f6009a = M3.H.c0(bVar, c5971a);
                                                                    break;
                                                                case 4:
                                                                    obj.f6013e = M3.H.d0(bVar, c5971a, true);
                                                                    break;
                                                                default:
                                                                    bVar.d0();
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        str7 = bVar.O();
                                                    }
                                                }
                                                bVar.j();
                                            }
                                            bVar.i();
                                        }
                                    }
                                    C4.a aVar9 = obj.f6009a;
                                    if (aVar9 != null && (bVar2 = obj.f6010b) != null && (bVar3 = obj.f6011c) != null && (bVar4 = obj.f6012d) != null && (bVar5 = obj.f6013e) != null) {
                                        zVar = new s3.z(aVar9, bVar2, bVar3, bVar4, bVar5);
                                    } else {
                                        zVar = null;
                                    }
                                }
                            }
                        }
                        bVar.j();
                    }
                    bVar.i();
                    c5971a.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList4);
                    z17 = z14;
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 14:
                    f6 = (float) bVar.r();
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 15:
                    f10 = (float) bVar.r();
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 16:
                    z14 = z17;
                    f11 = (float) (bVar.r() * I4.g.c());
                    z17 = z14;
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 17:
                    z14 = z17;
                    f12 = (float) (bVar.r() * I4.g.c());
                    z17 = z14;
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 18:
                    f14 = (float) bVar.r();
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 19:
                    f13 = (float) bVar.r();
                    z15 = false;
                    i13 = 1;
                    z17 = z17;
                    break;
                case 20:
                    bVar6 = M3.H.d0(bVar, c5971a, z15);
                    z17 = z17;
                    break;
                case 21:
                    str4 = bVar.O();
                    z17 = z17;
                    break;
                case 22:
                    z16 = bVar.p();
                    z17 = z17;
                    break;
                case 23:
                    if (bVar.F() == i13) {
                        z17 = i13;
                        break;
                    } else {
                        z17 = z15;
                        break;
                    }
                case 24:
                    int F13 = bVar.F();
                    if (F13 >= AbstractC6708l.h(18).length) {
                        c5971a.a("Unsupported Blend Mode: " + F13);
                        i19 = i13;
                        z17 = z17;
                        break;
                    } else {
                        i19 = AbstractC6708l.h(18)[F13];
                        z17 = z17;
                        break;
                    }
                default:
                    bVar.a0();
                    bVar.d0();
                    z12 = z17;
                    str2 = str4;
                    z13 = z15;
                    z15 = z13;
                    z17 = z12;
                    str4 = str2;
                    i13 = 1;
                    z17 = z17;
                    break;
            }
        }
        boolean z20 = z17;
        String str8 = str4;
        bVar.j();
        ArrayList arrayList5 = new ArrayList();
        if (f14 > 0.0f) {
            arrayList = arrayList2;
            z10 = z20;
            j6 = j11;
            str = str8;
            arrayList5.add(new J4.a(c5971a, valueOf, valueOf, (Interpolator) null, 0.0f, Float.valueOf(f14)));
        } else {
            arrayList = arrayList2;
            j6 = j11;
            z10 = z20;
            str = str8;
        }
        if (f13 <= 0.0f) {
            f13 = c5971a.f47160m;
        }
        arrayList5.add(new J4.a(c5971a, valueOf2, valueOf2, (Interpolator) null, f14, Float.valueOf(f13)));
        arrayList5.add(new J4.a(c5971a, valueOf, valueOf, (Interpolator) null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str6.endsWith(".ai") || "ai".equals(str)) {
            c5971a.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (eVar2 == null) {
                eVar2 = new C4.e();
            }
            C4.e eVar3 = eVar2;
            eVar3.f2679j = z10;
            eVar = eVar3;
        } else {
            eVar = eVar2;
        }
        return new E4.e(arrayList3, c5971a, str6, j6, i14, j10, str5, arrayList, eVar, i15, i16, i17, f6, f10, f11, f12, aVar, iVar, arrayList5, i18, bVar6, z16, aVar2, zVar, i19);
    }
}
