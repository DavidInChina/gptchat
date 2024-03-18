package Bg;

import wf.AbstractC6216a;

/* renamed from: Bg.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0211d extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ X f2110Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Eg.k f2111Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Eg.g f2112h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Eg.g f2113i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0211d(X x10, Eg.k kVar, Eg.g gVar, Eg.g gVar2) {
        super(0);
        this.f2110Y = x10;
        this.f2111Z = kVar;
        this.f2112h0 = gVar;
        this.f2113i0 = gVar2;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return Boolean.valueOf(C0213f.i(this.f2110Y, this.f2111Z.g0(this.f2112h0), this.f2113i0));
    }
}
