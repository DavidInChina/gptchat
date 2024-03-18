package I;

import A.C0007a0;
import E0.AbstractC0461u;
import b0.C2104h;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final C2104h f7922a = new C2104h(new g[16]);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
        if (r13 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:27:0x0080). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C5252d c5252d, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        C5252d c5252d2;
        int i11;
        Object[] objArr;
        int i12;
        Object obj;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i13 = eVar.f7921l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f7921l0 = i13 - Integer.MIN_VALUE;
                Object obj2 = eVar.f7919j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f7921l0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        i11 = eVar.f7918i0;
                        i12 = eVar.f7917h0;
                        objArr = eVar.f7916Z;
                        C5252d c5252d3 = eVar.f7915Y;
                        N.B0(obj2);
                        c5252d2 = c5252d3;
                        i11++;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    C2104h c2104h = this.f7922a;
                    i12 = c2104h.f25569h0;
                    if (i12 > 0) {
                        Object[] objArr2 = c2104h.f25567Y;
                        c5252d2 = c5252d;
                        i11 = 0;
                        objArr = objArr2;
                        g gVar = (g) objArr[i11];
                        eVar.f7915Y = c5252d2;
                        eVar.f7916Z = objArr;
                        eVar.f7917h0 = i12;
                        eVar.f7918i0 = i11;
                        eVar.f7921l0 = 1;
                        gVar.getClass();
                        d dVar = (d) E9.f.a(gVar, c.f7914a);
                        if (dVar == null) {
                            dVar = gVar.f7911s0;
                        }
                        AbstractC0461u A02 = gVar.A0();
                        if (A02 == null || (obj = dVar.Q(A02, new C0007a0(c5252d2, 2, gVar), eVar)) != EnumC5000a.f41328Y) {
                            obj = yVar;
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        i11++;
                    }
                    return yVar;
                }
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj22 = eVar.f7919j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f7921l0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
    }
}
