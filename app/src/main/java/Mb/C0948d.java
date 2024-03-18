package Mb;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import b9.EnumC2132a;
import com.openai.chatgpt.R;
import f9.C2958j;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Mb.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11905Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0954g f11906Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f11907h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ EnumC2132a f11908i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f11909j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948d(C0954g c0954g, Context context, EnumC2132a enumC2132a, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11906Z = c0954g;
        this.f11907h0 = context;
        this.f11908i0 = enumC2132a;
        this.f11909j0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0948d(this.f11906Z, this.f11907h0, this.f11908i0, this.f11909j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0948d) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        wd.t0 t0Var;
        String str;
        V v10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11905Y;
        C0954g c0954g = this.f11906Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                wd.v0 v0Var = (wd.v0) obj;
                z10 = v0Var instanceof wd.u0;
                C0954g c0954g2 = this.f11906Z;
                Context context = this.f11907h0;
                EnumC2132a enumC2132a = this.f11908i0;
                boolean z11 = this.f11909j0;
                if (!z10) {
                    String str2 = ((nd.m) ((wd.u0) v0Var).f48468a).f40292a;
                    this.f11905Y = 3;
                    Intent intent = C0954g.f11933q;
                    if (c0954g2.o(context, enumC2132a, str2, null, z11, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    boolean z12 = q0Var instanceof wd.t0;
                    String str3 = null;
                    if (z12) {
                        t0Var = (wd.t0) q0Var;
                    } else {
                        t0Var = null;
                    }
                    if (t0Var != null) {
                        str3 = t0Var.f48465d;
                    }
                    if (str3 != null) {
                        C0942a c0942a = C0942a.f11880i0;
                        Intent intent2 = C0954g.f11933q;
                        c0954g2.l(c0942a);
                        if (q0Var.f48450a instanceof Kc.a) {
                            v10 = new V(str3, 3, ((C2958j) c0954g2.f11936l).a(R.string.onboarding_error_action_label), C0954g.f11933q);
                        } else {
                            v10 = new V(str3, 2, 12);
                        }
                        c0954g2.f(v10);
                    } else {
                        Intent intent3 = C0954g.f11933q;
                        c0954g2.getClass();
                        if (z12) {
                            wd.t0 t0Var2 = (wd.t0) q0Var;
                            Integer num = t0Var2.f48463b;
                            String str4 = t0Var2.f48464c;
                            if (str4 == null) {
                                str4 = "";
                            }
                            str = "service " + num + Separators.SP + str4;
                        } else if (q0Var instanceof wd.r0) {
                            str = "network";
                        } else {
                            str = "other";
                        }
                        String str5 = str;
                        this.f11905Y = 4;
                        if (c0954g2.o(context, enumC2132a, null, str5, z11, this) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C0942a c0942a2 = C0942a.f11879h0;
            Intent intent4 = C0954g.f11933q;
            c0954g.l(c0942a2);
            this.f11905Y = 1;
            if (c0954g.f11940p.F(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f11905Y = 2;
        obj = C0954g.n(c0954g, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        wd.v0 v0Var2 = (wd.v0) obj;
        z10 = v0Var2 instanceof wd.u0;
        C0954g c0954g22 = this.f11906Z;
        Context context2 = this.f11907h0;
        EnumC2132a enumC2132a2 = this.f11908i0;
        boolean z112 = this.f11909j0;
        if (!z10) {
        }
        return jf.y.f36177a;
    }
}
