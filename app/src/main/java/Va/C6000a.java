package va;

import B.H;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;

/* renamed from: va.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6000a extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f47418Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6004e f47419Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6000a(C6004e c6004e, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f47419Z = c6004e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C6000a(this.f47419Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C6000a) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f47418Y;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f47418Y = 1;
            H h10 = this.f47419Z.f47427a;
            Object r10 = AbstractC4828h.r(h10, Boolean.valueOf(!((Boolean) h10.f1086f.getValue()).booleanValue()), h10.f1089i.h(), this);
            if (r10 != enumC5000a) {
                r10 = yVar;
            }
            if (r10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
