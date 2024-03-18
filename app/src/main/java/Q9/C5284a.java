package q9;

import K4.J;
import Lg.o;
import Ng.F;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4327s;
import l0.C4310b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: q9.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5284a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f43976Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f43977Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f43978h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ u9.b f43979i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f43980j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5284a(String str, u9.b bVar, AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f43978h0 = str;
        this.f43979i0 = bVar;
        this.f43980j0 = abstractC1710f0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5284a c5284a = new C5284a(this.f43978h0, this.f43979i0, this.f43980j0, abstractC4825e);
        c5284a.f43977Z = obj;
        return c5284a;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5284a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b0 -> B:32:0x00b3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f0 -> B:40:0x00f3). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        float f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f43976Y;
        u9.b bVar = this.f43979i0;
        String str2 = this.f43978h0;
        AbstractC1710f0 abstractC1710f0 = this.f43980j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    int i11 = AbstractC5285b.f43982b;
                    abstractC1710f0.setValue(((String) abstractC1710f0.getValue()) + str2.charAt(((String) abstractC1710f0.getValue()).length()));
                    if (bVar != null) {
                        Af.d.f840Y.getClass();
                        bVar.e(Af.d.f841Z.i().nextFloat());
                    }
                    int i12 = AbstractC5285b.f43982b;
                    if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str2)) {
                        long j6 = AbstractC5285b.f43981a;
                        this.f43977Z = null;
                        this.f43976Y = 2;
                        if (L4.a.V(j6, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        int i112 = AbstractC5285b.f43982b;
                        abstractC1710f0.setValue(((String) abstractC1710f0.getValue()) + str2.charAt(((String) abstractC1710f0.getValue()).length()));
                        if (bVar != null) {
                        }
                        int i122 = AbstractC5285b.f43982b;
                        if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str2)) {
                        }
                    }
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f43977Z;
            N.B0(obj);
            int i13 = AbstractC5285b.f43982b;
            abstractC1710f0.setValue(o.X2((String) abstractC1710f0.getValue()));
            if (bVar != null) {
                Af.d.f840Y.getClass();
                bVar.c(Af.d.f841Z.i().nextFloat());
            }
            int i14 = AbstractC5285b.f43982b;
            if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str)) {
                long j10 = AbstractC5285b.f43981a;
                this.f43977Z = str;
                this.f43976Y = 1;
                if (L4.a.V(j10, this) == enumC5000a) {
                    return enumC5000a;
                }
                int i132 = AbstractC5285b.f43982b;
                abstractC1710f0.setValue(o.X2((String) abstractC1710f0.getValue()));
                if (bVar != null) {
                }
                int i142 = AbstractC5285b.f43982b;
                if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str)) {
                }
            }
            int i1222 = AbstractC5285b.f43982b;
            if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str2)) {
            }
            return y.f36177a;
        }
        N.B0(obj);
        AbstractC4831k i15 = ((F) this.f43977Z).i();
        AbstractC3557B.c0("<this>", i15);
        AbstractC4327s abstractC4327s = (AbstractC4327s) i15.get(C4310b.f37708u0);
        if (abstractC4327s != null) {
            f6 = abstractC4327s.a0();
        } else {
            f6 = 1.0f;
        }
        if (f6 > 0.0f) {
            int i16 = AbstractC5285b.f43982b;
            String str3 = (String) abstractC1710f0.getValue();
            AbstractC3557B.c0("<this>", str2);
            AbstractC3557B.c0("other", str3);
            int min = Math.min(str2.length(), str3.length());
            int i17 = 0;
            while (i17 < min && J.q(str2.charAt(i17), str3.charAt(i17), false)) {
                i17++;
            }
            int i18 = i17 - 1;
            if (Lg.n.h2(i18, str2) || Lg.n.h2(i18, str3)) {
                i17--;
            }
            str = str2.subSequence(0, i17).toString();
            int i1422 = AbstractC5285b.f43982b;
            if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str)) {
            }
            int i12222 = AbstractC5285b.f43982b;
            if (!AbstractC3557B.K((String) abstractC1710f0.getValue(), str2)) {
            }
            return y.f36177a;
        }
        int i19 = AbstractC5285b.f43982b;
        abstractC1710f0.setValue(str2);
        return y.f36177a;
    }
}
