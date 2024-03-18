package fh;

import jf.C3952b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;

/* renamed from: fh.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3063F extends AbstractC5161h implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public int f30808Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ C3952b f30809h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3065H f30810i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3063F(C3065H c3065h, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f30810i0 = c3065h;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = (jf.y) obj2;
        C3063F c3063f = new C3063F(this.f30810i0, (AbstractC4825e) obj3);
        c3063f.f30809h0 = (C3952b) obj;
        return c3063f.invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f30808Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C3952b c3952b = this.f30809h0;
            C3065H c3065h = this.f30810i0;
            byte w10 = c3065h.f30818a.w();
            if (w10 == 1) {
                return c3065h.d(true);
            }
            if (w10 == 0) {
                return c3065h.d(false);
            }
            if (w10 == 6) {
                this.f30808Z = 1;
                obj = C3065H.a(c3065h, c3952b, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else if (w10 == 8) {
                return c3065h.c();
            } else {
                AbstractC3074a.r(c3065h.f30818a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
