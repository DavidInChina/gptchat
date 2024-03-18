package Cc;

import Dd.W;
import Ed.i;
import Ng.F;
import Ra.l;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public String f2976Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f2977Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f2978h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2978h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f2978h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2977Z;
        d dVar = this.f2978h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str = this.f2976Y;
                    N.B0(obj);
                    dVar.l(new l(str, 28, (i) obj));
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            W w10 = dVar.f2983j;
            this.f2977Z = 1;
            obj = w10.f3548b.a(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        String str2 = (String) obj;
        W w11 = dVar.f2983j;
        this.f2976Y = str2;
        this.f2977Z = 2;
        Enum a5 = w11.a(this);
        if (a5 == enumC5000a) {
            return enumC5000a;
        }
        str = str2;
        obj = a5;
        dVar.l(new l(str, 28, (i) obj));
        return y.f36177a;
    }
}
