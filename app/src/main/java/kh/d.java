package kh;

import Z.C1724m0;
import id.AbstractC3557B;
import java.util.List;
import lh.u;
import r0.z;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37549Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ e f37550Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(0);
        this.f37549Y = i10;
        this.f37550Z = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean a() {
        int i10 = this.f37549Y;
        boolean z10 = false;
        e eVar = this.f37550Z;
        switch (i10) {
            case 0:
                if (((Z0.k) eVar.f37555e.getValue()) != null) {
                    C1724m0 c1724m0 = eVar.f37554d;
                    if (!((List) c1724m0.getValue()).isEmpty()) {
                        List list = (List) c1724m0.getValue();
                        int size = list.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                u uVar = (u) list.get(i11);
                                if (uVar.f38511d && uVar.f38508a != null) {
                                    break;
                                } else {
                                    i11++;
                                }
                            } else {
                                List list2 = (List) c1724m0.getValue();
                                int size2 = list2.size();
                                for (int i12 = 0; i12 < size2; i12++) {
                                    if (((u) list2.get(i12)).f38508a != null) {
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                if (((Boolean) eVar.f37553c.getValue()).booleanValue()) {
                    List list3 = (List) eVar.f37554d.getValue();
                    int size3 = list3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size3) {
                            z zVar = ((u) list3.get(i13)).f38508a;
                            if (zVar != null && !AbstractC3557B.K(zVar, eVar.f37551a.e0())) {
                                i13++;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f37549Y) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                return (Z0.k) this.f37550Z.f37555e.getValue();
        }
    }
}
