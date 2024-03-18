package Gd;

import Ad.l;
import Cd.O;
import Cd.P;
import Cd.Q;
import Cd.S;
import Cd.T;
import Cd.U;
import Cd.V;
import Cd.W;
import Ng.D0;
import Ng.F;
import Qg.AbstractC1206i;
import Yg.p;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.y;
import kf.t;
import nf.AbstractC4825e;
import of.EnumC5000a;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final F f6291a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6292b;

    /* renamed from: c  reason: collision with root package name */
    public final Ld.c f6293c;

    /* renamed from: d  reason: collision with root package name */
    public final Ld.c f6294d;

    /* renamed from: e  reason: collision with root package name */
    public final u9.b f6295e;

    /* renamed from: f  reason: collision with root package name */
    public final h f6296f;

    /* renamed from: h  reason: collision with root package name */
    public float f6298h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6299i;

    /* renamed from: j  reason: collision with root package name */
    public long f6300j;

    /* renamed from: l  reason: collision with root package name */
    public D0 f6302l;

    /* renamed from: g  reason: collision with root package name */
    public final p f6297g = new p(AbstractC6463a.n("instant(...)"));

    /* renamed from: k  reason: collision with root package name */
    public final long f6301k = 8;

    /* renamed from: m  reason: collision with root package name */
    public U3.f f6303m = U.f3023g;

    /* JADX WARN: Type inference failed for: r4v1, types: [Gd.h, java.lang.Object] */
    public g(AbstractC1206i abstractC1206i, F f6, float f10, Ld.c cVar, Ld.c cVar2, u9.b bVar) {
        AbstractC3557B.c0("stateFlow", abstractC1206i);
        AbstractC3557B.c0("coroutineScope", f6);
        AbstractC3557B.c0("userAmplitudeSource", cVar);
        AbstractC3557B.c0("assistantAmplitudeSource", cVar2);
        AbstractC3557B.c0("hapticEngine", bVar);
        this.f6291a = f6;
        this.f6292b = f10;
        this.f6293c = cVar;
        this.f6294d = cVar2;
        this.f6295e = bVar;
        ?? obj = new Object();
        obj.f6304a = 0.0f;
        obj.f6305b = 0.0f;
        obj.f6306c = Float.MAX_VALUE;
        obj.f6307d = Float.MAX_VALUE;
        obj.f6308e = 0.0f;
        obj.f6309f = 0.0f;
        obj.f6310g = 0.0f;
        obj.f6311h = Float.MAX_VALUE;
        obj.f6312i = 0.0f;
        obj.f6313j = 0.0f;
        obj.f6314k = 0.0f;
        obj.f6315l = 0.0f;
        obj.f6316m = Float.MAX_VALUE;
        obj.f6317n = 0.0f;
        obj.f6318o = Float.MAX_VALUE;
        obj.f6319p = 0.0f;
        obj.f6320q = Float.MAX_VALUE;
        obj.f6321r = 0.0f;
        obj.f6322s = Float.MAX_VALUE;
        obj.f6323t = 0.0f;
        obj.f6324u = new float[4];
        obj.f6325v = new float[4];
        obj.f6326w = false;
        this.f6296f = obj;
        p.Companion.getClass();
        l.O0(f6, null, null, new d(abstractC1206i, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0061 -> B:24:0x0079). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0076 -> B:24:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        int i11;
        g gVar2;
        int i12;
        gVar.getClass();
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i13 = fVar.f6290k0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f6290k0 = i13 - Integer.MIN_VALUE;
                Object obj = fVar.f6288i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f6290k0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = fVar.f6287h0;
                            i12 = fVar.f6286Z;
                            gVar2 = fVar.f6285Y;
                            N.B0(obj);
                            i11++;
                            if (i11 < i12) {
                                if (l.G0(fVar.getContext())) {
                                    gVar2.f6295e.g();
                                    fVar.f6285Y = gVar2;
                                    fVar.f6286Z = i12;
                                    fVar.f6287h0 = i11;
                                    fVar.f6290k0 = 2;
                                    if (R4.b.p0(2000L, fVar) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                }
                                i11++;
                                if (i11 < i12) {
                                }
                            } else {
                                return y.f36177a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        gVar = fVar.f6285Y;
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    fVar.f6285Y = gVar;
                    fVar.f6290k0 = 1;
                    if (R4.b.p0(250L, fVar) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                gVar2 = gVar;
                i11 = 0;
                i12 = 10;
                if (i11 < i12) {
                }
            }
        }
        fVar = new f(gVar, abstractC4825e);
        Object obj2 = fVar.f6288i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f6290k0;
        if (i10 == 0) {
        }
        gVar2 = gVar;
        i11 = 0;
        i12 = 10;
        if (i11 < i12) {
        }
    }

    public final h b() {
        float[] fArr;
        float[] fArr2;
        float k10;
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        long currentTimeMillis = System.currentTimeMillis();
        this.f6300j = currentTimeMillis;
        int i10 = ((currentTimeMillis - this.f6300j) > this.f6301k ? 1 : ((currentTimeMillis - this.f6300j) == this.f6301k ? 0 : -1));
        h hVar = this.f6296f;
        if (i10 < 0) {
            return hVar;
        }
        boolean K10 = AbstractC3557B.K(this.f6303m, V.f3024g);
        float f15 = this.f6292b;
        if (K10) {
            fArr = this.f6294d.b(f15);
        } else {
            float[] fArr3 = hVar.f6324u;
            ArrayList arrayList = new ArrayList(fArr3.length);
            for (float f16 : fArr3) {
                arrayList.add(Float.valueOf(r.f.N(f16, 0.0f, 0.05f)));
            }
            fArr = t.I2(arrayList);
        }
        hVar.getClass();
        hVar.f6324u = fArr;
        boolean z10 = this.f6303m instanceof T;
        Ld.c cVar = this.f6293c;
        if (z10) {
            fArr2 = cVar.b(f15);
        } else {
            float[] fArr4 = hVar.f6325v;
            ArrayList arrayList2 = new ArrayList(fArr4.length);
            for (float f17 : fArr4) {
                arrayList2.add(Float.valueOf(r.f.N(f17, 0.0f, 0.05f)));
            }
            fArr2 = t.I2(arrayList2);
        }
        hVar.f6325v = fArr2;
        boolean z11 = hVar.f6326w;
        boolean z12 = this.f6299i;
        if (z11 != z12) {
            if (!z12) {
                hVar.f6307d = hVar.f6304a;
            } else {
                hVar.f6306c = hVar.f6304a;
                hVar.f6307d = Float.MAX_VALUE;
            }
            hVar.f6326w = z12;
        }
        hVar.f6305b = cVar.a(f15);
        p.Companion.getClass();
        hVar.f6304a = (float) Mg.b.k(new p(AbstractC6463a.n("instant(...)")).b(this.f6297g), Mg.d.f12134i0);
        float atan = ((((float) Math.atan(((float) Math.sin((N.o(((k10 - this.f6298h) - 0.0f) / 0.65f, 0.0f, 1.0f) - 0.5f) * 3.1415927f)) * 4.0f)) / ((float) Math.atan(4.0f))) * 0.5f) + 0.5f;
        float f18 = hVar.f6308e;
        if (this.f6303m instanceof Q) {
            f6 = atan;
        } else {
            f6 = Math.min(1 - atan, f18);
        }
        hVar.f6308e = f6;
        float f19 = hVar.f6310g;
        if (this.f6303m instanceof P) {
            f10 = atan;
        } else {
            f10 = Math.min(1 - atan, f19);
        }
        hVar.f6310g = f10;
        float f20 = hVar.f6321r;
        if (this.f6303m instanceof S) {
            f11 = atan;
        } else {
            f11 = Math.min(1 - atan, f20);
        }
        hVar.f6321r = f11;
        float f21 = hVar.f6312i;
        if (this.f6303m instanceof W) {
            f12 = atan;
        } else {
            f12 = Math.min(1 - atan, f21);
        }
        hVar.f6312i = f12;
        float f22 = hVar.f6314k;
        if (this.f6303m instanceof V) {
            f13 = atan;
        } else {
            f13 = Math.min(1 - atan, f22);
        }
        hVar.f6314k = f13;
        float f23 = hVar.f6317n;
        if (this.f6303m instanceof O) {
            f14 = atan;
        } else {
            f14 = Math.min(1 - atan, f23);
        }
        hVar.f6317n = f14;
        float f24 = hVar.f6319p;
        if (!(this.f6303m instanceof Cd.N)) {
            atan = Math.min(1 - atan, f24);
        }
        hVar.f6319p = atan;
        return hVar;
    }
}
