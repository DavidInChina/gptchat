package na;

import Z.AbstractC1708e0;
import id.AbstractC3557B;
import ta.AbstractC5690F;

/* renamed from: na.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4748e0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39969Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1708e0 f39970Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4748e0(AbstractC1708e0 abstractC1708e0, int i10) {
        super(1);
        this.f39969Y = i10;
        this.f39970Z = abstractC1708e0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39969Y;
        AbstractC1708e0 abstractC1708e0 = this.f39970Z;
        switch (i10) {
            case 0:
                ((Z.U0) abstractC1708e0).i((int) (((Z0.k) obj).f22804a & 4294967295L));
                return yVar;
            default:
                N0.C c10 = (N0.C) obj;
                AbstractC3557B.c0("it", c10);
                int i11 = c10.f12478b.f12529f;
                float f6 = AbstractC5690F.f45817a;
                ((Z.U0) abstractC1708e0).i(i11);
                return yVar;
        }
    }
}
