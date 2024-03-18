package xc;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import e9.C2814g;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.EnumC6181c;
import wf.n;

/* renamed from: xc.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6394c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f49793Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f49794Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ EnumC6181c f49795h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ ExperimentKey.BooleanKey f49796i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6394c(e eVar, EnumC6181c enumC6181c, ExperimentKey.BooleanKey booleanKey, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f49794Z = eVar;
        this.f49795h0 = enumC6181c;
        this.f49796i0 = booleanKey;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6394c(this.f49794Z, this.f49795h0, this.f49796i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6394c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f49793Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C2814g a5 = this.f49794Z.a(this.f49795h0, this.f49796i0);
            this.f49793Y = 1;
            obj = L4.a.m0(a5, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
