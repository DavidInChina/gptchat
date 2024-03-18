package rc;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import wd.C6189g;

/* renamed from: rc.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5456e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44860Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5438B f44861Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5463l f44862h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5456e(C5438B c5438b, C5463l c5463l, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44861Z = c5438b;
        this.f44862h0 = c5463l;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5456e(this.f44861Z, this.f44862h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5456e) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5426p l02;
        C5455d c5455d;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44860Y;
        C5438B c5438b = this.f44861Z;
        C5463l c5463l = this.f44862h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        l02 = L4.a.l0(c5463l.f44904a.f44961e);
                        c5455d = new C5455d(c5463l, null);
                        this.f44860Y = 5;
                        if (L4.a.b0(l02, c5455d, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        return jf.y.f36177a;
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f44860Y = 4;
                    if (c5463l.d(this) == enumC5000a) {
                        return enumC5000a;
                    }
                    l02 = L4.a.l0(c5463l.f44904a.f44961e);
                    c5455d = new C5455d(c5463l, null);
                    this.f44860Y = 5;
                    if (L4.a.b0(l02, c5455d, this) == enumC5000a) {
                    }
                    return jf.y.f36177a;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                this.f44860Y = 3;
                if (c5438b.a(this) == enumC5000a) {
                    return enumC5000a;
                }
                this.f44860Y = 4;
                if (c5463l.d(this) == enumC5000a) {
                }
                l02 = L4.a.l0(c5463l.f44904a.f44961e);
                c5455d = new C5455d(c5463l, null);
                this.f44860Y = 5;
                if (L4.a.b0(l02, c5455d, this) == enumC5000a) {
                }
                return jf.y.f36177a;
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f44860Y = 1;
            obj = L4.a.m0(c5438b.f44961e, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C5465n c5465n = c5463l.f44904a;
        Ra.l lVar = new Ra.l((C6189g) obj, 24, c5463l);
        this.f44860Y = 2;
        if (c5465n.b(lVar, this) == enumC5000a) {
            return enumC5000a;
        }
        this.f44860Y = 3;
        if (c5438b.a(this) == enumC5000a) {
        }
        this.f44860Y = 4;
        if (c5463l.d(this) == enumC5000a) {
        }
        l02 = L4.a.l0(c5463l.f44904a.f44961e);
        c5455d = new C5455d(c5463l, null);
        this.f44860Y = 5;
        if (L4.a.b0(l02, c5455d, this) == enumC5000a) {
        }
        return jf.y.f36177a;
    }
}
