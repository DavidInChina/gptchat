package oh;

import l0.AbstractC4313e;
import q0.C5252d;
import wf.AbstractC6216a;

/* renamed from: oh.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5014a extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC4313e f41397Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5252d f41398Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f41399h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Z0.l f41400i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5014a(long j6, AbstractC4313e abstractC4313e, C5252d c5252d, Z0.l lVar) {
        super(0);
        this.f41397Y = abstractC4313e;
        this.f41398Z = c5252d;
        this.f41399h0 = j6;
        this.f41400i0 = lVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        return new Z0.i(this.f41397Y.a(P4.a.F0(this.f41398Z.d()), P4.a.F0(this.f41399h0), this.f41400i0));
    }
}
