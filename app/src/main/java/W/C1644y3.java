package W;

import Z.AbstractC1725n;

/* renamed from: W.y3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1644y3 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f20633Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1644y3(String str) {
        super(3);
        this.f20633Y = str;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        E.q0 q0Var = (E.q0) obj;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        j4.b(this.f20633Y, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
        return jf.y.f36177a;
    }
}
