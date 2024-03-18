package H;

import Df.AbstractC0406e;
import id.AbstractC3557B;
import java.util.List;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class H extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6573Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f6574Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i10, List list) {
        super(0);
        this.f6573Y = i10;
        this.f6574Z = list;
    }

    public final AbstractC0406e a() {
        int i10 = this.f6573Y;
        List list = this.f6574Z;
        switch (i10) {
            case 6:
                return ((Df.w) list.get(0)).e();
            case 7:
                return ((Df.w) list.get(0)).e();
            default:
                return ((Df.w) list.get(0)).e();
        }
    }

    public final Integer c() {
        int i10 = this.f6573Y;
        List list = this.f6574Z;
        switch (i10) {
            case 0:
                Object obj = list.get(2);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Int", obj);
                return (Integer) obj;
            case 1:
                return Integer.valueOf(list.size());
            default:
                return Integer.valueOf(list.size());
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f6573Y;
        List list = this.f6574Z;
        switch (i10) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return c();
            case 3:
            case 4:
            case 5:
                return list;
            case 6:
                return a();
            case 7:
                return a();
            case 8:
                return a();
            default:
                return list;
        }
    }
}
