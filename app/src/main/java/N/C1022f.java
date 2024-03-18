package N;

import n0.C4707f;
import o0.C4869d;
import q0.C5254f;
import r0.C5347k;
import wf.AbstractC6216a;

/* renamed from: N.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1022f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f12312Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f12313Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f12314h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022f(long j6, AbstractC6216a abstractC6216a, boolean z10) {
        super(1);
        this.f12312Y = j6;
        this.f12313Z = abstractC6216a;
        this.f12314h0 = z10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C4869d c4869d = (C4869d) obj;
        r0.z K10 = M3.H.K(c4869d, C5254f.d(c4869d.f40415Y.g()) / 2.0f);
        int i10 = C5347k.f44246d;
        return c4869d.a(new A.B(this.f12313Z, this.f12314h0, K10, C4707f.a(5, this.f12312Y)));
    }
}
