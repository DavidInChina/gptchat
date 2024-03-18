package Rd;

import Df.AbstractC0405d;
import Li.q;
import Ng.F;
import Qd.E;
import com.google.android.gms.internal.play_billing.N;
import com.segment.analytics.kotlin.core.Settings;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class k extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f15452Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Qd.i f15453Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f15454h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Qd.i iVar, j jVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15453Z = iVar;
        this.f15454h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new k(this.f15453Z, this.f15454h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Settings settings;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15452Y;
        Qd.i iVar = this.f15453Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            q e10 = iVar.f14611Z.e();
            AbstractC0405d b10 = C.f37623a.b(E.class);
            this.f15452Y = 1;
            obj = e10.a(b10, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        E e11 = (E) obj;
        if (e11 != null) {
            settings = e11.f14576b;
        } else {
            settings = null;
        }
        if (settings != null && (!e11.f14578d.isEmpty())) {
            i iVar2 = i.f15449Y;
            j jVar = this.f15454h0;
            jVar.c(settings, iVar2);
            q e12 = iVar.f14611Z.e();
            Qd.C c10 = new Qd.C(R4.b.W1(new Integer(jVar.hashCode())));
            AbstractC0405d b11 = C.f37623a.b(E.class);
            this.f15452Y = 2;
            if (e12.b(c10, b11, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
