package t6;

import F5.h;
import S4.o;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import l8.AbstractC4344b;
import n6.e;
import p5.AbstractC5091c;
import q5.C5271a;
import s5.AbstractC5577b;
import s5.C5576a;
import t5.d;
import yf.AbstractC6583a;

/* renamed from: t6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5678a implements AbstractC5577b {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f45753d;

    /* renamed from: a  reason: collision with root package name */
    public final String f45754a;

    /* renamed from: b  reason: collision with root package name */
    public final o f45755b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5091c f45756c;

    static {
        byte[] bytes = Separators.RETURN.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        f45753d = bytes;
    }

    public C5678a(String str, o oVar, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f45754a = str;
        this.f45755b = oVar;
        this.f45756c = abstractC5091c;
    }

    @Override // s5.AbstractC5577b
    public final C5576a a(C5271a c5271a, List list) {
        byte[] i02;
        AbstractC3557B.c0("context", c5271a);
        AbstractC3557B.c0("batchData", list);
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        C3959i[] c3959iArr = new C3959i[2];
        String str = c5271a.f43901g;
        c3959iArr[0] = new C3959i("ddsource", str);
        StringBuilder sb2 = new StringBuilder("sdk_version:");
        String str2 = c5271a.f43902h;
        sb2.append(str2);
        ArrayList N02 = AbstractC4344b.N0("service:" + c5271a.f43897c, "version:" + c5271a.f43899e, sb2.toString(), "env:" + c5271a.f43898d);
        String str3 = c5271a.f43900f;
        if (str3.length() > 0) {
            N02.add("variant:".concat(str3));
        }
        c3959iArr[1] = new C3959i("ddtags", t.m2(N02, Separators.COMMA, null, null, null, 62));
        Map a12 = AbstractC4268D.a1(c3959iArr);
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        String str4 = this.f45754a;
        if (str4 == null) {
            str4 = c5271a.f43895a.f40609Z;
        }
        objArr[0] = str4;
        String format = String.format(locale, "%s/api/v2/rum", Arrays.copyOf(objArr, 1));
        ArrayList arrayList = new ArrayList(a12.size());
        for (Map.Entry entry : a12.entrySet()) {
            arrayList.add(entry.getKey() + Separators.EQUALS + entry.getValue());
        }
        String concat = format.concat(t.m2(arrayList, Separators.AND, Separators.QUESTION, null, null, 60));
        Map a13 = AbstractC4268D.a1(new C3959i("DD-API-KEY", c5271a.f43896b), new C3959i("DD-EVP-ORIGIN", str), new C3959i("DD-EVP-ORIGIN-VERSION", str2), new C3959i("DD-REQUEST-ID", uuid));
        o oVar = this.f45755b;
        oVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            e eVar = (e) ((h) oVar.f16184Z).a(dVar.f45752b);
            if (eVar instanceof e) {
                linkedHashMap2.put(dVar, eVar);
                String str5 = eVar.f39639a;
                Long l10 = (Long) linkedHashMap.get(str5);
                long j6 = eVar.f39640b;
                if (l10 == null) {
                    linkedHashMap.put(str5, Long.valueOf(j6));
                } else {
                    linkedHashMap.put(str5, Long.valueOf(Math.max(j6, l10.longValue())));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            d dVar2 = (d) obj;
            if (linkedHashMap2.containsKey(dVar2)) {
                e eVar2 = (e) AbstractC4268D.Z0(dVar2, linkedHashMap2);
                if (eVar2.f39640b == ((Number) AbstractC4268D.Z0(eVar2.f39639a, linkedHashMap)).longValue()) {
                }
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((d) it2.next()).f45751a);
        }
        i02 = P4.a.i0(arrayList3, f45753d, new byte[0], new byte[0], this.f45756c);
        return new C5576a(uuid, "RUM Request", concat, a13, i02, "text/plain;charset=UTF-8");
    }
}
