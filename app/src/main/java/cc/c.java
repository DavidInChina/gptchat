package Cc;

import Dd.W;
import Ed.i;
import Id.h;
import Id.j;
import Id.l;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.Y0;
import com.google.android.gms.internal.play_billing.N;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;
import wf.k;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements k {

    /* renamed from: Y  reason: collision with root package name */
    public int f2980Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ d f2981Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f2982h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, j jVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f2981Z = dVar;
        this.f2982h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new c(this.f2981Z, this.f2982h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((c) create((AbstractC4825e) obj)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2980Y;
        y yVar = y.f36177a;
        j jVar = this.f2982h0;
        d dVar = this.f2981Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            W w10 = dVar.f2983j;
            i iVar = ((h) jVar).f8554a;
            this.f2980Y = 1;
            w10.getClass();
            Object e10 = ((C5451O) w10.f3549c).e(iVar.f4682Y, this);
            if (e10 != enumC5000a) {
                e10 = yVar;
            }
            if (e10 == enumC5000a) {
                return enumC5000a;
            }
        }
        AbstractC1805k0 a5 = AbstractC1809m0.a();
        Y0 y02 = Y0.f23313z;
        C3959i[] c3959iArr = new C3959i[2];
        i iVar2 = ((h) jVar).f8554a;
        boolean z10 = false;
        c3959iArr[0] = new C3959i("selected_voice_name", iVar2.f4682Y);
        if (iVar2 == ((l) dVar.f808e.getValue()).f8558b) {
            z10 = true;
        }
        c3959iArr[1] = new C3959i("was_default_voice", Boolean.valueOf(z10));
        a5.b(y02, AbstractC4268D.a1(c3959iArr));
        return yVar;
    }
}
