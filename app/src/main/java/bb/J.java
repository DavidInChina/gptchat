package bb;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25725Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2151C f25726Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(AbstractC2151C abstractC2151C, int i10) {
        super(1);
        this.f25725Y = i10;
        this.f25726Z = abstractC2151C;
    }

    public final C2152D a(C2152D c2152d) {
        int i10 = this.f25725Y;
        AbstractC2151C abstractC2151C = this.f25726Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, ((C2184y) abstractC2151C).f25922a, null, null, false, null, false, false, 507);
            case 1:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, null, ((C2149A) abstractC2151C).f25679a, null, false, false, 479);
            default:
                AbstractC3557B.c0("$this$setState", c2152d);
                return C2152D.e(c2152d, null, null, null, ((C2150B) abstractC2151C).f25685a, false, null, false, false, 495);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f25725Y) {
            case 0:
                return a((C2152D) obj);
            case 1:
                return a((C2152D) obj);
            default:
                return a((C2152D) obj);
        }
    }
}
