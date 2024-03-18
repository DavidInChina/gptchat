package z4;

import v4.C5971a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51702Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ q f51703Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(0);
        this.f51702Y = i10;
        this.f51703Z = qVar;
    }

    public final Boolean a() {
        int i10 = this.f51702Y;
        boolean z10 = false;
        q qVar = this.f51703Z;
        switch (i10) {
            case 0:
                if (((C5971a) qVar.f51705Z.getValue()) != null || ((Throwable) qVar.f51706h0.getValue()) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 1:
                if (((Throwable) qVar.f51706h0.getValue()) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                if (((C5971a) qVar.f51705Z.getValue()) == null && ((Throwable) qVar.f51706h0.getValue()) == null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                if (((C5971a) qVar.f51705Z.getValue()) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f51702Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
