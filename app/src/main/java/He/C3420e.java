package he;

import id.AbstractC3557B;
import te.AbstractC5759c;
import ve.AbstractC6034c;

/* renamed from: he.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3420e extends C3418c {

    /* renamed from: k0  reason: collision with root package name */
    public final byte[] f32276k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f32277l0 = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3420e(ge.d dVar, AbstractC5759c abstractC5759c, AbstractC6034c abstractC6034c, byte[] bArr) {
        super(dVar);
        AbstractC3557B.c0("client", dVar);
        this.f32276k0 = bArr;
        this.f32271Z = new f(this, abstractC5759c);
        this.f32272h0 = new g(this, bArr, abstractC6034c);
    }

    @Override // he.C3418c
    public final boolean b() {
        return this.f32277l0;
    }

    @Override // he.C3418c
    public final Object e() {
        return AbstractC3557B.F(this.f32276k0);
    }
}
