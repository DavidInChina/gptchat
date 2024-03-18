package ta;

import android.net.Uri;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6784a;
import za.C6807x;

/* renamed from: ta.L  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5696L extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f45830Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f45831Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ X f45832h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5696L(X x10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f45832h0 = x10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5696L c5696l = new C5696L(this.f45832h0, abstractC4825e);
        c5696l.f45831Z = obj;
        return c5696l;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5696L) create((C6807x) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45830Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6807x c6807x = (C6807x) this.f45831Z;
            C6784a c6784a = c6807x.f51808e;
            if (c6784a != null) {
                C5705d c5705d = C5705d.f45924w0;
                Uri uri2 = c6784a.f51778d;
                X x10 = this.f45832h0;
                boolean z10 = c6807x.f51807d;
                if (z10 && (uri = c6784a.f51777c) != null && c6784a.f51775a != null && c6784a.f51776b != null && uri2 != null) {
                    this.f45830Y = 1;
                    x10.getClass();
                    x10.m(uri, Jc.E.f9043j0, c6784a.f51775a, c6784a.f51776b, c6784a.f51778d);
                    x10.f45864k.a(c5705d);
                    if (yVar == enumC5000a) {
                        return enumC5000a;
                    }
                } else if (z10 && c6784a.f51779e) {
                    this.f45830Y = 2;
                    x10.getClass();
                    if (uri2 != null) {
                        x10.m(uri2, Jc.E.f9042i0, null, null, null);
                        x10.f45864k.a(c5705d);
                    }
                    if (yVar == enumC5000a) {
                        return enumC5000a;
                    }
                }
            }
        }
        return yVar;
    }
}
