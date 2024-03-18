package io.ktor.utils.io.internal;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class h extends n {

    /* renamed from: c  reason: collision with root package name */
    public final i f33457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(iVar.f33468a, iVar.f33469b);
        AbstractC3557B.c0("initial", iVar);
        this.f33457c = iVar;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n c() {
        return this.f33457c.f33461f;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n d() {
        return this.f33457c.f33462g;
    }

    public final String toString() {
        return "IDLE(with buffer)";
    }
}
