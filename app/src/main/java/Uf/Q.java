package Uf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import kg.C4294f;
import sg.EnumC5626c;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final Cf.k f17788a = new Cf.k(16, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f17789b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f17790c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map f17791d;

    /* renamed from: e  reason: collision with root package name */
    public static final LinkedHashMap f17792e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set f17793f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set f17794g;

    /* renamed from: h  reason: collision with root package name */
    public static final M f17795h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map f17796i;

    /* renamed from: j  reason: collision with root package name */
    public static final LinkedHashMap f17797j;

    /* renamed from: k  reason: collision with root package name */
    public static final ArrayList f17798k;

    /* renamed from: l  reason: collision with root package name */
    public static final LinkedHashMap f17799l;

    static {
        int i10;
        Set<String> X12 = R4.b.X1("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(X12, 10));
        for (String str : X12) {
            Cf.k kVar = f17788a;
            String c10 = EnumC5626c.BOOLEAN.c();
            AbstractC3557B.b0("getDesc(...)", c10);
            arrayList.add(Cf.k.c(kVar, "java/util/Collection", str, "Ljava/util/Collection;", c10));
        }
        f17789b = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((M) it.next()).f17777e);
        }
        f17790c = arrayList2;
        ArrayList arrayList3 = f17789b;
        ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((M) it2.next()).f17774b.b());
        }
        Cf.k kVar2 = f17788a;
        String concat = "java/util/".concat("Collection");
        EnumC5626c enumC5626c = EnumC5626c.BOOLEAN;
        String c11 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c11);
        M c12 = Cf.k.c(kVar2, concat, "contains", "Ljava/lang/Object;", c11);
        P p10 = P.f17784i0;
        C3959i c3959i = new C3959i(c12, p10);
        String concat2 = "java/util/".concat("Collection");
        String c13 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c13);
        C3959i c3959i2 = new C3959i(Cf.k.c(kVar2, concat2, "remove", "Ljava/lang/Object;", c13), p10);
        String concat3 = "java/util/".concat("Map");
        String c14 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c14);
        C3959i c3959i3 = new C3959i(Cf.k.c(kVar2, concat3, "containsKey", "Ljava/lang/Object;", c14), p10);
        String concat4 = "java/util/".concat("Map");
        String c15 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c15);
        C3959i c3959i4 = new C3959i(Cf.k.c(kVar2, concat4, "containsValue", "Ljava/lang/Object;", c15), p10);
        String concat5 = "java/util/".concat("Map");
        String c16 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c16);
        C3959i c3959i5 = new C3959i(Cf.k.c(kVar2, concat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", c16), p10);
        C3959i c3959i6 = new C3959i(Cf.k.c(kVar2, "java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), P.f17785j0);
        M c17 = Cf.k.c(kVar2, "java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        P p11 = P.f17782Z;
        C3959i c3959i7 = new C3959i(c17, p11);
        C3959i c3959i8 = new C3959i(Cf.k.c(kVar2, "java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), p11);
        String concat6 = "java/util/".concat("List");
        EnumC5626c enumC5626c2 = EnumC5626c.INT;
        String c18 = enumC5626c2.c();
        AbstractC3557B.b0("getDesc(...)", c18);
        M c19 = Cf.k.c(kVar2, concat6, "indexOf", "Ljava/lang/Object;", c18);
        P p12 = P.f17783h0;
        C3959i c3959i9 = new C3959i(c19, p12);
        String concat7 = "java/util/".concat("List");
        String c20 = enumC5626c2.c();
        AbstractC3557B.b0("getDesc(...)", c20);
        Map a12 = AbstractC4268D.a1(c3959i, c3959i2, c3959i3, c3959i4, c3959i5, c3959i6, c3959i7, c3959i8, c3959i9, new C3959i(Cf.k.c(kVar2, concat7, "lastIndexOf", "Ljava/lang/Object;", c20), p12));
        f17791d = a12;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P4.a.n0(a12.size()));
        for (Map.Entry entry : a12.entrySet()) {
            linkedHashMap.put(((M) entry.getKey()).f17777e, entry.getValue());
        }
        f17792e = linkedHashMap;
        LinkedHashSet<M> u22 = AbstractC4273I.u2(f17791d.keySet(), f17789b);
        ArrayList arrayList5 = new ArrayList(AbstractC6583a.H1(u22, 10));
        for (M m10 : u22) {
            arrayList5.add(m10.f17774b);
        }
        f17793f = kf.t.P2(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC6583a.H1(u22, 10));
        for (M m11 : u22) {
            arrayList6.add(m11.f17777e);
        }
        f17794g = kf.t.P2(arrayList6);
        Cf.k kVar3 = f17788a;
        EnumC5626c enumC5626c3 = EnumC5626c.INT;
        String c21 = enumC5626c3.c();
        AbstractC3557B.b0("getDesc(...)", c21);
        M c22 = Cf.k.c(kVar3, "java/util/List", "removeAt", c21, "Ljava/lang/Object;");
        f17795h = c22;
        String concat8 = "java/lang/".concat("Number");
        String c23 = EnumC5626c.BYTE.c();
        AbstractC3557B.b0("getDesc(...)", c23);
        C3959i c3959i10 = new C3959i(Cf.k.c(kVar3, concat8, "toByte", "", c23), C4294f.e("byteValue"));
        String concat9 = "java/lang/".concat("Number");
        String c24 = EnumC5626c.SHORT.c();
        AbstractC3557B.b0("getDesc(...)", c24);
        C3959i c3959i11 = new C3959i(Cf.k.c(kVar3, concat9, "toShort", "", c24), C4294f.e("shortValue"));
        String concat10 = "java/lang/".concat("Number");
        String c25 = enumC5626c3.c();
        AbstractC3557B.b0("getDesc(...)", c25);
        C3959i c3959i12 = new C3959i(Cf.k.c(kVar3, concat10, "toInt", "", c25), C4294f.e("intValue"));
        String concat11 = "java/lang/".concat("Number");
        String c26 = EnumC5626c.LONG.c();
        AbstractC3557B.b0("getDesc(...)", c26);
        C3959i c3959i13 = new C3959i(Cf.k.c(kVar3, concat11, "toLong", "", c26), C4294f.e("longValue"));
        String concat12 = "java/lang/".concat("Number");
        String c27 = EnumC5626c.FLOAT.c();
        AbstractC3557B.b0("getDesc(...)", c27);
        C3959i c3959i14 = new C3959i(Cf.k.c(kVar3, concat12, "toFloat", "", c27), C4294f.e("floatValue"));
        String concat13 = "java/lang/".concat("Number");
        String c28 = EnumC5626c.DOUBLE.c();
        AbstractC3557B.b0("getDesc(...)", c28);
        C3959i c3959i15 = new C3959i(Cf.k.c(kVar3, concat13, "toDouble", "", c28), C4294f.e("doubleValue"));
        C3959i c3959i16 = new C3959i(c22, C4294f.e("remove"));
        String concat14 = "java/lang/".concat("CharSequence");
        String c29 = enumC5626c3.c();
        AbstractC3557B.b0("getDesc(...)", c29);
        String c30 = EnumC5626c.CHAR.c();
        AbstractC3557B.b0("getDesc(...)", c30);
        Map a13 = AbstractC4268D.a1(c3959i10, c3959i11, c3959i12, c3959i13, c3959i14, c3959i15, c3959i16, new C3959i(Cf.k.c(kVar3, concat14, "get", c29, c30), C4294f.e("charAt")));
        f17796i = a13;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(a13.size()));
        for (Map.Entry entry2 : a13.entrySet()) {
            linkedHashMap2.put(((M) entry2.getKey()).f17777e, entry2.getValue());
        }
        f17797j = linkedHashMap2;
        Map map = f17796i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            M m12 = (M) entry3.getKey();
            C4294f c4294f = (C4294f) entry3.getValue();
            String str2 = m12.f17773a;
            AbstractC3557B.c0("classInternalName", str2);
            AbstractC3557B.c0("name", c4294f);
            String str3 = m12.f17775c;
            AbstractC3557B.c0("parameters", str3);
            String str4 = m12.f17776d;
            AbstractC3557B.c0("returnType", str4);
            String str5 = c4294f + '(' + str3 + ')' + str4;
            AbstractC3557B.c0("jvmDescriptor", str5);
            linkedHashSet.add(str2 + '.' + str5);
        }
        Set<M> keySet = f17796i.keySet();
        ArrayList arrayList7 = new ArrayList(AbstractC6583a.H1(keySet, 10));
        for (M m13 : keySet) {
            arrayList7.add(m13.f17774b);
        }
        f17798k = arrayList7;
        Set<Map.Entry> entrySet = f17796i.entrySet();
        ArrayList arrayList8 = new ArrayList(AbstractC6583a.H1(entrySet, 10));
        for (Map.Entry entry4 : entrySet) {
            arrayList8.add(new C3959i(((M) entry4.getKey()).f17774b, entry4.getValue()));
        }
        int n02 = P4.a.n0(AbstractC6583a.H1(arrayList8, 10));
        if (n02 < 16) {
            i10 = 16;
        } else {
            i10 = n02;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(i10);
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            C3959i c3959i17 = (C3959i) it3.next();
            linkedHashMap3.put((C4294f) c3959i17.f36156Z, (C4294f) c3959i17.f36155Y);
        }
        f17799l = linkedHashMap3;
    }
}
