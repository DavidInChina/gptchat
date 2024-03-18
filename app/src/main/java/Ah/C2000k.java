package ah;

import Df.AbstractC0405d;
import H.H;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* renamed from: ah.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000k extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2000k f24207Z = new C2000k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2000k f24208h0 = new C2000k(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24209Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2000k(int i10) {
        super(2);
        this.f24209Y = i10;
    }

    public final KSerializer a(AbstractC0405d abstractC0405d, List list) {
        switch (this.f24209Y) {
            case 0:
                AbstractC3557B.c0("clazz", abstractC0405d);
                AbstractC3557B.c0("types", list);
                ArrayList H12 = Bi.c.H1(gh.f.f31643a, list, true);
                AbstractC3557B.Z(H12);
                return Bi.c.u1(abstractC0405d, H12, new H(6, list));
            default:
                AbstractC3557B.c0("clazz", abstractC0405d);
                AbstractC3557B.c0("types", list);
                ArrayList H13 = Bi.c.H1(gh.f.f31643a, list, true);
                AbstractC3557B.Z(H13);
                KSerializer u12 = Bi.c.u1(abstractC0405d, H13, new H(7, list));
                if (u12 != null) {
                    return A7.b.U0(u12);
                }
                return null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24209Y) {
            case 0:
                return a((AbstractC0405d) obj, (List) obj2);
            default:
                return a((AbstractC0405d) obj, (List) obj2);
        }
    }
}
