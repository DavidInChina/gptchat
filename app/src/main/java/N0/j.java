package N0;

import java.util.ArrayList;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12532Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ k f12533Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i10) {
        super(0);
        this.f12532Y = i10;
        this.f12533Z = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Float a() {
        o oVar;
        o oVar2;
        int i10 = this.f12532Y;
        float f6 = 0.0f;
        n nVar = null;
        k kVar = this.f12533Z;
        int i11 = 1;
        switch (i10) {
            case 0:
                ArrayList arrayList = kVar.f12538e;
                if (!arrayList.isEmpty()) {
                    Object obj = arrayList.get(0);
                    float c10 = ((n) obj).f12546a.c();
                    int u02 = AbstractC4344b.u0(arrayList);
                    Object obj2 = obj;
                    if (1 <= u02) {
                        while (true) {
                            Object obj3 = arrayList.get(i11);
                            float c11 = ((n) obj3).f12546a.c();
                            obj = obj2;
                            if (Float.compare(c10, c11) < 0) {
                                obj = obj3;
                                c10 = c11;
                            }
                            if (i11 != u02) {
                                i11++;
                                obj2 = obj;
                            }
                        }
                    }
                    nVar = obj;
                }
                n nVar2 = nVar;
                if (nVar2 != null && (oVar = nVar2.f12546a) != null) {
                    f6 = oVar.c();
                }
                return Float.valueOf(f6);
            default:
                ArrayList arrayList2 = kVar.f12538e;
                if (!arrayList2.isEmpty()) {
                    Object obj4 = arrayList2.get(0);
                    float b10 = ((n) obj4).f12546a.b();
                    int u03 = AbstractC4344b.u0(arrayList2);
                    Object obj5 = obj4;
                    if (1 <= u03) {
                        while (true) {
                            Object obj6 = arrayList2.get(i11);
                            float b11 = ((n) obj6).f12546a.b();
                            obj4 = obj5;
                            if (Float.compare(b10, b11) < 0) {
                                obj4 = obj6;
                                b10 = b11;
                            }
                            if (i11 != u03) {
                                i11++;
                                obj5 = obj4;
                            }
                        }
                    }
                    nVar = obj4;
                }
                n nVar3 = nVar;
                if (nVar3 != null && (oVar2 = nVar3.f12546a) != null) {
                    f6 = oVar2.b();
                }
                return Float.valueOf(f6);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f12532Y) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
