package com.auth0.android.jwt;

import I8.n;
import I8.r;
import I8.t;
import I8.x;
import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final r f26709a;

    public b(r rVar) {
        this.f26709a = rVar;
    }

    @Override // com.auth0.android.jwt.a
    public final Object a() {
        r rVar = this.f26709a;
        try {
            rVar.getClass();
            if (rVar instanceof t) {
                return null;
            }
            return K8.d.U0(Map.class).cast(new n().b(rVar, TypeToken.get(Map.class)));
        } catch (x e10) {
            throw new RuntimeException("Failed to decode claim as ".concat("Map"), e10);
        }
    }
}
