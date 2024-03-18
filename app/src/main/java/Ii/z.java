package Ii;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8710Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ A f8711Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f8712h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(A a5, String str, int i10) {
        super(0);
        this.f8710Y = i10;
        this.f8711Z = a5;
        this.f8712h0 = str;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        x xVar = x.f8702j0;
        x xVar2 = x.f8703k0;
        String str = this.f8712h0;
        A a5 = this.f8711Z;
        int i10 = this.f8710Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        AbstractC3557B.b0("activityClassName", str);
                        a5.d(str, xVar);
                        break;
                    default:
                        AbstractC3557B.b0("activityClassName", str);
                        a5.d(str, xVar2);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        AbstractC3557B.b0("activityClassName", str);
                        a5.d(str, xVar);
                        break;
                    default:
                        AbstractC3557B.b0("activityClassName", str);
                        a5.d(str, xVar2);
                        break;
                }
                return yVar;
        }
    }
}
