package W;

import Ng.AbstractC1070k;
import wf.AbstractC6216a;

/* renamed from: W.h3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1560h3 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20118Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f20119Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1560h3(int i10, Object obj) {
        super(0);
        this.f20118Y = i10;
        this.f20119Z = obj;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        A3 a32 = A3.f18982Z;
        int i10 = this.f20118Y;
        Object obj = this.f20119Z;
        switch (i10) {
            case 0:
                ((C1585m3) obj).a();
                return Boolean.TRUE;
            case 1:
                switch (i10) {
                    case 1:
                        AbstractC1070k abstractC1070k = ((C1585m3) obj).f20228b;
                        if (abstractC1070k.a()) {
                            abstractC1070k.resumeWith(a32);
                            break;
                        }
                        break;
                    default:
                        ((C1585m3) obj).a();
                        break;
                }
                return yVar;
            case 2:
                switch (i10) {
                    case 1:
                        AbstractC1070k abstractC1070k2 = ((C1585m3) obj).f20228b;
                        if (abstractC1070k2.a()) {
                            abstractC1070k2.resumeWith(a32);
                            break;
                        }
                        break;
                    default:
                        ((C1585m3) obj).a();
                        break;
                }
                return yVar;
            default:
                Z0.b bVar = ((C1550f3) obj).f20063d;
                if (bVar != null) {
                    return Float.valueOf(bVar.R(125));
                }
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?".toString());
        }
    }
}
