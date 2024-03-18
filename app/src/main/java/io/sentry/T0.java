package io.sentry;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class T0 {

    /* renamed from: a  reason: collision with root package name */
    public final U0 f33864a;

    /* renamed from: b  reason: collision with root package name */
    public final Iterable f33865b;

    public T0(U0 u02, Collection collection) {
        Ad.l.Z0("SentryEnvelopeHeader is required.", u02);
        this.f33864a = u02;
        Ad.l.Z0("SentryEnvelope items are required.", collection);
        this.f33865b = collection;
    }

    public T0(io.sentry.protocol.s sVar, io.sentry.protocol.q qVar, X0 x02) {
        this.f33864a = new U0(sVar, qVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(x02);
        this.f33865b = arrayList;
    }
}
