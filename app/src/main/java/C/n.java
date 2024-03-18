package C;

import B.AbstractC0130h1;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import z.AbstractC6696f;
import z.AbstractC6714o;
import z.C6716p;
import z.C6736z;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final float f2479a = (float) RCHTTPStatusCodes.BAD_REQUEST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r2v6, types: [pf.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AbstractC0130h1 abstractC0130h1, float f6, C6716p c6716p, C6736z c6736z, e eVar, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        y yVar;
        C6716p c6716p2;
        float f10;
        boolean z10;
        if (abstractC4825e instanceof k) {
            k kVar2 = (k) abstractC4825e;
            int i11 = kVar2.f2467j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar2.f2467j0 = i11 - Integer.MIN_VALUE;
                kVar = kVar2;
                Object obj = kVar.f2466i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f2467j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        f10 = kVar.f2463Y;
                        yVar = kVar.f2465h0;
                        c6716p2 = kVar.f2464Z;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? obj2 = new Object();
                    if (((Number) c6716p.b()).floatValue() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l lVar = new l(f6, obj2, abstractC0130h1, eVar, 0);
                    kVar.f2464Z = c6716p;
                    kVar.f2465h0 = obj2;
                    kVar.f2463Y = f6;
                    kVar.f2467j0 = 1;
                    if (AbstractC6696f.e(c6716p, c6736z, !z10, lVar, kVar) != enumC5000a) {
                        c6716p2 = c6716p;
                        yVar = obj2;
                        f10 = f6;
                    } else {
                        return enumC5000a;
                    }
                }
                return new a(new Float(f10 - yVar.f37646Y), c6716p2);
            }
        }
        kVar = new AbstractC5156c(abstractC4825e);
        Object obj3 = kVar.f2466i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f2467j0;
        if (i10 == 0) {
        }
        return new a(new Float(f10 - yVar.f37646Y), c6716p2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(AbstractC0130h1 abstractC0130h1, float f6, float f10, C6716p c6716p, AbstractC6714o abstractC6714o, e eVar, AbstractC4825e abstractC4825e) {
        m mVar;
        int i10;
        float f11;
        C6716p c6716p2;
        y yVar;
        boolean z10;
        float f12 = f6;
        if (abstractC4825e instanceof m) {
            m mVar2 = (m) abstractC4825e;
            int i11 = mVar2.f2478k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar2.f2478k0 = i11 - Integer.MIN_VALUE;
                mVar = mVar2;
                m mVar3 = mVar;
                Object obj = mVar3.f2477j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = mVar3.f2478k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        float f13 = mVar3.f2474Z;
                        float f14 = mVar3.f2473Y;
                        yVar = mVar3.f2476i0;
                        C6716p c6716p3 = mVar3.f2475h0;
                        N.B0(obj);
                        f11 = f13;
                        f12 = f14;
                        c6716p2 = c6716p3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? obj2 = new Object();
                    float floatValue = ((Number) c6716p.b()).floatValue();
                    Float f15 = new Float(f12);
                    if (((Number) c6716p.b()).floatValue() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l lVar = new l(f10, obj2, abstractC0130h1, eVar, 1);
                    c6716p2 = c6716p;
                    mVar3.f2475h0 = c6716p2;
                    mVar3.f2476i0 = obj2;
                    mVar3.f2473Y = f12;
                    mVar3.f2474Z = floatValue;
                    mVar3.f2478k0 = 1;
                    f11 = floatValue;
                    if (AbstractC6696f.g(c6716p, f15, abstractC6714o, !z10, lVar, mVar3) != enumC5000a) {
                        yVar = obj2;
                    } else {
                        return enumC5000a;
                    }
                }
                return new a(new Float(f12 - yVar.f37646Y), AbstractC6696f.l(c6716p2, 0.0f, c(((Number) c6716p2.b()).floatValue(), f11), 29));
            }
        }
        mVar = new AbstractC5156c(abstractC4825e);
        m mVar32 = mVar;
        Object obj3 = mVar32.f2477j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = mVar32.f2478k0;
        if (i10 == 0) {
        }
        return new a(new Float(f12 - yVar.f37646Y), AbstractC6696f.l(c6716p2, 0.0f, c(((Number) c6716p2.b()).floatValue(), f11), 29));
    }

    public static final float c(float f6, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        if (f10 > 0.0f) {
            return N.l(f6, f10);
        }
        return N.j(f6, f10);
    }
}
