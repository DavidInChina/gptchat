package io.ktor.utils.io.internal;

import z.C6685Z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f33450b = new c(null);

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f33451a;

    public c(Throwable th2) {
        this.f33451a = th2;
    }

    public final Throwable a() {
        Throwable th2 = this.f33451a;
        if (th2 == null) {
            return new C6685Z("The channel was closed");
        }
        return th2;
    }

    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
