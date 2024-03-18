package Ba;

import hc.C3403s;
import hc.L;
import ic.C3551v;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class g extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2019Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f2020Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(c cVar, int i10) {
        super(1);
        this.f2019Y = i10;
        this.f2020Z = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        r7 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        return hc.C3403s.e(r0, r6.f2020Z, new T0.z(r3, U3.f.e(r7, r7), 4), false, false, 25);
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i10 = this.f2019Y;
        String str = null;
        c cVar = this.f2020Z;
        switch (i10) {
            case 0:
                c cVar2 = (c) obj;
                return cVar;
            case 1:
                c cVar3 = (c) obj;
                return cVar;
            case 2:
                C3403s c3403s = (C3403s) obj;
                AbstractC3557B.c0("$this$setState", c3403s);
                int ordinal = c3403s.f32216a.ordinal();
                String str2 = "";
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (cVar != null) {
                            str = cVar.f2010c;
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else if (cVar != null) {
                    str = cVar.f2009b;
                    break;
                }
                break;
            case 3:
                L l10 = (L) obj;
                AbstractC3557B.c0("$this$setState", l10);
                return L.e(l10, false, false, cVar, 7);
            default:
                C3551v c3551v = (C3551v) obj;
                AbstractC3557B.c0("$this$setState", c3551v);
                return C3551v.e(c3551v, null, cVar, 1);
        }
    }
}
