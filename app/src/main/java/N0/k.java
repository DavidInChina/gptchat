package N0;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: a  reason: collision with root package name */
    public final C1046e f12534a;

    /* renamed from: b  reason: collision with root package name */
    public final List f12535b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f12536c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3957g f12537d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12538e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    public k(C1046e c1046e, E e10, List list, Z0.b bVar, S0.r rVar) {
        p pVar;
        String str;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        ArrayList arrayList2;
        kf.v vVar;
        kf.v vVar2;
        int i13;
        int i14;
        C1046e c1046e2 = c1046e;
        this.f12534a = c1046e2;
        this.f12535b = list;
        EnumC3958h enumC3958h = EnumC3958h.f36153Z;
        this.f12536c = R4.b.C1(enumC3958h, new j(this, 1));
        this.f12537d = R4.b.C1(enumC3958h, new j(this, 0));
        C1046e c1046e3 = AbstractC1047f.f12516a;
        int length = c1046e2.f12512Y.length();
        kf.v vVar3 = kf.v.f37483Y;
        List list2 = c1046e2.f12514h0;
        list2 = list2 == null ? vVar3 : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            pVar = e10.f12488b;
            if (i15 >= size) {
                break;
            }
            C1045d c1045d = (C1045d) list2.get(i15);
            p pVar2 = (p) c1045d.f12508a;
            int i17 = c1045d.f12509b;
            if (i17 != i16) {
                arrayList3.add(new C1045d(pVar, i16, i17));
            }
            p a5 = pVar.a(pVar2);
            int i18 = c1045d.f12510c;
            arrayList3.add(new C1045d(a5, i17, i18));
            i15++;
            i16 = i18;
        }
        if (i16 != length) {
            arrayList3.add(new C1045d(pVar, i16, length));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new C1045d(pVar, 0, 0));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i19 = 0;
        while (i19 < size2) {
            C1045d c1045d2 = (C1045d) arrayList3.get(i19);
            int i20 = c1045d2.f12509b;
            int i21 = c1045d2.f12510c;
            if (i20 != i21) {
                str = c1046e2.f12512Y.substring(i20, i21);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str);
            } else {
                str = "";
            }
            String str2 = str;
            ?? b10 = AbstractC1047f.b(c1046e2, i20, i21);
            p pVar3 = (p) c1045d2.f12508a;
            if (!Y0.k.a(pVar3.f12550b, Integer.MIN_VALUE)) {
                arrayList = arrayList4;
                vVar = vVar3;
                i12 = size2;
                arrayList2 = arrayList3;
                i11 = i19;
                i10 = i21;
            } else {
                vVar = vVar3;
                i12 = size2;
                arrayList2 = arrayList3;
                i11 = i19;
                arrayList = arrayList4;
                i10 = i21;
                pVar3 = new p(pVar3.f12549a, pVar.f12550b, pVar3.f12551c, pVar3.f12552d, pVar3.f12553e, pVar3.f12554f, pVar3.f12555g, pVar3.f12556h, pVar3.f12557i);
            }
            E e11 = new E(e10.f12487a, pVar.a(pVar3));
            if (b10 == 0) {
                vVar2 = vVar;
            } else {
                vVar2 = b10;
            }
            List list3 = this.f12535b;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i22 = 0;
            while (true) {
                i13 = c1045d2.f12509b;
                if (i22 >= size3) {
                    break;
                }
                Object obj = list3.get(i22);
                C1045d c1045d3 = (C1045d) obj;
                int i23 = i10;
                if (AbstractC1047f.c(i13, i23, c1045d3.f12509b, c1045d3.f12510c)) {
                    arrayList5.add(obj);
                }
                i22++;
                i10 = i23;
            }
            int i24 = i10;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i25 = 0; i25 < size4; i25++) {
                C1045d c1045d4 = (C1045d) arrayList5.get(i25);
                int i26 = c1045d4.f12509b;
                if (i13 <= i26 && (i14 = c1045d4.f12510c) <= i24) {
                    arrayList6.add(new C1045d(c1045d4.f12508a, i26 - i13, i14 - i13));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
            }
            arrayList4 = arrayList;
            arrayList4.add(new n(new V0.c(e11, rVar, bVar, str2, vVar2, arrayList6), i13, i24));
            i19 = i11 + 1;
            c1046e2 = c1046e;
            vVar3 = vVar;
            arrayList3 = arrayList2;
            size2 = i12;
        }
        this.f12538e = arrayList4;
    }

    @Override // N0.o
    public final boolean a() {
        ArrayList arrayList = this.f12538e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n) arrayList.get(i10)).f12546a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // N0.o
    public final float b() {
        return ((Number) this.f12536c.getValue()).floatValue();
    }

    @Override // N0.o
    public final float c() {
        return ((Number) this.f12537d.getValue()).floatValue();
    }
}
