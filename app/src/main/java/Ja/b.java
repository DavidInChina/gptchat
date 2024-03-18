package Ja;

import b4.AbstractC2125f;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f8903Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f8904Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ p f8905h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f8906i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8905h0 = pVar;
        this.f8906i0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f8905h0, this.f8906i0, abstractC4825e);
        bVar.f8904Z = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((AbstractC2125f) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f8903Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            a aVar = new a(this.f8905h0, this.f8906i0, null);
            this.f8903Y = 1;
            if (AbstractC5260f.U((AbstractC2125f) this.f8904Z, aVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
