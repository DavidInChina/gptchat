package Lc;

import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import o8.AbstractC4952e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q.D1;
import u8.AbstractC5857g;
import u8.C5852b;
import u8.C5867q;

/* loaded from: classes.dex */
public final class x extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f11034Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f11035Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f11035Z = yVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new x(this.f11035Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((x) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, t7.j] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        D1 d12;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11034Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Context context = this.f11035Z.f11037a;
            synchronized (AbstractC4952e.class) {
                try {
                    if (AbstractC4952e.f40941a == null) {
                        ?? obj2 = new Object();
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        obj2.f45780a = context;
                        AbstractC4952e.f40941a = obj2.b();
                    }
                    d12 = AbstractC4952e.f40941a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o8.f fVar = (o8.f) ((AbstractC5857g) d12.f43267g).a();
            byte b10 = (byte) (((byte) 2) | 1);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((1 & b10) == 0) {
                    sb2.append(" cloudProjectNumber");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" webViewRequestMode");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            o8.u uVar = new o8.u(4906872596L);
            fVar.getClass();
            o8.p pVar = fVar.f40944a;
            pVar.f40971a.b("warmUpIntegrityToken(%s)", 4906872596L);
            N7.f fVar2 = new N7.f();
            o8.i iVar = new o8.i(pVar, fVar2, 4906872596L, fVar2);
            C5852b c5852b = pVar.f40976f;
            c5852b.getClass();
            c5852b.a().post(new C5867q(c5852b, fVar2, fVar2, iVar));
            U3.c cVar = new U3.c(fVar, 17, uVar);
            N7.m mVar = fVar2.f12723a;
            mVar.getClass();
            N7.l lVar = N7.g.f12724a;
            N7.m mVar2 = new N7.m();
            mVar.f12736b.i(new N7.j(lVar, cVar, mVar2));
            mVar.i();
            this.f11034Y = 1;
            obj = Bi.c.T(mVar2, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
