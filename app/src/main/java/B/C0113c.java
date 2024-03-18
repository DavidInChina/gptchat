package B;

import G0.AbstractC0579h;
import H0.AbstractC0701r0;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;

/* renamed from: B.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113c extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC0137k f1282Z;

    /* renamed from: h0  reason: collision with root package name */
    public Ng.F f1283h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1284i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f1285j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f1286k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC0137k f1287l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113c(AbstractC0137k abstractC0137k, AbstractC4825e abstractC4825e, Ng.F f6) {
        super(2, abstractC4825e);
        this.f1286k0 = f6;
        this.f1287l0 = abstractC0137k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0113c c0113c = new C0113c(this.f1287l0, abstractC4825e, this.f1286k0);
        c0113c.f1285j0 = obj;
        return c0113c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0113c) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:25|61|28|29|65|30|(1:32)(10:33|68|34|35|(0)(0)|43|44|54|18|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
        r2 = r14;
        r1 = r15;
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
        r17 = r7;
        r8 = r8 ? 1 : 0;
        r8 = r8 ? 1 : 0;
        r8 = r8 ? 1 : 0;
        r8 = r8 ? 1 : 0;
        r8 = r8 ? 1 : 0;
        r18 = r8;
        r16 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[Catch: all -> 0x0029, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0029, blocks: (B:7:0x001e, B:34:0x00bf, B:51:0x0117, B:55:0x0134), top: B:63:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bb -> B:68:0x00bf). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x011d -> B:44:0x0103). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0146 -> B:18:0x004e). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        int i10;
        Object obj2;
        Object obj3;
        float f6;
        Throwable th2;
        B0.N n10;
        Object a5;
        C3959i c3959i;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f1284i0;
        C0111b0 c0111b0 = C0111b0.f1271b;
        AbstractC0137k abstractC0137k = this.f1287l0;
        Ng.F f10 = this.f1286k0;
        int i12 = 2;
        boolean z11 = true;
        z11 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    Ng.F f11 = this.f1283h0;
                    AbstractC0137k abstractC0137k2 = this.f1282Z;
                    B0.N n11 = (B0.N) this.f1285j0;
                    try {
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            obj2 = obj;
                            z10 = true;
                            i10 = 2;
                        } catch (CancellationException e10) {
                            e = e10;
                            z10 = true;
                            i10 = 2;
                            if (Ad.l.F0(f11)) {
                                ((H0.Y0) AbstractC0579h.p(abstractC0137k2, AbstractC0701r0.f7013p)).d();
                                abstractC0137k2.f1379G0.t(c0111b0);
                                n10 = n11;
                                i12 = i10;
                                boolean z12 = z10 ? 1 : 0;
                                Object[] objArr = z10 ? 1 : 0;
                                Object[] objArr2 = z10 ? 1 : 0;
                                Object[] objArr3 = z10 ? 1 : 0;
                                Object[] objArr4 = z10 ? 1 : 0;
                                Object[] objArr5 = z10 ? 1 : 0;
                                z11 = z12;
                                if (Ad.l.F0(f10)) {
                                }
                            } else {
                                throw e;
                            }
                        }
                        try {
                        } catch (CancellationException e11) {
                            e = e11;
                            if (Ad.l.F0(f11)) {
                            }
                        }
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        float d10 = ((H0.Y0) AbstractC0579h.p(abstractC0137k2, AbstractC0701r0.f7013p)).d();
                        if (!booleanValue) {
                            long l10 = AbstractC4828h.l(d10, d10);
                            C0.d dVar = abstractC0137k2.f1376D0;
                            long b10 = dVar.b(l10);
                            dVar.c();
                            if (abstractC0137k2.f1373A0) {
                                f6 = -1.0f;
                            } else {
                                f6 = 1.0f;
                            }
                            obj3 = new C0120e0(AbstractC4828h.l(Z0.p.b(b10) * f6, Z0.p.c(b10) * f6));
                        } else {
                            obj3 = c0111b0;
                        }
                        abstractC0137k2.f1379G0.t(obj3);
                        n10 = n11;
                        i12 = i10;
                        boolean z122 = z10 ? 1 : 0;
                        Object[] objArr6 = z10 ? 1 : 0;
                        Object[] objArr22 = z10 ? 1 : 0;
                        Object[] objArr32 = z10 ? 1 : 0;
                        Object[] objArr42 = z10 ? 1 : 0;
                        Object[] objArr52 = z10 ? 1 : 0;
                        z11 = z122;
                        if (Ad.l.F0(f10)) {
                            C0107a c0107a = abstractC0137k.f1374B0;
                            this.f1285j0 = n10;
                            this.f1282Z = null;
                            this.f1283h0 = null;
                            int i13 = z11 ? 1 : 0;
                            int i14 = z11 ? 1 : 0;
                            int i15 = z11 ? 1 : 0;
                            this.f1284i0 = i13;
                            a5 = G0.a(n10, c0107a, abstractC0137k.f1375C0, abstractC0137k.f1376D0, ((J0) abstractC0137k).f1113M0, this);
                            if (a5 == enumC5000a) {
                                return enumC5000a;
                            }
                            B0.N n12 = n10;
                            c3959i = (C3959i) a5;
                            if (c3959i != null) {
                                try {
                                    B0.u uVar = (B0.u) c3959i.f36155Y;
                                    long j6 = ((C5251c) c3959i.f36156Z).f43623a;
                                    C0.d dVar2 = abstractC0137k.f1376D0;
                                    Pg.k kVar = abstractC0137k.f1379G0;
                                    boolean z13 = abstractC0137k.f1373A0;
                                    int i16 = z11 ? 1 : 0;
                                    int i17 = z11 ? 1 : 0;
                                    C0107a c0107a2 = new C0107a(abstractC0137k, i16);
                                    this.f1285j0 = n12;
                                    this.f1282Z = abstractC0137k;
                                    this.f1283h0 = f10;
                                    this.f1284i0 = i12;
                                    B0.N n13 = n12;
                                    z10 = z11;
                                    i10 = i12;
                                    obj2 = G0.b(n12, uVar, j6, dVar2, kVar, z13, c0107a2, this);
                                    if (obj2 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    abstractC0137k2 = abstractC0137k;
                                    f11 = f10;
                                    n11 = n13;
                                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                    float d102 = ((H0.Y0) AbstractC0579h.p(abstractC0137k2, AbstractC0701r0.f7013p)).d();
                                    if (!booleanValue2) {
                                    }
                                    abstractC0137k2.f1379G0.t(obj3);
                                    n10 = n11;
                                    i12 = i10;
                                    boolean z1222 = z10 ? 1 : 0;
                                    Object[] objArr62 = z10 ? 1 : 0;
                                    Object[] objArr222 = z10 ? 1 : 0;
                                    Object[] objArr322 = z10 ? 1 : 0;
                                    Object[] objArr422 = z10 ? 1 : 0;
                                    Object[] objArr522 = z10 ? 1 : 0;
                                    z11 = z1222;
                                    if (Ad.l.F0(f10)) {
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    ((H0.Y0) AbstractC0579h.p(abstractC0137k, AbstractC0701r0.f7013p)).d();
                                    abstractC0137k.f1379G0.t(c0111b0);
                                    throw th2;
                                }
                                if (!abstractC0137k.f1377E0) {
                                    abstractC0137k.f1377E0 = z11;
                                    Ad.l.O0(abstractC0137k.p0(), null, null, new C0134j(abstractC0137k, null), 3);
                                }
                            } else {
                                n10 = n12;
                                if (Ad.l.F0(f10)) {
                                    return jf.y.f36177a;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        abstractC0137k = abstractC0137k2;
                        ((H0.Y0) AbstractC0579h.p(abstractC0137k, AbstractC0701r0.f7013p)).d();
                        abstractC0137k.f1379G0.t(c0111b0);
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n10 = (B0.N) this.f1285j0;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                a5 = obj;
                B0.N n122 = n10;
                c3959i = (C3959i) a5;
                if (c3959i != null) {
                }
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f1285j0;
            if (Ad.l.F0(f10)) {
            }
        }
    }
}
