package A;

import E.AbstractC0441z;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import E0.C0455n;
import E0.C0460t;
import androidx.compose.foundation.layout.LayoutWeightElement;
import bb.C2162e0;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4326r;
import lc.C4391O;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* renamed from: A.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0044t0 {
    public static C6043l A(C5760d c5760d, C6396A c6396a, C5760d c5760d2, ge.d dVar) {
        c5760d.c(c6396a);
        return new C6043l(c5760d2, dVar);
    }

    public static void B(long j6, StringBuilder sb2, String str) {
        sb2.append((Object) r0.r.i(j6));
        sb2.append(str);
    }

    public static void C(Long l10, I8.u uVar, String str) {
        uVar.V(Long.valueOf(l10.longValue()), str);
    }

    public static float D(float f6, float f10, Ji.d dVar, long j6, float f11, float f12) {
        dVar.c(f6 - f10, j6);
        return f11 - f12;
    }

    public static float E(float f6, float f10, Ji.d dVar, long j6, float f11, float f12) {
        dVar.c(f6 + f10, j6);
        return f11 - f12;
    }

    public static float F(float f6, float f10, Ji.d dVar, long j6, float f11, float f12) {
        dVar.c(f6 - f10, j6);
        return f11 + f12;
    }

    public static /* synthetic */ String G(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "INTERCEPTOR_SETUP";
                }
                return "CONFIGURATION";
            }
            return "ERROR";
        }
        return "DEBUG";
    }

    public static /* synthetic */ String H(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "UNITY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String I(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return "null";
                    }
                    return "NAVIGATIONVIEWTRACKINGSTRATEGY";
                }
                return "MIXEDVIEWTRACKINGSTRATEGY";
            }
            return "FRAGMENTVIEWTRACKINGSTRATEGY";
        }
        return "ACTIVITYVIEWTRACKINGSTRATEGY";
    }

    public static /* synthetic */ String J(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "UNITY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String K(int i10) {
        switch (i10) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "UNITY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String L(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "null";
                        }
                        return "EXCLUDE_INTERSECTIONS";
                    }
                    return "INTERSECT";
                }
                return "SUBTRACT";
            }
            return "ADD";
        }
        return "MERGE";
    }

    public static /* synthetic */ String M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "Vertical";
        }
        return "Horizontal";
    }

    public static /* synthetic */ String N(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return "null";
            }
            return "Expand";
        }
        return "Wrap";
    }

    public static /* synthetic */ String O(int i10) {
        switch (i10) {
            case 1:
                return "PRE_COMP";
            case 2:
                return "SOLID";
            case 3:
                return "IMAGE";
            case 4:
                return "NULL";
            case 5:
                return "SHAPE";
            case 6:
                return "TEXT";
            case 7:
                return "UNKNOWN";
            default:
                return "null";
        }
    }

    public static AbstractC4326r P(AbstractC0441z abstractC0441z, AbstractC4326r abstractC4326r) {
        ((E.A) abstractC0441z).getClass();
        if (1.0f > 0.0d) {
            return abstractC4326r.g(new LayoutWeightElement(com.google.android.gms.internal.play_billing.N.l(1.0f, Float.MAX_VALUE), true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    public static int a(AbstractC0466z abstractC0466z, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return abstractC0466z.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new E0.S(rVar, E0.T.f4036Z, E0.U.f4039Z, 0), A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int b(E0.N n10, AbstractC0459s abstractC0459s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0455n((E0.r) list.get(i11), 2, 2));
        }
        return n10.a(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), arrayList, A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int c(AbstractC0466z abstractC0466z, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return abstractC0466z.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new E0.S(rVar, E0.T.f4036Z, E0.U.f4038Y, 0), A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static int d(E0.N n10, AbstractC0459s abstractC0459s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0455n((E0.r) list.get(i11), 2, 1));
        }
        return n10.a(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), arrayList, A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static int e(AbstractC0466z abstractC0466z, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return abstractC0466z.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new E0.S(rVar, E0.T.f4035Y, E0.U.f4039Z, 0), A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int f(E0.N n10, AbstractC0459s abstractC0459s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0455n((E0.r) list.get(i11), 1, 2));
        }
        return n10.a(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), arrayList, A7.b.n(0, i10, 0, 0, 13)).getHeight();
    }

    public static int g(AbstractC0466z abstractC0466z, AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return abstractC0466z.e(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), new E0.S(rVar, E0.T.f4035Y, E0.U.f4038Y, 0), A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static int h(E0.N n10, AbstractC0459s abstractC0459s, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C0455n((E0.r) list.get(i11), 1, 1));
        }
        return n10.a(new C0460t(abstractC0459s, abstractC0459s.getLayoutDirection()), arrayList, A7.b.n(0, 0, 0, i10, 7)).getWidth();
    }

    public static /* synthetic */ boolean i(int i10) {
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return true;
            }
            throw null;
        }
        return false;
    }

    public static /* synthetic */ boolean j(int i10) {
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean k(int i10) {
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String l(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return "NavigationViewTrackingStrategy";
                    }
                    throw null;
                }
                return "MixedViewTrackingStrategy";
            }
            return "FragmentViewTrackingStrategy";
        }
        return "ActivityViewTrackingStrategy";
    }

    public static /* synthetic */ String n(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String o(int i10) {
        switch (i10) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "unity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean p(int i10) {
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean q(int i10) {
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ int r(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }

    public static float s(float f6, float f10, Ji.d dVar, long j6, float f11, float f12) {
        dVar.c(f6 + f10, j6);
        return f11 + f12;
    }

    public static G0.f0 t(int i10, wf.k kVar, Z.r rVar) {
        G0.f0 f0Var = new G0.f0(i10, kVar);
        rVar.h0(f0Var);
        return f0Var;
    }

    public static C2162e0 v(int i10, wf.k kVar, Z.r rVar) {
        C2162e0 c2162e0 = new C2162e0(i10, kVar);
        rVar.h0(c2162e0);
        return c2162e0;
    }

    public static Object w(Z.r rVar, boolean z10, int i10) {
        rVar.t(z10);
        rVar.W(i10);
        return rVar.K();
    }

    public static String y(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static C4391O z(int i10, wf.k kVar, Z.r rVar) {
        C4391O c4391o = new C4391O(i10, kVar);
        rVar.h0(c4391o);
        return c4391o;
    }
}
