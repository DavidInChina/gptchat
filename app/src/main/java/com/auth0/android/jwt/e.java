package com.auth0.android.jwt;

import I8.p;
import I8.q;
import I8.r;
import I8.t;
import I8.u;
import K8.i;
import K8.j;
import K8.k;
import K8.m;
import com.auth0.android.result.Credentials;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26713a;

    public /* synthetic */ e(int i10) {
        this.f26713a = i10;
    }

    public static Date b(u uVar, String str) {
        if (!uVar.f8133Y.containsKey(str)) {
            return null;
        }
        return new Date(uVar.q0(str).I() * 1000);
    }

    @Override // I8.q
    public final Object a(r rVar, Type type, y7.b bVar) {
        switch (this.f26713a) {
            case 0:
                rVar.getClass();
                if (!(rVar instanceof t) && (rVar instanceof u)) {
                    u y10 = rVar.y();
                    m mVar = y10.f8133Y;
                    if (mVar.containsKey("iss")) {
                        y10.q0("iss").T();
                    }
                    if (mVar.containsKey("sub")) {
                        y10.q0("sub").T();
                    }
                    b(y10, "exp");
                    b(y10, "nbf");
                    b(y10, "iat");
                    if (mVar.containsKey("jti")) {
                        y10.q0("jti").T();
                    }
                    Collections.emptyList();
                    if (mVar.containsKey("aud")) {
                        r q02 = y10.q0("aud");
                        q02.getClass();
                        if (q02 instanceof p) {
                            ArrayList arrayList = q02.s().f8131Y;
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                arrayList2.add(((r) arrayList.get(i10)).T());
                            }
                        } else {
                            Collections.singletonList(q02.T());
                        }
                    }
                    HashMap hashMap = new HashMap();
                    Iterator it = ((j) mVar.entrySet()).iterator();
                    while (((k) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((i) it).next();
                        hashMap.put(entry.getKey(), new b((r) entry.getValue()));
                    }
                    return new f(hashMap);
                }
                throw new RuntimeException("The token's payload had an invalid JSON format.");
            default:
                AbstractC3557B.c0("json", rVar);
                AbstractC3557B.c0("typeOfT", type);
                AbstractC3557B.c0("context", bVar);
                if ((rVar instanceof u) && !(rVar instanceof t) && !((AbstractCollection) rVar.y().f8133Y.entrySet()).isEmpty()) {
                    u y11 = rVar.y();
                    String str = (String) bVar.h(y11.r0("id_token"), String.class);
                    String str2 = (String) bVar.h(y11.r0("access_token"), String.class);
                    String str3 = (String) bVar.h(y11.r0("token_type"), String.class);
                    String str4 = (String) bVar.h(y11.r0("refresh_token"), String.class);
                    Long l10 = (Long) bVar.h(y11.r0("expires_in"), Long.TYPE);
                    String str5 = (String) bVar.h(y11.r0("scope"), String.class);
                    String str6 = (String) bVar.h(y11.r0("recovery_code"), String.class);
                    Date date = (Date) bVar.h(y11.r0("expires_at"), Date.class);
                    if (date == null && l10 != null) {
                        date = new Date((l10.longValue() * 1000) + System.currentTimeMillis());
                    }
                    Date date2 = date;
                    AbstractC3557B.b0("idToken", str);
                    AbstractC3557B.b0("accessToken", str2);
                    AbstractC3557B.b0("type", str3);
                    AbstractC3557B.b0("expiresAt", date2);
                    Credentials credentials = new Credentials(str, str2, str3, str4, date2, str5);
                    credentials.g(str6);
                    return credentials;
                }
                throw new RuntimeException("credentials json is not a valid json object");
        }
    }
}
