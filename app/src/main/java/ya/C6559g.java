package ya;

import id.AbstractC3557B;
import jf.y;

/* renamed from: ya.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6559g extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50862Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ j0.u f50863Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6559g(j0.u uVar, int i10) {
        super(1);
        this.f50862Y = i10;
        this.f50863Z = uVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f50862Y;
        j0.u uVar = this.f50863Z;
        switch (i10) {
            case 0:
                EnumC6570r enumC6570r = (EnumC6570r) obj;
                AbstractC3557B.c0("it", enumC6570r);
                return Boolean.valueOf(uVar.contains(enumC6570r));
            default:
                EnumC6570r enumC6570r2 = (EnumC6570r) obj;
                AbstractC3557B.c0("it", enumC6570r2);
                AbstractC3557B.c0("<this>", uVar);
                if (uVar.contains(enumC6570r2)) {
                    uVar.remove(enumC6570r2);
                } else {
                    uVar.add(enumC6570r2);
                }
                return y.f36177a;
        }
    }
}
