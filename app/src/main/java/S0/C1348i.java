package S0;

import Z.C1724m0;
import Z.l1;
import Z.o1;
import java.util.List;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import of.EnumC5000a;

/* renamed from: S0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1348i implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final List f16024Y;

    /* renamed from: Z  reason: collision with root package name */
    public final M f16025Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C1352m f16026h0;

    /* renamed from: i0  reason: collision with root package name */
    public final wf.k f16027i0;

    /* renamed from: j0  reason: collision with root package name */
    public final G f16028j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C1724m0 f16029k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f16030l0 = true;

    public C1348i(List list, Object obj, M m10, C1352m c1352m, wf.k kVar, G g10) {
        this.f16024Y = list;
        this.f16025Z = m10;
        this.f16026h0 = c1352m;
        this.f16027i0 = kVar;
        this.f16028j0 = g10;
        this.f16029k0 = AbstractC4828h.Z(obj, o1.f22665a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:26:0x006a, B:28:0x007b), top: B:52:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:18:0x0050, B:33:0x00a0, B:35:0x00ae, B:38:0x00ca), top: B:50:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[Catch: all -> 0x0059, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:18:0x0050, B:33:0x00a0, B:35:0x00ae, B:38:0x00ca), top: B:50:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:43:0x00df). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00dd -> B:42:0x00de). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C1344e c1344e;
        int i10;
        C1348i c1348i;
        Throwable th2;
        int i11;
        int i12;
        List list;
        List list2;
        C1348i c1348i2;
        AbstractC1356q abstractC1356q;
        if (abstractC4825e instanceof C1344e) {
            c1344e = (C1344e) abstractC4825e;
            int i13 = c1344e.f16013m0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1344e.f16013m0 = i13 - Integer.MIN_VALUE;
                Object obj = c1344e.f16011k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1344e.f16013m0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i12 = c1344e.f16010j0;
                            i11 = c1344e.f16009i0;
                            list2 = c1344e.f16007Z;
                            c1348i = c1344e.f16006Y;
                            try {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                list = list2;
                                i11++;
                                if (i11 < i12) {
                                    AbstractC1356q abstractC1356q2 = (AbstractC1356q) list.get(i11);
                                    if (Gi.e.v(((I) abstractC1356q2).f15983e, 2)) {
                                        C1352m c1352m = c1348i.f16026h0;
                                        G g10 = c1348i.f16028j0;
                                        C1345f c1345f = new C1345f(c1348i, abstractC1356q2, null);
                                        c1344e.f16006Y = c1348i;
                                        c1344e.f16007Z = list;
                                        c1344e.f16008h0 = abstractC1356q2;
                                        c1344e.f16009i0 = i11;
                                        c1344e.f16010j0 = i12;
                                        c1344e.f16013m0 = 1;
                                        Object c10 = c1352m.c(abstractC1356q2, g10, c1345f, c1344e);
                                        if (c10 == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        list2 = list;
                                        obj = c10;
                                        c1348i2 = c1348i;
                                        abstractC1356q = abstractC1356q2;
                                        if (obj == null) {
                                            M m10 = c1348i2.f16025Z;
                                            Object x02 = M3.H.x0(m10.f15989d, obj, abstractC1356q, m10.f15987b, m10.f15988c);
                                            C1724m0 c1724m0 = c1348i2.f16029k0;
                                            c1724m0.setValue(x02);
                                            boolean G02 = Ad.l.G0(c1344e.getContext());
                                            c1348i2.f16030l0 = false;
                                            c1348i2.f16027i0.invoke(new P(c1724m0.getValue(), G02));
                                            return yVar;
                                        }
                                        c1344e.f16006Y = c1348i2;
                                        c1344e.f16007Z = list2;
                                        c1344e.f16008h0 = null;
                                        c1344e.f16009i0 = i11;
                                        c1344e.f16010j0 = i12;
                                        c1344e.f16013m0 = 2;
                                        if (L4.a.a1(c1344e) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        c1348i = c1348i2;
                                        list = list2;
                                    }
                                    i11++;
                                    if (i11 < i12) {
                                        boolean G03 = Ad.l.G0(c1344e.getContext());
                                        c1348i.f16030l0 = false;
                                        c1348i.f16027i0.invoke(new P(c1348i.f16029k0.getValue(), G03));
                                        return yVar;
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                boolean G04 = Ad.l.G0(c1344e.getContext());
                                c1348i.f16030l0 = false;
                                c1348i.f16027i0.invoke(new P(c1348i.f16029k0.getValue(), G04));
                                throw th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i12 = c1344e.f16010j0;
                        i11 = c1344e.f16009i0;
                        AbstractC1356q abstractC1356q3 = c1344e.f16008h0;
                        List list3 = c1344e.f16007Z;
                        c1348i2 = c1344e.f16006Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            abstractC1356q = abstractC1356q3;
                            list2 = list3;
                            if (obj == null) {
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            c1348i = c1348i2;
                            boolean G042 = Ad.l.G0(c1344e.getContext());
                            c1348i.f16030l0 = false;
                            c1348i.f16027i0.invoke(new P(c1348i.f16029k0.getValue(), G042));
                            throw th2;
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    try {
                        list = this.f16024Y;
                        i12 = list.size();
                        c1348i = this;
                        i11 = 0;
                        if (i11 < i12) {
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        c1348i = this;
                        boolean G0422 = Ad.l.G0(c1344e.getContext());
                        c1348i.f16030l0 = false;
                        c1348i.f16027i0.invoke(new P(c1348i.f16029k0.getValue(), G0422));
                        throw th2;
                    }
                }
            }
        }
        c1344e = new C1344e(this, abstractC4825e);
        Object obj2 = c1344e.f16011k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1344e.f16013m0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC1356q abstractC1356q, AbstractC4825e abstractC4825e) {
        C1346g c1346g;
        int i10;
        Object obj;
        try {
            if (abstractC4825e instanceof C1346g) {
                c1346g = (C1346g) abstractC4825e;
                int i11 = c1346g.f16020i0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c1346g.f16020i0 = i11 - Integer.MIN_VALUE;
                    Object obj2 = c1346g.f16018Z;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c1346g.f16020i0;
                    obj = null;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            abstractC1356q = c1346g.f16017Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        C1347h c1347h = new C1347h(this, abstractC1356q, null);
                        c1346g.f16017Y = abstractC1356q;
                        c1346g.f16020i0 = 1;
                        obj2 = K4.J.k0(15000L, c1347h, c1346g);
                        if (obj2 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i10 == 0) {
            }
            obj = obj2;
            return obj;
        } catch (CancellationException e10) {
            if (Ad.l.G0(c1346g.getContext())) {
                return obj;
            }
            throw e10;
        } catch (Exception e11) {
            Ng.D d10 = (Ng.D) c1346g.getContext().get(Ng.C.f12863Y);
            if (d10 != null) {
                AbstractC4831k context = c1346g.getContext();
                d10.handleException(context, new IllegalStateException("Unable to load font " + abstractC1356q, e11));
                return obj;
            }
            return obj;
        }
        c1346g = new C1346g(this, abstractC4825e);
        Object obj22 = c1346g.f16018Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1346g.f16020i0;
        obj = null;
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f16029k0.getValue();
    }
}
