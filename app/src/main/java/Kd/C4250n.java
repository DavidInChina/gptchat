package kd;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import ed.C2877c;
import na.L0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: kd.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4250n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37330Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37331Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4255s f37332h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4250n(C4255s c4255s, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37332h0 = c4255s;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4250n c4250n = new C4250n(this.f37332h0, abstractC4825e);
        c4250n.f37331Z = obj;
        return c4250n;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4250n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [wf.n, kotlin.jvm.internal.j] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37330Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C4255s c4255s = this.f37332h0;
            L4.a.E0(L4.a.F0(new C4248l(c4255s, null), ((C2877c) c4255s.f37348a).f29281c), (F) this.f37331Z);
            Rg.o V02 = L4.a.V0(((C2877c) c4255s.f37348a).f29281c, new L0((AbstractC4825e) null, c4255s, 3));
            ?? jVar = new kotlin.jvm.internal.j(2, this.f37332h0, C4255s.class, "connectToWebSocket", "connectToWebSocket(Lcom/openai/platform/websockets/impl/WebSocketConnectionInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            this.f37330Y = 1;
            if (L4.a.b0(V02, jVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
