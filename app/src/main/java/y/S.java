package y;

import id.AbstractC3557B;
import z.C6729v0;
import z.C6731w0;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50147Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f50148Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(C6729v0 c6729v0, int i10) {
        super(1);
        this.f50147Y = i10;
        this.f50148Z = c6729v0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C6729v0 c6729v0 = this.f50148Z;
        int i10 = this.f50147Y;
        switch (i10) {
            case 0:
                return Boolean.valueOf(!AbstractC3557B.K(obj, c6729v0.f51386c.getValue()));
            case 1:
                Z.N n10 = (Z.N) obj;
                switch (i10) {
                    case 1:
                        return new C6731w0(c6729v0, 0);
                    default:
                        return new C6731w0(c6729v0, 1);
                }
            default:
                Z.N n11 = (Z.N) obj;
                switch (i10) {
                    case 1:
                        return new C6731w0(c6729v0, 0);
                    default:
                        return new C6731w0(c6729v0, 1);
                }
        }
    }
}
