package Q3;

import Qg.AbstractC1206i;
import jf.C3959i;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class g extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14409Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i[] f14410Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AbstractC1206i[] abstractC1206iArr, int i10) {
        super(0);
        this.f14409Y = i10;
        this.f14410Z = abstractC1206iArr;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        AbstractC1206i[] abstractC1206iArr = this.f14410Z;
        int i10 = this.f14409Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new c[abstractC1206iArr.length];
                    case 1:
                        return new Object[abstractC1206iArr.length];
                    default:
                        return new C3959i[abstractC1206iArr.length];
                }
            case 1:
                switch (i10) {
                    case 0:
                        return new c[abstractC1206iArr.length];
                    case 1:
                        return new Object[abstractC1206iArr.length];
                    default:
                        return new C3959i[abstractC1206iArr.length];
                }
            default:
                switch (i10) {
                    case 0:
                        return new c[abstractC1206iArr.length];
                    case 1:
                        return new Object[abstractC1206iArr.length];
                    default:
                        return new C3959i[abstractC1206iArr.length];
                }
        }
    }
}
