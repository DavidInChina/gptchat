package jg;

import Lg.n;
import hg.AbstractC3428g;
import id.AbstractC3557B;
import ig.C3583i;
import ig.EnumC3582h;
import ig.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kf.o;
import kf.t;
import kf.x;
import kf.y;
import l8.AbstractC4344b;
import lg.AbstractC4460e;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class h implements AbstractC3428g {

    /* renamed from: d  reason: collision with root package name */
    public static final List f36190d;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f36191a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f36192b;

    /* renamed from: c  reason: collision with root package name */
    public final List f36193c;

    static {
        String m22 = t.m2(AbstractC4344b.G0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List G02 = AbstractC4344b.G0(m22.concat("/Any"), m22.concat("/Nothing"), m22.concat("/Unit"), m22.concat("/Throwable"), m22.concat("/Number"), m22.concat("/Byte"), m22.concat("/Double"), m22.concat("/Float"), m22.concat("/Int"), m22.concat("/Long"), m22.concat("/Short"), m22.concat("/Boolean"), m22.concat("/Char"), m22.concat("/CharSequence"), m22.concat("/String"), m22.concat("/Comparable"), m22.concat("/Enum"), m22.concat("/Array"), m22.concat("/ByteArray"), m22.concat("/DoubleArray"), m22.concat("/FloatArray"), m22.concat("/IntArray"), m22.concat("/LongArray"), m22.concat("/ShortArray"), m22.concat("/BooleanArray"), m22.concat("/CharArray"), m22.concat("/Cloneable"), m22.concat("/Annotation"), m22.concat("/collections/Iterable"), m22.concat("/collections/MutableIterable"), m22.concat("/collections/Collection"), m22.concat("/collections/MutableCollection"), m22.concat("/collections/List"), m22.concat("/collections/MutableList"), m22.concat("/collections/Set"), m22.concat("/collections/MutableSet"), m22.concat("/collections/Map"), m22.concat("/collections/MutableMap"), m22.concat("/collections/Map.Entry"), m22.concat("/collections/MutableMap.MutableEntry"), m22.concat("/collections/Iterator"), m22.concat("/collections/MutableIterator"), m22.concat("/collections/ListIterator"), m22.concat("/collections/MutableListIterator"));
        f36190d = G02;
        o R22 = t.R2(G02);
        int n02 = P4.a.n0(AbstractC6583a.H1(R22, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        Iterator it = R22.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            linkedHashMap.put((String) yVar.f37487b, Integer.valueOf(yVar.f37486a));
        }
    }

    public h(j jVar, String[] strArr) {
        Set set;
        List list = jVar.f33228h0;
        if (list.isEmpty()) {
            set = x.f37485Y;
        } else {
            set = t.P2(list);
        }
        List<C3583i> list2 = jVar.f33227Z;
        AbstractC3557B.b0("getRecordList(...)", list2);
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (C3583i c3583i : list2) {
            int i10 = c3583i.f33214h0;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(c3583i);
            }
        }
        arrayList.trimToSize();
        this.f36191a = strArr;
        this.f36192b = set;
        this.f36193c = arrayList;
    }

    @Override // hg.AbstractC3428g
    public final String a(int i10) {
        return b(i10);
    }

    @Override // hg.AbstractC3428g
    public final String b(int i10) {
        String str;
        C3583i c3583i = (C3583i) this.f36193c.get(i10);
        int i11 = c3583i.f33213Z;
        if ((i11 & 4) == 4) {
            Object obj = c3583i.f33216j0;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                AbstractC4460e abstractC4460e = (AbstractC4460e) obj;
                String r02 = abstractC4460e.r0();
                if (abstractC4460e.T()) {
                    c3583i.f33216j0 = r02;
                }
                str = r02;
            }
        } else {
            if ((i11 & 2) == 2) {
                List list = f36190d;
                int size = list.size();
                int i12 = c3583i.f33215i0;
                if (i12 >= 0 && i12 < size) {
                    str = (String) list.get(i12);
                }
            }
            str = this.f36191a[i10];
        }
        if (c3583i.f33218l0.size() >= 2) {
            List list2 = c3583i.f33218l0;
            AbstractC3557B.Z(list2);
            Integer num = (Integer) list2.get(0);
            Integer num2 = (Integer) list2.get(1);
            AbstractC3557B.Z(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                AbstractC3557B.Z(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    AbstractC3557B.b0("substring(...)", str);
                }
            }
        }
        if (c3583i.f33220n0.size() >= 2) {
            List list3 = c3583i.f33220n0;
            AbstractC3557B.Z(list3);
            AbstractC3557B.Z(str);
            str = n.z2(str, (char) ((Integer) list3.get(0)).intValue(), (char) ((Integer) list3.get(1)).intValue());
        }
        EnumC3582h enumC3582h = c3583i.f33217k0;
        if (enumC3582h == null) {
            enumC3582h = EnumC3582h.NONE;
        }
        int ordinal = enumC3582h.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (str.length() >= 2) {
                    str = str.substring(1, str.length() - 1);
                    AbstractC3557B.b0("substring(...)", str);
                }
                str = n.z2(str, '$', '.');
            }
        } else {
            AbstractC3557B.Z(str);
            str = n.z2(str, '$', '.');
        }
        AbstractC3557B.Z(str);
        return str;
    }

    @Override // hg.AbstractC3428g
    public final boolean c(int i10) {
        return this.f36192b.contains(Integer.valueOf(i10));
    }
}
