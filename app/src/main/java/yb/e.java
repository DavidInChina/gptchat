package Yb;

import Df.H;
import Df.w;
import Ng.F;
import Qg.F0;
import Vc.q;
import Vc.r;
import Vc.x;
import Vc.y;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import qd.C5305b;
import qd.C5306c;
import qd.C5307d;
import wf.n;
import x8.W;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f22211Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Zb.b f22212Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ y f22213h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ f f22214i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Zb.b bVar, y yVar, f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f22212Z = bVar;
        this.f22213h0 = yVar;
        this.f22214i0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f22212Z, this.f22213h0, this.f22214i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f22211Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            y yVar = this.f22213h0;
            Zb.f fVar = new Zb.f(yVar.f18570e, yVar.f18566a, yVar.f18571f, yVar.f18572g, String.valueOf(yVar.f18573h));
            this.f22211Y = 1;
            Zb.b bVar = this.f22212Z;
            bVar.getClass();
            Zb.a aVar = new Zb.a(fVar, null);
            w a5 = C.a(Zb.i.class);
            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(Zb.i.class), a5);
            Yc.n nVar = bVar.f23645a;
            nVar.getClass();
            obj = W.S(nVar, n22, aVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        x xVar = (x) obj;
        if (xVar instanceof Vc.w) {
            Zb.i iVar = (Zb.i) ((Vc.w) xVar).f18565a;
            F0 f02 = this.f22214i0.f22215a;
            int ordinal = iVar.f23657a.ordinal();
            String str = iVar.f23658b;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        obj2 = C5307d.f44066a;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    obj2 = new C5306c(str);
                }
            } else {
                obj2 = new C5305b(str, iVar.f23660d, iVar.f23659c);
            }
            f02.setValue(obj2);
        } else if (xVar instanceof r) {
            Pc.c a10 = Pc.e.a();
            W.W(a10, "Sunset check failed: " + ((r) xVar), null, null, 6);
        } else if (!(xVar instanceof q)) {
            throw new RuntimeException();
        }
        return jf.y.f36177a;
    }
}
