package pb;

import fa.C2969F;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import sb.u;
import sb.v;
import sb.w;
import wf.k;

/* renamed from: pb.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5110a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5110a f42871Z = new C5110a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5110a f42872h0 = new C5110a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5110a f42873i0 = new C5110a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C5110a f42874j0 = new C5110a(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C5110a f42875k0 = new C5110a(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42876Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5110a(int i10) {
        super(1);
        this.f42876Y = i10;
    }

    public final w a(w wVar) {
        v vVar = v.f45527a;
        switch (this.f42876Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", wVar);
                return vVar;
            case 1:
                AbstractC3557B.c0("$this$setState", wVar);
                if (wVar instanceof u) {
                    u uVar = (u) wVar;
                    C2969F c2969f = uVar.f45524a;
                    AbstractC3557B.c0("message", c2969f);
                    M9.c cVar = uVar.f45525b;
                    AbstractC3557B.c0("rating", cVar);
                    return new u(c2969f, cVar, true);
                }
                return wVar;
            case 2:
                AbstractC3557B.c0("$this$setState", wVar);
                return vVar;
            case 3:
                AbstractC3557B.c0("$this$setState", wVar);
                return vVar;
            default:
                AbstractC3557B.c0("$this$setState", wVar);
                return vVar;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f42876Y) {
            case 0:
                return a((w) obj);
            case 1:
                return a((w) obj);
            case 2:
                return a((w) obj);
            case 3:
                return a((w) obj);
            default:
                return a((w) obj);
        }
    }
}
