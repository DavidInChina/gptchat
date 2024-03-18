package Mf;

import id.AbstractC3557B;
import kg.C4291c;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12066Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4291c f12067Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C4291c c4291c, int i10) {
        super(1);
        this.f12066Y = i10;
        this.f12067Z = c4291c;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f12066Y;
        C4291c c4291c = this.f12067Z;
        switch (i10) {
            case 0:
                C4291c c4291c2 = (C4291c) obj;
                AbstractC3557B.c0("it", c4291c2);
                if (!c4291c2.d() && AbstractC3557B.K(c4291c2.e(), c4291c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Nf.i iVar = (Nf.i) obj;
                AbstractC3557B.c0("it", iVar);
                return iVar.l(c4291c);
        }
    }
}
