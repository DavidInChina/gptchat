package Qd;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* renamed from: Qd.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1189h extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14606Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f14607Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1189h(i iVar, int i10) {
        super(0);
        this.f14606Y = i10;
        this.f14607Z = iVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f14606Y;
        i iVar = this.f14607Z;
        switch (i10) {
            case 0:
                k kVar = iVar.f14610Y;
                B b10 = kVar.f14622c;
                m mVar = iVar.f14611Z;
                Ng.B c10 = mVar.c();
                Li.q e10 = mVar.e();
                Object obj = iVar.f14610Y.f14621b;
                AbstractC3557B.Z(obj);
                return b10.a(this.f14607Z, e10, kVar.f14620a, c10, obj);
            default:
                Rd.l lVar = new Rd.l();
                AbstractC3557B.c0("<set-?>", iVar);
                lVar.f15456b = iVar;
                return lVar;
        }
    }
}
