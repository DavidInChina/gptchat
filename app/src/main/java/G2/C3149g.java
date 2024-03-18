package g2;

import android.content.Context;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: g2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3149g extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31087Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31088Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f31089h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31090i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f31091j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3149g(Context context, wf.k kVar, wf.k kVar2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31089h0 = context;
        this.f31090i0 = kVar;
        this.f31091j0 = kVar2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3149g c3149g = new C3149g(this.f31089h0, this.f31090i0, this.f31091j0, abstractC4825e);
        c3149g.f31088Z = obj;
        return c3149g;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3149g) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        C3146d c3146d;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31087Y;
        Context context = this.f31089h0;
        if (i10 != 0) {
            if (i10 == 1) {
                c3146d = (C3146d) this.f31088Z;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    context.unregisterReceiver(c3146d);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C3146d c3146d2 = new C3146d(new C3148f((Ng.F) this.f31088Z, this.f31091j0, 0));
            context.registerReceiver(c3146d2, C3146d.f31080c);
            try {
                c3146d2.a(context);
                wf.k kVar = this.f31090i0;
                this.f31088Z = c3146d2;
                this.f31087Y = 1;
                obj = kVar.invoke(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                c3146d = c3146d2;
            } catch (Throwable th4) {
                th2 = th4;
                c3146d = c3146d2;
                context.unregisterReceiver(c3146d);
                throw th2;
            }
        }
        context.unregisterReceiver(c3146d);
        return obj;
    }
}
