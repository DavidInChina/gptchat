package ua;

import ce.AbstractC2397c;
import ce.C2401g;
import id.AbstractC3557B;

/* renamed from: ua.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5871b implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f46508a;

    public C5871b(C2401g c2401g) {
        this.f46508a = c2401g;
    }

    @Override // p000if.a
    public final Object get() {
        p000if.a aVar = this.f46508a;
        AbstractC3557B.c0("actionHandlers", aVar);
        return new C5870a(aVar);
    }
}
