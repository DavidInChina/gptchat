package Tc;

import Ng.F;
import W.A3;
import W.C1590n3;
import W.C1600p3;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17050Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f17051Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f17052h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f17053i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f17054j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f17055k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, int i10, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17051Z = fVar;
        this.f17052h0 = str;
        this.f17053i0 = str2;
        this.f17054j0 = i10;
        this.f17055k0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new e(this.f17051Z, this.f17052h0, this.f17053i0, this.f17054j0, this.f17055k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17050Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C1600p3 c1600p3 = this.f17051Z.f17058c;
            this.f17050Y = 1;
            c1600p3.getClass();
            obj = c1600p3.a(new C1590n3(this.f17052h0, this.f17053i0, this.f17054j0), this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (d.f17049a[((A3) obj).ordinal()] == 1) {
            this.f17055k0.mo122invoke();
        }
        return jf.y.f36177a;
    }
}
