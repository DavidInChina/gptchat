package M5;

import Lg.n;
import android.gov.nist.core.Separators;
import kf.t;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class e extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11629Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ f f11630Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f11629Y = i10;
        this.f11630Z = fVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        int i10 = this.f11629Y;
        f fVar = this.f11630Z;
        switch (i10) {
            case 0:
                if (fVar.l().length() == 0) {
                    return fVar.D();
                }
                if (n.Z1(fVar.D(), fVar.l(), false)) {
                    return fVar.D();
                }
                return android.gov.nist.core.a.j(fVar.l(), Separators.SP, fVar.D());
            default:
                return (String) t.f2(n.F2(fVar.G(), new char[]{'.'}));
        }
    }
}
