package G4;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import v4.C5971a;
import w.C6050B;
import w.C6066m;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final U3.c f6033a = U3.c.y("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    public static final U3.c f6034b = U3.c.y(ParameterNames.ID, "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    public static final U3.c f6035c = U3.c.y("list");

    /* renamed from: d  reason: collision with root package name */
    public static final U3.c f6036d = U3.c.y("cm", "tm", "dr");

    public static C5971a a(H4.b bVar) {
        float f6;
        C6050B c6050b;
        ArrayList arrayList;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        float c10 = I4.g.c();
        C6066m c6066m = new C6066m((Object) null);
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C6050B c6050b2 = new C6050B(0);
        C5971a c5971a = new C5971a();
        bVar.h();
        int i13 = 0;
        int i14 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (bVar.m()) {
            switch (bVar.V(f6033a)) {
                case 0:
                    f6 = f13;
                    i13 = bVar.F();
                    f13 = f6;
                    break;
                case 1:
                    f6 = f13;
                    i14 = bVar.F();
                    f13 = f6;
                    break;
                case 2:
                    c6050b = c6050b2;
                    f14 = (float) bVar.r();
                    arrayList3 = arrayList3;
                    c6050b2 = c6050b;
                    break;
                case 3:
                    arrayList3 = arrayList3;
                    c6050b2 = c6050b2;
                    f13 = ((float) bVar.r()) - 0.01f;
                    break;
                case 4:
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    f10 = f13;
                    f15 = (float) bVar.r();
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 5:
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    String[] split = bVar.O().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        c5971a.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 6:
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    bVar.a();
                    int i15 = 0;
                    while (bVar.m()) {
                        E4.e a5 = t.a(bVar, c5971a);
                        if (a5.f4474e == 3) {
                            i15++;
                        }
                        arrayList2.add(a5);
                        c6066m.h(a5.f4473d, a5);
                        if (i15 > 4) {
                            I4.b.a("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    bVar.i();
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 7:
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    f10 = f13;
                    int i16 = i14;
                    f11 = f14;
                    bVar.a();
                    while (bVar.m()) {
                        ArrayList arrayList4 = new ArrayList();
                        C6066m c6066m2 = new C6066m((Object) null);
                        bVar.h();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i17 = 0;
                        int i18 = 0;
                        while (bVar.m()) {
                            int V10 = bVar.V(f6034b);
                            if (V10 != 0) {
                                if (V10 != 1) {
                                    if (V10 != 2) {
                                        if (V10 != 3) {
                                            if (V10 != 4) {
                                                if (V10 != 5) {
                                                    bVar.a0();
                                                    bVar.d0();
                                                    i11 = i16;
                                                } else {
                                                    str3 = bVar.O();
                                                }
                                            } else {
                                                str2 = bVar.O();
                                            }
                                        } else {
                                            i18 = bVar.F();
                                        }
                                    } else {
                                        i17 = bVar.F();
                                    }
                                } else {
                                    bVar.a();
                                    while (bVar.m()) {
                                        E4.e a10 = t.a(bVar, c5971a);
                                        c6066m2.h(a10.f4473d, a10);
                                        arrayList4.add(a10);
                                        i16 = i16;
                                    }
                                    i11 = i16;
                                    bVar.i();
                                }
                                i16 = i11;
                            } else {
                                str = bVar.O();
                            }
                        }
                        int i19 = i16;
                        bVar.j();
                        if (str2 != null) {
                            hashMap2.put(str, new v4.m(str, i17, str2, i18, str3));
                        } else {
                            hashMap.put(str, arrayList4);
                        }
                        i16 = i19;
                    }
                    i10 = i16;
                    bVar.i();
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 8:
                    f10 = f13;
                    i12 = i14;
                    f11 = f14;
                    bVar.h();
                    while (bVar.m()) {
                        if (bVar.V(f6035c) != 0) {
                            bVar.a0();
                            bVar.d0();
                        } else {
                            bVar.a();
                            while (bVar.m()) {
                                U3.c cVar = l.f6017a;
                                bVar.h();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (bVar.m()) {
                                    ArrayList arrayList5 = arrayList3;
                                    int V11 = bVar.V(l.f6017a);
                                    if (V11 != 0) {
                                        C6050B c6050b3 = c6050b2;
                                        if (V11 != 1) {
                                            if (V11 != 2) {
                                                if (V11 != 3) {
                                                    bVar.a0();
                                                    bVar.d0();
                                                } else {
                                                    bVar.r();
                                                }
                                            } else {
                                                str6 = bVar.O();
                                            }
                                        } else {
                                            str5 = bVar.O();
                                        }
                                        arrayList3 = arrayList5;
                                        c6050b2 = c6050b3;
                                    } else {
                                        str4 = bVar.O();
                                        arrayList3 = arrayList5;
                                    }
                                }
                                bVar.j();
                                hashMap3.put(str5, new B4.c(str4, str5, str6));
                                arrayList3 = arrayList3;
                                c6050b2 = c6050b2;
                            }
                            bVar.i();
                        }
                    }
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    bVar.j();
                    i10 = i12;
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 9:
                    f10 = f13;
                    i12 = i14;
                    f11 = f14;
                    bVar.a();
                    while (bVar.m()) {
                        U3.c cVar2 = k.f6015a;
                        ArrayList arrayList6 = new ArrayList();
                        bVar.h();
                        double d10 = 0.0d;
                        char c11 = 0;
                        String str7 = null;
                        String str8 = null;
                        while (bVar.m()) {
                            int V12 = bVar.V(k.f6015a);
                            if (V12 != 0) {
                                if (V12 != 1) {
                                    if (V12 != 2) {
                                        if (V12 != 3) {
                                            if (V12 != 4) {
                                                if (V12 != 5) {
                                                    bVar.a0();
                                                    bVar.d0();
                                                } else {
                                                    bVar.h();
                                                    while (bVar.m()) {
                                                        if (bVar.V(k.f6016b) != 0) {
                                                            bVar.a0();
                                                            bVar.d0();
                                                        } else {
                                                            bVar.a();
                                                            while (bVar.m()) {
                                                                arrayList6.add((D4.m) AbstractC0614g.a(bVar, c5971a));
                                                            }
                                                            bVar.i();
                                                        }
                                                    }
                                                    bVar.j();
                                                }
                                            } else {
                                                str8 = bVar.O();
                                            }
                                        } else {
                                            str7 = bVar.O();
                                        }
                                    } else {
                                        d10 = bVar.r();
                                    }
                                } else {
                                    bVar.r();
                                }
                            } else {
                                c11 = bVar.O().charAt(0);
                            }
                        }
                        bVar.j();
                        B4.d dVar = new B4.d(arrayList6, c11, d10, str7, str8);
                        c6050b2.e(dVar.hashCode(), dVar);
                    }
                    bVar.i();
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    i10 = i12;
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                case 10:
                    bVar.a();
                    while (bVar.m()) {
                        bVar.h();
                        String str9 = null;
                        float f16 = 0.0f;
                        while (bVar.m()) {
                            int V13 = bVar.V(f6036d);
                            if (V13 != 0) {
                                f12 = f13;
                                if (V13 != 1) {
                                    if (V13 != 2) {
                                        bVar.a0();
                                        bVar.d0();
                                    } else {
                                        bVar.r();
                                    }
                                } else {
                                    f14 = f14;
                                    f16 = (float) bVar.r();
                                    f13 = f12;
                                    i14 = i14;
                                }
                            } else {
                                f12 = f13;
                                str9 = bVar.O();
                            }
                            f13 = f12;
                        }
                        bVar.j();
                        arrayList3.add(new B4.f(str9, f16));
                        i14 = i14;
                        f14 = f14;
                        f13 = f13;
                    }
                    f10 = f13;
                    i12 = i14;
                    f11 = f14;
                    bVar.i();
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    i10 = i12;
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
                default:
                    bVar.a0();
                    bVar.d0();
                    arrayList = arrayList3;
                    c6050b = c6050b2;
                    f10 = f13;
                    i10 = i14;
                    f11 = f14;
                    f14 = f11;
                    i14 = i10;
                    arrayList3 = arrayList;
                    f13 = f10;
                    c6050b2 = c6050b;
                    break;
            }
        }
        Rect rect = new Rect(0, 0, (int) (i13 * c10), (int) (i14 * c10));
        float c12 = I4.g.c();
        c5971a.f47158k = rect;
        c5971a.f47159l = f14;
        c5971a.f47160m = f13;
        c5971a.f47161n = f15;
        c5971a.f47157j = arrayList2;
        c5971a.f47156i = c6066m;
        c5971a.f47150c = hashMap;
        c5971a.f47151d = hashMap2;
        c5971a.f47152e = c12;
        c5971a.f47155h = c6050b2;
        c5971a.f47153f = hashMap3;
        c5971a.f47154g = arrayList3;
        return c5971a;
    }
}
