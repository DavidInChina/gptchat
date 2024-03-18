package W9;

import G0.C0588q;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2592a;
import d4.AbstractC2597f;
import java.util.ArrayList;
import java.util.Iterator;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f20825Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f20826Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2592a[] f20827h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f20828i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2597f f20829j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j6, AbstractC2592a[] abstractC2592aArr, long j10, AbstractC2597f abstractC2597f, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f20826Z = j6;
        this.f20827h0 = abstractC2592aArr;
        this.f20828i0 = j10;
        this.f20829j0 = abstractC2597f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new b(this.f20826Z, this.f20827h0, this.f20828i0, this.f20829j0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((b) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20825Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                throw null;
            }
        } else {
            N.B0(obj);
            ArrayList arrayList = new ArrayList();
            AbstractC2592a[] abstractC2592aArr = this.f20827h0;
            if (abstractC2592aArr.length <= 0) {
                Iterator it = t.F2(arrayList, new C0588q(9)).iterator();
                if (!it.hasNext()) {
                    long j6 = this.f20826Z;
                    long j10 = this.f20828i0;
                    if (j6 < j10) {
                        c cVar = new c(j6, j10, this.f20829j0, null);
                        this.f20825Y = 2;
                        if (cVar.invoke(this) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                } else {
                    AbstractC2469q0.p(it.next());
                    throw null;
                }
            } else {
                AbstractC2592a abstractC2592a = abstractC2592aArr[0];
                throw null;
            }
        }
        return y.f36177a;
    }
}
