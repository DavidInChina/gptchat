package com.auth0.android.request.internal;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import h5.C3323a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import l5.C4336a;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final l5.f f26751a;

    /* renamed from: b  reason: collision with root package name */
    public final C3323a f26752b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f26753c;

    public l(C4336a c4336a, C3323a c3323a) {
        AbstractC3557B.c0("client", c4336a);
        this.f26751a = c4336a;
        this.f26752b = c3323a;
        C3959i[] c3959iArr = new C3959i[1];
        String locale = Locale.getDefault().toString();
        AbstractC3557B.b0("getDefault().toString()", locale);
        c3959iArr[0] = new C3959i(SIPHeaderNames.ACCEPT_LANGUAGE, locale.length() <= 0 ? "en_US" : locale);
        this.f26753c = AbstractC4268D.c1(c3959iArr);
    }

    public final b a(l5.d dVar, String str, e eVar, C3323a c3323a) {
        c c02 = c.f26725b.c0();
        AbstractC3557B.c0("url", str);
        l5.f fVar = this.f26751a;
        AbstractC3557B.c0("client", fVar);
        AbstractC3557B.c0("errorAdapter", c3323a);
        b bVar = new b(dVar, str, fVar, eVar, c3323a, c02);
        LinkedHashMap linkedHashMap = this.f26753c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            AbstractC3557B.c0("name", str2);
            AbstractC3557B.c0("value", str3);
            ((Map) bVar.f26724f.f17494i0).put(str2, str3);
            arrayList.add(bVar);
        }
        return bVar;
    }
}
