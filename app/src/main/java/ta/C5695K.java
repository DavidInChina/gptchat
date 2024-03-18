package ta;

import android.app.Application;
import android.net.Uri;
import com.openai.files.ChatFileProvider;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5045j;
import pf.AbstractC5163j;
import x9.C6383b;
import za.C6791h;
import za.C6793j;
import za.EnumC6785b;

/* renamed from: ta.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5695K extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45827Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X f45828Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ EnumC6785b f45829h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5695K(X x10, EnumC6785b enumC6785b, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45828Z = x10;
        this.f45829h0 = enumC6785b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5695K(this.f45828Z, this.f45829h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C5695K) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45827Y;
        X x10 = this.f45828Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ia.j jVar = ((rc.Q) x10.f45865l).f44819b;
            this.f45827Y = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        boolean z10 = ((zd.n) obj).f51987f;
        EnumC6785b enumC6785b = this.f45829h0;
        if (z10) {
            int ordinal = enumC6785b.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    x10.f(C6791h.f51788a);
                }
            } else {
                Sa.f fVar = (Sa.f) x10.f45863j;
                fVar.getClass();
                int i11 = ChatFileProvider.f27707l0;
                Application application = fVar.f16463Y;
                AbstractC3557B.c0("context", application);
                Uri c10 = AbstractC5045j.c(application, android.gov.nist.core.a.g(application.getPackageName(), ".files"), fVar.i());
                AbstractC3557B.b0("getUriForFile(...)", c10);
                x10.l(new C6383b(18, c10));
                x10.f(new C6793j(c10));
            }
        } else {
            x10.l(new C6383b(19, enumC6785b));
        }
        return jf.y.f36177a;
    }
}
