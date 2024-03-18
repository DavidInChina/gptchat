package kd;

import Df.H;
import com.google.android.gms.internal.play_billing.N;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: kd.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4254r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37343Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4255s f37344Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4254r(C4255s c4255s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37344Z = c4255s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4254r(this.f37344Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4254r) create(Integer.valueOf(((Number) obj).intValue()), (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37343Y;
        C4255s c4255s = this.f37344Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C4241e c4241e = c4255s.f37349b;
            this.f37343Y = 1;
            c4241e.getClass();
            ?? abstractC5163j = new AbstractC5163j(2, null);
            Df.w a5 = C.a(C4239c.class);
            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(C4239c.class), a5);
            Yc.a aVar = c4241e.f37301a;
            aVar.getClass();
            obj = W.S(aVar, n22, abstractC5163j, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        Vc.x xVar = (Vc.x) obj;
        if (xVar instanceof Vc.w) {
            C4239c c4239c = (C4239c) ((Vc.w) xVar).f18565a;
            c4255s.e(c4239c.f37297a, c4239c.f37298b);
        } else if (!(xVar instanceof Vc.r)) {
            if (!(xVar instanceof Vc.q)) {
                throw new RuntimeException();
            }
        } else {
            Vc.r rVar = (Vc.r) xVar;
            W.W(Pc.e.a(), "Websocket connection failure", rVar.f18561a, null, 4);
            throw rVar.f18561a;
        }
        return jf.y.f36177a;
    }
}
