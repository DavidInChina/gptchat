package H0;

import Pg.C1171d;
import j0.AbstractC3893i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: H0.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715y0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public Pg.C f7140Y;

    /* renamed from: Z  reason: collision with root package name */
    public C1171d f7141Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f7142h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Pg.o f7143i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0715y0(Pg.o oVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7143i0 = oVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0715y0(this.f7143i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0715y0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x0011, TRY_LEAVE, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:11:0x0020, B:12:0x0025, B:15:0x0032, B:17:0x003a), top: B:24:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002f -> B:15:0x0032). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pg.C c10;
        C1171d c1171d;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7142h0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    c1171d = this.f7141Z;
                    c10 = this.f7140Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        jf.y yVar = (jf.y) c1171d.b();
                        A0.f6712b.set(false);
                        int i11 = AbstractC3893i.f35891e;
                        io.sentry.hints.i.h();
                        this.f7140Y = c10;
                        this.f7141Z = c1171d;
                        this.f7142h0 = 1;
                        obj = c1171d.a(this);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            R4.b.Q(c10, null);
                            return jf.y.f36177a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                c10 = this.f7143i0;
                c1171d = c10.iterator();
                this.f7140Y = c10;
                this.f7141Z = c1171d;
                this.f7142h0 = 1;
                obj = c1171d.a(this);
                if (obj == enumC5000a) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                R4.b.Q(c10, th2);
                throw th3;
            }
        }
    }
}
