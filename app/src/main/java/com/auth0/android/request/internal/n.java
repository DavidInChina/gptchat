package com.auth0.android.request.internal;

import I8.q;
import I8.r;
import I8.t;
import I8.u;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m5.C4561a;

/* loaded from: classes2.dex */
public final class n implements q {

    /* renamed from: a  reason: collision with root package name */
    public final I8.n f26754a = new I8.n();

    @Override // I8.q
    public final Object a(r rVar, Type type, y7.b bVar) {
        rVar.getClass();
        if ((rVar instanceof u) && !(rVar instanceof t) && !((AbstractCollection) rVar.y().f8133Y.entrySet()).isEmpty()) {
            u y10 = rVar.y();
            String str = (String) bVar.h(y10.r0("user_id"), String.class);
            String str2 = (String) bVar.h(y10.r0("name"), String.class);
            String str3 = (String) bVar.h(y10.r0("nickname"), String.class);
            String str4 = (String) bVar.h(y10.r0("picture"), String.class);
            String str5 = (String) bVar.h(y10.r0("email"), String.class);
            String str6 = (String) bVar.h(y10.r0("given_name"), String.class);
            String str7 = (String) bVar.h(y10.r0("family_name"), String.class);
            if (y10.f8133Y.containsKey("email_verified")) {
                Boolean bool = (Boolean) bVar.h(y10.r0("email_verified"), Boolean.class);
            }
            r r02 = y10.r0("created_at");
            I8.n nVar = this.f26754a;
            nVar.getClass();
            Date date = (Date) K8.d.U0(Date.class).cast(nVar.b(r02, TypeToken.get(Date.class)));
            List list = (List) bVar.h(y10.r0("identities"), new TypeToken().getType());
            Type type2 = new TypeToken().getType();
            return new C4561a((Map) bVar.h(y10, type2), (Map) bVar.h(y10.r0("user_metadata"), type2), (Map) bVar.h(y10.r0("app_metadata"), type2));
        }
        throw new RuntimeException("user profile json is not a valid json object");
    }
}
