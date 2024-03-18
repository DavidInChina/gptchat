package vc;

import A.AbstractC0044t0;
import Df.H;
import Df.w;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
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

/* renamed from: vc.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6020j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f47455Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f47456Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f47457h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f47458i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6020j(String str, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f47457h0 = str;
        this.f47458i0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6020j c6020j = new C6020j(this.f47457h0, abstractC4825e, this.f47458i0);
        c6020j.f47456Z = obj;
        return c6020j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6020j) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47455Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f47456Z;
            C5760d B10 = E9.f.B("settings/clear_account_user_memory");
            C6016f c6016f = new C6016f(this.f47457h0, this.f47458i0);
            if (c6016f instanceof AbstractC6848g) {
                B10.f46128d = c6016f;
                B10.b(null);
            } else {
                B10.f46128d = c6016f;
                w a5 = C.a(C6016f.class);
                AbstractC2469q0.s(C.f37623a, C6016f.class, H.O(a5), a5, B10);
            }
            AbstractC3557B.m0(B10, AbstractC6414c.f49880a);
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49815f, B10, dVar);
            this.f47455Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
