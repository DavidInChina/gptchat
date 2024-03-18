package io.ktor.utils.io.internal;

import id.AbstractC3557B;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class j extends n {

    /* renamed from: c  reason: collision with root package name */
    public final i f33464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar) {
        super(iVar.f33468a, iVar.f33469b);
        AbstractC3557B.c0("initial", iVar);
        this.f33464c = iVar;
    }

    @Override // io.ktor.utils.io.internal.n
    public final ByteBuffer a() {
        return this.f33464c.f33459d;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n d() {
        return this.f33464c.f33463h;
    }

    @Override // io.ktor.utils.io.internal.n
    public final n e() {
        return this.f33464c.f33460e;
    }

    public final String toString() {
        return "Reading";
    }
}
