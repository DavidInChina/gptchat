package jc;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* renamed from: jc.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3934b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f36101Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f36102Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f36103h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3934b(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f36103h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3934b c3934b = new C3934b(this.f36103h0, abstractC4825e);
        c3934b.f36102Z = obj;
        return c3934b;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3934b) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f36101Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f36102Z;
            C5760d B10 = E9.f.B("memories");
            String str = this.f36103h0;
            if (str != null) {
                R4.b.L1(B10, "gizmo_id", str);
            }
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49811b, B10, dVar);
            this.f36101Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
