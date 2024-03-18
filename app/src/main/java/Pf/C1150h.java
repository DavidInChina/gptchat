package Pf;

import wf.AbstractC6216a;

/* renamed from: Pf.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1150h implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Ag.u f14095Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Mf.Z f14096Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1153k f14097h0;

    public C1150h(AbstractC1153k abstractC1153k, Ag.u uVar, Mf.Z z10) {
        this.f14097h0 = abstractC1153k;
        this.f14095Y = uVar;
        this.f14096Z = z10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new C1152j(this.f14097h0, this.f14095Y, this.f14096Z);
    }
}
