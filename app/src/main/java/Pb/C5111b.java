package pb;

import M9.i;
import Ng.F;
import Vc.q;
import Vc.w;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import e9.C2814g;
import jf.y;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import sb.r;
import wf.n;
import x8.W;

/* renamed from: pb.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5111b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C5113d f42877Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f42878Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f42879h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5113d f42880i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ r f42881j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5111b(C5113d c5113d, r rVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42880i0 = c5113d;
        this.f42881j0 = rVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5111b c5111b = new C5111b(this.f42880i0, this.f42881j0, abstractC4825e);
        c5111b.f42879h0 = obj;
        return c5111b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5111b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Type inference failed for: r15v16, types: [Ad.h, java.lang.Object] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y yVar;
        C5113d c5113d;
        x xVar;
        F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f42878Z;
        y yVar2 = y.f36177a;
        C5113d c5113d2 = this.f42880i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    c5113d = this.f42877Y;
                    F f10 = (F) this.f42879h0;
                    N.B0(obj);
                    xVar = (x) obj;
                    if (!(xVar instanceof w)) {
                        i iVar = (i) ((w) xVar).f18565a;
                        c5113d.l(C5110a.f42873i0);
                        c5113d.f(new Object());
                    } else if (xVar instanceof Vc.r) {
                        c5113d.l(C5110a.f42874j0);
                        W.W(Pc.e.a(), "Detailed feedback failed", ((Vc.r) xVar).f18561a, null, 4);
                    } else {
                        if (!(xVar instanceof q)) {
                            throw new RuntimeException();
                        }
                        yVar = null;
                        if (yVar == null) {
                            c5113d2.l(C5110a.f42875k0);
                            W.G(Pc.e.a(), "Detailed feedback failed, conversationId is null", null, 6);
                        }
                        return yVar2;
                    }
                    yVar = yVar2;
                    if (yVar == null) {
                    }
                    return yVar2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f6 = (F) this.f42879h0;
            N.B0(obj);
        } else {
            N.B0(obj);
            f6 = (F) this.f42879h0;
            C2814g c2814g = ((C4972C) c5113d2.f42888k).f41060o;
            this.f42879h0 = f6;
            this.f42878Z = 1;
            obj = L4.a.m0(c2814g, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        String str = ((T9.c) obj).f16966a;
        if (str != null) {
            K9.a aVar = c5113d2.f42887j;
            r rVar = this.f42881j0;
            String str2 = rVar.f45519a.f30008a;
            this.f42879h0 = f6;
            this.f42877Y = c5113d2;
            this.f42878Z = 2;
            obj = ((Ma.d) aVar).a(str, str2, rVar.f45520b, rVar.f45521c, rVar.f45522d, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            c5113d = c5113d2;
            xVar = (x) obj;
            if (!(xVar instanceof w)) {
            }
            yVar = yVar2;
            if (yVar == null) {
            }
            return yVar2;
        }
        yVar = null;
        if (yVar == null) {
        }
        return yVar2;
    }
}
