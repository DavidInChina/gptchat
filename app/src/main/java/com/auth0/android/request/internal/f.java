package com.auth0.android.request.internal;

import I8.o;
import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import m5.C4561a;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final I8.n f26731a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [I8.q, java.lang.Object] */
    static {
        Type type = TypeToken.getParameterized(Map.class, String.class, PublicKey.class).getType();
        o oVar = new o();
        oVar.f8121e.add(new i(0));
        oVar.b(new n(), C4561a.class);
        oVar.b(new com.auth0.android.jwt.e(1), Credentials.class);
        oVar.b(new Object(), type);
        oVar.f8123g = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        f26731a = oVar.a();
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    }
}
