package io.ktor.utils.io.internal;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class k extends n {

    /* renamed from: c  reason: collision with root package name */
    public final i f33465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar) {
        super(iVar.f33468a, iVar.f33469b);
        AbstractC3557B.c0("initial", iVar);
        this.f33465c = iVar;
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer a() {
        return this.f33465c.f33459d;
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer b() {
        return this.f33465c.f33458c;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n e() {
        return this.f33465c.f33462g;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n f() {
        return this.f33465c.f33461f;
    }

    public final String toString() {
        return "Reading+Writing";
    }
}
