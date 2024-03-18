package cg;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import jf.C3959i;
import kf.y;
import sg.EnumC5626c;
import yf.AbstractC6583a;

/* renamed from: cg.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2424o {

    /* renamed from: a  reason: collision with root package name */
    public final String f26646a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f26647b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public C3959i f26648c = new C3959i(TokenNames.f24320V, null);

    public C2424o(U3.e eVar, String str) {
        this.f26646a = str;
    }

    public final void a(String str, C2412c... c2412cArr) {
        C2427r c2427r;
        AbstractC3557B.c0("type", str);
        ArrayList arrayList = this.f26647b;
        if (c2412cArr.length == 0) {
            c2427r = null;
        } else {
            kf.o C32 = kf.q.C3(c2412cArr);
            int n02 = P4.a.n0(AbstractC6583a.H1(C32, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
            Iterator it = C32.iterator();
            while (it.hasNext()) {
                y yVar = (y) it.next();
                linkedHashMap.put(Integer.valueOf(yVar.f37486a), (C2412c) yVar.f37487b);
            }
            c2427r = new C2427r(linkedHashMap);
        }
        arrayList.add(new C3959i(str, c2427r));
    }

    public final void b(String str, C2412c... c2412cArr) {
        AbstractC3557B.c0("type", str);
        kf.o C32 = kf.q.C3(c2412cArr);
        int n02 = P4.a.n0(AbstractC6583a.H1(C32, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        Iterator it = C32.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            linkedHashMap.put(Integer.valueOf(yVar.f37486a), (C2412c) yVar.f37487b);
        }
        this.f26648c = new C3959i(str, new C2427r(linkedHashMap));
    }

    public final void c(EnumC5626c enumC5626c) {
        AbstractC3557B.c0("type", enumC5626c);
        String c10 = enumC5626c.c();
        AbstractC3557B.b0("getDesc(...)", c10);
        this.f26648c = new C3959i(c10, null);
    }
}
