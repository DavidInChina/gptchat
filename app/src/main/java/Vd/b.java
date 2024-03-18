package Vd;

import eh.C2907g;
import gh.C3273b;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class b extends o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f18583Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f18584h0 = new b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final b f18585i0 = new b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final b f18586j0 = new b(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18587Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f18587Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        switch (this.f18587Y) {
            case 0:
                AbstractC3557B.c0("it", (List) obj);
                return a.f18581a;
            case 1:
                invoke((C2907g) obj);
                return yVar;
            case 2:
                invoke((C2907g) obj);
                return yVar;
            default:
                invoke((C2907g) obj);
                return yVar;
        }
    }

    public final void invoke(C2907g c2907g) {
        switch (this.f18587Y) {
            case 1:
                AbstractC3557B.c0("$this$Json", c2907g);
                gh.e eVar = new gh.e();
                gh.e.a(eVar, C.f37623a.b(Object.class), new C3273b(f18583Z));
                c2907g.f29440q = new gh.d(eVar.f31638a, eVar.f31639b, eVar.f31640c, eVar.f31641d, eVar.f31642e);
                return;
            case 2:
                AbstractC3557B.c0("$this$Json", c2907g);
                c2907g.f29424a = true;
                return;
            default:
                AbstractC3557B.c0("$this$Json", c2907g);
                c2907g.f29426c = true;
                c2907g.f29427d = true;
                return;
        }
    }
}
