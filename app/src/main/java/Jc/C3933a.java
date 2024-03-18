package jc;

import A.AbstractC0044t0;
import Df.H;
import Df.w;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import ic.W;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.AbstractC6414c;
import xe.C6396A;
import ze.AbstractC6848g;

/* renamed from: jc.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3933a extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f36097Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f36098Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f36099h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3942j f36100i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3933a(String str, C3942j c3942j, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f36099h0 = str;
        this.f36100i0 = c3942j;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3933a c3933a = new C3933a(this.f36099h0, this.f36100i0, abstractC4825e);
        c3933a.f36098Z = obj;
        return c3933a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3933a) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f36097Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f36098Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "memories", new W(this.f36100i0, 1), 7);
            C3945m c3945m = new C3945m(this.f36099h0);
            if (c3945m instanceof AbstractC6848g) {
                c5760d.f46128d = c3945m;
                c5760d.b(null);
            } else {
                c5760d.f46128d = c3945m;
                w a5 = C.a(C3945m.class);
                AbstractC2469q0.s(C.f37623a, C3945m.class, H.O(a5), a5, c5760d);
            }
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49815f, c5760d, dVar);
            this.f36097Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
