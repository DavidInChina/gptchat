package uc;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6461B;

/* renamed from: uc.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5898p extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46657Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5900r f46658Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f46659h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5898p(C5900r c5900r, List list, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46658Z = c5900r;
        this.f46659h0 = list;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5898p(this.f46658Z, this.f46659h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5898p) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46657Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5889g c5889g = this.f46658Z.f46668d;
            C6461B c6461b = new C6461B(15, this.f46659h0);
            this.f46657Y = 1;
            if (c5889g.b(c6461b, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
