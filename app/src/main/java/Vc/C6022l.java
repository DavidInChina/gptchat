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

/* renamed from: vc.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6022l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f47461Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f47462Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f47463h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6022l(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f47463h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6022l c6022l = new C6022l(this.f47463h0, abstractC4825e);
        c6022l.f47462Z = obj;
        return c6022l;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6022l) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47461Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B("settings/announcement_viewed");
            R4.b.L1(B10, "announcement_id", this.f47463h0);
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49812c, B10, (ge.d) this.f47462Z);
            this.f47461Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
