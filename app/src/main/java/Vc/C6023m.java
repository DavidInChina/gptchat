package vc;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* renamed from: vc.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6023m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f47464Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f47465Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f47466h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f47467i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6023m(String str, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f47466h0 = str;
        this.f47467i0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6023m c6023m = new C6023m(this.f47466h0, this.f47467i0, abstractC4825e);
        c6023m.f47465Z = obj;
        return c6023m;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6023m) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47464Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B("settings/account_user_setting");
            R4.b.L1(B10, "feature", this.f47466h0);
            R4.b.L1(B10, "value", this.f47467i0);
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49814e, B10, (ge.d) this.f47465Z);
            this.f47464Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
