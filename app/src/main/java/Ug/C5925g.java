package ug;

import hg.C3431j;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ug.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5925g {

    /* renamed from: c  reason: collision with root package name */
    public static final C3431j f46772c = new C3431j(6, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final int f46773d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f46774e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f46775f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f46776g;

    /* renamed from: h  reason: collision with root package name */
    public static final int f46777h;

    /* renamed from: i  reason: collision with root package name */
    public static final int f46778i;

    /* renamed from: j  reason: collision with root package name */
    public static final int f46779j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f46780k;

    /* renamed from: l  reason: collision with root package name */
    public static final C5925g f46781l;

    /* renamed from: m  reason: collision with root package name */
    public static final C5925g f46782m;

    /* renamed from: n  reason: collision with root package name */
    public static final C5925g f46783n;

    /* renamed from: o  reason: collision with root package name */
    public static final C5925g f46784o;

    /* renamed from: p  reason: collision with root package name */
    public static final C5925g f46785p;

    /* renamed from: q  reason: collision with root package name */
    public static final ArrayList f46786q;

    /* renamed from: r  reason: collision with root package name */
    public static final ArrayList f46787r;

    /* renamed from: a  reason: collision with root package name */
    public final List f46788a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46789b;

    static {
        C5924f c5924f;
        C5925g c5925g;
        int i10 = 1 << 1;
        int i11 = i10 << 1;
        f46774e = i10;
        int i12 = i10 << 2;
        f46775f = i11;
        int i13 = i10 << 3;
        f46776g = i12;
        int i14 = i10 << 4;
        f46777h = i13;
        f46778i = i14;
        int i15 = (i10 << 5) - 1;
        f46779j = i15;
        int i16 = 1 | i10 | i11;
        f46780k = i16;
        f46781l = new C5925g(i15);
        f46782m = new C5925g(i13 | i14);
        new C5925g(1);
        new C5925g(i10);
        new C5925g(i11);
        f46783n = new C5925g(i16);
        new C5925g(i12);
        f46784o = new C5925g(i13);
        f46785p = new C5925g(i14);
        new C5925g(i10 | i13 | i14);
        Field[] fields = C5925g.class.getFields();
        AbstractC3557B.b0("getFields(...)", fields);
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C5924f c5924f2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof C5925g) {
                c5925g = (C5925g) obj;
            } else {
                c5925g = null;
            }
            if (c5925g != null) {
                String name = field2.getName();
                AbstractC3557B.b0("getName(...)", name);
                c5924f2 = new C5924f(c5925g.f46789b, name);
            }
            if (c5924f2 != null) {
                arrayList2.add(c5924f2);
            }
        }
        f46786q = arrayList2;
        Field[] fields2 = C5925g.class.getFields();
        AbstractC3557B.b0("getFields(...)", fields2);
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (AbstractC3557B.K(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj2);
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                AbstractC3557B.b0("getName(...)", name2);
                c5924f = new C5924f(intValue, name2);
            } else {
                c5924f = null;
            }
            if (c5924f != null) {
                arrayList5.add(c5924f);
            }
        }
        f46787r = arrayList5;
    }

    public C5925g(int i10, List list) {
        AbstractC3557B.c0("excludes", list);
        this.f46788a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 &= ~((AbstractC5923e) it.next()).a();
        }
        this.f46789b = i10;
    }

    public final boolean a(int i10) {
        if ((i10 & this.f46789b) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(C5925g.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter", obj);
        C5925g c5925g = (C5925g) obj;
        if (AbstractC3557B.K(this.f46788a, c5925g.f46788a) && this.f46789b == c5925g.f46789b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46788a.hashCode() * 31) + this.f46789b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = f46786q.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C5924f) obj).f46770a == this.f46789b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C5924f c5924f = (C5924f) obj;
        if (c5924f != null) {
            str = c5924f.f46771b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = f46787r;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C5924f c5924f2 = (C5924f) it2.next();
                if (a(c5924f2.f46770a)) {
                    str2 = c5924f2.f46771b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = kf.t.m2(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("DescriptorKindFilter(", str, ", ");
        s10.append(this.f46788a);
        s10.append(')');
        return s10.toString();
    }

    public /* synthetic */ C5925g(int i10) {
        this(i10, kf.v.f37483Y);
    }
}
