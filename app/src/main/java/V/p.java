package V;

import Ng.C1084s;
import Ng.v0;
import Z.C1724m0;
import Z.o1;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q0.C5251c;
import z.AbstractC6696f;
import z.C6694e;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public C5251c f17952a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17953b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17954c;

    /* renamed from: d  reason: collision with root package name */
    public Float f17955d;

    /* renamed from: e  reason: collision with root package name */
    public Float f17956e;

    /* renamed from: f  reason: collision with root package name */
    public C5251c f17957f;

    /* renamed from: g  reason: collision with root package name */
    public final C6694e f17958g = AbstractC6696f.a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public final C6694e f17959h = AbstractC6696f.a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public final C6694e f17960i = AbstractC6696f.a(0.0f);

    /* renamed from: j  reason: collision with root package name */
    public final C1084s f17961j;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f17962k;

    /* renamed from: l  reason: collision with root package name */
    public final C1724m0 f17963l;

    /* JADX WARN: Type inference failed for: r1v3, types: [Ng.v0, Ng.s] */
    public p(C5251c c5251c, float f6, boolean z10) {
        this.f17952a = c5251c;
        this.f17953b = f6;
        this.f17954c = z10;
        ?? v0Var = new v0(true);
        v0Var.Y(null);
        this.f17961j = v0Var;
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f17962k = AbstractC4828h.Z(bool, o1Var);
        this.f17963l = AbstractC4828h.Z(bool, o1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        i iVar;
        EnumC5000a enumC5000a;
        int i10;
        p pVar;
        Object e02;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f17939i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f17939i0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f17937Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f17939i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar = iVar.f17936Y;
                        N.B0(obj);
                        iVar.f17936Y = null;
                        iVar.f17939i0 = 3;
                        pVar.getClass();
                        e02 = Ad.l.e0(new o(pVar, null), iVar);
                        if (e02 != enumC5000a) {
                            e02 = yVar;
                        }
                        if (e02 == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                    pVar = iVar.f17936Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    iVar.f17936Y = this;
                    iVar.f17939i0 = 1;
                    Object e03 = Ad.l.e0(new m(this, null), iVar);
                    if (e03 != enumC5000a) {
                        e03 = yVar;
                    }
                    if (e03 == enumC5000a) {
                        return enumC5000a;
                    }
                    pVar = this;
                }
                pVar.f17962k.setValue(Boolean.TRUE);
                iVar.f17936Y = pVar;
                iVar.f17939i0 = 2;
                if (pVar.f17961j.z(iVar) == enumC5000a) {
                    return enumC5000a;
                }
                iVar.f17936Y = null;
                iVar.f17939i0 = 3;
                pVar.getClass();
                e02 = Ad.l.e0(new o(pVar, null), iVar);
                if (e02 != enumC5000a) {
                }
                if (e02 == enumC5000a) {
                }
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj2 = iVar.f17937Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = iVar.f17939i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        pVar.f17962k.setValue(Boolean.TRUE);
        iVar.f17936Y = pVar;
        iVar.f17939i0 = 2;
        if (pVar.f17961j.z(iVar) == enumC5000a) {
        }
        iVar.f17936Y = null;
        iVar.f17939i0 = 3;
        pVar.getClass();
        e02 = Ad.l.e0(new o(pVar, null), iVar);
        if (e02 != enumC5000a) {
        }
        if (e02 == enumC5000a) {
        }
    }
}
