package mh;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class S extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f39431Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f39432Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(boolean z10, boolean z11) {
        super(0);
        this.f39431Y = z10;
        this.f39432Z = z11;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new C4686p(null, this.f39431Y, this.f39432Z, 1);
    }
}
