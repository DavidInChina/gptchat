package Kd;

import Dd.AbstractC0392m;
import Dd.C0385f;
import Dd.C0398t;
import Qg.r0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public String f9645Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9646Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ byte[] f9647h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ I f9648i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(I i10, AbstractC4825e abstractC4825e, byte[] bArr) {
        super(2, abstractC4825e);
        this.f9647h0 = bArr;
        this.f9648i0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B(this.f9648i0, abstractC4825e, this.f9647h0);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Exception e10;
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9646Z;
        I i11 = this.f9648i0;
        if (i10 != 0) {
            if (i10 == 1) {
                str = this.f9645Y;
                try {
                    N.B0(obj);
                } catch (Exception e11) {
                    e10 = e11;
                    i11.f9691n.a("Unable to handle voice mode message", e10, P4.a.o0(new C3959i("message", str)));
                    return jf.y.f36177a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            String str2 = new String(this.f9647h0, Lg.a.f11131a);
            try {
                Dd.K k10 = (Dd.K) md.b.f39132a.b(Dd.K.Companion.serializer(), str2);
                int ordinal = k10.f3521a.ordinal();
                AbstractC0392m abstractC0392m = k10.f3522b;
                if (ordinal != 0) {
                    str2 = str2;
                    if (ordinal == 2) {
                        AbstractC3557B.a0("null cannot be cast to non-null type com.openai.voice.api.ConversationUpdate", abstractC0392m);
                        C0385f c0385f = (C0385f) abstractC0392m;
                        Pc.g gVar = i11.f9691n;
                        W.F(gVar, "Received conversation update " + c0385f, null, 6);
                        r0 r0Var = i11.f9695r;
                        this.f9645Y = str2;
                        this.f9646Z = 1;
                        Object c10 = r0Var.c(c0385f, this);
                        str2 = c10;
                        if (c10 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                } else {
                    AbstractC3557B.a0("null cannot be cast to non-null type com.openai.voice.api.StateUpdate", abstractC0392m);
                    I.a(i11, (C0398t) abstractC0392m);
                    str2 = str2;
                }
            } catch (Exception e12) {
                str = str2;
                e10 = e12;
                i11.f9691n.a("Unable to handle voice mode message", e10, P4.a.o0(new C3959i("message", str)));
                return jf.y.f36177a;
            }
        }
        return jf.y.f36177a;
    }
}
