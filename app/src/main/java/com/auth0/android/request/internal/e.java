package com.auth0.android.request.internal;

import I8.E;
import com.auth0.android.result.Credentials;
import com.google.gson.reflect.TypeToken;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e implements l5.e {

    /* renamed from: a  reason: collision with root package name */
    public final E f26730a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(I8.n nVar) {
        this(nVar.f(TypeToken.get(Credentials.class)));
        AbstractC3557B.c0("gson", nVar);
    }

    public e(E e10) {
        this.f26730a = e10;
    }

    public e(I8.n nVar, TypeToken typeToken) {
        this(nVar.f(typeToken));
    }
}
