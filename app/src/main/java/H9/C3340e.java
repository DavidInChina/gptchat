package h9;

import G0.C0571a;
import Kd.I;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.o;

/* renamed from: h9.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3340e extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31963Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f31964Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3340e(Object obj, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f31963Y = i10;
        this.f31964Z = obj;
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f31963Y) {
            case 0:
                AbstractC1207j abstractC1207j = (AbstractC1207j) obj;
                Throwable th2 = (Throwable) obj2;
                return p((AbstractC4825e) obj3);
            default:
                AbstractC1207j abstractC1207j2 = (AbstractC1207j) obj;
                Throwable th3 = (Throwable) obj2;
                return p((AbstractC4825e) obj3);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        y yVar = y.f36177a;
        int i10 = this.f31963Y;
        Object obj2 = this.f31964Z;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                N.B0(obj);
                C3341f c3341f = (C3341f) obj2;
                c3341f.f31967c.a(new C0571a(27, c3341f));
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                N.B0(obj);
                ((I) obj2).f9682e.a(false);
                return yVar;
        }
    }

    public final Object p(AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        int i10 = this.f31963Y;
        Object obj = this.f31964Z;
        switch (i10) {
            case 0:
                new C3340e((C3341f) obj, abstractC4825e, 0).invokeSuspend(yVar);
                return yVar;
            default:
                new C3340e((I) obj, abstractC4825e, 1).invokeSuspend(yVar);
                return yVar;
        }
    }
}
