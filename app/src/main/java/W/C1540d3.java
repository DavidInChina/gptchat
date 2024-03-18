package W;

import wf.AbstractC6216a;

/* renamed from: W.d3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540d3 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f20018Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Z0.b f20019Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ EnumC1555g3 f20020h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f20021i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f20022j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1540d3(boolean z10, Z0.b bVar, EnumC1555g3 enumC1555g3, wf.k kVar, boolean z11) {
        super(0);
        this.f20018Y = z10;
        this.f20019Z = bVar;
        this.f20020h0 = enumC1555g3;
        this.f20021i0 = kVar;
        this.f20022j0 = z11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new C1550f3(this.f20018Y, this.f20019Z, this.f20020h0, this.f20021i0, this.f20022j0);
    }
}
