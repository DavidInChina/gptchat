package B;

import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: B.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134j extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f1360Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.B f1361Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f1362h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f1363i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1364j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134j(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1364j0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0134j c0134j = new C0134j(this.f1364j0, abstractC4825e);
        c0134j.f1363i0 = obj;
        return c0134j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0134j) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:29|30|(1:32)|(1:34)|13|52|35|(2:41|(2:43|(1:45)))(2:37|(1:39))|18|(1:50)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: CancellationException -> 0x00d1, TryCatch #0 {CancellationException -> 0x00d1, blocks: (B:35:0x00b6, B:37:0x00bc, B:41:0x00d3, B:43:0x00d7), top: B:52:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3 A[Catch: CancellationException -> 0x00d1, TryCatch #0 {CancellationException -> 0x00d1, blocks: (B:35:0x00b6, B:37:0x00bc, B:41:0x00d3, B:43:0x00d7), top: B:52:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ce -> B:18:0x0057). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d5 -> B:18:0x0057). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e2 -> B:18:0x0057). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f0 -> B:10:0x0029). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f3 -> B:18:0x0057). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        Ng.F f10;
        kotlin.jvm.internal.B b10;
        Object a5;
        Ng.F f11;
        kotlin.jvm.internal.B b11;
        kotlin.jvm.internal.B b12;
        Object obj2;
        Ng.F f12;
        Object obj3;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1362h0;
        jf.y yVar = jf.y.f36177a;
        AbstractC0137k abstractC0137k = this.f1364j0;
        switch (i10) {
            case 0:
                com.google.android.gms.internal.play_billing.N.B0(obj);
                f12 = (Ng.F) this.f1363i0;
                if (Ad.l.F0(f12)) {
                    ?? obj4 = new Object();
                    Pg.k kVar = abstractC0137k.f1379G0;
                    this.f1363i0 = f12;
                    this.f1360Y = obj4;
                    this.f1361Z = obj4;
                    this.f1362h0 = 1;
                    Object g10 = kVar.g(this);
                    if (g10 == enumC5000a) {
                        return enumC5000a;
                    }
                    f11 = f12;
                    obj = g10;
                    b11 = obj4;
                    b12 = obj4;
                    b12.f37622Y = obj;
                    obj2 = b11.f37622Y;
                    if (!(obj2 instanceof C0117d0)) {
                        this.f1363i0 = f11;
                        this.f1360Y = b11;
                        this.f1361Z = null;
                        this.f1362h0 = 2;
                        if (AbstractC0137k.C0(abstractC0137k, f11, (C0117d0) obj2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        b10 = b11;
                        f10 = f11;
                        C0131i c0131i = new C0131i(b10, abstractC0137k, null);
                        this.f1363i0 = f10;
                        this.f1360Y = b10;
                        this.f1362h0 = 3;
                        J0 j02 = (J0) abstractC0137k;
                        a5 = j02.f1109I0.a(new I0(j02, c0131i, null), this);
                        if (a5 != EnumC5000a.f41328Y) {
                            a5 = yVar;
                        }
                        if (a5 == enumC5000a) {
                            return enumC5000a;
                        }
                        f12 = f10;
                        obj3 = b10.f37622Y;
                        if (obj3 instanceof C0120e0) {
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped", obj3);
                            this.f1363i0 = f12;
                            this.f1360Y = null;
                            this.f1362h0 = 4;
                            if (AbstractC0137k.D0(abstractC0137k, f12, (C0120e0) obj3, this) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else if (obj3 instanceof C0111b0) {
                            this.f1363i0 = f12;
                            this.f1360Y = null;
                            this.f1362h0 = 5;
                            if (AbstractC0137k.B0(abstractC0137k, this, f12) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        if (Ad.l.F0(f12)) {
                            return yVar;
                        }
                    } else {
                        f12 = f11;
                        if (Ad.l.F0(f12)) {
                        }
                    }
                }
            case 1:
                kotlin.jvm.internal.B b13 = this.f1361Z;
                b11 = this.f1360Y;
                f11 = (Ng.F) this.f1363i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                b12 = b13;
                b12.f37622Y = obj;
                obj2 = b11.f37622Y;
                if (!(obj2 instanceof C0117d0)) {
                }
                break;
            case 2:
                b10 = this.f1360Y;
                f10 = (Ng.F) this.f1363i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                C0131i c0131i2 = new C0131i(b10, abstractC0137k, null);
                this.f1363i0 = f10;
                this.f1360Y = b10;
                this.f1362h0 = 3;
                J0 j022 = (J0) abstractC0137k;
                a5 = j022.f1109I0.a(new I0(j022, c0131i2, null), this);
                if (a5 != EnumC5000a.f41328Y) {
                }
                if (a5 == enumC5000a) {
                }
                f12 = f10;
                obj3 = b10.f37622Y;
                if (obj3 instanceof C0120e0) {
                }
                if (Ad.l.F0(f12)) {
                }
                break;
            case 3:
                b10 = this.f1360Y;
                f10 = (Ng.F) this.f1363i0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (CancellationException unused) {
                    f6 = f10;
                    this.f1363i0 = f6;
                    this.f1360Y = null;
                    this.f1362h0 = 6;
                    if (AbstractC0137k.B0(abstractC0137k, this, f6) == enumC5000a) {
                    }
                    f12 = f6;
                    if (Ad.l.F0(f12)) {
                    }
                }
                f12 = f10;
                obj3 = b10.f37622Y;
                if (obj3 instanceof C0120e0) {
                }
                if (Ad.l.F0(f12)) {
                }
                break;
            case 4:
                f6 = (Ng.F) this.f1363i0;
                try {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } catch (CancellationException unused2) {
                    this.f1363i0 = f6;
                    this.f1360Y = null;
                    this.f1362h0 = 6;
                    if (AbstractC0137k.B0(abstractC0137k, this, f6) == enumC5000a) {
                    }
                    f12 = f6;
                    if (Ad.l.F0(f12)) {
                    }
                }
                f12 = f6;
                if (Ad.l.F0(f12)) {
                }
                break;
            case 5:
                f6 = (Ng.F) this.f1363i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                f12 = f6;
                if (Ad.l.F0(f12)) {
                }
                break;
            case 6:
                f6 = (Ng.F) this.f1363i0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                f12 = f6;
                if (Ad.l.F0(f12)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
