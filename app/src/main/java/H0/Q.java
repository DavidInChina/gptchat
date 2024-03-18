package H0;

import E0.AbstractC0461u;
import G0.AbstractC0579h;
import Z.C1712g0;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3953c;
import l0.AbstractC4325q;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import q0.C5250b;
import q0.C5252d;
import q0.C5254f;

/* loaded from: classes2.dex */
public abstract class Q implements X0 {

    /* renamed from: b  reason: collision with root package name */
    public static final C5252d f6867b = new C5252d(0.0f, 0.0f, 10.0f, 10.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f6868c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f6869d = 0;

    public static final boolean j(L0.o oVar) {
        if (U3.f.T(oVar.h(), L0.r.f10454j) == null) {
            return true;
        }
        return false;
    }

    public static final R0 m(int i10, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((R0) arrayList.get(i11)).f6871Y == i10) {
                return (R0) arrayList.get(i11);
            }
        }
        return null;
    }

    public static final String n(int i10) {
        if (L0.g.a(i10, 0)) {
            return "android.widget.Button";
        }
        if (L0.g.a(i10, 1)) {
            return "android.widget.CheckBox";
        }
        if (L0.g.a(i10, 3)) {
            return "android.widget.RadioButton";
        }
        if (L0.g.a(i10, 5)) {
            return "android.widget.ImageView";
        }
        if (L0.g.a(i10, 6)) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final boolean o(Object obj) {
        if (obj instanceof j0.s) {
            j0.s sVar = (j0.s) obj;
            if (sVar.c() != C1712g0.f22623a && sVar.c() != Z.o1.f22665a && sVar.c() != Z.F0.f22489a) {
                return false;
            }
            Object value = sVar.getValue();
            if (value == null) {
                return true;
            }
            return o(value);
        } else if ((obj instanceof AbstractC3953c) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class[] clsArr = f6868c;
            for (int i10 = 0; i10 < 7; i10++) {
                if (clsArr[i10].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final float p(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        float f6 = (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + f6;
    }

    public static final androidx.compose.ui.node.a q(androidx.compose.ui.node.a aVar, C0702s c0702s) {
        for (androidx.compose.ui.node.a E10 = aVar.E(); E10 != null; E10 = E10.E()) {
            if (((Boolean) c0702s.invoke(E10)).booleanValue()) {
                return E10;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [q0.b, java.lang.Object] */
    public static final void r(Region region, L0.o oVar, LinkedHashMap linkedHashMap, L0.o oVar2, Region region2) {
        boolean z10;
        boolean z11;
        C5252d c5252d;
        androidx.compose.ui.node.a aVar;
        Object p12;
        boolean T = oVar2.f10420c.T();
        androidx.compose.ui.node.a aVar2 = oVar2.f10420c;
        if (T && aVar2.S()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = region.isEmpty();
        int i10 = oVar.f10424g;
        int i11 = oVar2.f10424g;
        if (!isEmpty || i11 == i10) {
            if (z10 && !oVar2.f10422e) {
                return;
            }
            L0.j jVar = oVar2.f10421d;
            boolean z12 = jVar.f10410Z;
            Object obj = oVar2.f10418a;
            if (z12 && (p12 = R4.b.p1(aVar2)) != null) {
                obj = p12;
            }
            AbstractC4325q abstractC4325q = ((AbstractC4325q) obj).f37720Y;
            Object obj2 = jVar.f10409Y.get(L0.i.f10385b);
            if (obj2 == null) {
                obj2 = null;
            }
            if (obj2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = abstractC4325q.f37720Y.f37732r0;
            C5252d c5252d2 = C5252d.f43624e;
            if (z13) {
                if (!z11) {
                    G0.g0 z14 = AbstractC0579h.z(abstractC4325q, 8);
                    c5252d2 = androidx.compose.ui.layout.a.d(z14).F(z14, true);
                } else {
                    G0.g0 z15 = AbstractC0579h.z(abstractC4325q, 8);
                    if (z15.G0().f37732r0) {
                        AbstractC0461u d10 = androidx.compose.ui.layout.a.d(z15);
                        C5250b c5250b = z15.f5764A0;
                        C5250b c5250b2 = c5250b;
                        if (c5250b == null) {
                            ?? obj3 = new Object();
                            obj3.f43615a = 0.0f;
                            obj3.f43616b = 0.0f;
                            obj3.f43617c = 0.0f;
                            obj3.f43618d = 0.0f;
                            z15.f5764A0 = obj3;
                            c5250b2 = obj3;
                        }
                        long w02 = z15.w0(z15.F0());
                        c5250b2.f43615a = -C5254f.d(w02);
                        c5250b2.f43616b = -C5254f.b(w02);
                        c5250b2.f43617c = C5254f.d(w02) + z15.U();
                        c5250b2.f43618d = C5254f.b(w02) + z15.T();
                        G0.g0 g0Var = z15;
                        while (true) {
                            if (g0Var != d10) {
                                g0Var.S0(c5250b2, false, true);
                                if (c5250b2.b()) {
                                    break;
                                }
                                G0.g0 g0Var2 = g0Var.f5772p0;
                                AbstractC3557B.Z(g0Var2);
                                g0Var = g0Var2;
                            } else {
                                c5252d2 = new C5252d(c5250b2.f43615a, c5250b2.f43616b, c5250b2.f43617c, c5250b2.f43618d);
                                break;
                            }
                        }
                    }
                }
            }
            int Y02 = AbstractC4344b.Y0(c5252d2.f43625a);
            int Y03 = AbstractC4344b.Y0(c5252d2.f43626b);
            int Y04 = AbstractC4344b.Y0(c5252d2.f43627c);
            int Y05 = AbstractC4344b.Y0(c5252d2.f43628d);
            region2.set(Y02, Y03, Y04, Y05);
            if (i11 == i10) {
                i11 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                linkedHashMap.put(Integer.valueOf(i11), new S0(oVar2, region2.getBounds()));
                List g10 = oVar2.g(false, true);
                for (int size = g10.size() - 1; -1 < size; size--) {
                    r(region, oVar, linkedHashMap, (L0.o) g10.get(size), region2);
                }
                if (u(oVar2)) {
                    region.op(Y02, Y03, Y04, Y05, Region.Op.DIFFERENCE);
                }
            } else if (oVar2.f10422e) {
                L0.o i12 = oVar2.i();
                if (i12 != null && (aVar = i12.f10420c) != null && aVar.T()) {
                    c5252d = i12.e();
                } else {
                    c5252d = f6867b;
                }
                linkedHashMap.put(Integer.valueOf(i11), new S0(oVar2, new Rect(AbstractC4344b.Y0(c5252d.f43625a), AbstractC4344b.Y0(c5252d.f43626b), AbstractC4344b.Y0(c5252d.f43627c), AbstractC4344b.Y0(c5252d.f43628d))));
            } else if (i11 == -1) {
                linkedHashMap.put(Integer.valueOf(i11), new S0(oVar2, region2.getBounds()));
            }
        }
    }

    public static final AbstractC4326r s(AbstractC4326r abstractC4326r, AbstractC4326r abstractC4326r2) {
        D0 d02 = new D0();
        return abstractC4326r.g(d02).g(abstractC4326r2).g(d02.f6718e);
    }

    public static final boolean t(androidx.compose.ui.node.a aVar, androidx.compose.ui.node.a aVar2) {
        androidx.compose.ui.node.a E10 = aVar2.E();
        if (E10 == null) {
            return false;
        }
        if (!AbstractC3557B.K(E10, aVar) && !t(aVar, E10)) {
            return false;
        }
        return true;
    }

    public static final boolean u(L0.o oVar) {
        L0.j jVar = oVar.f10421d;
        if (!jVar.f10410Z) {
            Set<L0.u> keySet = jVar.f10409Y.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                for (L0.u uVar : keySet) {
                    if (uVar.f10475c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final void v(float[] fArr, float[] fArr2) {
        float p10 = p(fArr2, 0, fArr, 0);
        float p11 = p(fArr2, 0, fArr, 1);
        float p12 = p(fArr2, 0, fArr, 2);
        float p13 = p(fArr2, 0, fArr, 3);
        float p14 = p(fArr2, 1, fArr, 0);
        float p15 = p(fArr2, 1, fArr, 1);
        float p16 = p(fArr2, 1, fArr, 2);
        float p17 = p(fArr2, 1, fArr, 3);
        float p18 = p(fArr2, 2, fArr, 0);
        float p19 = p(fArr2, 2, fArr, 1);
        float p20 = p(fArr2, 2, fArr, 2);
        float p21 = p(fArr2, 2, fArr, 3);
        float p22 = p(fArr2, 3, fArr, 0);
        float p23 = p(fArr2, 3, fArr, 1);
        float p24 = p(fArr2, 3, fArr, 2);
        float p25 = p(fArr2, 3, fArr, 3);
        fArr[0] = p10;
        fArr[1] = p11;
        fArr[2] = p12;
        fArr[3] = p13;
        fArr[4] = p14;
        fArr[5] = p15;
        fArr[6] = p16;
        fArr[7] = p17;
        fArr[8] = p18;
        fArr[9] = p19;
        fArr[10] = p20;
        fArr[11] = p21;
        fArr[12] = p22;
        fArr[13] = p23;
        fArr[14] = p24;
        fArr[15] = p25;
    }

    public static final c1.l w(C0686j0 c0686j0, int i10) {
        Object obj;
        Iterator<T> it = c0686j0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((androidx.compose.ui.node.a) ((Map.Entry) obj).getKey()).f24843Z == i10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (c1.l) entry.getValue();
    }
}
