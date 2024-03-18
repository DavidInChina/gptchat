package pb;

import M9.i;
import Ng.F;
import Vc.q;
import Vc.r;
import Vc.w;
import Vc.x;
import com.google.android.gms.internal.play_billing.N;
import e9.C2814g;
import fa.C2969F;
import jf.y;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;
import x8.W;

/* renamed from: pb.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5112c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C5113d f42882Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f42883Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f42884h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5113d f42885i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C2969F f42886j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5112c(C5113d c5113d, C2969F c2969f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f42885i0 = c5113d;
        this.f42886j0 = c2969f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5112c c5112c = new C5112c(this.f42885i0, this.f42886j0, abstractC4825e);
        c5112c.f42884h0 = obj;
        return c5112c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5112c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Type inference failed for: r14v15, types: [Ad.h, java.lang.Object] */
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
        int i10 = this.f42883Z;
        y yVar2 = y.f36177a;
        C5113d c5113d2 = this.f42885i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    C5113d c5113d3 = this.f42882Y;
                    F f10 = (F) this.f42884h0;
                    N.B0(obj);
                    c5113d = c5113d3;
                    xVar = (x) obj;
                    if (!(xVar instanceof w)) {
                        i iVar = (i) ((w) xVar).f18565a;
                        if (!c5113d.f42889l) {
                            c5113d.f(new Object());
                        }
                    } else if (xVar instanceof r) {
                        W.W(Pc.e.a(), "Thumbs down failed", ((r) xVar).f18561a, null, 4);
                    } else {
                        if (!(xVar instanceof q)) {
                            throw new RuntimeException();
                        }
                        yVar = null;
                        if (yVar == null) {
                            W.G(Pc.e.a(), "Thumbs down failed, conversationId is null", null, 6);
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
            f6 = (F) this.f42884h0;
            N.B0(obj);
        } else {
            N.B0(obj);
            f6 = (F) this.f42884h0;
            C2814g c2814g = ((C4972C) c5113d2.f42888k).f41060o;
            this.f42884h0 = f6;
            this.f42883Z = 1;
            obj = L4.a.m0(c2814g, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        String str = ((T9.c) obj).f16966a;
        if (str != null) {
            boolean z10 = c5113d2.f42889l;
            C2969F c2969f = this.f42886j0;
            if (z10) {
                c5113d2.l(new oa.i(c2969f, 3));
            }
            String str2 = c2969f.f30008a;
            this.f42884h0 = f6;
            this.f42882Y = c5113d2;
            this.f42883Z = 2;
            Ma.d dVar = (Ma.d) c5113d2.f42887j;
            dVar.getClass();
            obj = dVar.a(str, str2, M9.c.f11726Z, null, null, this);
            c5113d = c5113d2;
            if (obj == enumC5000a) {
                return enumC5000a;
            }
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
