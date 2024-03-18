package C;

import B.AbstractC0130h1;
import B.C0142l1;
import B.L0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import z.AbstractC6696f;
import z.AbstractC6714o;
import z.C6716p;
import z.C6736z;

/* loaded from: classes.dex */
public final class j implements L0 {

    /* renamed from: a  reason: collision with root package name */
    public final o f2458a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6714o f2459b;

    /* renamed from: c  reason: collision with root package name */
    public final C6736z f2460c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6714o f2461d;

    /* renamed from: e  reason: collision with root package name */
    public final C0142l1 f2462e = androidx.compose.foundation.gestures.a.f24695d;

    public j(o oVar, AbstractC6714o abstractC6714o, C6736z c6736z, AbstractC6714o abstractC6714o2) {
        this.f2458a = oVar;
        this.f2459b = abstractC6714o;
        this.f2460c = c6736z;
        this.f2461d = abstractC6714o2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, AbstractC0130h1 abstractC0130h1, float f6, float f10, e eVar, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        C6716p c6716p;
        b bVar;
        Object f11;
        jVar.getClass();
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f2457h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f2457h0 = i11 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.f2455Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar2.f2457h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (Math.abs(f6) == 0.0f || Math.abs(f10) == 0.0f) {
                        c6716p = AbstractC6696f.b(f6, f10, 28);
                        return c6716p;
                    }
                    iVar2.f2457h0 = 1;
                    C6736z c6736z = jVar.f2460c;
                    if (Math.abs(AbstractC6696f.j(c6736z, f10)) >= Math.abs(f6)) {
                        bVar = new b(0, c6736z);
                    } else {
                        bVar = new b(1, jVar.f2459b);
                    }
                    float f12 = n.f2479a;
                    Float f13 = new Float(f6);
                    Float f14 = new Float(f10);
                    switch (bVar.f2434Y) {
                        case 0:
                            f11 = bVar.f(abstractC0130h1, f13.floatValue(), f14.floatValue(), eVar, iVar2);
                            break;
                        default:
                            f11 = bVar.f(abstractC0130h1, f13.floatValue(), f14.floatValue(), eVar, iVar2);
                            break;
                    }
                    obj = f11;
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                c6716p = ((a) obj).f2433b;
                return c6716p;
            }
        }
        iVar = new i(jVar, abstractC4825e);
        i iVar22 = iVar;
        Object obj2 = iVar22.f2455Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar22.f2457h0;
        if (i10 == 0) {
        }
        c6716p = ((a) obj2).f2433b;
        return c6716p;
    }

    @Override // B.L0
    public final Object a(AbstractC0130h1 abstractC0130h1, float f6, AbstractC4825e abstractC4825e) {
        return d(abstractC0130h1, f6, g.f2451Y, abstractC4825e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC0130h1 abstractC0130h1, float f6, wf.k kVar, AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f2441i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f2441i0 = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f2439Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f2441i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        kVar = dVar.f2438Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C0142l1 c0142l1 = this.f2462e;
                    f fVar = new f(f6, abstractC0130h1, this, null, kVar);
                    dVar.f2438Y = kVar;
                    dVar.f2441i0 = 1;
                    obj = Ad.l.n1(dVar, c0142l1, fVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                a aVar = (a) obj;
                kVar.invoke(new Float(0.0f));
                return aVar;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj2 = dVar.f2439Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f2441i0;
        if (i10 == 0) {
        }
        a aVar2 = (a) obj2;
        kVar.invoke(new Float(0.0f));
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AbstractC0130h1 abstractC0130h1, float f6, wf.k kVar, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        a aVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f2454h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f2454h0 = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f2452Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = hVar.f2454h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    hVar.f2454h0 = 1;
                    obj = c(abstractC0130h1, f6, kVar, hVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                aVar = (a) obj;
                float f10 = 0.0f;
                if (((Number) aVar.f2432a).floatValue() != 0.0f) {
                    f10 = ((Number) aVar.f2433b.b()).floatValue();
                }
                return new Float(f10);
            }
        }
        hVar = new h(this, abstractC4825e);
        Object obj3 = hVar.f2452Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = hVar.f2454h0;
        if (i10 == 0) {
        }
        aVar = (a) obj3;
        float f102 = 0.0f;
        if (((Number) aVar.f2432a).floatValue() != 0.0f) {
        }
        return new Float(f102);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!AbstractC3557B.K(jVar.f2461d, this.f2461d) || !AbstractC3557B.K(jVar.f2460c, this.f2460c) || !AbstractC3557B.K(jVar.f2459b, this.f2459b) || !AbstractC3557B.K(jVar.f2458a, this.f2458a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2460c.hashCode();
        int hashCode2 = this.f2459b.hashCode();
        return this.f2458a.hashCode() + ((hashCode2 + ((hashCode + (this.f2461d.hashCode() * 31)) * 31)) * 31);
    }
}
