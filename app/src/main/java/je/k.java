package je;

import Ng.AbstractC1073l0;
import Ng.v0;
import java.util.concurrent.CancellationException;
import jf.y;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class k extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36138Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1073l0 f36139Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(v0 v0Var, int i10) {
        super(1);
        this.f36138Y = i10;
        this.f36139Z = v0Var;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        AbstractC1073l0 abstractC1073l0 = this.f36139Z;
        int i10 = this.f36138Y;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        if (th2 != null) {
                            abstractC1073l0.k(new CancellationException(th2.getMessage()));
                            break;
                        }
                        break;
                    default:
                        abstractC1073l0.k(null);
                        break;
                }
                return yVar;
            default:
                Throwable th3 = (Throwable) obj;
                switch (i10) {
                    case 0:
                        if (th3 != null) {
                            abstractC1073l0.k(new CancellationException(th3.getMessage()));
                            break;
                        }
                        break;
                    default:
                        abstractC1073l0.k(null);
                        break;
                }
                return yVar;
        }
    }
}
