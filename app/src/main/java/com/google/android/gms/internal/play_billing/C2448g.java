package com.google.android.gms.internal.play_billing;

import android.gov.nist.core.Separators;

/* renamed from: com.google.android.gms.internal.play_billing.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2448g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f26920a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f26921b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f26922c;

    public C2448g(Object obj, Object obj2, Object obj3) {
        this.f26920a = obj;
        this.f26921b = obj2;
        this.f26922c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f26920a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f26921b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f26922c);
        StringBuilder t10 = android.gov.nist.core.a.t("Multiple entries with same key: ", valueOf, Separators.EQUALS, valueOf2, " and ");
        t10.append(valueOf3);
        t10.append(Separators.EQUALS);
        t10.append(valueOf4);
        return new IllegalArgumentException(t10.toString());
    }
}
