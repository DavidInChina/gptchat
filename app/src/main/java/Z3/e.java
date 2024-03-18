package z3;

import Ad.l;
import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kf.t;
import kf.w;
import l8.AbstractC4344b;
import lf.C4436a;
import lf.C4439d;
import lf.C4442g;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f51581a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f51582b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f51583c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f51584d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        AbstractC3557B.c0("foreignKeys", abstractSet);
        this.f51581a = str;
        this.f51582b = map;
        this.f51583c = abstractSet;
        this.f51584d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final e a(C3.b bVar, String str) {
        Map map;
        C4442g c4442g;
        C4442g c4442g2;
        boolean z10;
        int i10;
        int i11;
        String str2;
        int i12;
        d dVar;
        Throwable th2;
        String str3;
        boolean z11;
        C3.b bVar2 = bVar;
        StringBuilder sb2 = new StringBuilder("PRAGMA table_info(`");
        sb2.append(str);
        String str4 = "`)";
        sb2.append(str4);
        Cursor h10 = bVar2.h(sb2.toString());
        try {
            String str5 = "name";
            if (h10.getColumnCount() <= 0) {
                map = w.f37484Y;
                l.S(h10, null);
            } else {
                int columnIndex = h10.getColumnIndex(str5);
                int columnIndex2 = h10.getColumnIndex("type");
                int columnIndex3 = h10.getColumnIndex("notnull");
                int columnIndex4 = h10.getColumnIndex("pk");
                int columnIndex5 = h10.getColumnIndex("dflt_value");
                C4439d c4439d = new C4439d();
                while (h10.moveToNext()) {
                    String string = h10.getString(columnIndex);
                    String string2 = h10.getString(columnIndex2);
                    if (h10.getInt(columnIndex3) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i13 = h10.getInt(columnIndex4);
                    String string3 = h10.getString(columnIndex5);
                    AbstractC3557B.b0(str5, string);
                    AbstractC3557B.b0("type", string2);
                    c4439d.put(string, new C6760a(i13, 2, string, string2, string3, z11));
                    columnIndex = columnIndex;
                }
                c4439d.b();
                c4439d.f38324r0 = true;
                if (c4439d.f38320n0 > 0) {
                    map = c4439d;
                } else {
                    map = C4439d.f38311s0;
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", map);
                }
                th = null;
            }
            h10 = bVar2.h("PRAGMA foreign_key_list(`" + str + str4);
            try {
                int columnIndex6 = h10.getColumnIndex(ParameterNames.ID);
                int columnIndex7 = h10.getColumnIndex("seq");
                int columnIndex8 = h10.getColumnIndex("table");
                int columnIndex9 = h10.getColumnIndex("on_delete");
                int columnIndex10 = h10.getColumnIndex("on_update");
                int columnIndex11 = h10.getColumnIndex(ParameterNames.ID);
                int columnIndex12 = h10.getColumnIndex("seq");
                int columnIndex13 = h10.getColumnIndex("from");
                int columnIndex14 = h10.getColumnIndex("to");
                C4436a c4436a = new C4436a();
                while (h10.moveToNext()) {
                    String str6 = str5;
                    int i14 = h10.getInt(columnIndex11);
                    int i15 = columnIndex11;
                    int i16 = h10.getInt(columnIndex12);
                    int i17 = columnIndex12;
                    String string4 = h10.getString(columnIndex13);
                    int i18 = columnIndex13;
                    AbstractC3557B.b0("cursor.getString(fromColumnIndex)", string4);
                    String string5 = h10.getString(columnIndex14);
                    AbstractC3557B.b0("cursor.getString(toColumnIndex)", string5);
                    c4436a.add(new c(string4, i14, i16, string5));
                    map = map;
                    str5 = str6;
                    columnIndex11 = i15;
                    columnIndex12 = i17;
                    columnIndex13 = i18;
                    columnIndex14 = columnIndex14;
                }
                Map map2 = map;
                String str7 = str5;
                List E22 = t.E2(AbstractC4344b.Q(c4436a));
                h10.moveToPosition(-1);
                C4442g c4442g3 = new C4442g();
                while (h10.moveToNext()) {
                    if (h10.getInt(columnIndex7) == 0) {
                        int i19 = h10.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : E22) {
                            List list = E22;
                            if (((c) obj).f51573Y == i19) {
                                arrayList3.add(obj);
                            }
                            E22 = list;
                        }
                        List list2 = E22;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            arrayList.add(cVar.f51575h0);
                            arrayList2.add(cVar.f51576i0);
                        }
                        String string6 = h10.getString(columnIndex8);
                        AbstractC3557B.b0("cursor.getString(tableColumnIndex)", string6);
                        String string7 = h10.getString(columnIndex9);
                        AbstractC3557B.b0("cursor.getString(onDeleteColumnIndex)", string7);
                        String string8 = h10.getString(columnIndex10);
                        AbstractC3557B.b0("cursor.getString(onUpdateColumnIndex)", string8);
                        c4442g3.add(new C6761b(string6, string7, string8, arrayList, arrayList2));
                        columnIndex6 = columnIndex6;
                        E22 = list2;
                    }
                }
                C4442g K10 = R4.b.K(c4442g3);
                l.S(h10, null);
                h10 = bVar2.h("PRAGMA index_list(`" + str + str4);
                String str8 = str7;
                try {
                    int columnIndex15 = h10.getColumnIndex(str8);
                    int columnIndex16 = h10.getColumnIndex("origin");
                    int columnIndex17 = h10.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        c4442g2 = null;
                        l.S(h10, null);
                    } else {
                        C4442g c4442g4 = new C4442g();
                        while (h10.moveToNext()) {
                            if (AbstractC3557B.K("c", h10.getString(columnIndex16))) {
                                String string9 = h10.getString(columnIndex15);
                                if (h10.getInt(columnIndex17) == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                AbstractC3557B.b0(str8, string9);
                                h10 = bVar2.h("PRAGMA index_xinfo(`" + string9 + str4);
                                int columnIndex18 = h10.getColumnIndex("seqno");
                                int columnIndex19 = h10.getColumnIndex("cid");
                                int columnIndex20 = h10.getColumnIndex(str8);
                                int columnIndex21 = h10.getColumnIndex("desc");
                                String str9 = str8;
                                if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                    i12 = columnIndex15;
                                    str2 = str4;
                                    i11 = columnIndex16;
                                    i10 = columnIndex17;
                                    th = null;
                                    dVar = null;
                                } else {
                                    TreeMap treeMap = new TreeMap();
                                    i12 = columnIndex15;
                                    TreeMap treeMap2 = new TreeMap();
                                    while (h10.moveToNext()) {
                                        if (h10.getInt(columnIndex19) >= 0) {
                                            int i20 = h10.getInt(columnIndex18);
                                            String str10 = str4;
                                            String string10 = h10.getString(columnIndex20);
                                            if (h10.getInt(columnIndex21) > 0) {
                                                str3 = "DESC";
                                            } else {
                                                str3 = "ASC";
                                            }
                                            int i21 = columnIndex21;
                                            String str11 = str3;
                                            int i22 = columnIndex16;
                                            Integer valueOf = Integer.valueOf(i20);
                                            AbstractC3557B.b0("columnName", string10);
                                            treeMap.put(valueOf, string10);
                                            treeMap2.put(Integer.valueOf(i20), str11);
                                            str4 = str10;
                                            columnIndex16 = i22;
                                            columnIndex21 = i21;
                                            columnIndex17 = columnIndex17;
                                        }
                                    }
                                    str2 = str4;
                                    i11 = columnIndex16;
                                    i10 = columnIndex17;
                                    Collection values = treeMap.values();
                                    AbstractC3557B.b0("columnsMap.values", values);
                                    List K22 = t.K2(values);
                                    Collection values2 = treeMap2.values();
                                    AbstractC3557B.b0("ordersMap.values", values2);
                                    dVar = new d(string9, z10, K22, t.K2(values2));
                                    l.S(h10, null);
                                    th2 = null;
                                }
                                if (dVar == null) {
                                    l.S(h10, th2);
                                    c4442g = null;
                                    break;
                                }
                                c4442g4.add(dVar);
                                bVar2 = bVar;
                                str8 = str9;
                                columnIndex15 = i12;
                                str4 = str2;
                                columnIndex16 = i11;
                                columnIndex17 = i10;
                            }
                        }
                        c4442g2 = R4.b.K(c4442g4);
                        th = null;
                    }
                    c4442g = c4442g2;
                    return new e(str, map2, K10, c4442g);
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } finally {
                }
            }
        } finally {
            try {
                throw th3;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC3557B.K(this.f51581a, eVar.f51581a) || !AbstractC3557B.K(this.f51582b, eVar.f51582b) || !AbstractC3557B.K(this.f51583c, eVar.f51583c)) {
            return false;
        }
        Set set2 = this.f51584d;
        if (set2 == null || (set = eVar.f51584d) == null) {
            return true;
        }
        return AbstractC3557B.K(set2, set);
    }

    public final int hashCode() {
        return this.f51583c.hashCode() + AbstractC6463a.f(this.f51582b, this.f51581a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f51581a + "', columns=" + this.f51582b + ", foreignKeys=" + this.f51583c + ", indices=" + this.f51584d + '}';
    }
}
