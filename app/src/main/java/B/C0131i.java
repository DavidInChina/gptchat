package B;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;

/* renamed from: B.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public kotlin.jvm.internal.B f1348Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f1349Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1350h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1351i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1352j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131i(kotlin.jvm.internal.B b10, AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1351i0 = b10;
        this.f1352j0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0131i c0131i = new C0131i(this.f1351i0, this.f1352j0, abstractC4825e);
        c0131i.f1350h0 = obj;
        return c0131i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0131i) create((H0) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:31:0x008a). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        H0 h02;
        H0 h03;
        boolean z10;
        jf.y yVar;
        C0114c0 c0114c0;
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1349Z;
        AbstractC0137k abstractC0137k = this.f1352j0;
        kotlin.jvm.internal.B b10 = this.f1351i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    kotlin.jvm.internal.B b11 = this.f1348Y;
                    h02 = (H0) this.f1350h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    b11.f37622Y = obj;
                    h03 = h02;
                    Object obj2 = b10.f37622Y;
                    z10 = obj2 instanceof C0120e0;
                    yVar = jf.y.f36177a;
                    if (z10 && !(obj2 instanceof C0111b0)) {
                        if (obj2 instanceof C0114c0) {
                            c0114c0 = (C0114c0) obj2;
                        } else {
                            c0114c0 = null;
                        }
                        if (c0114c0 != null) {
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta", obj2);
                            this.f1350h0 = h03;
                            this.f1348Y = null;
                            this.f1349Z = 1;
                            ((J0) abstractC0137k).getClass();
                            J0 j02 = h03.f1093a;
                            AbstractC0173w0 abstractC0173w0 = j02.f1111K0;
                            W0 w02 = j02.f1110J0;
                            W0 w03 = W0.f1213Y;
                            long j6 = ((C0114c0) obj2).f1288b;
                            if (w02 == w03) {
                                f6 = C5251c.e(j6);
                            } else {
                                f6 = C5251c.d(j6);
                            }
                            abstractC0173w0.b(f6);
                            if (yVar == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        h02 = h03;
                        Pg.k kVar = abstractC0137k.f1379G0;
                        this.f1350h0 = h02;
                        this.f1348Y = b10;
                        this.f1349Z = 2;
                        obj = kVar.g(this);
                        if (obj != enumC5000a) {
                            return enumC5000a;
                        }
                        b11 = b10;
                        b11.f37622Y = obj;
                        h03 = h02;
                        Object obj22 = b10.f37622Y;
                        z10 = obj22 instanceof C0120e0;
                        yVar = jf.y.f36177a;
                        if (z10) {
                        }
                        return yVar;
                    }
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h03 = (H0) this.f1350h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            h02 = h03;
            Pg.k kVar2 = abstractC0137k.f1379G0;
            this.f1350h0 = h02;
            this.f1348Y = b10;
            this.f1349Z = 2;
            obj = kVar2.g(this);
            if (obj != enumC5000a) {
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            h03 = (H0) this.f1350h0;
            Object obj222 = b10.f37622Y;
            z10 = obj222 instanceof C0120e0;
            yVar = jf.y.f36177a;
            if (z10) {
            }
            return yVar;
        }
    }
}
